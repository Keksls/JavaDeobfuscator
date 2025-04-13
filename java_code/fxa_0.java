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
 * Renamed from fxa
 */
public class fxa_0
extends fwk_0 {
    private Entity3D c;
    private VertexBufferPCT d;
    private auf_2 e;
    private azj_2 f;
    private frs_0 g = frs_0.e;

    @Override
    public float g() {
        return 0.0f;
    }

    @Override
    public void b(float f2) {
    }

    @Override
    public void a(ayo_2 ayo_22, ayo_2 ayo_23, ayo_2 ayo_24, ayo_2 ayo_25, ayo_2 ayo_26, ayo_2 ayo_27, ayo_2 ayo_28, ayo_2 ayo_29, ayo_2 ayo_210) {
    }

    @Override
    public void b(azj_2 azj_22) {
    }

    @Override
    public Insets i() {
        return null;
    }

    @Override
    public azj_2 e() {
        return null;
    }

    @Override
    public void a(Insets insets) {
    }

    @Override
    public final void a(azj_2 azj_22) {
        if (this.f == azj_22) {
            return;
        }
        this.f = azj_22;
        this.k();
    }

    @Override
    public final azj_2 d() {
        return this.f;
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        super.setModulationColor(azj_22);
        this.k();
    }

    private void k() {
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.f == null) {
            f5 = 1.0f;
            f4 = 1.0f;
            f3 = 1.0f;
            f2 = 1.0f;
        } else {
            f2 = this.f.q();
            f3 = this.f.r();
            f4 = this.f.s();
            f5 = this.f.p();
        }
        if (this.a != null) {
            f2 *= this.a.q();
            f3 *= this.a.r();
            f4 *= this.a.s();
            f5 *= this.a.p();
        }
        for (int k = 0; k < this.d.k(); ++k) {
            this.d.a(k, f2, f3, f4, f5);
        }
    }

    public boolean j() {
        return false;
    }

    @Override
    public void a(boolean bl) {
    }

    @Override
    public void a(float f2) {
    }

    @Override
    public float f() {
        return 0.0f;
    }

    @Override
    public void a(frs_0 frs_02) {
        this.g = frs_02;
    }

    @Override
    public frs_0 h() {
        return this.g;
    }

    private float[] c(float f2) {
        float f3;
        float[] fArray = null;
        fArray = f2 == 0.0f ? new float[]{} : (f2 <= 0.3f ? new float[6] : (f2 <= 0.6f ? new float[10] : (f2 <= 0.9f ? new float[14] : new float[18])));
        if (f2 > 0.0f) {
            f3 = Math.min(1.0f, f2 / 0.3f);
            fArray[0] = 0.5f;
            fArray[1] = 0.0f;
            fArray[2] = 0.5f - 0.3f * f3;
            fArray[3] = 0.3f * f3;
            fArray[4] = 1.0f - fArray[2];
            fArray[5] = fArray[3];
        }
        if (f2 > 0.3f) {
            f3 = Math.min(1.0f, (f2 - 0.3f) / 0.3f);
            fArray[6] = 0.2f * (1.0f - f3);
            fArray[7] = 0.3f + 0.3f * f3;
            fArray[8] = 1.0f - fArray[6];
            fArray[9] = fArray[7];
        }
        if (f2 > 0.6f) {
            f3 = Math.min(1.0f, (f2 - 0.6f) / 0.3f);
            fArray[10] = 0.0f;
            fArray[11] = 0.6f + 0.3f * f3;
            fArray[12] = 1.0f;
            fArray[13] = fArray[11];
        }
        if (f2 > 0.9f) {
            f3 = Math.min(1.0f, (f2 - 0.9f) / 0.1f);
            fArray[14] = 0.3f * f3;
            fArray[15] = 0.9f + 0.1f * f3;
            fArray[16] = 1.0f - fArray[14];
            fArray[17] = fArray[15];
        }
        int n = fArray.length;
        for (int k = 0; k < n; k += 2) {
            if (this.g.c()) {
                fArray[k] = Math.min(fArray[k], 0.5f);
                continue;
            }
            if (!this.g.d()) continue;
            fArray[k] = Math.max(fArray[k], 0.5f);
        }
        return fArray;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float f2) {
        float[] fArray = this.c(f2);
        this.a(fArray.length / 2);
        int n5 = fArray.length / 2;
        for (int k = 0; k < n5; ++k) {
            float f3 = (float)n + (float)n3 * fArray[k * 2];
            float f4 = (float)n2 + (float)n4 * fArray[k * 2 + 1];
            this.d.b(k, f3, f4);
        }
    }

    @Override
    public final Entity a() {
        return this.c;
    }

    private void a(int n) {
        if (n != this.d.j()) {
            this.a(this.d, n);
        }
    }

    private void a(VertexBufferPCT vertexBufferPCT, int n) {
        vertexBufferPCT.a(n);
    }

    @Override
    public final void b() {
        assert (this.c == null);
        assert (this.d == null);
        assert (this.e == null);
        this.c = (Entity3D)Entity3D.c.d();
        GeometryMesh geometryMesh = (GeometryMesh)GLGeometryMesh.k.d();
        this.d = VertexBufferPCT.d.b(9);
        this.e = auf_2.b;
        this.d.a(0);
        this.a(new azf_2(azf_2.f));
        geometryMesh.a(ave_1.e, this.d, this.e);
        this.c.a(geometryMesh);
        geometryMesh.u();
    }

    @Override
    public final void c() {
        super.c();
        this.f = null;
        this.d.u();
        this.d = null;
        this.e = null;
        this.c.u();
        this.c = null;
    }
}

