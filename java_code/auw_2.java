/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;

/*
 * Renamed from auw
 */
public class auw_2 {
    private VertexBufferPCT b = null;
    private avz_2 c;
    private Entity3D d;
    private int e;
    private axn_2 f;
    private axn_2 g;

    public auw_2(axn_2 axn_22, axn_2 axn_23) {
        this.a(axn_22, axn_23);
    }

    public auw_2() {
        this(axn_2.e, axn_2.f);
    }

    public final void a(axn_2 axn_22, axn_2 axn_23) {
        this.f = axn_22;
        this.g = axn_23;
    }

    public final void a() {
        if (this.b != null) {
            this.b.u();
            this.b = null;
        }
    }

    public final void a(Entity3D entity3D, int n) {
        int n2 = n * 4;
        this.e = n;
        if (this.b != null && this.b.k() != n2) {
            this.b.u();
            this.b = null;
        }
        if (this.b == null) {
            this.b = VertexBufferPCT.d.b(n2);
        }
        this.b.p();
        this.d = entity3D;
    }

    public final void b() {
        this.c();
        this.d = null;
        this.c = null;
    }

    private void c() {
        assert (this.b != null);
        assert (this.d != null);
        if (this.b.j() != 0) {
            GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.k.d();
            gLGeometryMesh.a(this.f, this.g);
            gLGeometryMesh.a(ave_1.g, this.b, auf_2.b);
            this.d.a(gLGeometryMesh, this.c, null);
            gLGeometryMesh.u();
        }
    }

    public final void a(int n, int n2, int n3, int n4, ayo_2 ayo_22, float f2, float f3, float f4, float f5, azj_2 azj_22) {
        assert (n3 != 0 && n4 != 0);
        assert (ayo_22 != null);
        assert (this.b.j() + 4 <= this.b.k());
        if (this.c != null && this.c != ayo_22.a()) {
            this.c();
            this.b.u();
            this.b = VertexBufferPCT.d.b(this.e * 4);
        }
        GeometrySprite.b(this.b, n2, n, n3, n4);
        if (azj_22 != null) {
            GeometrySprite.a(this.b, azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
        } else {
            GeometrySprite.a(this.b, 1.0f, 1.0f, 1.0f, 1.0f);
        }
        GeometrySprite.a(this.b, f2, f3, f4, f5, ayo_22.n());
        this.c = (avz_2)ayo_22.a();
        --this.e;
        this.b.a(4 + this.b.j());
    }

    public final void a(int n, int n2, int n3, int n4, ayo_2 ayo_22, azj_2 azj_22) {
        if (ayo_22 == null) {
            --this.e;
            return;
        }
        this.a(n, n2, n3, n4, ayo_22, ayo_22.k(), ayo_22.h(), ayo_22.j(), ayo_22.i(), azj_22);
    }
}

