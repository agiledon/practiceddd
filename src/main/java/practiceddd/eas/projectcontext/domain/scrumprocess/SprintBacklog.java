package practiceddd.eas.projectcontext.domain.scrumprocess;

import practiceddd.eas.dddcore.Entity;
import practiceddd.eas.dddcore.Identity;
import practiceddd.eas.projectcontext.domain.exception.InvalidAssignmentException;

public class SprintBacklog extends Entity<Identity> {
    private Identity id;
    private String title;
    private String description;
    private BacklogStatus backlogStatus;
    private Identity ownerId;

    public SprintBacklog(String title, String description) {
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

    public void assignedTo(Identity memberId) {
        if (!this.backlogStatus.isClosed()) {
            this.ownerId = memberId;
        } else {
            throw new InvalidAssignmentException(String.format("The closed sprint backlog %s can not be assigned.", this.title));
        }
    }
}
