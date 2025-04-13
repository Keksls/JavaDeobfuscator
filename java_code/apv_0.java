/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aPV
 */
public class apv_0 {
    private final int a = 2;
    private final aif_0[] b = new aif_0[2];
    private static final apv_0 c = new apv_0();

    public static apv_0 a() {
        return c;
    }

    private apv_0() {
        for (int k = 0; k < 2; ++k) {
            this.b[k] = aii_0.a().a(this.a(k), aim.b);
        }
    }

    public void a(bvx_2 bvx_22) {
        for (int k = 0; k < 2; ++k) {
            this.b[k].f();
            this.b[k].a(anr_0.T[k]);
        }
        tg_0 tg_02 = bvx_22.g();
        int n = tg_02.z();
        int n2 = tg_02.A();
        int n3 = tg_02.B();
        int n4 = n + n3;
        int n5 = n2 + tg_02.C();
        for (int k = n; k < n4; ++k) {
            for (int i2 = n2; i2 < n5; ++i2) {
                byte by = tg_02.j(k, i2);
                if (by == -1) continue;
                short s2 = tg_02.i(k, i2);
                this.b[by].b(k, i2, s2);
            }
        }
    }

    public void b() {
        for (int k = 0; k < 2; ++k) {
            this.b[k].f();
        }
    }

    protected String a(int n) {
        return "startPoint" + n;
    }
}

