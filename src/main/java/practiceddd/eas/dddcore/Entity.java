package practiceddd.eas.dddcore;

public class Entity<T> {
    private T id;

    public T id() {
        return this.id;
    }
}
