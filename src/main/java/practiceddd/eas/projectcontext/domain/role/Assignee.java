package practiceddd.eas.projectcontext.domain.role;

import practiceddd.eas.projectcontext.domain.scrumprocess.SprintBacklog;

public class Assignee extends Role {
    public void assigned(Assigner assigner, SprintBacklog backlog) {
        backlog.assignedTo(assigner, this);
    }
}
