/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from RS
 */
public abstract class rs_0 {
    private List<rv_0> a = null;

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int a(int var1);

    public abstract int f();

    public abstract void b(int var1);

    public abstract int c(int var1);

    public abstract int d(int var1);

    public abstract int e(int var1);

    public abstract int f(int var1);

    public abstract void g(int var1);

    public abstract void h(int var1);

    public abstract void g();

    public boolean h() {
        return this.a() > 0;
    }

    public boolean i() {
        return this.a() < 0;
    }

    public boolean j() {
        return this.a() == 0;
    }

    public boolean k() {
        return this.a() != 0;
    }

    public boolean l() {
        return this.b() >= this.c();
    }

    public boolean m() {
        return this.b() <= this.e();
    }

    public void n() {
        this.b(this.c());
    }

    public void o() {
        this.b(this.e());
    }

    public abstract ru_0 p();

    public void a(List<rv_0> list) {
        if (list == null) {
            return;
        }
        if (this.a == null) {
            this.a = new ArrayList<rv_0>();
            this.a.addAll(list);
        } else {
            this.r();
            this.a.addAll(list);
        }
    }

    public void a(rv_0 rv_02) {
        if (this.a == null) {
            this.a = new ArrayList<rv_0>();
            this.a.add(rv_02);
        } else if (!this.a.contains(rv_02)) {
            this.a.add(rv_02);
        }
    }

    public void b(rv_0 rv_02) {
        if (this.a != null) {
            this.a.remove(rv_02);
        }
    }

    public List<rv_0> q() {
        return this.a;
    }

    public void r() {
        if (this.a != null) {
            this.a.clear();
        }
    }

    public void s() {
        if (this.a != null && !this.a.isEmpty()) {
            for (rv_0 rv_02 : this.a) {
                rv_02.a(this);
            }
        }
    }
}

