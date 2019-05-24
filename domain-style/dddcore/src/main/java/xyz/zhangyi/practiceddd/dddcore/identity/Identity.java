package xyz.zhangyi.practiceddd.dddcore.identity;

import java.io.Serializable;

public interface Identity<T> extends Serializable {
    T value();
    boolean isEmpty();
    T emptyId();
}
