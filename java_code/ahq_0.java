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
 * Renamed from ahQ
 */
public class ahq_0
extends ahm_0
implements aln_1 {
    private static final Logger a = Logger.getLogger((String)"camera");
    private boolean c = true;
    private boolean d;
    private final air_0 e = new air_0();
    private final ais f = new ais();
    private float g;
    private float h;
    private float i;
    @NotNull
    private ahh_0 j = new ahf_0();
    private final ahr_0 k = new ahr_0();
    private ahy_0 l = new aia_0();
    private final adi_1<ahj_0> m = new adi_1<ahj_0>(ahj_0::a);
    private final afr_2 n = new afr_2();

    public ahq_0(ahg_0 ahg_02) {
        this(ahg_02, true);
    }

    public ahq_0(ahg_0 ahg_02, boolean bl) {
        super(ahg_02);
        this.c(bl);
        this.e.b(2.1f);
        this.e.a(0.01f);
        this.f.a(0.01f);
        this.e.c(1.2f);
    }

    @Override
    public void a(int n) {
        this.v();
        this.b(n);
        float f2 = this.j.J();
        float f3 = this.j.K();
        float f4 = this.j.L();
        this.k.a(f2, f3, f4);
        afd_1 afd_12 = this.l.a(this.b, this);
        this.f.c(afd_12.a, afd_12.b);
        boolean bl = this.f.a(n, 1.0f / this.f(), this.c);
        this.F();
        if (bl) {
            this.m();
        } else if (!this.k.d) {
            this.E();
        }
        if (this.l()) {
            this.k();
        }
    }

    protected final void b(int n) {
        float f2 = this.e.a();
        if (f2 != this.e.a(n)) {
            this.m();
        }
    }

    public void a(aiu aiu2) {
        this.f.a(aiu2);
    }

    public final void r() {
        float f2 = this.j.J();
        float f3 = this.j.K();
        float f4 = this.j.L();
        float f5 = this.b.c(f2, f3);
        float f6 = this.b.a(f2, f3, f4);
        this.f.a(f5, f6);
        this.F();
        this.m();
        this.k.d = false;
    }

    public final void s() {
        this.r();
        this.k();
    }

    public float t() {
        return this.e.b();
    }

    public void a(float f2) {
        this.e.e(Hw.b(f2, agB.a().b(), agB.a().c()));
    }

    public void b(float f2) {
        this.e.c(f2);
        this.k();
    }

    @Override
    public float f() {
        return this.e.a();
    }

    @Override
    public float e_() {
        return this.b.b(this.f.d(), this.f.e(), this.j.L());
    }

    @Override
    public float f_() {
        return this.b.c(this.f.d(), this.f.e(), this.j.L());
    }

    @NotNull
    public ahh_0 u() {
        return this.j;
    }

    public void a(@NotNull ahh_0 ahh_02) {
        this.j = ahh_02;
        this.k.d = false;
    }

    public void a(ahy_0 ahy_02) {
        this.l = ahy_02;
    }

    public float[] a(aiG aiG2) {
        return ahs_0.h;
    }

    public final void a(ahj_0 ahj_02) {
        this.m.a(ahj_02);
    }

    public final void b(ahj_0 ahj_02) {
        this.m.b(ahj_02);
    }

    private void E() {
        this.k.d = true;
        this.m.a();
    }

    public final void c(float f2) {
        if (!this.d) {
            this.a(this.t() - f2);
        }
    }

    public final void b(boolean bl) {
        this.d = bl;
    }

    public void d(float f2) {
        this.e.b(2.1f * f2);
    }

    public void e(float f2) {
        this.f.b(2.1f * f2);
    }

    public void a(float f2, float f3) {
        this.b(this.g + f2, this.h + f3);
    }

    public void v() {
        this.b(0.0f, 0.0f);
        this.i = 0.0f;
    }

    private void b(float f2, float f3) {
        if (this.g != f2 || this.h != f3) {
            this.g = f2;
            this.h = f3;
            this.m();
        }
    }

    public final void c(boolean bl) {
        this.c = bl;
        this.f.b(this.c ? 10.0f : 2.1f);
    }

    private void F() {
        float f2 = this.j.J();
        float f3 = this.j.K();
        float f4 = this.j.L();
        this.n.a(f2 - f3, -(f2 + f3), f4 / 4.8f);
    }

    @Override
    public afr_2 w() {
        return this.n;
    }

    @Override
    public float x() {
        return this.g();
    }

    @Override
    public int d() {
        return 0;
    }

    @Override
    public float g_() {
        return this.f.d() + this.g;
    }

    @Override
    public float h_() {
        return this.f.e() + this.h;
    }

    @Override
    public float i_() {
        return this.i;
    }

    public float y() {
        return this.j.J();
    }

    public float z() {
        return this.j.K();
    }

    public float A() {
        return this.j.L();
    }

    public int B() {
        return Hw.b(this.y());
    }

    public int C() {
        return Hw.b(this.z());
    }

    public short D() {
        return (short)Hw.b(this.A());
    }

    public void f(float f2) {
        this.i = f2;
    }
}

