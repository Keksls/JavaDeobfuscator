/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Preconditions
 */
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Objects;

final class Cf<E, D>
extends cc_0<E, D> {
    private final D a;

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public D c() {
        return this.a;
    }

    @Override
    public E d() {
        throw new IllegalStateException("error is absent.");
    }

    @Override
    public cc_0<E, D> a(cc_0<E, D> cc_02) {
        return cc_02;
    }

    @Override
    public <E1> cc_0<E1, D> a(Function<? super E, ? extends E1> function) {
        Preconditions.checkNotNull(function);
        return this;
    }

    @Override
    public <D1> cc_0<E, D1> b(Function<? super D, ? extends D1> function) {
        Preconditions.checkNotNull(function);
        return new Cf<E, Object>(function.apply(this.a));
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.a == null ? 0 : this.a.hashCode());
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Cf cf = (Cf)object;
        return Objects.equals(this.a, cf.a);
    }

    public String toString() {
        return String.format("Either Valid [%s]", this.a);
    }

    Cf(D d2) {
        this.a = d2;
    }
}

