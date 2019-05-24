package top.dddclub.practiceddd.eas.projectcontext.repositories;

import top.dddclub.practiceddd.eas.projectcontext.domain.scrumprocess.SprintBacklog;

public interface SprintBacklogRepository {
    void update(SprintBacklog backlog);
}
