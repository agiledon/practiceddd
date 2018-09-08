package practiceddd.eas.dddcore;

public interface Identity<T> {
    T value();
    boolean isEmpty();
    T emptyId();
}
