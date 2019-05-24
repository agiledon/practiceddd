package xyz.zhangyi.practiceddd.eas.projectcontext.gateways.persistence;

import org.springframework.stereotype.Repository;
import xyz.zhangyi.practiceddd.eas.projectcontext.repositories.SprintBacklogAssignmentRepository;
import xyz.zhangyi.practiceddd.eas.projectcontext.domain.scrumprocess.SprintBacklogAssignment;

@Repository
public class SprintBacklogAssignmentMyBatisRepository implements SprintBacklogAssignmentRepository {
    @Override
    public void add(SprintBacklogAssignment assignment) {

    }
}
