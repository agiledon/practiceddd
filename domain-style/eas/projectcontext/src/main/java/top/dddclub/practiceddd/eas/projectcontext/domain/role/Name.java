package xyz.zhangyipracticeddd.eas.projectcontext.domain.role;

import jdk.nashorn.internal.ir.annotations.Immutable;

@Immutable
public class Name {
    private final String firstName;
    private final String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final String getLastName() {
        return lastName;
    }
}
