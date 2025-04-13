/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eKn {
    private boolean a = false;
    private final List<aff_1> b = new ArrayList<aff_1>();
    private int c = 0;
    private int d = 0;
    private ti_0 e = null;

    public void a(boolean bl) {
        this.a = bl;
    }

    public boolean a() {
        return this.a;
    }

    public aff_1 b() {
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.get(this.b.size() - 1);
    }

    public List<aff_1> c() {
        return this.b;
    }

    public void a(int n, int n2, short s2) {
        this.b.add(new aff_1(n, n2, s2));
    }

    public void a(int n) {
        this.c = n;
    }

    public int d() {
        return this.c;
    }

    public void b(int n) {
        this.d = n;
    }

    public int e() {
        return this.d;
    }

    public void a(ti_0 ti_02) {
        this.e = ti_02;
    }

    public ti_0 f() {
        return this.e;
    }
}

