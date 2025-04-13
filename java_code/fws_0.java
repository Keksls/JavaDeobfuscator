/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TFloatArrayList
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import gnu.trove.list.array.TFloatArrayList;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;

/*
 * Renamed from fwS
 */
public final class fws_0 {
    private static final short b = 21845;
    private EntityGroup c;
    private Entity3D d;
    private Entity3D e;
    private Entity3D f;
    private auw_2 g;
    private auw_2 h;
    private auw_2 i;
    private azj_2 j = null;
    private int k = 0;
    private int l;
    private int m;
    private fsj_0 n = null;

    public void a() {
        this.n = null;
    }

    public void a(fsj_0 fsj_02) {
        this.n = fsj_02;
    }

    public int b() {
        return this.m;
    }

    public void a(int n) {
        this.m = n;
    }

    public int c() {
        return this.l;
    }

    public void b(int n) {
        this.l = n;
    }

    public void c(int n) {
        this.k = n;
    }

    public void a(azj_2 azj_22) {
        if (this.j == azj_22) {
            return;
        }
        this.j = azj_22;
    }

    public azj_2 d() {
        return this.j;
    }

    static int a(int n, int n2) {
        return n / 2 + fws_0.b(n, n2);
    }

    private static int b(int n, int n2) {
        return n * n2;
    }

    private float i() {
        return this.n != null ? -this.n.a() : 0.0f;
    }

    private float j() {
        if (this.n == null) {
            return 1.0f;
        }
        return (float)this.m / (this.n.b() - this.n.a());
    }

