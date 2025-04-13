/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLAutoDrawable
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from auy
 */
public class auy_2
implements aac_2 {
    private static final Logger d = Logger.getLogger(auy_2.class);
    private static final int e = 3;
    public static final int a = 1000;
    public static final int b = 1000;
    private auz_2 f;
    private int g;
    private int h;
    private int i = 1000;
    private final float[] j;
    private final float[] k;
    private final float[] l;
    private final EntitySprite m;
    private azy_2 n;
    private final ArrayList<auxx_2> o = new ArrayList();
    private final ArrayList<aue_2> p = new ArrayList();
    private Runnable q;
    private static final auy_2 r = new auy_2();
    int c = 0;

    private auy_2() {
        this.k = new float[4];
        this.j = new float[4];
        this.l = new float[4];
        this.k[3] = 0.0f;
        this.j[3] = 1.0f;
        this.g = 0;
        this.h = 1000;
        this.f = auz_2.d;
        this.m = (EntitySprite)EntitySprite.a.c();
        this.m.p = this;
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.j.c();
        this.m.a(gLGeometrySprite);
        gLGeometrySprite.u();
        this.m.a(this.j[0], this.j[1], this.j[2], this.j[3]);
        this.m.a((ays_2)null);
        this.m.b(false);
        this.m.c().a(axn_2.e, axn_2.f);
    }

    public static auy_2 a() {
        return r;
    }

    public final boolean b() {
        return this.f == auz_2.a;
    }

    public final boolean c() {
        return this.f == auz_2.c;
    }

    public final boolean d() {
        return this.f == auz_2.b;
    }

    public final boolean e() {
        return this.f == auz_2.d;
    }

    public final void b(int n) {
        this.i = n;
    }

    public final void a(int n, azy_2 azy_22) {
        this.a(n, azy_22, 0);
    }

    public final void a(int n, azy_2 azy_22, int n2) {
        if (this.f == auz_2.b) {
            d.error((Object)"Error occured during fade in", (Throwable)new Exception());
            if (n2 < 3) {
                this.c(n);
                this.a(n, azy_22, n2 + 1);
                return;
            }
        }
        this.n = azy_22;
        this.a(n, azf_2.f);
        this.a(auz_2.a);
    }

    @Override
    public final void a(int n) {
        if (this.f == auz_2.b) {
            this.c += n;
            if (this.c > 10000) {
                this.c = 0;
            }
            for (int k = this.p.size() - 1; k >= 0; --k) {
                if (this.p.get(k).a()) continue;
                return;
            }
            if (this.c == 0) {
                // empty if block
            }
            this.c = 0;
            this.c(this.i);
            return;
        }
        if (this.f == auz_2.d) {
            return;
        }
        this.g += n;
        if (this.g > this.h) {
            this.g = this.h;
            this.l[0] = this.j[0];
            this.l[1] = this.j[1];
            this.l[2] = this.j[2];
            this.l[3] = this.j[3];
            if (this.f == auz_2.a) {
                this.a(auz_2.b);
                this.n = null;
            } else {
                this.a(auz_2.d);
            }
        } else {
            float f2 = (float)this.g / (float)this.h;
            this.l[0] = Hw.a(this.k[0], this.j[0], f2);
            this.l[1] = Hw.a(this.k[1], this.j[1], f2);
            this.l[2] = Hw.a(this.k[2], this.j[2], f2);
            this.l[3] = Hw.a(this.k[3], this.j[3], f2);
        }
        this.m.a(this.l[0], this.l[1], this.l[2], this.l[3]);
        this.m.b(this.l[3] > 0.004f);
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable) {
    }

    @Override
    public final void a(int n, int n2) {
        this.m.a((float)(n2 / 2), (float)(-n / 2), n, n2);
        if (this.n != null) {
            this.n.a(n, n2);
        }
    }

    @Override
    public void b(GL2 gL2) {
        if (this.f == auz_2.d) {
            return;
        }
        if (this.n != null) {
            this.n.b(gL2);
        }
        avx_2 avx_22 = auj_1.a.a();
        avx_22.b(Matrix44.b);
        this.m.c(avx_22);
    }

    public final void a(auxx_2 auxx_22) {
        this.o.add(auxx_22);
    }

    public final void b(auxx_2 auxx_22) {
        this.o.remove(auxx_22);
    }

    public final void a(aue_2 aue_22) {
        this.p.add(aue_22);
    }

    public final void b(aue_2 aue_22) {
        this.p.remove(aue_22);
    }

    private void c(int n) {
        if (this.f == auz_2.d) {
            d.error((Object)"Error occured during fade out", (Throwable)new Exception());
        }
        if (this.q != null) {
            this.q.run();
            this.q = null;
        }
        if (this.n != null) {
            this.n.e();
        }
        this.n = null;
        this.a(n, azf_2.a);
        this.a(auz_2.c);
    }

    private void a(int n, azj_2 azj_22) {
        this.k[0] = this.l[0];
        this.k[1] = this.l[1];
        this.k[2] = this.l[2];
        this.k[3] = this.l[3];
        this.j[0] = azj_22.q();
        this.j[1] = azj_22.r();
        this.j[2] = azj_22.s();
        this.j[3] = azj_22.p();
        this.h = n;
        this.g = 0;
    }

    public final void f() {
        this.a(auz_2.b);
    }

    private void a(auz_2 auz_22) {
        if (this.f == auz_22) {
            return;
        }
        auz_2 auz_23 = this.f;
        this.f = auz_22;
        for (int k = this.o.size() - 1; k >= 0; --k) {
            this.f.a(this.o.get(k));
        }
    }

    public final void a(Runnable runnable) {
        this.q = runnable;
    }
}

