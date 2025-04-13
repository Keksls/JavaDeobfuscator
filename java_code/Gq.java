/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Preconditions
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;

class Gq {
    public static final Function<Gq, Gu> a = new Gr();
    private final Gt b;
    private final Gu c;
    private final Gu d;

    public static Predicate<Gq> a(Gt gt) {
        return new Gs(gt);
    }

    Gq(Gt gt, Gu gu, Gu gu2) {
        this.b = (Gt)((Object)Preconditions.checkNotNull((Object)((Object)gt)));
        this.c = (Gu)Preconditions.checkNotNull((Object)gu);
        this.d = (Gu)Preconditions.checkNotNull((Object)gu2);
    }

    public Gt a() {
        return this.b;
    }

    public Gu b() {
        return this.c;
    }

    public Gu c() {
        return this.d;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + this.c.hashCode();
        n2 = 31 * n2 + this.d.hashCode();
        n2 = 31 * n2 + this.b.hashCode();
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
        Gq gq = (Gq)object;
        if (!this.c.equals(gq.c)) {
            return false;
        }
        if (!this.d.equals(gq.d)) {
            return false;
        }
        return this.b == gq.b;
    }

    public String toString() {
        return this.b + "[" + this.c + " -> " + this.d + "]";
    }
}

