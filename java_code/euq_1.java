/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eUQ
 */
public class euq_1 {
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;
    private final int g;
    final eup_1[] h;
    private final int i;
    static final /* synthetic */ boolean a;

    public euq_1(int n, int n2, int n3, int n4, boolean bl, int n5, eup_1[] eup_1Array, int n6) {
        this.b = n;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = bl;
        this.g = n5;
        this.h = eup_1Array;
        this.i = n6;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public boolean d() {
        return this.f;
    }

    public int e() {
        return this.g;
    }

    public int f() {
        return this.c;
    }

    public eup_1[] g() {
        return this.h;
    }

    public eup_1 h() {
        if (!a && this.h.length <= 0) {
            throw new AssertionError();
        }
        float f2 = 0.0f;
        float f3 = Hw.a(0.0f, this.m());
        int n = this.h.length;
        for (int k = 0; k < n; ++k) {
            if (!(f3 <= (f2 += this.h[k].c()))) continue;
            return this.h[k];
        }
        return this.h[this.h.length - 1];
    }

    public short i() {
        return (short)this.h().b();
    }

    private float m() {
        float f2 = 0.0f;
        for (eup_1 eup_12 : this.h) {
            f2 += eup_12.c();
        }
        return f2;
    }

    public int j() {
        return this.i;
    }

    public int k() {
        return this.h.length;
    }

    public boolean l() {
        return this.c == 0;
    }

    static {
        a = !eun_1.class.desiredAssertionStatus();
    }
}

