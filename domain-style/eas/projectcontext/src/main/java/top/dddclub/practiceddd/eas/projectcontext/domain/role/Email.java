package xyz.zhangyipracticeddd.eas.projectcontext.domain.role;

import jdk.nashorn.internal.ir.annotations.Immutable;
import xyz.zhangyipracticeddd.eas.projectcontext.domain.exception.ValidationException;

@Immutable
public class Email {
    private final String address;

    public Email(String address) {
        if (!address.contains("@")) {
            throw new ValidationException("Not a valid email address");
        }
        this.address = address;
    }

    public final String address() {
        return address;
    }
}
