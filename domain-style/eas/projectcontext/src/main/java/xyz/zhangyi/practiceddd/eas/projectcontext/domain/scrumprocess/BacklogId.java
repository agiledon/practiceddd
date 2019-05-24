package xyz.zhangyi.practiceddd.eas.projectcontext.domain.scrumprocess;

import xyz.zhangyi.practiceddd.dddcore.identity.RuleRandomIdentity;

public final class BacklogId extends RuleRandomIdentity {
    private String backlogId;

    public BacklogId(String projectName, int seed) {
        super(projectName, seed);
    }
}
