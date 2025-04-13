/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKX
 */
public class fkx_2 {
    float[][] a = new float[0][];
    final fks_2 b = new fks_2();
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    long i;
    long j;
    fle_1 k;
    int l;
    int m;
    int n;
    int o;

    public fkx_2(fle_1 fle_12) {
        this.k = fle_12;
        if (fle_12.d != 0) {
            this.b.a();
        }
    }

    public void a(fle_1 fle_12) {
        this.k = fle_12;
    }

    public int a() {
        if (this.k != null && this.k.d != 0) {
            this.b.c();
        }
        return 0;
    }

    public int a(fkt_2 fkt_22) {
        int n;
        fls_1 fls_12 = this.k.e;
        this.b.a(fkt_22.a, fkt_22.b, fkt_22.c);
        if (this.b.c(1) != 0) {
            return -1;
        }
        int n2 = this.b.c(this.k.f);
        if (n2 == -1) {
            return -1;
        }
        this.g = n2;
        this.d = fls_12.o[this.g].a;
        if (this.d != 0) {
            this.c = this.b.c(1);
            this.e = this.b.c(1);
            if (this.e == -1) {
                return -1;
            }
        } else {
            this.c = 0;
            this.e = 0;
        }
        this.i = fkt_22.f;
        this.j = fkt_22.g - 3L;
        this.h = fkt_22.e;
        this.f = fls_12.g[this.d];
        if (this.a.length < fls_12.b) {
            this.a = new float[fls_12.b][];
        }
        for (n = 0; n < fls_12.b; ++n) {
            if (this.a[n] == null || this.a[n].length < this.f) {
                this.a[n] = new float[this.f];
                continue;
            }
            for (int k = 0; k < this.f; ++k) {
                this.a[n][k] = 0.0f;
            }
        }
        n = fls_12.p[fls_12.o[this.g].d];
        return flp_1.a[n].a(this, this.k.B[this.g]);
    }
}

