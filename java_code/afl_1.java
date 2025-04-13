/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aFl
 */
public class afl_1
implements Iterable<aff_1> {
    private static final Logger a = Logger.getLogger(afl_1.class);
    private final aff_1 b;
    private final aff_1 c;

    public afl_1(aff_1 aff_12, aff_1 aff_13) {
        long l;
        if (!aff_12.i(aff_13)) {
            throw new IllegalArgumentException("Can't create a segment from unaligned points : " + aff_12 + ", " + aff_13);
        }
        if (aff_12.a((Object)aff_13)) {
            throw new IllegalArgumentException("Can't create a segment from a point : " + aff_12 + ", " + aff_13);
        }
        long l2 = afl_1.f(aff_12);
        if (l2 < (l = afl_1.f(aff_13))) {
            this.b = new aff_1(aff_12);
            this.c = new aff_1(aff_13);
        } else {
            this.b = new aff_1(aff_13);
            this.c = new aff_1(aff_12);
        }
    }

    public afl_1(afl_1 afl_12) {
        this(afl_12.b, afl_12.c);
    }

    @Override
    @NotNull
    public Iterator<aff_1> iterator() {
        return new afo_2(this);
    }

    public boolean a() {
        return this.b.e() == this.c.e();
    }

    public boolean b() {
        return this.b.d() == this.c.d();
    }

    public boolean a(aff_1 aff_12) {
        return this.b(aff_12) == afn_1.b;
    }

    public afn_1 b(aff_1 aff_12) {
        if (aff_12 == null) {
            return afn_1.a;
        }
        if (!this.c(aff_12)) {
            return afn_1.a;
        }
        long l = afl_1.f(aff_12);
        if (l < afl_1.f(this.b)) {
            return afn_1.c;
        }
        if (l > afl_1.f(this.c)) {
            return afn_1.d;
        }
        return afn_1.b;
    }

    public boolean c(aff_1 aff_12) {
        if (aff_12 == null) {
            return false;
        }
        if (this.b.a((Object)aff_12)) {
            return true;
        }
        if (this.c.a((Object)aff_12)) {
            return true;
        }
        return this.b.a(this.c, aff_12);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        afl_1 afl_12 = (afl_1)object;
        if (this.c != null ? !this.c.a((Object)afl_12.c) : afl_12.c != null) {
            return false;
        }
        return this.b != null ? this.b.a((Object)afl_12.b) : afl_12.b == null;
    }

    public boolean d(aff_1 aff_12) {
        afn_1 afn_12 = this.b(aff_12);
        return afn_12 == afn_1.d || afn_12 == afn_1.c;
    }

    public boolean e(aff_1 aff_12) {
        afn_1 afn_12 = this.b(aff_12);
        switch (afn_12) {
            case c: {
                this.b.g(aff_12);
                return true;
            }
            case d: {
                this.c.g(aff_12);
                return true;
            }
        }
        return false;
    }

    public aff_1 c() {
        return new aff_1(this.b);
    }

    public aff_1 d() {
        return new aff_1(this.c);
    }

    public int e() {
        return (int)(afl_1.f(this.c) - afl_1.f(this.b) + 1L);
    }

    public int hashCode() {
        int n = this.b != null ? this.b.b() : 0;
        n = 31 * n + (this.c != null ? this.c.b() : 0);
        return n;
    }

    public String toString() {
        return "{Segment (" + this.b + ")-(" + this.c + ")}";
    }

    private static long f(aff_1 aff_12) {
        return aff_12.d() + aff_12.e();
    }
}

