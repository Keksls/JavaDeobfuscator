/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fyI
 */
public class fyi_0 {
    private static final fyi_0 a = new fyi_0();
    private final ArrayList<fyk_0> b = new ArrayList();
    private final ArrayList<fyk_0> c = new ArrayList();
    private final ArrayList<fyk_0> d = new ArrayList();
    private final ArrayList<ftj_0> e = new ArrayList();
    private boolean f = false;
    private boolean g = false;
    private final ArrayList<ftj_0> h = new ArrayList();
    private final ArrayList<ftj_0> i = new ArrayList();
    private boolean j = false;
    private int k = 0;

    private fyi_0() {
    }

    public static fyi_0 a() {
        return a;
    }

    public void a(fyk_0 fyk_02) {
        if (!this.g) {
            this.b.add(fyk_02);
        } else {
            this.c.add(fyk_02);
            this.j = true;
        }
    }

    public void b(fyk_0 fyk_02) {
        if (!this.g) {
            this.b.remove(fyk_02);
        } else {
            this.d.add(fyk_02);
            this.j = true;
        }
    }

    public void a(ftj_0 ftj_02) {
        if (this.g) {
            this.h.add(ftj_02);
            this.j = true;
        } else {
            if (!this.e.contains(ftj_02)) {
                this.e.add(ftj_02);
            }
            this.f = true;
        }
    }

    public void b(ftj_0 ftj_02) {
        if (this.g) {
            if (this.h.contains(ftj_02)) {
                this.h.remove(ftj_02);
            } else {
                this.i.add(ftj_02);
            }
            this.j = true;
        } else {
            this.e.remove(ftj_02);
        }
    }

    public void b() {
        this.e.sort(fyj_0.a);
        this.f = false;
    }

    public void c() {
        this.f = true;
    }

    public boolean d() {
        return this.f;
    }

    public void e() {
        int n;
        this.f();
        int n2 = this.k;
        this.k = 0;
        int n3 = this.e.size();
        for (n = 0; n < n3; ++n) {
            if (!this.e.get(n).h()) continue;
            ++this.k;
        }
        if (this.k == 0 && n2 > 0) {
            n3 = this.b.size();
            for (n = 0; n < n3; ++n) {
                this.b.get(n).a();
            }
        }
        this.g();
    }

    public void f() {
        this.g = true;
    }

    public void g() {
        int n;
        this.g = false;
        if (!this.j) {
            return;
        }
        int n2 = this.h.size();
        if (n2 > 0) {
            for (n = 0; n < n2; ++n) {
                this.a(this.h.get(n));
            }
            this.h.clear();
        }
        if ((n2 = this.i.size()) > 0) {
            for (n = 0; n < n2; ++n) {
                this.b(this.i.get(n));
            }
            this.i.clear();
        }
        if ((n2 = this.c.size()) > 0) {
            for (n = 0; n < n2; ++n) {
                this.a(this.c.get(n));
            }
            this.c.clear();
        }
        if ((n2 = this.d.size()) > 0) {
            for (n = 0; n < n2; ++n) {
                this.b(this.d.get(n));
            }
            this.d.clear();
        }
        this.j = false;
    }
}

