/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.awt.Insets;
import org.apache.log4j.Logger;

/*
 * Renamed from fxb
 */
public final class fxb_0 {
    private static final Logger b = Logger.getLogger(fxb_0.class);
    private azj_2 c;
    private String d;
    private ayo_2 e;
    private int f;
    private int g;
    private int h;
    private int i;
    private fqq_0 j = fqq_0.a;
    private boolean k;
    private boolean l;
    private boolean m;
    private EntitySprite n;
    private final afj_1 o = new afj_1();

    public int a() {
        return this.f;
    }

    public void a(int n) {
        this.f = n;
    }

    public int b() {
        return this.g;
    }

    public void b(int n) {
        this.g = n;
    }

    public int c() {
        return this.h;
    }

    public void c(int n) {
        this.h = n;
    }

    public int d() {
        return this.i;
    }

    public void d(int n) {
        this.i = n;
    }

    public fqq_0 e() {
        return this.j;
    }

    public void a(fqq_0 fqq_02) {
        this.j = fqq_02;
    }

    public void a(ayo_2 ayo_22) {
        this.e = ayo_22;
        if (this.e != null) {
            this.k = true;
        }
    }

    public ayo_2 f() {
        return this.e;
    }

    public boolean g() {
        return this.k;
    }

    public void a(afr_2 afr_22, float f2) {
        ayx_2 ayx_22 = (ayx_2)this.n.D().c(1);
        this.o.a(afr_22, f2);
        ayx_22.a(this.o);
        if (afr_22 == afr_2.e || afr_22 == afr_2.d) {
            float f3 = ayx_22.g().a();
            float f4 = ayx_22.g().b();
            ayx_22.a(f3, f4, -(this.d() / 2));
        }
        this.n.D().b(1, ayx_22);
    }

    public void a(azj_2 azj_22) {
        if (azj_22 == this.c) {
            return;
        }
        if (azj_22 != null) {
            this.n.a(azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
        } else {
            this.n.a(1.0f, 1.0f, 1.0f, 1.0f);
        }
        this.c = azj_22;
    }

    public azj_2 h() {
        return this.c;
    }

    public boolean i() {
        return this.l;
    }

    public void a(boolean bl) {
        this.l = bl;
    }

    public boolean j() {
        return this.m;
    }

    public void b(boolean bl) {
        this.m = bl;
    }

    public String k() {
        return this.d;
    }

    public void a(String string) {
        this.d = string;
        this.p();
    }

    public void a(fjf_2 fjf_22, Insets insets, Insets insets2, Insets insets3) {
        if (this.e == null || this.e.a() == null) {
            this.n.b(false);
            return;
        }
        this.n.b(true);
        int n = insets.left + insets2.left + insets3.left;
        int n2 = insets.bottom + insets2.bottom + insets3.bottom;
        this.n.a((float)(n2 + this.h + this.g), (float)(n + this.f), this.i, this.h);
        if (this.c != null) {
            this.n.a(this.c);
        } else {
            this.n.a(1.0f, 1.0f, 1.0f, 1.0f);
        }
        this.e.q();
        this.n.a(this.e.a());
        this.n.D().a(0, -this.i / 2, -this.h / 2);
        this.n.D().a(1, this.i / 2, this.h / 2);
        if (this.l) {
            if (this.m) {
                this.n.c().a(this.e.j(), this.e.i(), this.e.k(), this.e.h(), this.e.n());
            } else {
                this.n.c().a(this.e.k(), this.e.i(), this.e.j(), this.e.h(), this.e.n());
            }
        } else if (this.m) {
            this.n.c().a(this.e.j(), this.e.h(), this.e.k(), this.e.i(), this.e.n());
        } else {
            this.n.c().a(this.e.k(), this.e.h(), this.e.j(), this.e.i(), this.e.n());
        }
        this.p();
    }

    private void p() {
        if (Cz.f(this.d)) {
            if (axy_2.b.c()) {
                this.n.a(null, 0, null);
            } else {
                this.n.R();
            }
            return;
        }
        int n = auc_1.c(this.d);
        aug_1 aug_12 = aui_1.a().c();
        if (aug_12 != null && aug_12.b(n)) {
            this.n.a(aug_12, n, aup_1.I);
        } else {
            b.error((Object)("technic invalide " + this.d));
        }
    }

    public void l() {
        this.e = null;
        this.c = null;
        this.d = null;
        this.n.u();
        this.n = null;
    }

    public void m() {
        assert (this.n == null);
        this.n = (EntitySprite)EntitySprite.a.d();
        this.n.p = this;
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.j.d();
        this.n.a(geometrySprite);
        geometrySprite.u();
        BatchTransformer batchTransformer = this.n.D();
        batchTransformer.a(new ayx_2());
        batchTransformer.a(new ayx_2());
    }

    public Entity n() {
        return this.n;
    }

    public afj_1 o() {
        return this.o;
    }

    public void a(float f2, float f3, float f4) {
        ayx_2 ayx_22 = (ayx_2)this.n.D().c(1);
        ayx_22.b(f2, f3, f4);
        this.n.D().b(1, ayx_22);
    }
}

