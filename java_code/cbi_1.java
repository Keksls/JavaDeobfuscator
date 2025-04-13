/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cbI
 */
public class cbi_1
extends cbq_1 {
    private static final Long[] i = new Long[]{70300052L, 70500006L, 70300053L, 70300051L};
    private static final Long[] j = new Long[]{70420001L, 70420002L, 70420003L, 70420004L};
    public static final azf_2 a = new azf_2(0.6f, 0.6f, 0.6f, 0.4f);
    private final azf_2 k = new azf_2(a);
    private boolean l;
    private int m;
    private int n;
    private int o;
    private long p;
    private int q;

    @Override
    public void a(azj_2 azj_22) {
        this.k.a(azj_22);
    }

    @Override
    public void a() {
    }

    @Override
    public void i() {
        super.i();
        this.l = false;
        this.n = 0;
        this.q = -1;
        this.o = 0;
        this.p = 0L;
    }

    @Override
    public void a(int n) {
        super.a(n);
        if (this.n > 30000) {
            return;
        }
        this.n += n;
        this.o += n;
        if (this.q <= 0 && this.n <= 11500) {
            this.q = Hw.b(2000, 5000);
        }
        if (this.o > this.q && this.n <= 11500) {
            long l;
            while ((l = i[Hw.b(0, i.length - 1)].longValue()) == this.p) {
            }
            aki_0.h().a(l, 0.4f, 1, -1L, -1L, -1);
            this.q = -1;
            this.o = 0;
            this.p = l;
        }
        if (this.n > 11500 && !this.l) {
            aki_0.h().a(70300050L, 0.45f, 1, -1L, -1L, -1);
            this.l = true;
        }
        switch (this.m) {
            case 0: {
                if (this.n < 5000) {
                    return;
                }
                cbt_1.a(this.e, this.k, 200, 400, -0.5f, -0.6f);
                this.c();
                ++this.m;
                break;
            }
            case 1: {
                if (this.n < 10000) {
                    return;
                }
                cbt_1.a(this.e, this.k, 300, 500, -1.0f, -1.5f);
                this.c();
                ++this.m;
                break;
            }
            case 2: {
                if (this.n < 15000) {
                    return;
                }
                cbt_1.a(this.e, this.k, 800, 1000, -2.5f, -2.0f);
                this.c();
                ++this.m;
                break;
            }
            case 3: {
                if (this.n < 20000) {
                    return;
                }
                cbt_1.a(this.e, this.k, 300, 500, -1.0f, -1.5f);
                this.c();
                ++this.m;
                break;
            }
            case 4: {
                if (this.n < 25000) {
                    return;
                }
                cbt_1.a(this.e, this.k, 200, 400, -0.5f, -0.6f);
                this.c();
                ++this.m;
                break;
            }
            default: {
                aui_1.a().b(this);
                return;
            }
        }
    }

    private void c() {
        aki_0.h().a(j[Hw.b(0, j.length - 1)], 0.5f, 1, -1L, -1L, -1);
    }

    @Override
    public void a(aui_2 aui_22) {
    }

    @Override
    public azj_2 b() {
        return this.k;
    }
}

