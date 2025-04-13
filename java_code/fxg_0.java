/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import java.awt.Insets;

/*
 * Renamed from fxg
 */
public final class fxg_0
extends fwk_0 {
    private final ayo_2[] c = new ayo_2[9];
    private boolean d = false;
    private Entity3D e;
    private boolean f = true;
    private azj_2 g;
    private auw_2 h;

    @Override
    public float g() {
        return 0.0f;
    }

    @Override
    public void b(float f2) {
    }

    @Override
    public void a(frs_0 frs_02) {
    }

    @Override
    public frs_0 h() {
        return null;
    }

    @Override
    public void a(boolean bl) {
        this.f = bl;
    }

    @Override
    public void b(azj_2 azj_22) {
    }

    @Override
    public azj_2 e() {
        return null;
    }

    @Override
    public void a(Insets insets) {
    }

    @Override
    public Insets i() {
        return null;
    }

    @Override
    public void a(azj_2 azj_22) {
        if (this.g == azj_22) {
            return;
        }
        this.g = azj_22;
        this.s();
    }

    @Override
    public azj_2 d() {
        return this.g;
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        super.setModulationColor(azj_22);
        this.s();
    }

    private void s() {
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.g == null) {
            f5 = 1.0f;
            f4 = 1.0f;
            f3 = 1.0f;
            f2 = 1.0f;
        } else {
            f2 = this.g.q();
            f3 = this.g.r();
            f4 = this.g.s();
            f5 = this.g.p();
        }
        if (this.a != null) {
            f2 *= this.a.q();
            f3 *= this.a.r();
            f4 *= this.a.s();
            f5 *= this.a.p();
        }
        this.e.a(f2, f3, f4, f5);
    }

    @Override
    public void a(float f2) {
    }

    @Override
    public float f() {
        return 0.0f;
    }

    public ayo_2 j() {
        return this.c[5];
    }

    public void a(ayo_2 ayo_22) {
        this.c[5] = ayo_22;
        this.t();
    }

    public ayo_2 k() {
        return this.c[1];
    }

    public void b(ayo_2 ayo_22) {
        this.c[1] = ayo_22;
        this.t();
    }

    public ayo_2 l() {
        return this.c[2];
    }

    public void c(ayo_2 ayo_22) {
        this.c[2] = ayo_22;
        this.t();
    }

    public ayo_2 m() {
        return this.c[0];
    }

    public void d(ayo_2 ayo_22) {
        this.c[0] = ayo_22;
        this.t();
    }

    public ayo_2 n() {
        return this.c[7];
    }

    public void e(ayo_2 ayo_22) {
        this.c[7] = ayo_22;
        this.t();
    }

    public ayo_2 o() {
        return this.c[8];
    }

    public void f(ayo_2 ayo_22) {
        this.c[8] = ayo_22;
        this.t();
    }

    public ayo_2 p() {
        return this.c[6];
    }

    public void g(ayo_2 ayo_22) {
        this.c[6] = ayo_22;
        this.t();
    }

    public ayo_2 q() {
        return this.c[3];
    }

    public void h(ayo_2 ayo_22) {
        this.c[3] = ayo_22;
        this.t();
    }

    public ayo_2 r() {
        return this.c[4];
    }

    public void i(ayo_2 ayo_22) {
        this.c[4] = ayo_22;
        this.t();
    }

    @Override
    public void a(ayo_2 ayo_22, ayo_2 ayo_23, ayo_2 ayo_24, ayo_2 ayo_25, ayo_2 ayo_26, ayo_2 ayo_27, ayo_2 ayo_28, ayo_2 ayo_29, ayo_2 ayo_210) {
        this.c[0] = ayo_22;
        this.c[1] = ayo_23;
        this.c[2] = ayo_24;
        this.c[3] = ayo_25;
        this.c[4] = ayo_26;
        this.c[5] = ayo_27;
        this.c[6] = ayo_28;
        this.c[7] = ayo_29;
        this.c[8] = ayo_210;
        this.t();
    }

    public void j(ayo_2 ayo_22) {
        this.c[5] = ayo_22;
        this.t();
    }

    public void a(ayo_2[] ayo_2Array) {
        this.c[0] = ayo_2Array[0];
        this.c[1] = ayo_2Array[1];
        this.c[2] = ayo_2Array[2];
        this.c[3] = ayo_2Array[3];
        this.c[4] = ayo_2Array[4];
        this.c[5] = ayo_2Array[5];
        this.c[6] = ayo_2Array[6];
        this.c[7] = ayo_2Array[7];
        this.c[8] = ayo_2Array[8];
        this.t();
    }

    private void t() {
        if (this.c[4] == null) {
            this.d = false;
            return;
        }
        int n = 0;
        for (int k = this.c.length - 1; k >= 0; --k) {
            if (this.c[k] == null) continue;
            ++n;
        }
        if (n != 1 && n != 9) {
            this.d = false;
            return;
        }
        this.d = true;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float f2) {
        if (!this.d) {
            return;
        }
        this.e.c();
        int[] nArray = new int[3];
        int[] nArray2 = new int[3];
        n3 = (int)((float)n3 * (this.f ? f2 : 1.0f));
        n4 = (int)((float)n4 * (this.f ? 1.0f : f2));
        nArray[0] = this.c[0].e();
        nArray[2] = this.c[2].e();
        nArray[1] = Math.max(0, n3 - (nArray[0] + nArray[2]));
        nArray2[0] = this.c[0].d();
        nArray2[2] = this.c[6].d();
        nArray2[1] = Math.max(0, n4 - (nArray2[0] + nArray2[2]));
        this.a(9);
        int n5 = n4 + n2;
        for (int k = 0; k < 3; ++k) {
            int n6 = n;
            for (int i2 = 0; i2 < 3; ++i2) {
                this.a(n6, n5, nArray[i2], nArray2[k], this.c[k * 3 + i2]);
                n6 += nArray[i2];
            }
            n5 -= nArray2[k];
        }
        this.u();
    }

    @Override
    public final Entity a() {
        return this.e;
    }

    @Override
    public final void b() {
        assert (this.e == null);
        this.e = (Entity3D)Entity3D.c.d();
    }

    @Override
    public final void c() {
        super.c();
        this.e.u();
        this.e = null;
        this.g = null;
        if (this.h != null) {
            this.h.a();
            this.h = null;
        }
    }

    private void a(int n, int n2, int n3, int n4, ayo_2 ayo_22) {
        if (n3 == 0 || n4 == 0) {
            return;
        }
        this.h.a(n, n2, n3, n4, ayo_22, null);
    }

    private void a(int n) {
        if (this.h == null) {
            this.h = new auw_2();
        }
        this.h.a(this.e, n);
    }

    private void u() {
        this.h.b();
    }
}

