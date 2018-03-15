package practiceddd.eas.projectcontext.domain.scrumprocess;

import practiceddd.eas.dddcore.Entity;
import practiceddd.eas.dddcore.Identity;
import practiceddd.eas.projectcontext.domain.exception.InvalidAssignmentException;
import practiceddd.eas.projectcontext.domain.exception.InvalidBacklogException;
import practiceddd.eas.projectcontext.domain.role.Assignee;
import practiceddd.eas.projectcontext.domain.role.Assigner;

public class SprintBacklog extends Entity<Identity> {
    private Identity id;
    private String title;
    private String description;
    private BacklogStatus backlogStatus;
    private Assigner assigner;
    private Assignee assignee;

    public SprintBacklog(String title, String description) {
        if (title == null) {
            throw new InvalidBacklogException("the title of backlog can't be null");
        }

        this.title = title;
        this.description = description;
        this.backlogStatus = new NewBacklogStatus();
    }

    public Identity id() {
        return this.id;
    }

    public String title() {
        return this.title;
    }

    public String description() {
        return this.description;
    }

    public void assignedTo(Assigner assigner, Assignee assignee) {
        if (this.backlogStatus.isClosed()) {
            throw new InvalidAssignmentException(
                    String.format("The closed sprint backlog %s can not be assigned to %s.", this.title, assignee.getName()));
        }
        this.assigner = assigner;
        this.assignee = assignee;
    }
}
