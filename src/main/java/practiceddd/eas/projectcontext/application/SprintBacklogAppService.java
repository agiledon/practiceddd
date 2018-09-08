package practiceddd.eas.projectcontext.application;

import practiceddd.eas.dddcore.exception.ApplicationException;
import practiceddd.eas.projectcontext.domain.exception.InvalidAssignmentException;
import practiceddd.eas.projectcontext.domain.role.TeamMember;
import practiceddd.eas.projectcontext.domain.scrumprocess.AssignSprintBacklogService;
import practiceddd.eas.projectcontext.domain.scrumprocess.SprintBacklog;

public class SprintBacklogAppService {
    private AssignSprintBacklogService assignService;

    public void assignBacklog(SprintBacklog backlog, TeamMember assignee) throws ApplicationException {
        try {
            assignService.assign(backlog, assignee);
        } catch (InvalidAssignmentException ex) {
            throw new ApplicationException("failed to assign sprint backlog", ex);
        }
    }
}
