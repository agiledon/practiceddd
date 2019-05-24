package top.dddclub.practiceddd.eas.projectcontext.domain.scrumprocess;

import top.dddclub.practiceddd.dddcore.identity.RuleRandomIdentity;

public final class BacklogId extends RuleRandomIdentity {
    private String backlogId;

    public BacklogId(String projectName, int seed) {
        super(projectName, seed);
    }
}
