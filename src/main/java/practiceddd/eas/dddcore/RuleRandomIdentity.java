package practiceddd.eas.dddcore;

import java.util.Random;

public class RuleRandomIdentity implements RandomIdentity<String>, Identity<String> {
    private String value;
    private String prefix;
    private int seed;
    private String joiner;

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
