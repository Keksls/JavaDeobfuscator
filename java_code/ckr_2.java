/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import java.awt.Dimension;
import java.awt.Insets;
import org.apache.log4j.Logger;

/*
 * Renamed from cKR
 */
public class ckr_2
extends fbs_1 {
    private static final Logger c = Logger.getLogger(ckr_2.class);
    protected Entity3D a;
    private azj_2 d;
    private ayo_2 e;
    private ayo_2 f;
    private ayo_2 g;
    private ayo_2 h;
    private boolean i = false;
    private boolean j = false;
    private int[] k;
    private int[] l;
    private float[] m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;

    public void a(int[] nArray, int[] nArray2, float[] fArray) {
        this.k = nArray;
        this.m = fArray;
        this.a(nArray2);
        this.l = nArray2;
        this.k();
        this.n();
    }

    public float[] a() {
        return this.m;
    }

    public int[] b() {
        return this.k;
    }

    public void a(ayo_2 ayo_22) {
        this.e = ayo_22;
        this.j();
    }

    public void b(ayo_2 ayo_22) {
        this.g = ayo_22;
        this.j();
    }

    public void c(ayo_2 ayo_22) {
        this.h = ayo_22;
        this.j();
    }

    public void d(ayo_2 ayo_22) {
        this.f = ayo_22;
        this.j();
    }

    public ayo_2 c() {
        return this.e;
    }

    public ayo_2 d() {
        return this.f;
    }

    public ayo_2 e() {
        return this.g;
    }

    public ayo_2 f() {
        return this.h;
    }

    private void j() {
        this.i = this.e != null && this.h != null && this.g != null && this.f != null;
    }

    private void a(int[] nArray) {
        int n = nArray.length - 1;
        int n2 = this.l.length - 1;
        while (n2 >= 0 || n >= 0) {
            int n3;
            int n4 = this.l.length > n2 && n2 >= 0 ? this.l[n2] : 0;
            int n5 = n3 = nArray.length > n && n >= 0 ? nArray[n] : 0;
            if (n < 0 || n2 >= 0 && n4 < n3) {
                this.b(n2);
                --n2;
                continue;
            }
            if (n2 < 0 || n >= 0 && n4 > n3) {
                this.a(n2);
                --n;
                continue;
            }
            --n2;
            --n;
        }
    }

    private void k() {
        int n = this.a.V();
        int n2 = n - 3;
        if (n2 < this.k.length) {
            c.warn((Object)("mauvais nombre de jonctions : " + n2 + "/" + this.k.length));
        } else if (n2 > this.k.length) {
            c.warn((Object)("mauvais nombre de jonctions : " + n2 + "/" + this.k.length));
        }
    }

    private void a(int n, int n2, int n3) {
        int n4 = this.a.V();
        int n5 = n4 - 3;
        if (n < 0 || n >= n5) {
            return;
        }
        GeometrySprite geometrySprite = (GeometrySprite)this.a.b(n + 3);
        geometrySprite.a((float)n3, (float)n2);
        geometrySprite.a(1.0f, 1.0f, 1.0f, this.m[n]);
    }

    public void a(int n) {
        if (!this.i) {
            return;
        }
        int n2 = this.a.V() - 3;
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.j.d();
        geometrySprite.a(this.h.e(), this.h.d());
        geometrySprite.a(1.0f, 1.0f, 1.0f, 1.0f);
        geometrySprite.a(this.h.k(), this.h.h(), this.h.j(), this.h.i(), this.h.n());
        this.a.a(geometrySprite, this.h.a(), null);
        geometrySprite.u();
        if (n2 > 0) {
            for (int k = n2; k >= n && k > 0; --k) {
                GeometrySprite geometrySprite2 = (GeometrySprite)this.a.b(k + 3);
                GeometrySprite geometrySprite3 = (GeometrySprite)this.a.b(k - 1 + 3);
                geometrySprite2.a(geometrySprite3.j(), geometrySprite3.g(), geometrySprite3.p(), geometrySprite3.q());
            }
        }
    }

    public void b(int n) {
        int n2 = this.a.V();
        int n3 = n2 - 3;
        if (n3 <= 0) {
            return;
        }
        this.a.b(this.a.b(3 + n));
    }

    private void l() {
        this.a(this.n - this.e.e(), 0, this.e.e(), this.e.d(), this.e);
        this.a(this.n - this.f.e(), 0, this.f.e(), this.f.d(), this.f);
        this.a(this.n - this.g.e(), 0, this.g.e(), 0, this.g);
        this.j = true;
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        this.p = insets.left + insets2.left + insets3.left;
        this.s = insets.bottom + insets2.bottom + insets3.bottom;
        this.q = insets.right + insets2.right + insets3.right;
        this.r = insets.top + insets2.top + insets3.top;
        this.n = dimension.width - this.p - this.q;
        this.o = dimension.height - this.r - this.s;
        if (!this.i) {
            return;
        }
        if (!this.j) {
            this.l();
        }
        this.m();
    }

    private void m() {
        GeometrySprite geometrySprite = (GeometrySprite)this.a.b(0);
        geometrySprite.a((float)(this.s + this.e.d()), (float)(this.p + this.n - this.e.e()));
        geometrySprite = (GeometrySprite)this.a.b(1);
        geometrySprite.a((float)(this.s + this.o), (float)(this.p + this.n - this.f.e()));
        geometrySprite = (GeometrySprite)this.a.b(2);
        geometrySprite.a((float)(this.s + this.o - this.f.d()), (float)(this.p + this.n - this.f.e()), this.g.e(), this.o - this.f.d() - this.e.d());
        this.n();
    }

    private void n() {
        if (this.k != null && this.k.length > 0) {
            int n = this.k.length;
            for (int k = 0; k < n; ++k) {
                this.a(k, this.p + this.n - this.g.e(), this.s + this.k[k]);
            }
        }
    }

    private void a(int n, int n2, int n3, int n4, ayo_2 ayo_22) {
        if (ayo_22 == null || ayo_22.a() == null) {
            return;
        }
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.j.d();
        geometrySprite.a((float)n2, (float)n, n3, n4);
        if (this.d != null) {
            geometrySprite.a(this.d.q(), this.d.r(), this.d.s(), this.d.p());
        } else {
            geometrySprite.a(1.0f, 1.0f, 1.0f, 1.0f);
        }
        geometrySprite.a(ayo_22.k(), ayo_22.h(), ayo_22.j(), ayo_22.i(), ayo_22.n());
        this.a.a(geometrySprite, ayo_22.a(), null);
        geometrySprite.u();
    }

    @Override
    public Entity g() {
        return this.a;
    }

    @Override
    public void h() {
        this.e = null;
        this.f = null;
        this.h = null;
        this.g = null;
        this.a.u();
        this.a = null;
        this.d = null;
    }

    @Override
    public void i() {
        assert (this.a == null) : "Object already checked out";
        this.a = (Entity3D)Entity3D.c.d();
        this.i = false;
        this.j = false;
        this.l = new int[0];
        this.m = new float[0];
        this.k = new int[0];
    }
}

