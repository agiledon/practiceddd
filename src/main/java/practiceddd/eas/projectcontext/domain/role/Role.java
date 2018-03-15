package practiceddd.eas.projectcontext.domain.role;

import practiceddd.eas.dddcore.Entity;
import practiceddd.eas.dddcore.Identity;

public abstract class Role extends Entity<Identity> {
    private Identity id;
    private Name name;
    private Email email;

    public Identity getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }
}
