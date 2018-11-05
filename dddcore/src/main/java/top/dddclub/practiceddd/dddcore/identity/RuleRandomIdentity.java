package top.dddclub.practiceddd.dddcore.identity;

import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.Random;

@Immutable
public class RuleRandomIdentity implements RandomIdentity<String>, Identity<String> {
    private String value;
    private String prefix;
    private int seed;
    private String joiner;

    private static final long serialVersionUID = 1L;

    public RuleRandomIdentity(String value) {
        this.value = value;
    }

    public RuleRandomIdentity(String prefix, int seed) {
        this.prefix = prefix;
        this.seed = seed;
        this.joiner = "_";
    }

    public RuleRandomIdentity(String prefix, int seed, String joiner) {
        this.prefix = prefix;
        this.seed = seed;
        this.joiner = joiner;
    }

    @Override
    public final String value() {
        return this.value;
    }

    @Override
    public final boolean isEmpty() {
        return value.isEmpty();
    }

    @Override
    public final String emptyId() {
        return "";
    }

    @Override
    public final String next() {
        long suffix = new Random(seed).nextLong();
        return String.format("%s%s%s", prefix, joiner, suffix);
    }
}
