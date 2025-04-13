/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

public class Hz
extends Number {
    private final double a;
    private final Long b;

    public Hz(long l, double d2) {
        this.a = d2;
        this.b = l;
    }

    public double a() {
        return this.a;
    }

    @Override
    public int intValue() {
        return this.b.intValue();
    }

    @Override
    public long longValue() {
        return this.b;
    }

    @Override
    public float floatValue() {
        return this.b.floatValue();
    }

    @Override
    public double doubleValue() {
        return this.b.doubleValue();
    }

    public String toString() {
        return this.b.toString();
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public boolean equals(Object object) {
        if (object instanceof Hz) {
            return Objects.equals(this.b, ((Hz)object).b);
        }
        if (object instanceof Long) {
            return this.b.equals(object);
        }
        return false;
    }
}

