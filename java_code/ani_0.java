/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ani
 */
public class ani_0
implements anc_0 {
    private static final Logger a = Logger.getLogger(ani_0.class);
    private int b;
    private boolean c;
    private long[] d;
    private byte[] e;
    private float[] f;
    private float[] g;

    public ani_0(arf_1 arf_12) {
        this.a(arf_12);
    }

    public ani_0(int n, boolean bl, long[] lArray, byte[] byArray) {
        this.b = n;
        this.c = bl;
        this.d = lArray;
        this.e = byArray;
        int n2 = this.d.length;
        this.f = new float[n2];
        this.g = new float[n2];
        for (int k = 0; k < n2; ++k) {
            this.f[k] = 1.0f;
            this.g[k] = 1.0f;
        }
    }

    public ani_0(int n, boolean bl, long[] lArray, byte[] byArray, float[] fArray, float[] fArray2) {
        this.b = n;
        this.c = bl;
        this.d = lArray;
        this.e = byArray;
        this.f = fArray;
        this.g = fArray2;
    }

    @Override
    public void a(aty_1 aty_12) {
        int n = Hw.a(this.d.length);
        long l = this.d[n];
        if (!ann_2.a(aty_12, l)) {
            return;
        }
        if (!ann_2.a(l)) {
            return;
        }
        if (this.f[n] != this.g[n]) {
            ann_2.a(aty_12, l, this.e[n], Hw.a(this.f[n], this.g[n]), (short)1, this.b, this.c);
        } else {
            ann_2.a(aty_12, l, this.e[n], (short)1, this.b, this.c);
        }
    }

    @Override
    public int a() {
        return 6;
    }

    @Override
    public void a(arf_1 arf_12) {
        int n = arf_12.c();
        this.d = new long[n];
        this.e = new byte[n];
        this.f = new float[n];
        this.g = new float[n];
        for (int k = 0; k < n; ++k) {
            this.d[k] = arf_12.j();
            this.e[k] = arf_12.a();
            if (!arf_12.l()) continue;
            this.f[k] = arf_12.d();
            this.g[k] = arf_12.d();
        }
        this.b = arf_12.c();
        this.c = arf_12.l();
    }

    @Override
    public void a(gk_0 gk_02) {
        int n = this.d != null ? this.d.length : 0;
        gk_02.a(n);
        for (int k = 0; k < n; ++k) {
            gk_02.c(this.d[k]);
            gk_02.a(this.e[k]);
            if (this.f[k] != this.g[k] || this.f[k] != 0.0f) {
                gk_02.a(true);
                gk_02.a(this.f[k]);
                gk_02.a(this.g[k]);
                continue;
            }
            gk_02.a(false);
        }
        gk_02.a(this.b);
        gk_02.a(this.c);
    }

    public void a(int n) {
        this.b = n;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public void a(long[] lArray) {
        this.d = lArray;
    }

    public void a(byte[] byArray) {
        this.e = byArray;
    }

    public void a(float[] fArray, float[] fArray2) {
        this.f = fArray;
        this.g = fArray2;
    }
}

