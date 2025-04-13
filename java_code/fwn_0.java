/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import java.awt.Insets;

/*
 * Renamed from fwN
 */
public class fwn_0
extends fwk_0 {
    private static final byte d = 32;
    private Entity3D e;
    private VertexBufferPCT f;
    private auf_2 g;
    private azj_2 h;
    private float i = 0.5f;
    private float j = 1.0f;
    private final byte k = (byte)32;
    private float l = 1.5707964f;
    private float m = 1.0f;
    protected ayo_2 b = null;

    @Override
    public float g() {
        return this.l;
    }

    @Override
    public void b(float f2) {
        this.l = f2;
    }

    @Override
    public void a(frs_0 frs_02) {
    }

    @Override
    public frs_0 h() {
        return null;
    }

    @Override
    public final void a(azj_2 azj_22) {
        if (this.h == azj_22) {
            return;
        }
        this.h = azj_22;
        this.m();
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        super.setModulationColor(azj_22);
        this.m();
    }

    private void m() {
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
        for (int k = 0; k < this.f.k(); ++k) {
            this.f.a(k, f2, f3, f4, f5);
        }
    }

    @Override
    public float f() {
        return this.m;
    }

    @Override
    public void a(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.m = f2;
    }

    @Override
    public final azj_2 d() {
        return this.h;
    }

    public float j() {
        return this.i;
    }

    public void c(float f2) {
        this.i = f2;
    }

    public float k() {
        return this.j;
    }

    public void d(float f2) {
        this.j = f2;
    }

    public boolean l() {
        return false;
    }

    @Override
    public void a(boolean bl) {
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
    public void a(ayo_2 ayo_22, ayo_2 ayo_23, ayo_2 ayo_24, ayo_2 ayo_25, ayo_2 ayo_26, ayo_2 ayo_27, ayo_2 ayo_28, ayo_2 ayo_29, ayo_2 ayo_210) {
        this.b = ayo_26;
        this.e.a(0, this.b.a());
        this.a(this.f, this.f.j());
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int n5;
        float f9 = -((float)(Math.PI * 2 * (double)this.m)) / 32.0f;
        int n6 = (int)Math.floor(32.0f * f2) + 1;
        float f10 = -((float)(Math.PI * 2 * (double)this.m * (double)f2));
        int n7 = (n6 + (n6 > 32 ? 0 : 1)) * 2;
        if (n7 < 4) {
            this.a(0);
            return;
        }
        this.a(n7);
        int n8 = n3 / 2 + n;
        int n9 = n4 / 2 + n2;
        float f11 = (float)Math.min(n3, n4) / 2.0f;
        float f12 = f11 * this.i;
        float f13 = f11 * this.j;
        for (n5 = 0; n5 < n6; ++n5) {
            f8 = (float)Math.cos(f9 * (float)n5 + this.l);
            f7 = (float)Math.sin(f9 * (float)n5 + this.l);
            f6 = f8 * f12 + (float)n8;
            f5 = f7 * f12 + (float)n9;
            f4 = f8 * f13 + (float)n8;
            f3 = f7 * f13 + (float)n9;
            this.f.b(n5 * 2, f6, f5);
            this.f.b(n5 * 2 + 1, f4, f3);
        }
        if (n6 < 33) {
            n5 = n6;
            f8 = (float)Math.cos(f10 + this.l);
            f7 = (float)Math.sin(f10 + this.l);
            f6 = f8 * f12 + (float)n8;
            f5 = f7 * f12 + (float)n9;
            f4 = f8 * f13 + (float)n8;
            f3 = f7 * f13 + (float)n9;
            this.f.b(n5 * 2, f6, f5);
            this.f.b(n5 * 2 + 1, f4, f3);
        }
    }

    @Override
    public final Entity a() {
        return this.e;
    }

    private void a(int n) {
        if (n != this.f.j()) {
            this.a(this.f, n);
        }
    }

    protected void a(VertexBufferPCT vertexBufferPCT, int n) {
        vertexBufferPCT.a(n);
        if (this.b != null) {
            boolean bl = false;
            for (int k = 0; k < n; ++k) {
                boolean bl2 = k % 4 < 2;
                bl = !bl;
                float f2 = bl2 ? this.b.i() : this.b.h();
                float f3 = bl ? this.b.k() : this.b.j();
                vertexBufferPCT.a(k, f2, f3);
            }
        }
    }

    @Override
    public void b() {
        assert (this.e == null);
        assert (this.f == null);
        assert (this.g == null);
        this.e = (Entity3D)Entity3D.c.d();
        GeometryMesh geometryMesh = (GeometryMesh)GLGeometryMesh.k.d();
        int n = 66;
        this.f = VertexBufferPCT.d.a(66);
        this.g = auf_2.b;
        this.f.a(66);
        this.a(new azf_2(azf_2.e));
        geometryMesh.a(ave_1.e, this.f, this.g);
        this.e.a(geometryMesh);
        geometryMesh.u();
    }

    @Override
    public final void c() {
        super.c();
        this.f.u();
        this.f = null;
        this.g = null;
        this.e.u();
        this.e = null;
        this.h = null;
        this.b = null;
    }
}

