package top.dddclub.practiceddd.dddcore;

public interface Identity<T> {
    T value();
    boolean isEmpty();
    T emptyId();
}
