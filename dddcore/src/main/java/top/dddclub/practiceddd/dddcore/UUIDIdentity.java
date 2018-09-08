package top.dddclub.practiceddd.dddcore;

import java.util.UUID;

public class UUIDIdentity implements RandomIdentity<String>, Identity<String> {
    private String value;

    public UUIDIdentity() {
        this.value = next();
    }

    @Override
    public String next() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean isEmpty() {
        return value.isEmpty();
    }

    @Override
    public String emptyId() {
        return "";
    }
}
