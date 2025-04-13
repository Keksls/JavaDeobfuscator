/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ahM
 */
public abstract class ahm_0 {
    private static final Logger a = Logger.getLogger(ahm_0.class);
    protected final ahg_0 b;
    private final afk_2 c = new afk_2();
    private boolean d = true;
    private float e = 1.0f;
    private int f;
    private int g;
    private adi_1<ahp_0> h;

    protected ahm_0(ahg_0 ahg_02) {
        this.b = ahg_02;
        this.m();
    }

    public final float g() {
        return this.e * this.f();
    }

    public final float h() {
        return this.e;
    }

    public final int i() {
        return this.f;
    }

    public final int j() {
        return this.g;
    }

    public final boolean a(int n, int n2, int n3, int n4) {
        return n4 >= this.c.b && n2 <= this.c.c && n >= this.c.d && n3 <= this.c.e;
    }

    public final void b(int n, int n2) {
        this.f = n;
        this.g = n2;
        float f2 = (float)n / 1024.0f;
        float f3 = (float)n2 / 768.0f;
        this.e = Math.max(1.0f, Math.min(f2, f3));
        this.m();
    }

    protected final void k() {
        this.a(this.g_(), this.h_(), this.c);
        this.d = false;
        this.r();
    }

    public final void a(float f2, float f3, afk_2 afk_22) {
        float f4 = Math.abs(1.0f / (2.0f * this.g()));
        float f5 = (float)this.i() * f4;
        float f6 = (float)this.j() * f4;
        afk_22.b = Hw.c(f2 - f5);
        afk_22.c = Hw.d(f2 + f5);
        afk_22.d = Hw.c(f3 - f6);
        afk_22.e = Hw.d(f3 + f6);
    }

    public final boolean l() {
        return this.d;
    }

    protected final void m() {
        this.d = true;
    }

    public final void a(ahp_0 ahp_02) {
        if (this.h == null) {
            this.h = new adi_1<ahp_0>(new ahn_0(this));
        }
        this.h.a(ahp_02);
    }

    public final void b(ahp_0 ahp_02) {
        this.h.b(ahp_02);
    }

    private void r() {
        if (this.h != null) {
            this.h.a();
        }
    }

    public final afk_2 n() {
        return this.c;
    }

    public final int o() {
        return Hw.b(this.g_());
    }

    public final int p() {
        return Hw.b(this.h_());
    }

    public abstract float e_();

    public abstract float f_();

    public abstract float g_();

    public abstract float h_();

    public abstract float i_();

    public abstract float f();

    public abstract void a(int var1);

    public ahh_0 q() {
        return new aho_0(this);
    }
}

