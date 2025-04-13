/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class fzn {
    private static final Logger a = Logger.getLogger(fzn.class);
    private static final fzn b = new fzn();
    private final ArrayList<fzm> c = new ArrayList();
    private final ArrayList<fzm> d = new ArrayList();
    private final ArrayList<fzl_0> e = new ArrayList();
    private final ArrayList<fzk_0> f = new ArrayList();
    private fzl_0 g;

    private fzn() {
    }

    public static fzn a() {
        return b;
    }

    public void a(fzl_0 fzl_02) {
        this.e.add(fzl_02);
    }

    public void a(fzl_0 fzl_02, boolean bl) {
        this.e.remove(fzl_02);
        if (bl && fzl_02.b()) {
            for (int k = this.f.size() - 1; k >= 0; --k) {
                this.f.get(k).a();
            }
        }
    }

    public void a(fzk_0 fzk_02) {
        this.f.add(fzk_02);
    }

    public void b(fzk_0 fzk_02) {
        this.f.remove(fzk_02);
    }

    public void a(fzm fzm2) {
        this.c.add(fzm2);
    }

    public void b(fzm fzm2) {
        this.c.remove(fzm2);
    }

    public void a(fvE fvE2, int n, int n2) {
        for (fzl_0 fzl_02 : this.e) {
            if (!fzl_02.a(fvE2, n, n2)) continue;
            this.g = fzl_02;
            this.g.a(n, n2);
            this.d.clear();
            for (fzm fzm2 : this.c) {
                if (!fzm2.a(this.g.c())) continue;
                this.d.add(fzm2);
            }
            return;
        }
    }

    public boolean b(fvE fvE2, int n, int n2) {
        if (this.g != null && this.g.d()) {
            this.g.a(n, n2, fvE2);
            for (fzm fzm2 : this.d) {
                fzm2.a(this.g, n, n2, fvE2);
            }
            return true;
        }
        return false;
    }

    public void c(fvE fvE2, int n, int n2) {
        if (this.g != null && this.g.e()) {
            this.g.b(n, n2, fvE2);
            for (fzm fzm2 : this.d) {
                fzm2.b(this.g, n, n2, fvE2);
            }
            this.g = null;
        }
    }

    public void b() {
        if (this.g != null) {
            this.g.a();
            this.g = null;
        }
    }

    public void c() {
        this.g = null;
    }
}

