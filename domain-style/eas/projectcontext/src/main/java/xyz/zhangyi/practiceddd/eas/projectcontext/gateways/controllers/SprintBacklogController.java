package xyz.zhangyi.practiceddd.eas.projectcontext.gateways.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.zhangyi.practiceddd.eas.projectcontext.application.SprintBacklogAppService;
import xyz.zhangyi.practiceddd.eas.projectcontext.gateways.controllers.message.AssignSprintBacklogRequest;

@RestController
@RequestMapping(value="/sprint-backlogs")
public class SprintBacklogController {
    @Autowired
    private SprintBacklogAppService appService;

    public void assignSprintBacklog(AssignSprintBacklogRequest assignRequest) {

    }
}
