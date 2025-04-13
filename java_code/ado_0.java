/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import gnu.trove.list.array.TIntArrayList;

/*
 * Renamed from ado
 */
public abstract class ado_0
extends adn_0 {
    public float a;
    public float f;
    protected final Entity3D g = (Entity3D)Entity3D.c.c();
    protected VertexBufferPCT h;
    protected static final int i = 4096;
    protected static final float[] j = new float[32768];
    protected static final float[] k = new float[65536];
    protected static final float[] l = new float[32768];
    protected final ads_0 m;
    protected abb_2 n;
    protected int o;
    protected int p;
    protected int q;
    protected TIntArrayList r;
    protected adr_0[] s;
    protected aeh_2 t;
    protected float u;
    protected float v;

    public ado_0(ads_0 ads_02) {
        this.m = ads_02;
    }

    private void a(int n, int n2) {
        int n3;
        n = Math.min(n, 4096);
        this.p = 0;
        this.o = 0;
        this.q = Math.min(n2, n);
        this.s = new adr_0[n];
        for (n3 = 0; n3 < n; ++n3) {
            this.s[n3] = this.m.a();
        }
        this.n = new abb_2(n);
        this.r = new TIntArrayList(n);
        n3 = n * 4;
        this.h = VertexBufferPCT.d.a(n3);
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.k.d();
        gLGeometryMesh.a(ave_1.g, this.h, auf_2.b);
        gLGeometryMesh.a(axn_2.e, axn_2.f);
        this.g.a(gLGeometryMesh);
        gLGeometryMesh.u();
    }

    public void c(int n) {
        this.a(n, n);
    }

    public void d(int n) {
        this.q = Math.min(n, this.s.length);
    }

    @Override
    public void a() {
        this.g.u();
    }

    @Override
    public void i() {
        this.u = 0.0f;
        this.v = 0.0f;
        if (this.n != null) {
            for (int k = 0; k < this.p; ++k) {
                this.n.a(this.r.get(k) - 1);
            }
        }
        if (this.r != null) {
            this.r.clear();
        }
        this.p = 0;
    }

    @Override
    public void a(int n) {
        this.u += (float)n;
        if (this.e == null) {
            return;
        }
        this.k();
        float f2 = (float)n / 1000.0f;
        this.v += f2;
        this.d();
        this.a(f2);
        this.h.a();
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        for (int k = 0; k < this.p; ++k) {
            float f3;
            int n6 = this.r.getQuick(k) - 1;
            adr_0 adr_02 = this.s[n6];
            float f4 = (adr_02.a - adr_02.b) * 43.0f;
            float f5 = -(adr_02.a + adr_02.b) * 21.5f + adr_02.c * 10.0f;
            float f6 = 1.0f;
            if (!this.c()) {
                f6 = 1.5f / this.e.g();
            }
            float f7 = adr_02.t * f6;
            float f8 = adr_02.u * f6;
            if (this.b()) {
                f3 = Hw.i(adr_02.v);
                float f9 = Hw.h(adr_02.v);
                float f10 = f3 * f8;
                float f11 = f9 * f8;
                float f12 = -f9 * f7;
                float f13 = f3 * f7;
                ado_0.j[n5++] = f4 - f10 - f12;
                ado_0.j[n5++] = f5 - f11 - f13;
                ado_0.j[n5++] = f4 - f10 + f12;
                ado_0.j[n5++] = f5 - f11 + f13;
                ado_0.j[n5++] = f4 + f10 + f12;
                ado_0.j[n5++] = f5 + f11 + f13;
                ado_0.j[n5++] = f4 + f10 - f12;
                ado_0.j[n5++] = f5 + f11 - f13;
            } else {
                ado_0.j[n5++] = f4 - f7;
                ado_0.j[n5++] = f5 - f8;
                ado_0.j[n5++] = f4 - f7;
                ado_0.j[n5++] = f5 + f8;
                ado_0.j[n5++] = f4 + f7;
                ado_0.j[n5++] = f5 + f8;
                ado_0.j[n5++] = f4 + f7;
                ado_0.j[n5++] = f5 - f8;
            }
            f3 = adr_02.m;
            ado_0.k[n4++] = adr_02.j;
            ado_0.k[n4++] = adr_02.k;
            ado_0.k[n4++] = adr_02.l;
            ado_0.k[n4++] = f3;
            ado_0.k[n4++] = adr_02.j;
            ado_0.k[n4++] = adr_02.k;
            ado_0.k[n4++] = adr_02.l;
            ado_0.k[n4++] = f3;
            ado_0.k[n4++] = adr_02.j;
            ado_0.k[n4++] = adr_02.k;
            ado_0.k[n4++] = adr_02.l;
            ado_0.k[n4++] = f3;
            ado_0.k[n4++] = adr_02.j;
            ado_0.k[n4++] = adr_02.k;
            ado_0.k[n4++] = adr_02.l;
            ado_0.k[n4++] = f3;
            ado_0.l[n3++] = adr_02.q;
            ado_0.l[n3++] = adr_02.s;
            ado_0.l[n3++] = adr_02.q;
            ado_0.l[n3++] = adr_02.p;
            ado_0.l[n3++] = adr_02.r;
            ado_0.l[n3++] = adr_02.p;
            ado_0.l[n3++] = adr_02.r;
            ado_0.l[n3++] = adr_02.s;
            ++n2;
        }
        this.h.a(j, n5);
        this.h.c(k, n4);
        this.h.e(l, n3);
        this.h.a(n2 * 4);
    }

    private void a(float f2) {
        for (int k = 0; k < this.p; ++k) {
            int n = this.r.getQuick(k) - 1;
            adr_0 adr_02 = this.s[n];
            this.a(adr_02, f2);
        }
    }

    private void d() {
        if (this.v > this.a) {
            int n = 0;
            while ((float)n < this.f && this.p < this.q) {
                int n2 = this.n.a();
                this.r.add(n2 + 1);
                ++this.p;
                adr_0 adr_02 = this.s[n2];
                this.a(adr_02);
                ++n;
            }
            this.v -= this.a;
        }
    }

    private void k() {
        float f2 = this.e.A();
        int n = 0;
        while (n < this.p) {
            int n2 = this.r.getQuick(n) - 1;
            adr_0 adr_02 = this.s[n2];
            float f3 = adr_02.c - f2;
            if (f3 <= this.t.f() && f3 >= this.t.g() && adr_02.n <= adr_02.o) {
                ++n;
                continue;
            }
            --this.p;
            this.r.removeAt(n);
            this.n.a(n2);
        }
    }

    @Override
    public void a(aui_2 aui_22) {
        this.g.c(aui_22);
    }

    public void a(aeh_2 aeh_22) {
        this.t = aeh_22;
    }

    protected abstract boolean b();

    protected abstract boolean c();

    protected abstract void a(adr_0 var1);

    protected abstract void a(adr_0 var1, float var2);

    public final void e(int n) {
        float f2 = (float)n / 1000.0f;
        for (int k = 0; k < this.p; ++k) {
            int n2 = this.r.getQuick(k) - 1;
            if (!(this.s[n2].o > f2)) continue;
            this.s[n2].o = f2;
        }
    }
}

