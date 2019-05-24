package xyz.zhangyipracticeddd.eas.projectcontext.gateways.persistence;

import org.springframework.stereotype.Repository;
import xyz.zhangyipracticeddd.eas.projectcontext.domain.scrumprocess.SprintBacklogAssignment;
import xyz.zhangyipracticeddd.eas.projectcontext.repositories.SprintBacklogAssignmentRepository;

@Repository
public class SprintBacklogAssignmentMyBatisRepository implements SprintBacklogAssignmentRepository {
    @Override
    public void add(SprintBacklogAssignment assignment) {

    }
}
