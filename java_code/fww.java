/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TFloatArrayList
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.material.Material;
import gnu.trove.list.array.TFloatArrayList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;

public class fww {
    private static final Logger b = Logger.getLogger(fww.class);
    private final ArrayList<fwx> c = new ArrayList();
    private fwB d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k = Integer.MAX_VALUE;
    private int l = Integer.MIN_VALUE;
    private int m = Integer.MAX_VALUE;
    private int n = Integer.MIN_VALUE;
    private boolean o = false;
    private boolean p = true;
    private int q;
    private float r = 1.0f;
    private ayo_2 s = null;
    private boolean t = true;
    private boolean u = true;
    private float v;
    private float w;
    protected aby_0 a;
    private String x;
    private String y;
    private String z;
    private long A;

    private void A() {
        this.a = new aby_0(0L);
        this.a.a(gi_0.k(this.x));
        try {
            this.a.a(this.x, false);
        }
        catch (IOException iOException) {
            b.error((Object)"Unable to load anm file", (Throwable)iOException);
            this.a.R();
            this.a = null;
            return;
        }
        this.a.a(axn_2.b, axn_2.f);
        this.a.a(aej_2.a(1));
        this.a.e(this.B());
        this.a.a(Material.b);
        this.a.u().a(this.a.w());
    }

    private String B() {
        return this.o ? this.z : this.y;
    }

    public fww() {
        this.g = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.h = Integer.MIN_VALUE;
        this.f = Integer.MIN_VALUE;
    }

    public ArrayList<fwx> a() {
        return this.c;
    }

    public void a(fwB fwB2) {
        this.d = fwB2;
    }

    public void a(short s2, short s3, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.c.add(new fwx(s2, s3, f2, f3, f4, f5, f6, f7, f8, f9));
        this.e = Math.min(this.e, s2);
        this.f = Math.max(this.f, s2);
        this.g = Math.min(this.g, s3);
        this.h = Math.max(this.h, s3);
        this.a((int)f2, (int)f5, (int)f6, (int)f9);
    }

    private void a(int n, int n2, int n3, int n4) {
        this.k = Math.min(this.k, n);
        this.l = Math.max(this.l, n3);
        this.m = Math.min(this.m, n4);
        this.n = Math.max(this.n, n2);
    }

    public void b() {
        fwx fwx2;
        int n;
        Collections.sort(this.c);
        int n2 = (this.e + this.f) / 2;
        int n3 = (this.g + this.h) / 2;
        fwx fwx3 = null;
        this.m = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.n = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        for (n = this.c.size() - 1; n >= 0; --n) {
            fwx2 = this.c.get(n);
            this.a((int)fwx2.c(), (int)fwx2.f(), (int)fwx2.g(), (int)fwx2.j());
            if (fwx2.i != n2 || fwx2.j != n3) continue;
            fwx3 = fwx2;
            break;
        }
        if (fwx3 == null && this.c.size() > 0) {
            for (n = this.c.size() / 2; n >= 0; --n) {
                fwx2 = this.c.get(n);
                if (fwx2.i != n2) continue;
                fwx3 = fwx2;
                break;
            }
        }
        if (fwx3 == null && this.c.size() > 0) {
            fwx3 = this.c.get(this.c.size() / 2);
        }
        if (fwx3 != null) {
            this.i = fwx3.i;
            this.j = fwx3.j;
            this.v = (fwx3.c() + fwx3.g()) / 2.0f;
            this.w = (fwx3.d() + fwx3.h()) / 2.0f;
        }
    }

    public void a(boolean bl) {
        this.u = bl;
    }

    public boolean a(int n, int n2) {
        if (!this.u) {
            return false;
        }
        int n3 = this.c.size();
        for (int k = 0; k < n3; ++k) {
            if (this.c.get(k).a() != n || this.c.get(k).b() != n2) continue;
            return true;
        }
        return false;
    }

    fwx b(int n, int n2) {
        int n3 = this.c.size();
        for (int k = 0; k < n3; ++k) {
            fwx fwx2 = this.c.get(k);
            if (fwx2.i != n || fwx2.j != n2) continue;
            return fwx2;
        }
        return null;
    }

