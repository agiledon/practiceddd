package practiceddd.eas.dddcore;

public abstract class Entity<T> {
    private T id;

    public T id() {
        return this.id;
    }
}
