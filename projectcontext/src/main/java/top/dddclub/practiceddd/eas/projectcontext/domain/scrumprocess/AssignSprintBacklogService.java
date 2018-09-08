package top.dddclub.practiceddd.eas.projectcontext.domain.scrumprocess;

import top.dddclub.practiceddd.eas.projectcontext.domain.role.TeamMember;
import top.dddclub.practiceddd.eas.projectcontext.interfaces.notification.NotificationService;

public class AssignSprintBacklogService {
    private SprintBacklogRepository backlogRepository;
    private SprintBacklogAssignmentRepository assignmentRepository;
    private NotificationService notificationService;

    public void assign(SprintBacklog backlog, TeamMember assignee) {
        SprintBacklogAssignment assignment = backlog.assignTo(assignee);
        backlogRepository.update(backlog);
        assignmentRepository.add(assignment);

        AssignmentNotification notification = new AssignmentNotification(assignment);
        notificationService.send(assignee.email().address(), notification.content());
    }
}
