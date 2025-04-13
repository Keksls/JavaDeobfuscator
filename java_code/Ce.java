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

class Ce<E, D>
extends cc_0<E, D> {
    private final E a;

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public D c() {
        throw new IllegalStateException("data is absent.");
    }

    @Override
    public E d() {
        return this.a;
    }

    @Override
    public cc_0<E, D> a(cc_0<E, D> cc_02) {
        return this;
    }

    @Override
    public <E1> cc_0<E1, D> a(Function<? super E, ? extends E1> function) {
        Preconditions.checkNotNull(function);
        return new Ce<Object, D>(function.apply(this.a));
    }

    @Override
    public <D1> cc_0<E, D1> b(Function<? super D, ? extends D1> function) {
        Preconditions.checkNotNull(function);
        return this;
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
        Ce ce = (Ce)object;
        return Objects.equals(this.a, ce.a);
    }

    public String toString() {
        return String.format("Either Error [%s]", this.a);
    }

    Ce(E e2) {
        this.a = Preconditions.checkNotNull(e2);
    }
}

