package practiceddd.eas.projectcontext.domain.scrumprocess;

public class AssignmentNotification {
    private SprintBacklogAssignment assignment;

    public AssignmentNotification(SprintBacklogAssignment assignment) {
        this.assignment = assignment;
    }

    public String content() {
        return "";
    }
}
