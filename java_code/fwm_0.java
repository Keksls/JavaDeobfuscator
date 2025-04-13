/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import java.awt.Insets;
import org.apache.log4j.Logger;

/*
 * Renamed from fwM
 */
public final class fwm_0
extends fwk_0 {
    private static final Logger c = Logger.getLogger(fwm_0.class);
    private final ayo_2[] d = new ayo_2[9];
    private boolean e = false;
    private Entity3D f;
    private boolean g = true;
    private azj_2 h;
    private fwl_0 i;
    private float j = 1.5707964f;
    private auw_2 k;

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
        this.g = bl;
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
        if (this.h == azj_22) {
            return;
        }
        this.h = azj_22;
        this.s();
    }

    @Override
    public azj_2 d() {
        return this.h;
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
        if (this.h == null) {
            f5 = 1.0f;
            f4 = 1.0f;
            f3 = 1.0f;
            f2 = 1.0f;
        } else {
            f2 = this.h.q();
            f3 = this.h.r();
            f4 = this.h.s();
            f5 = this.h.p();
        }
        if (this.a != null) {
            f2 *= this.a.q();
            f3 *= this.a.r();
            f4 *= this.a.s();
            f5 *= this.a.p();
        }
        this.f.a(f2, f3, f4, f5);
    }

    @Override
    public void a(float f2) {
    }

    @Override
    public float f() {
        return 0.0f;
    }

    public ayo_2 j() {
        return this.d[5];
    }

    public void a(ayo_2 ayo_22) {
        this.d[5] = ayo_22;
        this.t();
    }

    public ayo_2 k() {
        return this.d[1];
    }

    public void b(ayo_2 ayo_22) {
        this.d[1] = ayo_22;
        this.t();
    }

    public ayo_2 l() {
        return this.d[2];
    }

    public void c(ayo_2 ayo_22) {
        this.d[2] = ayo_22;
        this.t();
    }

    public ayo_2 m() {
        return this.d[0];
    }

    public void d(ayo_2 ayo_22) {
        this.d[0] = ayo_22;
        this.t();
    }

    public ayo_2 n() {
        return this.d[7];
    }

    public void e(ayo_2 ayo_22) {
        this.d[7] = ayo_22;
        this.t();
    }

    public ayo_2 o() {
        return this.d[8];
    }

    public void f(ayo_2 ayo_22) {
        this.d[8] = ayo_22;
        this.t();
    }

    public ayo_2 p() {
        return this.d[6];
    }

    public void g(ayo_2 ayo_22) {
        this.d[6] = ayo_22;
        this.t();
    }

    public ayo_2 q() {
        return this.d[3];
    }

    public void h(ayo_2 ayo_22) {
        this.d[3] = ayo_22;
        this.t();
    }

    public ayo_2 r() {
        return this.d[4];
    }

    public void i(ayo_2 ayo_22) {
        this.d[4] = ayo_22;
        this.t();
    }

    @Override
    public void a(ayo_2 ayo_22, ayo_2 ayo_23, ayo_2 ayo_24, ayo_2 ayo_25, ayo_2 ayo_26, ayo_2 ayo_27, ayo_2 ayo_28, ayo_2 ayo_29, ayo_2 ayo_210) {
        this.d[0] = ayo_22;
        this.d[1] = ayo_23;
        this.d[2] = ayo_24;
        this.d[3] = ayo_25;
        this.d[4] = ayo_26;
        this.d[5] = ayo_27;
        this.d[6] = ayo_28;
        this.d[7] = ayo_29;
        this.d[8] = ayo_210;
        this.t();
    }

    public void j(ayo_2 ayo_22) {
        this.d[5] = ayo_22;
        this.t();
    }

    public void a(ayo_2[] ayo_2Array) {
        this.d[0] = ayo_2Array[0];
        this.d[1] = ayo_2Array[1];
        this.d[2] = ayo_2Array[2];
        this.d[3] = ayo_2Array[3];
        this.d[4] = ayo_2Array[4];
        this.d[5] = ayo_2Array[5];
        this.d[6] = ayo_2Array[6];
        this.d[7] = ayo_2Array[7];
        this.d[8] = ayo_2Array[8];
        this.t();
    }

    private void t() {
        if (this.d[4] == null) {
            this.e = false;
            return;
        }
        int n = 0;
        for (int k = this.d.length - 1; k >= 0; --k) {
            if (this.d[k] == null) continue;
            ++n;
        }
        if (n != 1 && n != 9) {
            this.e = false;
            return;
        }
        this.e = true;
        this.i.a(this.d[4]);
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float f2) {
        if (!this.e) {
            return;
        }
        this.f.c();
        int[] nArray = new int[3];
        int[] nArray2 = new int[3];
        nArray[0] = this.d[0].e();
        nArray[2] = this.d[2].e();
        nArray[1] = Math.max(0, n3 - (nArray[0] + nArray[2]));
        nArray2[0] = this.d[0].d();
        nArray2[2] = this.d[6].d();
        nArray2[1] = Math.max(0, n4 - (nArray2[0] + nArray2[2]));
        this.a(9);
        int n5 = n4 + n2;
        for (int k = 0; k < 3; ++k) {
            int n6 = n;
            for (int i2 = 0; i2 < 3; ++i2) {
                this.a(n6, n5, nArray[i2], nArray2[k], this.d[k * 3 + i2]);
                n6 += nArray[i2];
            }
            n5 -= nArray2[k];
        }
        this.u();
        this.c(f2);
    }

    private void c(float f2) {
        float f3 = (float)Math.PI * 2 * f2;
        float f4 = (float)Math.PI * 2;
        this.i.a(f3);
        this.i.b((float)Math.PI * 2);
    }

    @Override
    public final Entity a() {
        return this.f;
    }

    @Override
    public final void b() {
        assert (this.f == null);
        this.f = (Entity3D)Entity3D.c.d();
        try {
            this.i = new fwl_0();
            this.f.a(this.i.c(), this.i.d(), this.i.f());
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public final void c() {
        super.c();
        this.f.u();
        this.f = null;
        this.h = null;
        if (this.k != null) {
            this.k.a();
            this.k = null;
        }
    }

    private void a(int n, int n2, int n3, int n4, ayo_2 ayo_22) {
        if (n3 == 0 || n4 == 0) {
            return;
        }
        this.k.a(n, n2, n3, n4, ayo_22, null);
    }

    private void a(int n) {
        if (this.k == null) {
            this.k = new auw_2();
        }
        this.k.a(this.f, n);
    }

    private void u() {
        this.k.b();
    }
}

