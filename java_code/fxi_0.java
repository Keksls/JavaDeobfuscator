/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fxi
 */
public class fxi_0 {
    private static final Logger b = Logger.getLogger(fxi_0.class);
    private static final int c = 512;
    private Entity3D d;
    private VertexBufferPCT e;
    private auf_2 f;
    private azj_2 g;
    private ayo_2 h;
    private GeometryMesh i;
    private int j;
    private int k;
    private int l;
    private int m;
    private ArrayList<afq_2> n;
    private ArrayList<afq_2>[] o;
    private int p;
    private int q;
    private aad_1 r;

    public void a(ArrayList<afq_2> arrayList) {
        if (this.n == arrayList) {
            return;
        }
        this.n = arrayList;
        if (this.n == null) {
            return;
        }
        for (int k = this.n.size() - 1; k >= 0; --k) {
            afq_2 afq_22 = this.n.get(k);
            afq_22.a(afq_22.a / 512.0f);
            afq_22.b(afq_22.b / 512.0f);
        }
        this.d();
    }

    public int a(afq_2 afq_22) {
        int n = (int)Math.floor((afq_22.a + 1.0f) * (float)this.p / 2.0f);
        if (n < 0 || n >= this.p) {
            return -1;
        }
        return n;
    }

    public int b(afq_2 afq_22) {
        int n = (int)Math.floor((afq_22.b + 1.0f) * (float)this.q / 2.0f);
        if (n < 0 || n >= this.q) {
            return -1;
        }
        return n;
    }

    public void a(ayo_2 ayo_22) {
        if (this.h == ayo_22) {
            return;
        }
        this.h = ayo_22;
        this.d.a(0, this.h.a());
        this.f();
    }

    public void a(int n, int n2, int n3, int n4) {
        boolean bl = this.l != n3 || this.m != n4;
        this.l = n3;
        this.m = n4;
        this.j = n;
        this.k = n2;
        if (this.h == null) {
            return;
        }
        if (bl) {
            this.d();
        }
    }

    private void d() {
        int n;
        if (this.l == 0 || this.m == 0 || this.n == null) {
            return;
        }
        float f2 = 0.8f;
        float f3 = (float)this.h.e() * 0.8f / 512.0f;
        this.e();
        ArrayList[] arrayListArray = new ArrayList[this.o.length];
        for (n = 0; n < this.p; ++n) {
            for (int k = 0; k < this.q; ++k) {
                int n2 = n * this.q + k;
                arrayListArray[n2] = new ArrayList(this.r.a().size());
                this.r.b(this.o[n2], arrayListArray[n2], f3);
            }
        }
        n = 0;
        for (ArrayList arrayList : arrayListArray) {
            n += arrayList != null ? arrayList.size() : 0;
        }
        this.a(n);
        float f4 = frs_0.e.a(512 * this.p, this.l);
        float f5 = frs_0.e.b(512 * this.q, this.m);
        float[] fArray = new float[]{0.8f, 0.9f, 1.0f};
        int n3 = 0;
        for (int k = 0; k < this.p; ++k) {
            float f6 = 512 * k;
            for (int i2 = 0; i2 < this.q; ++i2) {
                float f7 = 512 * i2;
                ArrayList arrayList = arrayListArray[k * this.q + i2];
                n = arrayList.size();
                for (int i3 = 0; i3 < n; ++i3) {
                    afq_2 afq_22 = (afq_2)arrayList.get(i3);
                    float f8 = (afq_22.a + 1.0f) * 512.0f / 2.0f + (float)this.j + f6 + f4;
                    float f9 = (afq_22.b + 1.0f) * 512.0f / 2.0f + (float)this.k + f7 + f5;
                    int n4 = (int)((float)this.h.e() * fArray[i3 % fArray.length]);
                    int n5 = (int)((float)this.h.d() * fArray[i3 % fArray.length]);
                    this.e.b((i3 + n3) * 4, f8 - (float)n4, f9 - (float)n5);
                    this.e.b((i3 + n3) * 4 + 1, f8 - (float)n4, f9 + (float)n5);
                    this.e.b((i3 + n3) * 4 + 2, f8 + (float)n4, f9 + (float)n5);
                    this.e.b((i3 + n3) * 4 + 3, f8 + (float)n4, f9 - (float)n5);
                }
                n3 += n;
            }
        }
    }

    public final Entity a() {
        return this.d;
    }

    private void e() {
        this.p = (int)Math.ceil((float)this.l / 512.0f);
        this.q = (int)Math.ceil((float)this.m / 512.0f);
        this.o = new ArrayList[this.p * this.q];
        for (int k = this.n.size() - 1; k >= 0; --k) {
            afq_2 afq_22 = this.n.get(k);
            int n = this.a(afq_22);
            int n2 = this.b(afq_22);
            if (n == -1 || n2 == -1) continue;
            int n3 = n * this.q + n2;
            ArrayList<afq_2> arrayList = this.o[n3];
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.o[n3] = arrayList;
            }
            float f2 = (afq_22.a + 1.0f) * (float)this.p - (float)(2 * n) - 1.0f;
            float f3 = (afq_22.b + 1.0f) * (float)this.q - (float)(2 * n2) - 1.0f;
            arrayList.add(new afq_2(f2, f3));
        }
    }

    private void f() {
        if (this.e == null) {
            return;
        }
        int n = this.e.j();
        if (this.h != null) {
            float f2 = this.h.h();
            float f3 = this.h.j();
            float f4 = this.h.i();
            float f5 = this.h.k();
            int n2 = n / 4;
            for (int k = 0; k < n2; ++k) {
                this.e.a(k * 4, f2, f3);
                this.e.a(k * 4 + 1, f2, f5);
                this.e.a(k * 4 + 2, f4, f5);
                this.e.a(k * 4 + 3, f4, f3);
            }
        }
    }

    private void g() {
        int n = this.e.j();
        int n2 = n / 4;
        for (int k = 0; k < n2; ++k) {
            float f2 = 1.0f;
            float f3 = Hw.a(0.95f, 0.99f);
            float f4 = f3 * f3;
            this.e.a(k * 4, f4, f4, f4, 1.0f);
            this.e.a(k * 4 + 1, f3, f3, f3, 1.0f);
            this.e.a(k * 4 + 2, 1.0f, 1.0f, 1.0f, 1.0f);
            this.e.a(k * 4 + 3, f3, f3, f3, 1.0f);
        }
    }

    private void a(int n) {
        int n2 = n * 4;
        if (this.e != null) {
            this.e.u();
        }
        this.e = VertexBufferPCT.d.b(n2);
        this.f = auf_2.b;
        this.e.a(n2);
        this.g();
        this.f();
        this.i.a(ave_1.g, this.e, this.f);
    }

    public final void b() {
        assert (this.d == null);
        assert (this.i == null);
        this.d = (Entity3D)Entity3D.c.d();
        this.i = (GeometryMesh)GLGeometryMesh.k.d();
        this.d.a(this.i);
        this.r = new aak_1(0.055f, true, 1000, 1);
        this.r.e();
    }

    public final void c() {
        this.d.u();
        this.d = null;
        this.i.u();
        this.i = null;
        this.e.u();
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }
}

