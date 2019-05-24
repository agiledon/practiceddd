package xyz.zhangyi.practiceddd.eas.projectcontext.domain.scrumprocess;

import xyz.zhangyi.practiceddd.eas.projectcontext.domain.role.MemberId;
import xyz.zhangyi.practiceddd.dddcore.Entity;
import xyz.zhangyi.practiceddd.dddcore.identity.UUIDIdentity;

import java.time.LocalDateTime;

public class SprintBacklogAssignment extends Entity<UUIDIdentity> {
    private BacklogId sprintBacklogId;
    private MemberId assigneeId;
    private LocalDateTime assignedTime;

    public SprintBacklogAssignment(BacklogId sprintBacklogId, MemberId assignee) {
        this.id = new UUIDIdentity();
        this.sprintBacklogId = sprintBacklogId;
        this.assigneeId = assignee;
        assignedTime = LocalDateTime.now();
    }

    public BacklogId getSprintBacklogId() {
        return sprintBacklogId;
    }

    public MemberId getAssigneeId() {
        return assigneeId;
    }

    public LocalDateTime getAssignedTime() {
        return assignedTime;
    }
}
