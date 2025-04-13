/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public final class aed
implements avn_2 {
    private static final Logger b = Logger.getLogger(aed.class);
    public static final aed a = new aed();
    private final ArrayList<aeh_0> c = new ArrayList();
    private final ArrayList<aeh_0> d = new ArrayList();
    private final ArrayList<aek_0> e = new ArrayList(3000);
    private final ArrayList<aek_0> f = new ArrayList(3000);
    private static final Comparator<aei_0> g = new aee();
    private final aev h = aev.a();
    private final ArrayList<aei_0> i = new ArrayList(8);
    private final ArrayList<aej_0> j = new ArrayList(3);
    private final ArrayList<aei_0> k = new ArrayList(8);
    private final ArrayList<adR> l = new ArrayList();
    private float m;
    private float n;
    private boolean o = true;
    private boolean p = true;
    private boolean q = true;
    private final float[] r = new float[6];

    private aed() {
        this.i.add(this.h);
    }

    public void a() {
        avo_2.a.a(new adY(), this);
        this.c();
    }

    public boolean b() {
        return this.q;
    }

    public void a(boolean bl) {
        this.q = bl;
    }

    public adS a(int n) {
        return adZ.b().c(n);
    }

    public void b(int n) {
        adS adS2 = this.a(n);
        if (adS2 != null) {
            adS2.b(true);
        }
    }

    public void c(int n) {
        adS adS2 = this.a(n);
        if (adS2 != null) {
            adS2.b(false);
        }
    }

    public void d(int n) {
        adZ.b().a(n);
    }

    public void a(int n, int n2) {
        if (n2 == 0) {
            this.d(n);
            return;
        }
        adS adS2 = this.a(n);
        if (adS2 != null) {
            adS2.b(n2);
        }
    }

    @Override
    public void a(avk_2 avk_22) {
        adZ.b().a((adS)avk_22);
    }

    @Override
    public void b(avk_2 avk_22) {
        adZ.b().a(avk_22.d());
    }

    public void a(aeh_0 aeh_02) {
        if (!this.c.contains(aeh_02)) {
            this.c.add(aeh_02);
        }
    }

    public void b(aeh_0 aeh_02) {
        if (!this.d.contains(aeh_02)) {
            this.d.add(aeh_02);
        }
    }

    public void c(aeh_0 aeh_02) {
        this.c.remove(aeh_02);
    }

    public void a(aei_0 aei_02) {
        if (!this.i.contains(aei_02)) {
            this.i.add(aei_02);
            this.i.sort(g);
            if (aei_02 instanceof aej_0) {
                this.j.add((aej_0)aei_02);
            }
        }
    }

    public void b(aei_0 aei_02) {
        this.i.remove(aei_02);
        this.j.remove(aei_02);
    }

    public void a(adR adR2) {
        if (!this.l.contains(adR2)) {
            this.l.add(adR2);
        }
    }

    public void b(adR adR2) {
        this.l.remove(adR2);
    }

    public void a(ahg_0 ahg_02, int n) {
        this.e(n);
        if (!this.q) {
            return;
        }
        this.a(ahg_02);
        if (this.h.g()) {
            this.h();
            this.g();
            this.h.a(false);
        } else {
            if (this.o) {
                this.h();
            }
            if (this.p) {
                this.g();
            }
        }
        this.i();
        this.b(false);
        this.a(this.e);
        this.b(true);
        this.a(this.f);
    }

    private void e(int n) {
        this.f(n);
        adZ.b().a(this.n, n);
    }

    private void b(boolean bl) {
        this.k.clear();
        int n = this.i.size();
        for (int k = 0; k < n; ++k) {
            aei_0 aei_02 = this.i.get(k);
            if (aei_02.d() || bl && !aei_02.f()) continue;
            this.k.add(aei_02);
        }
    }

    private void g() {
        this.h.b(this.n);
        this.p = false;
    }

    private void h() {
        this.h.a(this.m);
        this.o = false;
    }

    private void f(int n) {
        int n2 = this.i.size();
        for (int k = 0; k < n2; ++k) {
            this.i.get(k).b(n);
        }
    }

    private void a(ahg_0 ahg_02) {
        int n;
        int n2;
        ahq_0 ahq_02 = ahg_02.s();
        int n3 = Integer.MAX_VALUE;
        int n4 = Integer.MIN_VALUE;
        int n5 = Integer.MAX_VALUE;
        int n6 = Integer.MIN_VALUE;
        this.e.clear();
        this.f.clear();
        int n7 = this.c.size();
        for (n2 = 0; n2 < n7; ++n2) {
            this.c.get(n2).a(ahq_02, this.e);
        }
        n2 = this.d.size();
        for (int k = 0; k < n2; ++k) {
            this.d.get(k).a(ahq_02, this.f);
        }
        Iterator iterator = Iterators.concat(this.e.iterator(), this.f.iterator());
        while (iterator.hasNext()) {
            aek_0 aek_02 = (aek_0)iterator.next();
            n = aek_02.G();
            int n8 = aek_02.H();
            if (n < n3) {
                n3 = n;
            }
            if (n > n4) {
                n4 = n;
            }
            if (n8 < n5) {
                n5 = n8;
            }
            if (n8 <= n6) continue;
            n6 = n8;
        }
        n = this.j.size();
        for (int k = 0; k < n; ++k) {
            this.j.get(k).a(n3, n5, n4 - n3 + 1, n6 - n5 + 1);
        }
    }

    private void i() {
        int n = this.j.size();
        for (int k = 0; k < n; ++k) {
            this.j.get(k).a();
        }
    }

    private void a(List<aek_0> list) {
        int n = list.size();
        for (int k = 0; k < n; ++k) {
            aek_0 aek_02 = list.get(k);
            try {
                int n2 = aek_02.G();
                int n3 = aek_02.H();
                short s2 = aek_02.I();
                short s3 = aek_02.ar();
                this.a(n2, n3, s2, s3, this.r);
                aek_02.b(this.r);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Unable to apply lights on object : " + aek_02), (Throwable)runtimeException);
            }
        }
    }

    private void a(int n, int n2, int n3, int n4, float[] fArray) {
        fArray[0] = 1.0f;
        fArray[1] = 1.0f;
        fArray[2] = 1.0f;
        int n5 = this.k.size();
        for (int k = 0; k < n5; ++k) {
            this.k.get(k).a(n, n2, n3, n4, fArray);
        }
    }

    public void c() {
        this.i.clear();
        this.j.clear();
        this.a(1.0f);
        this.o = true;
        this.p = true;
        adZ.b().c();
        this.a(this.h);
        this.a(adQ.a());
        this.a(adZ.b());
    }

    public void d() {
        this.h.a(true);
    }

    public void a(float f2, float f3) {
        int n;
        int n2 = this.l.size();
        if (!auc_1.a(this.m, f2)) {
            this.m = f2;
            this.o = true;
            for (n = 0; n < n2; ++n) {
                this.l.get(n).a(this.m);
            }
        }
        if (!auc_1.a(this.n, f3)) {
            this.n = f3;
            this.p = true;
            for (n = 0; n < n2; ++n) {
                this.l.get(n).b(this.n);
            }
        }
    }

    public void a(float f2) {
        float f3 = f2 > 0.001f ? f2 : 0.0f;
        float f4 = f2 < -0.001f ? -f2 : 0.0f;
        this.a(f3, f4);
    }

    public float e() {
        return this.n;
    }

    public float f() {
        return this.m;
    }
}

