/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from aLL
 */
public abstract class all_1
implements ald_1 {
    private static final boolean i = false;
    protected static final Logger a = Logger.getLogger(all_1.class);
    private byte j = 0;
    private byte k = 0;
    private float l = 1.0f;
    private float m = 1.0f;
    private float n = 1.0f;
    private float o = 1.0f;
    private float p;
    private float q;
    private boolean r = false;
    private boolean s = false;
    private final String t;
    protected aln_1 b;
    protected ams_1 c;
    protected amf_1 d;
    protected int e = 0;
    protected boolean f;
    protected byte g = 0;
    private boolean u = true;
    private final ArrayList<alm_1> v = new ArrayList();
    private final ArrayList<alm_1> w = new ArrayList();
    private final ArrayList<alm_1> x = new ArrayList();
    private final byte y;

    protected all_1(String string) {
        this(string, -1);
    }

    protected all_1(String string, byte by) {
        this(string, 0, by);
    }

    protected all_1(String string, byte by, byte by2) {
        this.t = string;
        this.b = null;
        this.p = 0.0f;
        this.g = by;
        this.y = by2;
    }

    public boolean a(int n) {
        if (n > this.j - this.k) {
            return false;
        }
        this.k = (byte)(this.k + n);
        return true;
    }

    public boolean b(int n) {
        if (this.k < n) {
            return false;
        }
        this.k = (byte)(this.k - n);
        return true;
    }

    public void a(alm_1 alm_12) {
        this.w.add(alm_12);
    }

    public void b(alm_1 alm_12) {
        this.x.add(alm_12);
    }

    public byte b() {
        return this.j;
    }

    public boolean a(byte by) {
        assert (by >= 0) : "Nombre de voix invalide";
        if (by == this.j) {
            return false;
        }
        if (by > this.j ? !this.c.d(by - this.j) : !this.c.e(this.j - by)) {
            return false;
        }
        this.j = by;
        return true;
    }

    public byte c() {
        return this.y;
    }

    public byte d() {
        return this.g;
    }

    public void b(byte by) {
        this.g = by;
    }

    public boolean e() {
        return this.u;
    }

    public void a(boolean bl) {
        this.u = bl;
    }

    public aln_1 f() {
        return this.b;
    }

    public void a(aln_1 aln_12) {
        this.b = aln_12;
    }

    public void a(ams_1 ams_12) {
        this.c = ams_12;
    }

    public ams_1 g() {
        return this.c;
    }

    public final void a(amf_1 amf_12) {
        this.d = amf_12;
    }

    public final amf_1 h() {
        assert (this.d != null) : "Il faut d'abord initialiser en  appelant setHelper";
        return this.d;
    }

    public float i() {
        return this.m;
    }

    public void a(float f2) {
        this.m = f2;
        this.f(this.m);
    }

    public float j() {
        return this.l;
    }

    public void b(float f2) {
        this.l = f2;
        this.a(this.l);
    }

    public void c(float f2) {
        this.a(this.l * f2);
    }

    public float k() {
        return this.m / this.l;
    }

    @Override
    public final float a() {
        return this.n * this.m;
    }

    public final float l() {
        return this.n;
    }

    public final void d(float f2) {
        if (this.n != f2) {
            float f3 = this.n;
            this.n = f2;
            this.b(f3, this.n);
            this.f(this.i());
        }
    }

    public final void e(float f2) {
        if (this.o != f2) {
            this.c(this.o, f2);
            this.f(this.i());
            this.o = f2;
        }
    }

    public final float m() {
        return this.o;
    }

    public final boolean n() {
        return this.r;
    }

    public final void b(boolean bl) {
        this.a(this.r, bl);
        this.r = bl;
    }

    public boolean o() {
        return this.u && (!this.r || this.s);
    }

    public boolean p() {
        return this.s;
    }

    public void c(boolean bl) {
        this.s = bl;
    }

    public String q() {
        return this.t;
    }

    public abstract Collection<amj_1> r();

    public abstract amj_1 a(amx_1 var1, boolean var2, boolean var3, boolean var4, long var5);

    public amj_1 a(long l, boolean bl, boolean bl2, boolean bl3, long l2) {
        if (this.d != null && this.o()) {
            amx_1 amx_12;
            try {
                amx_12 = this.d.a(l);
            }
            catch (IOException iOException) {
                a.error((Object)("Impossible de charger le son d'id " + l));
                return null;
            }
            if (amx_12 == null) {
                a.error((Object)("Impossible de charger le son d'id " + l));
                return null;
            }
            return this.a(amx_12, bl, bl2, bl3, l2);
        }
        return null;
    }

    public abstract void a(amj_1 var1);

    public abstract void b(float var1, float var2);

    public abstract void f(float var1);

    public abstract void c(float var1, float var2);

    public abstract void a(boolean var1, boolean var2);

    public amj_1 a(long l, long l2) {
        amx_1 amx_12;
        try {
            amx_12 = this.d.a(l);
        }
        catch (IOException iOException) {
            a.error((Object)("Impossible de pr\u00e9parer le son d'id " + l), (Throwable)iOException);
            return null;
        }
        if (amx_12 == null) {
            a.error((Object)("Impossible de pr\u00e9parer le son d'id " + l));
            return null;
        }
        return this.a(amx_12, l2);
    }

    public amj_1 a(amx_1 amx_12, long l) {
        if (this.o()) {
            return this.c.a(amx_12, this, l);
        }
        return null;
    }

    public abstract void s();

    public void a(long l) {
        int n;
        for (n = this.w.size() - 1; n >= 0; --n) {
            this.v.add(this.w.remove(n));
        }
        for (n = this.x.size() - 1; n >= 0; --n) {
            this.v.remove(this.x.remove(n));
        }
        int n2 = this.v.size();
        for (n = 0; n < n2; ++n) {
            this.v.get(n).a(this, l);
        }
        float f2 = 0.0f;
        if (this.p > 0.0f) {
            f2 = Math.min(this.q, this.n + this.p);
        } else if (this.p < 0.0f) {
            f2 = Math.max(this.q, this.n + this.p);
        } else {
            return;
        }
        if (f2 == this.q) {
            this.p = 0.0f;
            this.q = 0.0f;
        }
        this.d(f2);
    }

    @Override
    public void a(float f2, float f3) {
        if (f3 > 0.0f) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > this.m()) {
                this.e(f2);
            }
            this.q = f2;
            this.p = (f2 - this.a()) * 10.0f / f3;
        }
    }

    public abstract void t();

    public abstract void b(amj_1 var1);

    public void u() {
    }

    public void v() {
    }

    public boolean c(int n) {
        if (this.e == n) {
            return false;
        }
        this.e = n;
        return true;
    }

    public boolean w() {
        return this.f;
    }

    public void d(boolean bl) {
        this.f = bl;
    }
}

