package xyz.zhangyipracticeddd.dddcore.identity;

import java.io.Serializable;

public interface Identity<T> extends Serializable {
    T value();
    boolean isEmpty();
    T emptyId();
}
