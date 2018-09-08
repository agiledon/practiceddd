package top.dddclub.practiceddd.eas.projectcontext.domain.role;

import top.dddclub.practiceddd.dddcore.Entity;

public class TeamMember extends Entity<MemberId> {
    private Name name;
    private Email email;

    protected TeamMember(MemberId id, Name name, Email email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String idValue() {
        return id.value();
    }

    public Name name() {
        return name;
    }

    public Email email() {
        return email;
    }

    public boolean isSame(MemberId memberId) {
        return memberId != null && memberId.equals(this.id);
    }
}
