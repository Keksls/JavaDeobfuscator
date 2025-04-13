/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from ayO
 */
public final class ayo_2 {
    private int f;
    private int g;
    public float a;
    public float b;
    public float c;
    public float d;
    private ays_2 h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m = false;
    private boolean n = false;
    private avg_1 o = avg_1.a;
    private final ArrayList<ayp_2> p = new ArrayList();

    public ayo_2() {
        this.i = 0;
        this.j = 0;
        this.f = -1;
        this.g = -1;
        this.l = true;
    }

    public ayo_2(ays_2 ays_22) {
        assert (ays_22 != null);
        this.h = ays_22;
        this.h.k_();
        this.i = 0;
        this.j = 0;
        this.f = -1;
        this.g = -1;
        this.l = true;
        this.q();
    }

    public ayo_2(ays_2 ays_22, int n, int n2, int n3, int n4) {
        assert (ays_22 != null);
        this.h = ays_22;
        this.h.k_();
        this.i = n;
        this.j = n2;
        this.f = n3;
        this.g = n4;
        this.l = false;
        this.q();
    }

    public void a(ayp_2 ayp_22) {
        assert (ayp_22 != null) : "Client can't be null";
        assert (!this.p.contains(ayp_22)) : "Client already registered for this pixmap";
        this.p.add(ayp_22);
    }

    public void b(ayp_2 ayp_22) {
        assert (ayp_22 != null) : "Client can't be null";
        this.p.remove(ayp_22);
    }

    public ays_2 a() {
        return this.h;
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.o.a() ? this.f : this.g;
    }

    public int e() {
        return this.o.a() ? this.g : this.f;
    }

    public int f() {
        return this.i;
    }

    public int g() {
        return this.j;
    }

    public float h() {
        return this.a;
    }

    public float i() {
        return this.b;
    }

    public float j() {
        return this.c;
    }

    public float k() {
        return this.d;
    }

    public void a(ays_2 ays_22) {
        if (ays_22 != null) {
            ays_22.k_();
        }
        if (this.h != null) {
            this.h.u();
        }
        this.h = ays_22;
        this.k = false;
    }

    public void a(int n) {
        this.i = n;
        this.k = false;
    }

    public void b(int n) {
        this.j = n;
        this.k = false;
    }

    public void c(int n) {
        this.f = n;
        this.k = false;
    }

    public void d(int n) {
        this.g = n;
        this.k = false;
    }

    public void a(boolean bl) {
        this.n = bl;
        this.k = false;
    }

    public void b(boolean bl) {
        this.m = bl;
        this.k = false;
    }

    public boolean l() {
        return this.m;
    }

    public boolean m() {
        return this.n;
    }

    public avg_1 n() {
        return this.o;
    }

    public void a(avg_1 avg_12) {
        if (avg_12 != this.o) {
            this.o = avg_12;
            this.k = false;
        }
    }

    public void c(boolean bl) {
        this.l = bl;
        this.k = false;
    }

    public boolean o() {
        return this.l;
    }

    public boolean p() {
        return !this.k;
    }

    public void q() {
        float f2;
        afe_1 afe_12;
        if (this.h == null) {
            return;
        }
        if (this.l) {
            afe_12 = this.h.w();
            afe_1 afe_13 = this.h.x();
            f2 = afe_13.a();
            float f3 = afe_13.b();
            this.i = 0;
            this.j = 0;
            this.f = afe_12.a();
            this.g = afe_12.b();
            this.d = 0.0f;
            this.a = 0.0f;
            this.c = (float)this.g / f3;
            this.b = (float)this.f / f2;
        } else {
            afe_12 = this.h.x();
            float f4 = afe_12.a();
            f2 = afe_12.b();
            this.a = (float)this.i / f4;
            this.b = (float)(this.i + this.f) / f4;
            this.d = (float)this.j / f2;
            this.c = (float)(this.j + this.g) / f2;
        }
        if (this.m) {
            float f5 = this.a;
            this.a = this.b;
            this.b = f5;
        }
        if (this.n) {
            float f6 = this.d;
            this.d = this.c;
            this.c = f6;
        }
        this.k = true;
        for (int k = this.p.size() - 1; k >= 0; --k) {
            this.p.get(k).a(this);
        }
    }
}

