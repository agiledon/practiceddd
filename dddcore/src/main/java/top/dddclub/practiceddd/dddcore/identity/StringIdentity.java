package top.dddclub.practiceddd.dddcore.identity;

public class StringIdentity implements Identity<String> {
    private String value;

    public StringIdentity(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return this.value;
    }

    @Override
    public boolean isEmpty() {
        return value.isEmpty();
    }

    @Override
    public String emptyId() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StringIdentity that = (StringIdentity) o;

        return value.equals(that.value);

    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return "StringIdentity{" +
                "value='" + value + '\'' +
                '}';
    }
}
