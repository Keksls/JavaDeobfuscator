/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;

/*
 * Renamed from SM
 */
public final class sm_0 {
    private final int a;
    private final long b;
    private final long c;
    private final Collection<sm_0> d = new ArrayList<sm_0>();
    private sm_0 e;

    sm_0(int n, long l, long l2) {
        this.a = n;
        this.b = l;
        this.c = l2;
    }

    void a(sm_0 sm_02) {
        this.d.add(sm_02);
        sm_02.e = this;
    }

    boolean b(sm_0 sm_02) {
        return this.d.remove(sm_02);
    }

    boolean a(int n, long l) {
        if (this.e == null) {
            return false;
        }
        if (this.e.a == n && this.e.c == l) {
            return true;
        }
        return this.e.a(n, l);
    }

    boolean a(int n, long l, long l2) {
        if (this.e == null) {
            return false;
        }
        if (this.e.a == n && this.e.c == l && this.e.b == l2) {
            return true;
        }
        return this.e.a(n, l, l2);
    }

    public boolean c(sm_0 sm_02) {
        return this.d.contains(sm_02);
    }

    public int a() {
        return this.a;
    }

    public sm_0 b() {
        return this.e;
    }

    public long c() {
        return this.c;
    }

    public long d() {
        return this.b;
    }

    public void e() {
        this.e = null;
        this.d.clear();
    }

    public String toString() {
        if (this.e == null) {
            return this.a + "( casterId = " + this.b + "), ( targetId = " + this.c + ")";
        }
        return this.a + "( casterId = " + this.b + "), ( targetId = " + this.c + ") <- " + this.e.toString();
    }
}