    public float[] e() {
        int n;
        int n2 = this.n != null ? (int)this.n.a() : 0;
        int n3 = this.n != null ? (int)this.n.b() : 0;
        int n4 = n2 / 5 * 5;
        int n5 = n3 / 5 * 5;
        int n6 = (n5 - n4) / 5 + 1;
        TFloatArrayList tFloatArrayList = new TFloatArrayList();
        for (n = 0; n < n6; ++n) {
            float f2 = n4 + 5 * n;
            tFloatArrayList.add(0.0f);
            tFloatArrayList.add(f2);
            tFloatArrayList.add((float)this.l);
            tFloatArrayList.add(f2);
        }
        if (this.n != null) {
            int n7 = this.n.c().size();
            for (n = 0; n < n7; ++n) {
                float f3 = this.k * n;
                tFloatArrayList.add(f3);
                tFloatArrayList.add((float)n2);
                tFloatArrayList.add(f3);
                tFloatArrayList.add((float)n3);
            }
        }
        return tFloatArrayList.toArray();
    }

    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        Object object;
        Object object2;
        azj_2 azj_22;
        int n = insets.left + insets2.left + insets3.left;
        int n2 = insets.bottom + insets2.bottom + insets3.bottom;
        this.l = dimension.width - n;
        this.m = dimension.height - n2;
        this.d.c();
        this.f.c();
        this.e.c();
        ayx_2 ayx_22 = (ayx_2)this.f.D().c(0);
        ayx_22.b(1.0f, this.j(), 1.0f);
        ayx_22.a(n, this.i() * this.j() + (float)n2, 0.0f);
        this.f.D().b(0, ayx_22);
        ayx_22 = (ayx_2)this.e.D().c(0);
        ayx_22.b(1.0f, this.j(), 1.0f);
        ayx_22.a(n, this.i() * this.j() + (float)n2, 0.0f);
        this.e.D().b(0, ayx_22);
        azj_2 azj_23 = azj_22 = this.j == null ? azf_2.e : this.j;
        if (this.n != null) {
            object2 = this.n.c();
            int n3 = ((ArrayList)object2).size();
            for (int k = 0; k < n3; ++k) {
                fwx_0 fwx_02 = (fwx_0)((ArrayList)object2).get(k);
                ayo_2 ayo_22 = fwx_02.b();
                Object object3 = object = fwx_02.a() != null ? azf_2.a(fwx_02.a(), azj_22) : azj_22;
                if (ayo_22 != null) {
                    this.a(n + fws_0.b(this.k, k), n2 + this.m, this.k, this.m, ayo_22, (azj_2)object);
                    continue;
                }
                this.a(n + fws_0.b(this.k, k), n2 + this.m, this.k, this.m, (azj_2)object);
            }
        }
        object2 = this.e();
        int[] nArray = new int[((float[])object2).length / 2];
        this.a((float[])object2, new azj_2[]{new azf_2(0.0f, 0.0f, 0.0f, 0.5f)}, nArray, 1.0f, ave_1.b, this.e);
        if (this.n != null) {
            ArrayList<fwz_0> arrayList = this.n.e();
            int n4 = arrayList.size();
            for (int k = 0; k < n4; ++k) {
                object = arrayList.get(k);
                this.a(((fwz_0)object).a(this.k), ((fwz_0)object).c(), ((fwz_0)object).d(), 1.0f, ave_1.e, this.f);
            }
            ArrayList<fwy_0> arrayList2 = this.n.d();
            int n5 = arrayList2.size();
            for (n4 = 0; n4 < n5; ++n4) {
                fwy_0 fwy_02 = arrayList2.get(n4);
                this.a(fwy_02.a(this.k), fwy_02.a(), fwy_02.c(), 2.0f, ave_1.c, this.f);
                this.a(fwy_02.a(this.k), fwy_02.a(), fwy_02.c(), 2.0f, ave_1.a, this.f);
            }
        }
    }

    public void f() {
        this.c.u();
        this.c = null;
        this.d.u();
        this.d = null;
        this.e.u();
        this.e = null;
        this.f.u();
        this.f = null;
        this.j = null;
        this.n = null;
    }

    public void g() {
        assert (this.c == null);
        assert (this.e == null);
        assert (this.f == null);
        this.c = (EntityGroup)EntityGroup.a.d();
        this.c.p = this;
        this.d = (Entity3D)Entity3D.c.d();
        this.e = (Entity3D)Entity3D.c.d();
        this.f = (Entity3D)Entity3D.c.d();
        this.c.a(this.d);
        this.c.a(this.e);
        this.c.a(this.f);
        this.e.a(new fwt_0(this));
        this.e.b(new fwu_0(this));
        this.f.a(new fwv_0(this));
        this.f.b(new fww_0(this));
        this.f.D().a(new ayx_2());
        this.e.D().a(new ayx_2());
    }

    public final Entity h() {
        return this.c;
    }

    private int a(float[] fArray, azj_2[] azj_2Array, int[] nArray, float f2, ave_1 ave_12, Entity3D entity3D) {
        int n;
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.k.d();
        int n2 = fArray.length / 2;
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.d.a(n2);
        auf_2 auf_22 = auf_2.b;
        vertexBufferPCT.a(n2);
        vertexBufferPCT.b(fArray);
        int n3 = vertexBufferPCT.j();
        for (n = 0; n < n3; ++n) {
            azj_2 azj_22 = azj_2Array[nArray[n]];
            vertexBufferPCT.a(n, azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
        }
        gLGeometryMesh.a(ave_12, vertexBufferPCT, auf_22);
        gLGeometryMesh.b(f2);
        n = entity3D.a(gLGeometryMesh);
        gLGeometryMesh.u();
        vertexBufferPCT.u();
        return n;
    }

    private void a(int n, int n2, int n3, int n4, ayo_2 ayo_22, azj_2 azj_22) {
        if (n3 == 0 || n4 == 0) {
            return;
        }
        float f2 = 0.0f;
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.j.d();
        geometrySprite.a((float)n2 - (float)n4 / 2.0f, (float)(n - n3 / 2), n3, n4);
        geometrySprite.a(azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
        ays_2 ays_22 = null;
        if (ayo_22 != null) {
            geometrySprite.a(ayo_22.k(), ayo_22.h(), ayo_22.j(), ayo_22.i(), ayo_22.n());
            ays_22 = ayo_22.a();
        }
        this.d.a(geometrySprite, ays_22, null);
        geometrySprite.u();
    }

    private void a(int n, int n2, int n3, int n4, azj_2 azj_22) {
        if (n3 == 0 || n4 == 0) {
            return;
        }
        GeometryMesh geometryMesh = (GeometryMesh)GLGeometryMesh.k.d();
        float[] fArray = new float[]{n, n2 - n4, n + n3, n2 - n4, n + n3, n2, n, n2};
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.d.b(4);
        auf_2 auf_22 = auf_2.a;
        vertexBufferPCT.a(4);
        vertexBufferPCT.b(fArray);
        int n5 = vertexBufferPCT.j();
        for (int k = 0; k < n5; ++k) {
            vertexBufferPCT.a(k, azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
        }
        geometryMesh.a(ave_1.g, vertexBufferPCT, auf_22);
        vertexBufferPCT.u();
        this.d.a(geometryMesh);
        geometryMesh.u();
    }
}

