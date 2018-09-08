package top.dddclub.practiceddd.eas.projectcontext.gateways.persistence;

import org.springframework.stereotype.Repository;
import top.dddclub.practiceddd.eas.projectcontext.domain.scrumprocess.SprintBacklog;
import top.dddclub.practiceddd.eas.projectcontext.repositories.SprintBacklogRepository;

@Repository
public class SprintBacklogMyBatisRepository implements SprintBacklogRepository {
    @Override
    public void update(SprintBacklog backlog) {

    }
}