    public float[] c() {
        float[] fArray = new float[this.c.size() * 8];
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            fwx fwx2 = this.c.get(k);
            fArray[k * 8] = fwx2.a;
            fArray[k * 8 + 1] = fwx2.b;
            fArray[k * 8 + 2] = fwx2.c;
            fArray[k * 8 + 3] = fwx2.d;
            fArray[k * 8 + 4] = fwx2.e;
            fArray[k * 8 + 5] = fwx2.f;
            fArray[k * 8 + 6] = fwx2.g;
            fArray[k * 8 + 7] = fwx2.h;
        }
        return fArray;
    }

    public void a(TFloatArrayList tFloatArrayList) {
        for (int k = this.e - 1; k < this.f + 1; ++k) {
            for (int i2 = this.g - 1; i2 < this.h + 1; ++i2) {
                fwx fwx2 = this.b(k, i2);
                fwx fwx3 = this.b(k, i2 + 1);
                fwx fwx4 = this.b(k + 1, i2);
                if (fwx2 == null) {
                    if (fwx3 != null) {
                        tFloatArrayList.add(fwx3.c);
                        tFloatArrayList.add(fwx3.d);
                        tFloatArrayList.add(fwx3.e);
                        tFloatArrayList.add(fwx3.f);
                    }
                    if (fwx4 == null) continue;
                    tFloatArrayList.add(fwx4.a);
                    tFloatArrayList.add(fwx4.b);
                    tFloatArrayList.add(fwx4.c);
                    tFloatArrayList.add(fwx4.d);
                    continue;
                }
                if (fwx3 == null) {
                    tFloatArrayList.add(fwx2.a);
                    tFloatArrayList.add(fwx2.b);
                    tFloatArrayList.add(fwx2.g);
                    tFloatArrayList.add(fwx2.h);
                }
                if (fwx4 != null) continue;
                tFloatArrayList.add(fwx2.e);
                tFloatArrayList.add(fwx2.f);
                tFloatArrayList.add(fwx2.g);
                tFloatArrayList.add(fwx2.h);
            }
        }
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return this.h;
    }

    public azj_2 h() {
        return this.d.aX_();
    }

    public String i() {
        return this.d.bc_();
    }

    public boolean j() {
        return this.o;
    }

    public void b(boolean bl) {
        if (this.o == bl) {
            return;
        }
        this.o = bl;
        this.p = true;
    }

    public int k() {
        return this.q;
    }

    public void a(int n) {
        this.q = n;
    }

    public float l() {
        return this.r;
    }

    public void a(float f2) {
        this.r = f2;
    }

    public int m() {
        return this.i;
    }

    public int n() {
        return this.j;
    }

    public float o() {
        return this.v;
    }

    public float p() {
        return this.w;
    }

    public int q() {
        return this.k;
    }

    public int r() {
        return this.l;
    }

    public int s() {
        return this.m;
    }

    public int t() {
        return this.n;
    }

    public ayo_2 u() {
        return this.s;
    }

    public void a(ayo_2 ayo_22) {
        this.s = ayo_22;
    }

    public void a(String string) {
        this.x = string;
    }

    public void b(String string) {
        this.y = string;
    }

    public void c(String string) {
        this.z = string;
    }

    public void a(long l) {
        this.A = l;
    }

    public void v() {
        if (this.s != null && this.s.a() != null) {
            this.s.a().u();
            this.s = null;
        }
        if (this.a != null) {
            this.a.R();
            this.a = null;
        }
    }

    public fwB w() {
        return this.d;
    }

    public boolean x() {
        return this.t;
    }

    public void c(boolean bl) {
        this.t = bl;
    }

    public aby_0 y() {
        return this.a;
    }

    public boolean b(int n) {
        if (!this.t) {
            return true;
        }
        if (!this.C()) {
            return true;
        }
        this.z();
        if (this.p) {
            if (this.o && this.A != -1L) {
                fza_0.a().a(this.A);
            }
            this.a.e(this.B());
            this.p = false;
        }
        this.a.a((ahg_0)null, n);
        return true;
    }

    private boolean C() {
        if (this.a == null && this.x != null && this.y != null && this.z != null) {
            this.A();
        }
        return this.a != null;
    }

    protected void z() {
        Entity entity = this.a.t();
        ayx_2 ayx_22 = (ayx_2)entity.D().c(0);
        ayx_22.a(this.v, this.w, 0.0f);
        float f2 = 1.0f;
        if (this.a.an() != null) {
            f2 = this.a.an().p();
        }
        float f3 = 60.0f;
        ayx_22.b(60.0f / f2, 60.0f / f2, 0.0f);
        entity.D().e();
    }
}

