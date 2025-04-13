/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

/*
 * Renamed from adH
 */
public class adh_0
extends ado_0 {
    private final Random w = new Random();
    private float x;
    private float y;
    private float z;
    private final float A;
    private final float B;
    private final float C;
    private final float D = 1.0f;
    private final float E = 1.0f;
    private final float F = 1.0f;
    private float G = 0.2f;

    public adh_0() {
        super(new adi_0());
        this.f = 10.0f;
        this.a = 0.3f;
        this.x = 15.0f;
        this.y = 1.0f;
        this.A = 0.5f;
        this.B = 0.5f;
        this.C = -3.0f;
    }

    public void a(float f2, float f3, float f4, float f5) {
        this.a(true);
        this.f = f2;
        this.a = f3 * 0.001f;
        this.x = f4 * 0.001f;
        this.y = f5;
        this.d();
    }

    public void d() {
        String string = "textures/snow.tga";
        avx_2 avx_22 = auj_1.a.a();
        ays_2 ays_22 = ayu_2.a().a((aui_2)avx_22, -1296775008915292151L, auc_1.a().c() + "textures/snow.tga", false);
        this.g.a(0, ays_22);
    }

    public void a(float f2) {
        this.z = f2;
    }

    @Override
    protected boolean b() {
        return false;
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    protected void a(adr_0 adr_02) {
        float f2 = this.e.e_();
        float f3 = this.e.f_();
        float f4 = this.e.A();
        adr_02.a = this.t.c() + Hw.d() * this.t.h() + f2;
        adr_02.b = this.t.e() + Hw.d() * this.t.i() + f3;
        adr_02.c = this.t.f() - Hw.d() * ((this.t.f() + this.t.g()) * 0.5f) + f4;
        adr_02.d = 0.0f;
        adr_02.e = 0.0f;
        adr_02.f = 0.0f;
        adr_02.o = this.x;
        adr_02.n = 0.0f;
        adr_02.j = 1.0f;
        adr_02.k = 1.0f;
        adr_02.l = 1.0f;
        adr_02.m = 0.75f + this.w.nextFloat() * 0.25f;
        adr_02.t = adr_02.u = this.y + this.y * Hw.d() * 1.5f;
        adr_02.p = 0.0f;
        adr_02.q = 0.0f;
        adr_02.s = 1.0f;
        adr_02.r = 1.0f;
        adg_0 adg_02 = (adg_0)adr_02;
        adg_02.w = this.A + Hw.d() * this.B;
        adg_02.x = false;
        adg_02.y = this.z;
        adg_02.z = this.C;
    }

    @Override
    protected final void a(adr_0 adr_02, float f2) {
        adg_0 adg_02 = (adg_0)adr_02;
        if (adr_02.c <= this.e.A() + 0.1f) {
            adg_02.x = true;
        }
        adg_02.y += this.z;
        adr_02.a(f2);
    }
}

