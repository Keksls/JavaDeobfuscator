/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import java.awt.Insets;
import java.util.ArrayList;

/*
 * Renamed from fxf
 */
public final class fxf_0 {
    private azj_2 b = null;
    private final ArrayList<fjo_1> c = new ArrayList();
    private final ArrayList<fjz_1> d = new ArrayList();
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private final boolean i = false;
    private Entity3D j;
    private EntityGroup k;
    private EntityGroup l;

    public final int a() {
        return this.e;
    }

    public final void a(int n) {
        this.e = n;
    }

    public final int b() {
        return this.f;
    }

    public final void b(int n) {
        this.f = n;
    }

    public final int c() {
        return this.h;
    }

    public final void c(int n) {
        this.h = n;
    }

    public final int d() {
        return this.g;
    }

    public final void d(int n) {
        this.g = n;
    }

    public void a(fjo_1 fjo_12) {
        this.c.add(fjo_12);
        this.c(fjo_12);
    }

    public void a(fjz_1 fjz_12) {
        this.d.add(fjz_12);
        this.b(fjz_12);
    }

    public void b(fjo_1 fjo_12) {
        int n = this.c.indexOf(fjo_12);
        this.c.remove(n);
        this.j.b(this.j.b(n));
    }

    public final boolean e() {
        return false;
    }

    public final void a(azj_2 azj_22) {
        if (azj_22 == this.b) {
            return;
        }
        if (azj_22 != null) {
            this.j.a(azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
        } else {
            this.j.a(1.0f, 1.0f, 1.0f, 1.0f);
        }
        this.b = azj_22;
    }

    public final azj_2 f() {
        return this.b;
    }

    public void g() {
        for (int k = this.j.V() - 1; k >= 0; --k) {
            this.j.b(this.j.b(0));
        }
        this.c.clear();
        this.d.clear();
    }

    public void a(fjf_2 fjf_22, Insets insets, Insets insets2, Insets insets3) {
        Object object;
        int n;
        int n2;
        this.k.b(true);
        this.j.b(true);
        this.l.b(true);
        int n3 = insets.left + insets2.left + insets3.left;
        int n4 = insets.bottom + insets2.bottom + insets3.bottom;
        this.k.D().a(0, this.e, this.f);
        if (this.b != null) {
            this.j.a(this.b.q(), this.b.r(), this.b.s(), this.b.p());
            n2 = this.d.size();
            for (n = 0; n < n2; ++n) {
                this.d.get(n).f().b(this.b.q() * this.b.p(), this.b.r() * this.b.p(), this.b.s() * this.b.p(), this.b.p());
            }
        } else {
            this.j.a(1.0f, 1.0f, 1.0f, 1.0f);
            n2 = this.d.size();
            for (n = 0; n < n2; ++n) {
                this.d.get(n).f().b(1.0f, 1.0f, 1.0f, 1.0f);
            }
        }
        n2 = this.c.size();
        for (n = 0; n < n2; ++n) {
            object = this.c.get(n);
            int n5 = ((fjo_1)object).b() * this.g + n3;
            int n6 = ((fjo_1)object).c() * this.h + n4 + fjf_22.height;
            GeometrySprite geometrySprite = (GeometrySprite)this.j.b(n);
            geometrySprite.a((float)n6, (float)n5);
        }
        n2 = this.d.size();
        for (n = 0; n < n2; ++n) {
            object = this.d.get(n);
            GeometryMesh geometryMesh = (GeometryMesh)this.j.b(n + this.c.size());
            this.a(geometryMesh.c(), (fjz_1)object);
        }
    }

    public final void h() {
        this.c.clear();
        this.d.clear();
        this.b = null;
        this.j.u();
        this.j = null;
    }

    private void c(fjo_1 fjo_12) {
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.j.d();
        ayo_2 ayo_22 = fjo_12.a();
        geometrySprite.b(ayo_22.k(), ayo_22.h(), ayo_22.j(), ayo_22.i());
        geometrySprite.a(ayo_22.e(), ayo_22.d());
        this.j.a(geometrySprite, ayo_22.a(), null);
        geometrySprite.u();
    }

    private void a(VertexBufferPCT vertexBufferPCT, fjz_1 fjz_12) {
        float[] fArray = new float[]{fjz_12.b(), fjz_12.c(), fjz_12.b() + fjz_12.d(), fjz_12.c(), fjz_12.b() + fjz_12.d(), fjz_12.c(), fjz_12.b() + fjz_12.d(), fjz_12.c() + fjz_12.e(), fjz_12.b() + fjz_12.d(), fjz_12.c() + fjz_12.e(), fjz_12.b(), fjz_12.c() + fjz_12.e(), fjz_12.b(), fjz_12.c() + fjz_12.e(), fjz_12.b(), fjz_12.c()};
        vertexBufferPCT.b(fArray);
    }

    private void b(fjz_1 fjz_12) {
        GeometryMesh geometryMesh = (GeometryMesh)GLGeometryMesh.k.d();
        int n = 16;
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.d.b(16);
        auf_2 auf_22 = auf_2.b;
        vertexBufferPCT.a(16);
        int n2 = vertexBufferPCT.j();
        for (int k = 0; k < n2; ++k) {
            vertexBufferPCT.a(k, 1.0f, 1.0f, 1.0f, 1.0f);
        }
        geometryMesh.a(ave_1.b, vertexBufferPCT, auf_22);
        this.j.a(geometryMesh);
        geometryMesh.u();
        vertexBufferPCT.u();
    }

    public final void i() {
        assert (this.j == null);
        this.k = (EntityGroup)EntityGroup.a.d();
        this.k.p = this;
        this.k.D().a(new ayx_2());
        this.j = (Entity3D)Entity3D.c.d();
        this.l = (EntityGroup)EntityGroup.a.d();
        this.l.p = this;
        this.k.a(this.j);
        this.k.a((Entity)this.l);
    }

    public final EntityGroup j() {
        return this.k;
    }

    public EntityGroup k() {
        return this.l;
    }
}

