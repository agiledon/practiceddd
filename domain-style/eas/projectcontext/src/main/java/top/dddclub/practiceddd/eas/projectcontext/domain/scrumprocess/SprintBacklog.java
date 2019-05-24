package xyz.zhangyipracticeddd.eas.projectcontext.domain.scrumprocess;

import xyz.zhangyipracticeddd.dddcore.Entity;
import xyz.zhangyipracticeddd.eas.projectcontext.domain.exception.InvalidAssignmentException;
import xyz.zhangyipracticeddd.eas.projectcontext.domain.exception.InvalidBacklogException;
import xyz.zhangyipracticeddd.eas.projectcontext.domain.role.MemberId;
import xyz.zhangyipracticeddd.eas.projectcontext.domain.role.TeamMember;

public class SprintBacklog extends Entity<BacklogId> {
    private String title;
    private String description;
    private BacklogStatus backlogStatus;
    private MemberId ownerId = null;

    public SprintBacklog(BacklogId backlogId, String title, String description) {
        if (title == null) {
            throw new InvalidBacklogException("the title of backlog can't be null");
        }

        this.id = backlogId;
        this.title = title;
        this.description = description;
        this.backlogStatus = new NewBacklogStatus();
    }

    public String title() {
        return this.title;
    }

    public String description() {
        return this.description;
    }

    public SprintBacklogAssignment assignTo(TeamMember assignee) {
        if (this.backlogStatus.isClosed()) {
            throw new InvalidAssignmentException(
                    String.format("The closed sprint backlog %s can not be assigned to %s.", this.title, assignee.name()));
        }
        if (assignee.isSame(this.ownerId)) {
            throw new InvalidAssignmentException(
                    String.format("The sprint backlog %s not allow to assign to same team member %s.", this.title, assignee.name()));
        }
        return new SprintBacklogAssignment(this.id, assignee.id());
    }
}
