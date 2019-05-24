package xyz.zhangyipracticeddd.dddcore;

import xyz.zhangyipracticeddd.dddcore.identity.Identity;

public abstract class Entity<T extends Identity> {
    protected T id;

    public T id() {
        return this.id;
    }
}
