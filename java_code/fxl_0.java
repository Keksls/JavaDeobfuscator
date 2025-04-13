/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import java.util.ArrayList;
import java.util.Comparator;
import org.apache.log4j.Logger;

/*
 * Renamed from fxl
 */
public class fxl_0 {
    private static final Logger a = Logger.getLogger(fxl_0.class);
    private static final azj_2 b = new azf_2(0.2f, 0.2f, 0.2f, 0.3f);
    private static final int c = 86;
    private static final int d = 43;
    private static final float e = 0.06f;
    private static final float f = 1.0f;
    private static final float g = 0.5f;
    private static final float h = 193.5f;
    private static final float i = 387.0f;
    private static final Comparator<Entity> j = new fxm_0();
    private float k;
    private float l;
    private final ayx_2 m = new ayx_2();
    private final ayx_2 n = new ayx_2();
    private final EntityGroup o;
    private Entity3D p;
    private Entity3D q;
    private final fxn_0 r = new fxn_0();
    private final fxn_0 s = new fxn_0();
    private boolean t = false;
    private final afk_2 u = new afk_2();

    public fxl_0() {
        this.o = (EntityGroup)EntityGroup.a.d();
        this.o.p = this;
        this.o.D().a(this.m);
        this.o.D().a(this.n);
    }

    public void a(float f2) {
        this.s.a(f2);
    }

    public void b(float f2) {
        this.r.a(f2);
    }

    public void a(float f2, float f3) {
        this.k = f2;
        this.l = f3;
    }

    public void a(int n, int n2) {
        this.n.a((float)n * 0.5f, (float)n2 * 0.5f, 0.0f);
    }

    public void a(afk_2 afk_22) {
        this.u.a(afk_22.b, afk_22.c + 1, afk_22.d, afk_22.e + 1);
    }

    public EntityGroup a() {
        this.a(this.o);
        return this.o;
    }

    public void a(EntityGroup entityGroup) {
        entityGroup.c();
        this.r.sort(j);
        this.s.sort(j);
        for (EntitySprite entitySprite : this.r) {
            entityGroup.a(entitySprite);
        }
        for (EntitySprite entitySprite : this.s) {
            entityGroup.a(entitySprite);
        }
        if (this.q != null) {
            entityGroup.a(this.q);
        }
        if (this.t) {
            entityGroup.a(this.p);
        }
    }

    public EntitySprite a(afe_1 afe_12, afe_1 afe_13, ays_2 ays_22, azj_2 azj_22) {
        return this.a(afe_12, afe_13, this.k, ays_22, azj_22, this.r);
    }

    public EntitySprite b(afe_1 afe_12, afe_1 afe_13, ays_2 ays_22, azj_2 azj_22) {
        return this.a(afe_12, afe_13, this.l, ays_22, azj_22, this.s);
    }

    private EntitySprite a(afe_1 afe_12, afe_1 afe_13, float f2, ays_2 ays_22, azj_2 azj_22, ArrayList<EntitySprite> arrayList) {
        EntitySprite entitySprite = (EntitySprite)EntitySprite.a.d();
        entitySprite.a(aui_1.a().b(), aup_1.d, aup_1.I);
        entitySprite.f = afe_12.a();
        entitySprite.g = afe_12.b();
        entitySprite.e = afe_12.a() + afe_12.b();
        int n = afe_12.a() + afe_13.a();
        int n2 = afe_12.b() + afe_13.b();
        int n3 = Hw.c((float)((n - n2) * 86) * 0.5f);
        int n4 = Hw.c((float)(-(n + n2) * 43) * 0.5f);
        azr_2 azr_22 = ays_22.a(0);
        short s2 = azr_22.e();
        short s3 = azr_22.f();
        fwQ.a(n3 + s2, n4 + s3, ays_22, azj_22, entitySprite);
        GeometrySprite geometrySprite = entitySprite.c();
        geometrySprite.a(Hw.c((float)geometrySprite.p() / f2), Hw.c((float)geometrySprite.q() / f2));
        geometrySprite.a(axn_2.b, axn_2.f);
        arrayList.add(entitySprite);
        return entitySprite;
    }

    public Entity3D a(afe_1 afe_12, azj_2 azj_22) {
        this.b();
        this.q = (Entity3D)Entity3D.c.d();
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.k.d();
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.d.b(4);
        vertexBufferPCT.n();
        int n = Hw.c((float)afe_12.a() / 2.0f) * 2;
        int n2 = Hw.c((float)afe_12.b() / 2.0f) * 2;
        fxl_0.a(vertexBufferPCT, n, n + 2, n2, n2, azj_22);
        fxl_0.a(vertexBufferPCT, n + 2, n, n2 + 2, n2 + 2, azj_22);
        vertexBufferPCT.o();
        gLGeometryMesh.a(ave_1.g, vertexBufferPCT, auf_2.a);
        this.q.a(gLGeometryMesh);
        gLGeometryMesh.u();
        return this.q;
    }

    public void b() {
        if (this.q != null) {
            this.q.u();
            this.q = null;
        }
    }

    public EntitySprite b(int n, int n2) {
        return fxl_0.a(n, n2, this.r);
    }

    public EntitySprite c(int n, int n2) {
        return fxl_0.a(n, n2, this.s);
    }

    public void a(Entity entity) {
        if (this.s.remove(entity)) {
            entity.u();
            return;
        }
        if (this.r.remove(entity)) {
            entity.u();
            return;
        }
    }

