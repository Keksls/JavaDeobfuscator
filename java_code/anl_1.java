/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from anl
 */
public class anl_1
implements anc_0 {
    private static final Logger a = Logger.getLogger(anl_1.class);
    private boolean b;
    private long[] c;
    private byte[] d;
    private float[] e;
    private float[] f;

    public anl_1() {
    }

    public anl_1(arf_1 arf_12) {
        this.a(arf_12);
    }

    public anl_1(boolean bl, long[] lArray, byte[] byArray) {
        this.b = bl;
        this.c = lArray;
        this.d = byArray;
        int n = this.c.length;
        this.e = new float[n];
        this.f = new float[n];
        for (int k = 0; k < n; ++k) {
            this.e[k] = 1.0f;
            this.f[k] = 1.0f;
        }
    }

    public anl_1(boolean bl, long[] lArray, byte[] byArray, float[] fArray, float[] fArray2) {
        this.b = bl;
        this.c = lArray;
        this.d = byArray;
        this.e = fArray;
        this.f = fArray2;
    }

    @Override
    public void a(aty_1 aty_12) {
        int n = Hw.a(this.c.length);
        long l = this.c[n];
        if (!ann_2.a(aty_12, l)) {
            return;
        }
        if (!ann_2.a(l)) {
            return;
        }
        ann_2.a(aty_12, l, (float)this.d[n], Hw.a(this.e[n], this.f[n]), (short)1, this.b);
    }

    @Override
    public int a() {
        return 4;
    }

    @Override
    public void a(arf_1 arf_12) {
        int n = arf_12.c();
        this.c = new long[n];
        this.d = new byte[n];
        this.e = new float[n];
        this.f = new float[n];
        for (int k = 0; k < n; ++k) {
            this.c[k] = arf_12.j();
            this.d[k] = arf_12.a();
            if (!arf_12.l()) continue;
            this.e[k] = arf_12.d();
            this.f[k] = arf_12.d();
        }
        this.b = arf_12.l();
    }

    @Override
    public void a(gk_0 gk_02) {
        int n = this.c != null ? this.c.length : 0;
        gk_02.a(n);
        for (int k = 0; k < n; ++k) {
            gk_02.c(this.c[k]);
            gk_02.a(this.d[k]);
            if (this.e[k] != this.f[k] || this.e[k] != 0.0f) {
                gk_02.a(true);
                gk_02.a(this.e[k]);
                gk_02.a(this.f[k]);
                continue;
            }
            gk_02.a(false);
        }
        gk_02.a(this.b);
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public void a(long[] lArray) {
        this.c = lArray;
    }

    public void a(byte[] byArray) {
        this.d = byArray;
    }

    public void a(float[] fArray, float[] fArray2) {
        this.e = fArray;
        this.f = fArray2;
    }
}

