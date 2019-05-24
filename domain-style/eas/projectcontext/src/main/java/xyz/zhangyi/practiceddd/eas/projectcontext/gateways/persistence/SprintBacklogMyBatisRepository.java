package xyz.zhangyi.practiceddd.eas.projectcontext.gateways.persistence;

import org.springframework.stereotype.Repository;
import xyz.zhangyi.practiceddd.eas.projectcontext.repositories.SprintBacklogRepository;
import xyz.zhangyi.practiceddd.eas.projectcontext.domain.scrumprocess.SprintBacklog;

@Repository
public class SprintBacklogMyBatisRepository implements SprintBacklogRepository {
    @Override
    public void update(SprintBacklog backlog) {

    }
}
