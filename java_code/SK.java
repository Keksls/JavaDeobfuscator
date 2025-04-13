/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashSet;

public final class SK {
    public static final SK a = new SK();
    private sm_0 b;
    private final Collection<sl_0> c = new HashSet<sl_0>();

    SK() {
    }

    public sm_0 a(int n, long l, long l2) {
        sm_0 sm_02 = new sm_0(n, l, l2);
        if (this.b != null) {
            this.b.a(sm_02);
        }
        this.b = sm_02;
        this.c.add(new sl_0(this, n, l, l2));
        return sm_02;
    }

    void a() {
        sm_0 sm_02 = this.b;
        if (this.b.b() != null) {
            sm_02.b().b(this.b);
        }
        this.b = this.b.b();
        this.c.remove(new sl_0(this, sm_02.a(), sm_02.d(), sm_02.c()));
        sm_02.e();
    }

    public boolean a(int n, long l) {
        if (this.b == null) {
            return false;
        }
        if (this.b.a() == n && this.b.c() == l) {
            return true;
        }
        return this.b.a(n, l);
    }

    sm_0 b() {
        return this.b;
    }

    public void c() {
        this.b = null;
        this.c.clear();
    }

    public String toString() {
        if (this.b == null) {
            return "empty";
        }
        return this.b.toString();
    }

    public boolean b(int n, long l, long l2) {
        return this.c.contains(new sl_0(this, n, l, l2));
    }
}

