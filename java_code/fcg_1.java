/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fCg
 */
public class fcg_1
extends fbr_2 {
    private static final auf_2 c;
    private VertexBufferPCT d;
    private Entity3D e;
    private azj_2 f;
    private azj_2 g;

    public final void a(azj_2 azj_22) {
        assert (azj_22 != null) : "Color can't be null";
        if (this.f == azj_22) {
            return;
        }
        this.f = azj_22;
        this.d();
    }

    public final azj_2 b() {
        return this.f;
    }

    public final void b(azj_2 azj_22) {
        if (this.g == azj_22) {
            return;
        }
        this.g = azj_22;
        this.d();
    }

    public final azj_2 c() {
        return this.g;
    }

    private void d() {
        float f2 = this.f != null ? this.f.q() : 1.0f;
        float f3 = this.f != null ? this.f.r() : 1.0f;
        float f4 = this.f != null ? this.f.s() : 1.0f;
        float f5 = this.f != null ? this.f.p() : 1.0f;
        f2 *= this.g != null ? this.g.q() : 1.0f;
        f3 *= this.g != null ? this.g.r() : 1.0f;
        f4 *= this.g != null ? this.g.s() : 1.0f;
        f5 *= this.g != null ? this.g.p() : 1.0f;
        float[] fArray = new float[this.d.k() * 4];
        for (int k = 0; k < fArray.length; k += 4) {
            fArray[k] = f2;
            fArray[k + 1] = f3;
            fArray[k + 2] = f4;
            fArray[k + 3] = f5;
        }
        this.d.d(fArray);
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        int n = insets.left + insets2.left;
        int n2 = insets.right + insets2.right;
        int n3 = insets.top + insets2.top;
        int n4 = insets.bottom + insets2.bottom;
        int n5 = 0;
        float[] fArray = new float[this.d.k() * 2];
        fArray[n5++] = insets.left;
        fArray[n5++] = insets.bottom;
        fArray[n5++] = n;
        fArray[n5++] = insets.bottom;
        fArray[n5++] = n;
        fArray[n5++] = n4;
        fArray[n5++] = insets.left;
        fArray[n5++] = n4;
        fArray[n5++] = n;
        fArray[n5++] = dimension.height - n3;
        fArray[n5++] = insets.left;
        fArray[n5++] = dimension.height - n3;
        fArray[n5++] = insets.left;
        fArray[n5++] = dimension.height - insets.top;
        fArray[n5++] = n;
        fArray[n5++] = dimension.height - insets.top;
        fArray[n5++] = dimension.width - n2;
        fArray[n5++] = dimension.height - insets.top;
        fArray[n5++] = dimension.width - insets.right;
        fArray[n5++] = dimension.height - insets.top;
        fArray[n5++] = dimension.width - insets.right;
        fArray[n5++] = dimension.height - n3;
        fArray[n5++] = dimension.width - n2;
        fArray[n5++] = dimension.height - n3;
        fArray[n5++] = dimension.width - n2;
        fArray[n5++] = n4;
        fArray[n5++] = dimension.width - insets.right;
        fArray[n5++] = n4;
        fArray[n5++] = dimension.width - insets.right;
        fArray[n5++] = insets.bottom;
        fArray[n5++] = dimension.width - n2;
        fArray[n5] = insets.bottom;
        this.d.b(fArray);
    }

    @Override
    public Entity g() {
        return this.e;
    }

    @Override
    public void h() {
        this.f = null;
        this.g = null;
        this.e.u();
        this.e = null;
        this.d.u();
        this.d = null;
    }

    @Override
    public void i() {
        assert (this.e == null) : "Object is already checked out";
        assert (this.d == null);
        this.e = (Entity3D)Entity3D.c.d();
        GeometryMesh geometryMesh = (GeometryMesh)GLGeometryMesh.k.d();
        this.e.a(geometryMesh);
        geometryMesh.u();
        this.d = VertexBufferPCT.d.b(16);
        geometryMesh.a(ave_1.d, this.d, c);
    }

    static {
        short[] sArray = new short[]{5, 4, 7, 6, 5, 7, 4, 11, 8, 7, 4, 8, 11, 10, 9, 8, 11, 9, 3, 2, 4, 5, 3, 4, 12, 13, 10, 11, 12, 10, 0, 1, 2, 3, 0, 2, 1, 15, 12, 2, 1, 12, 15, 14, 13, 12, 15, 13};
        c = new auf_2(sArray);
    }
}