    private static EntitySprite a(int n, int n2, ArrayList<EntitySprite> arrayList) {
        EntitySprite entitySprite = fxl_0.b(n, n2, arrayList);
        if (entitySprite != null) {
            arrayList.remove(entitySprite);
            entitySprite.u();
        }
        return entitySprite;
    }

    public EntitySprite d(int n, int n2) {
        return fxl_0.b(n, n2, this.r);
    }

    public EntitySprite e(int n, int n2) {
        return fxl_0.b(n, n2, this.s);
    }

    private static EntitySprite b(int n, int n2, ArrayList<EntitySprite> arrayList) {
        for (int k = 0; k < arrayList.size(); ++k) {
            EntitySprite entitySprite = arrayList.get(k);
            if (entitySprite.f != (float)n || entitySprite.g != (float)n2) continue;
            return entitySprite;
        }
        return null;
    }

    public EntitySprite f(int n, int n2) {
        float f2 = (float)n - this.n.h().a;
        float f3 = (float)n2 - this.n.h().b;
        f2 /= this.e();
        f3 /= this.e();
        f2 -= this.m.h().a;
        f3 -= this.m.h().b;
        for (int k = this.s.size() - 1; k >= 0; --k) {
            EntitySprite entitySprite = (EntitySprite)this.s.get(k);
            GeometrySprite geometrySprite = entitySprite.c();
            if (f2 <= geometrySprite.g() || f2 >= geometrySprite.h() || geometrySprite.j() <= f3 || geometrySprite.k() >= f3) continue;
            azc_2 azc_22 = entitySprite.d().a(0).l();
            float f4 = (f2 - geometrySprite.g()) * this.l;
            float f5 = (float)entitySprite.d().a(0).b() - (geometrySprite.j() - f3) * this.l;
            if (azc_22 != null && !azc_22.a((int)f4, (int)f5)) continue;
            return entitySprite;
        }
        return null;
    }

    public void c() {
        this.r.clear();
        this.s.clear();
        this.b();
        this.o.c();
    }

    public void d() {
        this.c();
        if (this.p != null) {
            this.p.u();
            this.p = null;
        }
        this.t = false;
        this.o.u();
    }

    public float b(float f2, float f3) {
        float f4 = f2 - f3;
        return f4 * 86.0f * 2.0f;
    }

    public float c(float f2, float f3) {
        float f4 = -(f2 + f3);
        return f4 * 43.0f * 2.0f;
    }

    public float e() {
        return this.n.l().a;
    }

    public void c(float f2) {
        float f3 = Hw.b(f2, 0.06f, 1.0f);
        this.n.b(f3, f3, 1.0f);
    }

    public void a(boolean bl) {
        this.t = bl;
        if (this.p == null) {
            int n;
            this.p = (Entity3D)Entity3D.c.d();
            GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.k.d();
            VertexBufferPCT vertexBufferPCT = VertexBufferPCT.d.b(2 * (this.u.e() + this.u.f()));
            vertexBufferPCT.n();
            for (n = this.u.b; n <= this.u.c; ++n) {
                fxl_0.a(vertexBufferPCT, n, n, this.u.d, this.u.e, b);
            }
            for (n = this.u.d; n <= this.u.e; ++n) {
                fxl_0.a(vertexBufferPCT, this.u.b, this.u.c, n, n, b);
            }
            vertexBufferPCT.o();
            gLGeometryMesh.a(ave_1.b, vertexBufferPCT, auf_2.b);
            this.p.a(gLGeometryMesh);
            gLGeometryMesh.u();
        }
    }

    private static void a(VertexBufferPCT vertexBufferPCT, int n, int n2, int n3, int n4, azj_2 azj_22) {
        float f2 = n - n3;
        float f3 = n2 - n4;
        float f4 = -(n + n3);
        float f5 = -(n2 + n4);
        vertexBufferPCT.a(387.0f * f2, 193.5f * f4, 0.0f, 0.0f, azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
        vertexBufferPCT.a(387.0f * f3, 193.5f * f5, 0.0f, 0.0f, azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
    }

    public afe_1 g(int n, int n2) {
        float f2 = (float)n - this.n.h().a;
        float f3 = (float)n2 - this.n.h().b;
        f2 /= this.e();
        f3 /= this.e();
        f2 -= this.m.h().a;
        f3 -= this.m.h().b;
        f2 /= 86.0f;
        f3 /= 43.0f;
        return new afe_1(Hw.c((f2 += 0.5f) - (f3 += 0.5f)), -Hw.c(f2 + f3));
    }

    public afq_2 d(float f2, float f3) {
        float f4 = f2 / 86.0f;
        float f5 = f3 / 43.0f;
        return new afq_2(-f4 + f5, f4 + f5);
    }

    public afq_2 f() {
        aft_2 aft_22 = this.m.h();
        return this.d(aft_22.a, aft_22.b);
    }

    public afq_2 e(float f2, float f3) {
        float f4 = f2 - f3;
        float f5 = -(f2 + f3);
        return new afq_2(-f4 * 86.0f * 0.5f, -f5 * 43.0f * 0.5f);
    }

    public void f(float f2, float f3) {
        afq_2 afq_22 = this.e(f2, f3);
        this.m.a(afq_22.a(), afq_22.b(), 0.0f);
    }
}

