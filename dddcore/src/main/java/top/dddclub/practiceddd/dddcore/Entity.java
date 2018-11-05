package top.dddclub.practiceddd.dddcore;

import top.dddclub.practiceddd.dddcore.identity.Identity;

public abstract class Entity<T extends Identity> {
    protected T id;

    public T id() {
        return this.id;
    }
}
