/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from axb
 */
class axb_2 {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    final int[] g = new int[500];

    axb_2() {
    }

    final void a(long l) {
        this.d = 0;
        this.e = 0;
        int n = this.g.length;
        this.g[(int)(l % (long)n)] = this.a;
        long l2 = 0L;
        int n2 = 0;
        for (int k = 0; k < n; ++k) {
            int n3 = this.g[k];
            l2 += (long)n3;
            if (n3 < this.d || this.d <= 0) {
                this.d = n3;
            }
            if (n3 > this.e) {
                this.e = n3;
            }
            if (n3 == 0) continue;
            ++n2;
        }
        this.b = (int)Hw.b((double)l2 / (double)n2);
        this.c = (int)Hw.b((double)l2 / (double)n);
        this.f = (int)l2;
        this.a = 0;
    }

    final void a(int n) {
        this.a += n;
    }

    final void a() {
        this.a = 0;
        this.b = 0;
        this.d = 0;
        this.e = 0;
        for (int k = 0; k < this.g.length; ++k) {
            this.g[k] = 0;
        }
    }
}

