package top.dddclub.practiceddd.dddcore.identity;

public interface Identity<T> {
    T value();
    boolean isEmpty();
    T emptyId();
}
