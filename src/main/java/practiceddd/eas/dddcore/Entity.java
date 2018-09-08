package practiceddd.eas.dddcore;

public abstract class Entity<T> {
    protected T id;

    public T id() {
        return this.id;
    }
}
