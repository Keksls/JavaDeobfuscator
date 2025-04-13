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
 * Renamed from fxh
 */
public class fxh_0
extends fwk_0 {
    private Entity3D c;
    private azj_2 d;
    private azj_2 e;
    private final Insets f = new Insets(0, 0, 0, 0);
    private boolean g = true;
    private VertexBufferPCT h;
    private VertexBufferPCT i;
    private static final auf_2 j;
    private static final auf_2 k;

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
    public void a(ayo_2 ayo_22, ayo_2 ayo_23, ayo_2 ayo_24, ayo_2 ayo_25, ayo_2 ayo_26, ayo_2 ayo_27, ayo_2 ayo_28, ayo_2 ayo_29, ayo_2 ayo_210) {
    }

    @Override
    public final void a(azj_2 azj_22) {
        if (this.d == azj_22) {
            return;
        }
        this.d = azj_22;
        this.k();
    }

    @Override
    public void b(azj_2 azj_22) {
        if (this.e == azj_22) {
            return;
        }
        this.e = azj_22;
        this.k();
    }

    @Override
    public azj_2 e() {
        return this.e;
    }

    @Override
    public void a(Insets insets) {
        this.f.set(insets.top, insets.left, insets.bottom, insets.right);
    }

    @Override
    public Insets i() {
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
        float f6;
        float f7;
        float f8;
        float f9;
        if (this.d == null) {
            f9 = 1.0f;
            f8 = 1.0f;
            f7 = 1.0f;
            f6 = 1.0f;
        } else {
            f6 = this.d.q();
            f7 = this.d.r();
            f8 = this.d.s();
            f9 = this.d.p();
        }
        if (this.a != null) {
            f6 *= this.a.q();
            f7 *= this.a.r();
            f8 *= this.a.s();
            f9 *= this.a.p();
        }
        for (int k = 0; k < this.i.k(); ++k) {
            this.i.a(k, f6, f7, f8, f9);
        }
        if (this.e == null) {
            f5 = 1.0f;
            f4 = 1.0f;
            f3 = 1.0f;
            f2 = 1.0f;
        } else {
            f2 = this.e.q();
            f3 = this.e.r();
            f4 = this.e.s();
            f5 = this.e.p();
        }
        if (this.a != null) {
            f2 *= this.a.q();
            f3 *= this.a.r();
            f4 *= this.a.s();
            f5 *= this.a.p();
        }
        for (int k = 0; k < this.h.k(); ++k) {
            this.h.a(k, f2, f3, f4, f5);
        }
    }

    @Override
    public final azj_2 d() {
        return this.d;
    }

    @Override
    public void a(float f2) {
    }

    @Override
    public float f() {
        return 0.0f;
    }

    public boolean j() {
        return this.g;
    }

    @Override
    public void a(boolean bl) {
        this.g = bl;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float f2) {
        n3 = (int)((float)n3 * (this.g ? f2 : 1.0f));
        n4 = (int)((float)n4 * (this.g ? 1.0f : f2));
        n3 = Math.max(n3, this.f.left + this.f.right);
        n4 = Math.max(n4, this.f.top + this.f.bottom);
        int n5 = n;
        int n6 = n2 + n4;
        this.h.b(0, n5, n2);
        this.h.b(1, n5 + this.f.left, n2);
        this.h.b(2, n5 + this.f.left, n2 + this.f.bottom);
        this.h.b(3, n5, n2 + this.f.bottom);
        this.h.b(4, n5 + this.f.left, n6 - this.f.top);
        this.h.b(5, n5, n6 - this.f.top);
        this.h.b(6, n5, n6);
        this.h.b(7, n5 + this.f.left, n6);
        this.h.b(8, n + n3 - this.f.right, n6);
        this.h.b(9, n + n3, n6);
        this.h.b(10, n + n3, n6 - this.f.top);
        this.h.b(11, n + n3 - this.f.right, n6 - this.f.top);
        this.h.b(12, n + n3 - this.f.right, n2 + this.f.bottom);
        this.h.b(13, n + n3, n2 + this.f.bottom);
        this.h.b(14, n + n3, n2);
        this.h.b(15, n + n3 - this.f.right, n2);
        this.i.b(0, n5 + this.f.left, n2 + this.f.bottom);
        this.i.b(1, n + n3 - this.f.right, n2 + this.f.bottom);
        this.i.b(2, n + n3 - this.f.right, n6 - this.f.top);
        this.i.b(3, n5 + this.f.left, n6 - this.f.top);
    }

    @Override
    public final Entity a() {
        return this.c;
    }

    @Override
    public final void b() {
        assert (this.c == null) : "Object is already checked out";
        this.c = (Entity3D)Entity3D.c.d();
        GeometryMesh geometryMesh = (GeometryMesh)GLGeometryMesh.k.d();
        this.c.a(geometryMesh);
        geometryMesh.u();
        assert (this.h == null);
        this.h = VertexBufferPCT.d.b(16);
        geometryMesh.a(ave_1.d, this.h, j);
        geometryMesh = (GeometryMesh)GLGeometryMesh.k.d();
        this.c.a(geometryMesh);
        geometryMesh.u();
        assert (this.i == null);
        this.i = VertexBufferPCT.d.b(4);
        geometryMesh.a(ave_1.d, this.i, k);
    }

    @Override
    public final void c() {
        super.c();
        this.d = null;
        this.e = null;
        this.f.set(0, 0, 0, 0);
        this.c.u();
        this.c = null;
        this.h.u();
        this.h = null;
        this.i.u();
        this.i = null;
    }

    static {
        short[] sArray = new short[]{5, 4, 7, 6, 5, 7, 4, 11, 8, 7, 4, 8, 11, 10, 9, 8, 11, 9, 3, 2, 4, 5, 3, 4, 12, 13, 10, 11, 12, 10, 0, 1, 2, 3, 0, 2, 1, 15, 12, 2, 1, 12, 15, 14, 13, 12, 15, 13};
        j = new auf_2(sArray);
        short[] sArray2 = new short[]{0, 1, 2, 3, 0, 2};
        k = new auf_2(sArray2);
    }
}

