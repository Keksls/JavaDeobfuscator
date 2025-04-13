/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Yx
 */
public class yx_0 {
    private static final ys_0[] b = new ys_0[32];
    private acf_2 c;
    private final aby_2 d = new aby_2(324);
    private final aby_2 e = new aby_2(324);
    private final yv_0 f;
    private static final Logger g;

    public yx_0(@NotNull yv_0 yv_02) {
        this.f = yv_02;
    }

    public boolean a(int n, int n2) {
        if (this.f.a(n, n2)) {
            return true;
        }
        return this.d.a((n2 -= this.f.e) * 18 + (n -= this.f.d));
    }

    public boolean a(int n, int n2, short s2) {
        if (this.a(n, n2)) {
            return true;
        }
        return this.c != null && this.c.c(apb_2.a(n, n2, s2));
    }

    public boolean b(int n, int n2) {
        if (this.a(n, n2)) {
            return true;
        }
        if (this.c == null) {
            return false;
        }
        for (int k = 0; k < this.c.d(); ++k) {
            aff_1 aff_12 = apb_2.a(this.c.b(k));
            if (aff_12.d() != n || aff_12.e() != n2) continue;
            return true;
        }
        return false;
    }

    public final int a(int n, int n2, int n3) {
        assert (this.f.b(n, n2));
        int n4 = this.f.a(n, n2, b, 0);
        if (n4 == 0) {
            return 0;
        }
        for (int k = 0; k < n4; ++k) {
            if (yx_0.b[k].c != n3) continue;
            return b[k].c();
        }
        return 0;
    }

    public boolean b(int n, int n2, int n3) {
        return ys_0.a(this.a(n, n2, n3));
    }

    public boolean c(int n, int n2) {
        return this.e.a((n2 -= this.f.e) * 18 + (n -= this.f.d));
    }

    public final yv_0 a() {
        return this.f;
    }

    public void a(int n, int n2, boolean bl) {
        if (this.a(n, n2) == bl) {
            return;
        }
        this.d.a((n2 -= this.f.e) * 18 + (n -= this.f.d), bl);
    }

    public void a(int n, int n2, short s2, boolean bl) {
        if (this.a(n, n2, s2) == bl) {
            return;
        }
        if (this.a().a(n, n2, b, 0) == 1) {
            this.a(n, n2, bl);
            return;
        }
        if (!bl) {
            if (this.c != null) {
                this.c.e(apb_2.a(n, n2, s2));
            }
        } else {
            if (this.c == null) {
                this.c = new acf_2();
            }
            this.c.d(apb_2.a(n, n2, s2));
        }
    }

    public void b(int n, int n2, boolean bl) {
        if (this.c(n, n2) == bl) {
            return;
        }
        if (bl) {
            if (!this.b(n, n2)) {
                this.e.a((n2 -= this.f.e) * 18 + (n -= this.f.d), true);
            }
        } else {
            this.e.a((n2 -= this.f.e) * 18 + (n -= this.f.d), false);
        }
    }

    public boolean c(int n, int n2, int n3) {
        try {
            int n4 = this.f.a(n, n2, b, 0);
            for (int k = 0; k < n4; ++k) {
                ys_0 ys_02 = b[k];
                if (ys_02 == null || ys_02.c != n3 || !ys_02.l()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            g.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public boolean d(int n, int n2, int n3) {
        try {
            int n4 = this.f.a(n, n2, b, 0);
            for (int k = 0; k < n4; ++k) {
                ys_0 ys_02 = b[k];
                if (ys_02 == null || ys_02.c != n3 || !ys_02.o()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            g.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public boolean e(int n, int n2, int n3) {
        try {
            int n4 = this.f.a(n, n2, b, 0);
            for (int k = 0; k < n4; ++k) {
                ys_0 ys_02 = b[k];
                if (ys_02 == null || ys_02.c != n3 || !ys_02.m()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            g.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public boolean f(int n, int n2, int n3) {
        try {
            int n4 = this.f.a(n, n2, b, 0);
            for (int k = 0; k < n4; ++k) {
                ys_0 ys_02 = b[k];
                if (ys_02 == null || ys_02.c != n3 || !ys_02.n()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            g.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public boolean g(int n, int n2, int n3) {
        try {
            int n4 = this.f.a(n, n2, b, 0);
            for (int k = 0; k < n4; ++k) {
                ys_0 ys_02 = b[k];
                if (ys_02 == null || ys_02.c != n3 || !ys_02.q()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            g.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    static {
        for (int k = 0; k < b.length; ++k) {
            yx_0.b[k] = new ys_0();
        }
        g = Logger.getLogger(yx_0.class);
    }
}

