/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public abstract class dht
extends dfc {
    @Nullable
    private final Integer a;
    private final boolean b;

    public boolean k() {
        return this.a != null;
    }

    @Nullable
    public Integer o() {
        return this.a;
    }

    public boolean p() {
        return this.b;
    }

    public dht(@Nullable Integer n, boolean bl) {
        this.a = n;
        this.b = bl;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dht)) {
            return false;
        }
        dht dht2 = (dht)object;
        if (!dht2.b(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (this.p() != dht2.p()) {
            return false;
        }
        Integer n = this.o();
        Integer n2 = dht2.o();
        return !(n == null ? n2 != null : !((Object)n).equals(n2));
    }

    protected boolean b(Object object) {
        return object instanceof dht;
    }

    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        n2 = n2 * 59 + (this.p() ? 79 : 97);
        Integer n3 = this.o();
        n2 = n2 * 59 + (n3 == null ? 43 : ((Object)n3).hashCode());
        return n2;
    }
}

