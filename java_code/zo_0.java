/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

/*
 * Renamed from Zo
 */
public class zo_0
extends zn_0 {
    private final Entity3D f;
    private apv_2 g;
    private final zt_0 h;
    private float i;
    private float j;
    private int k;
    private int l;
    private int m;
    private int n = 4;
    private boolean o = true;
    public static final int e = -1;

    static float b(float f2, float f3, float f4, float f5) {
        f2 = f2 / f5 - 1.0f;
        return -f4 * (f2 * f2 * f2 * f2 - 1.0f) + f3;
    }

    static float c(float f2, float f3, float f4, float f5) {
        return f2 * (f4 - f3) / f5 + f3;
    }

    @Override
    public void a(boolean bl) {
        this.o = bl;
    }

    public zo_0(String string, int n, int n2, zt_0 zt_02, int n3) {
        this(ayu_2.a().b((aui_2)auj_1.a.a(), (long)auc_1.d(string), string, false), n, n2, zt_02, n3);
    }

    public zo_0(ays_2 ays_22, int n, int n2, zt_0 zt_02, int n3) {
        this.h = zt_02;
        this.c = n3;
        this.f = (Entity3D)Entity3D.c.d();
        this.f.D().a(new ayx_2());
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.j.d();
        if (n == -1) {
            n = ays_22.a(0).a();
        }
        if (n2 == -1) {
            n2 = ays_22.a(0).b();
        }
        geometrySprite.a((float)n2, 0.0f, n, n2);
        geometrySprite.b(0.0f, 0.0f, 1.0f, 1.0f);
        this.f.a(geometrySprite, ays_22, null);
        geometrySprite.u();
        this.f.a(1.0f, 1.0f, 1.0f, 0.0f);
    }

    @Override
    public apv_2 a() {
        return this.g;
    }

    @Override
    public void a(apv_2 apv_22) {
        this.g = apv_22;
    }

    @Override
    public int b() {
        return this.k;
    }

    @Override
    public void a(int n) {
        this.k = n;
    }

    @Override
    public int c() {
        return this.l;
    }

    @Override
    public void b(int n) {
        this.l = n;
    }

    @Override
    public float d() {
        if (this.g != null) {
            return this.g.J();
        }
        return 0.0f;
    }

    @Override
    public float e() {
        if (this.g != null) {
            return this.g.K();
        }
        return 0.0f;
    }

    @Override
    public float f() {
        if (this.g != null) {
            return this.g.L();
        }
        return 0.0f;
    }

    void s() {
        this.o().D().a(0, this.i, this.j);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5) {
        this.i = f2 + f4;
        this.j = f3 + f5;
        this.s();
    }

    @Override
    public int i() {
        return this.m;
    }

    @Override
    public void d(int n) {
        this.m = n;
    }

    @Override
    public int j() {
        return this.n;
    }

    @Override
    public void e(int n) {
        this.n = n;
    }

    public Entity3D o() {
        return this.f;
    }

    public void p() {
        this.b = 0;
    }

    @Override
    public void c(int n) {
        super.c(n);
        if (this.o) {
            this.h.a(this, n);
        }
    }

    @Override
    public void a(acb_0 acb_02, int n) {
        this.c(n);
    }

    @Override
    public void l() {
        this.f.u();
        this.g = null;
    }

    @Override
    public boolean m() {
        return true;
    }

    public float q() {
        return this.i;
    }

    public float r() {
        return this.j;
    }

    @Override
    public /* synthetic */ Entity k() {
        return this.o();
    }
}

