package xyz.zhangyipracticeddd.eas.projectcontext.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zhangyipracticeddd.dddcore.exception.ApplicationException;
import xyz.zhangyipracticeddd.eas.projectcontext.domain.exception.InvalidAssignmentException;
import xyz.zhangyipracticeddd.eas.projectcontext.domain.role.TeamMember;
import xyz.zhangyipracticeddd.eas.projectcontext.domain.scrumprocess.AssignSprintBacklogService;
import xyz.zhangyipracticeddd.eas.projectcontext.domain.scrumprocess.SprintBacklog;

@Service
public class SprintBacklogAppService {
    @Autowired
    private AssignSprintBacklogService assignService;

    public void assignBacklog(SprintBacklog backlog, TeamMember assignee) throws ApplicationException {
        try {
            assignService.assign(backlog, assignee);
        } catch (InvalidAssignmentException ex) {
            throw new ApplicationException("failed to assign sprint backlog", ex);
        }
    }
}
