package practiceddd.eas.projectcontext.domain.role;

import practiceddd.eas.projectcontext.domain.scrumprocess.SprintBacklog;

public class Assigner extends Role {
    public void assign(SprintBacklog backlog, Assignee assignee) {
        backlog.assignedTo(this, assignee);
    }

}
