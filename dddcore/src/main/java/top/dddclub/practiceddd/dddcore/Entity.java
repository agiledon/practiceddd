package top.dddclub.practiceddd.dddcore;

public abstract class Entity<T> {
    protected T id;

    public T id() {
        return this.id;
    }
}
