package xyz.zhangyipracticeddd.eas.projectcontext.gateways.persistence;

import org.springframework.stereotype.Repository;
import xyz.zhangyipracticeddd.eas.projectcontext.domain.scrumprocess.SprintBacklog;
import xyz.zhangyipracticeddd.eas.projectcontext.repositories.SprintBacklogRepository;

@Repository
public class SprintBacklogMyBatisRepository implements SprintBacklogRepository {
    @Override
    public void update(SprintBacklog backlog) {

    }
}
