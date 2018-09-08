package top.dddclub.practiceddd.eas.projectcontext.gateways.persistence;

import org.springframework.stereotype.Repository;
import top.dddclub.practiceddd.eas.projectcontext.domain.scrumprocess.SprintBacklogAssignment;
import top.dddclub.practiceddd.eas.projectcontext.repositories.SprintBacklogAssignmentRepository;

@Repository
public class SprintBacklogAssignmentMyBatisRepository implements SprintBacklogAssignmentRepository {
    @Override
    public void add(SprintBacklogAssignment assignment) {

    }
}
