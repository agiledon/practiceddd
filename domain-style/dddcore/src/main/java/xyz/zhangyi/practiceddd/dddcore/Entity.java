package xyz.zhangyi.practiceddd.dddcore;

import xyz.zhangyi.practiceddd.dddcore.identity.Identity;

public abstract class Entity<T extends Identity> {
    protected T id;

    public T id() {
        return this.id;
    }
}
