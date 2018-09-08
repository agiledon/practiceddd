package practiceddd.eas.projectcontext.application;

import practiceddd.eas.notificationcontext.application.NotificationAppService;
import practiceddd.eas.projectcontext.domain.role.TeamMember;
import practiceddd.eas.projectcontext.domain.scrumprocess.AssignSprintBacklogService;
import practiceddd.eas.projectcontext.domain.scrumprocess.SprintBacklog;

public class SprintBacklogAppService {
    private AssignSprintBacklogService assignService;
    private NotificationAppService notificationService;

    public void assignBacklog(SprintBacklog backlog, TeamMember teamMember) {

    }
}
