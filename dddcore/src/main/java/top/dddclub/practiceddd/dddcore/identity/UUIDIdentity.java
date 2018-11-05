package top.dddclub.practiceddd.dddcore.identity;

import java.util.UUID;

public class UUIDIdentity implements RandomIdentity<String>, Identity<String> {
    private String value;

    public UUIDIdentity() {
        this.value = next();
    }

    private static final long serialVersionUID = 1L;

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
