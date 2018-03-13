package practiceddd.eas.dddcore;

import jdk.nashorn.internal.ir.annotations.Immutable;

@Immutable
public class Identity {
    private final String value;

    public Identity(String value) {
        this.value = value;
    }

    public final String getValue() {
        return value;
    }
}
