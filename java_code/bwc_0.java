/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bwc
 */
public class bwc_0
extends aiD
implements aei_0 {
    public static final float d = 1.5f;
    private static final float[] e = new float[]{0.5f, 0.5f, 0.5f};
    private static final azj_2 f = new azf_2(1.0f, 1.0f, 1.0f);
    private static final azj_2 g = new fyr_0(elw_1.cg);
    private static final long h = 500L;
    private static final float i = 1.4f;
    private final tg_0 j;
    private float k = 1.0f;
    private final boolean l;
    private boolean m;

    public bwc_0(tg_0 tg_02) {
        super(f, g, 500L);
        this.j = tg_02;
        cct_1 cct_12 = ccs_1.a().a(tg_02.p());
        this.l = cct_12 != null && !cct_12.v;
    }

    public void a(float f2) {
        this.k = 0.5f * f2 + 0.5f;
    }

    @Override
    public int e() {
        return 700;
    }

    @Override
    public boolean d() {
        return this.l;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        boolean bl = this.j.a(n, n2);
        if (bl) {
            fArray[0] = e[0];
            fArray[1] = e[1];
            fArray[2] = e[2];
            float f2 = !this.m ? 0.9f : 0.5f;
            this.a(fArray, f2, e);
            return;
        }
        if (this.j.d(n, n2)) {
            if (this.k != 1.0f && this.j.k(n, n2)) {
                this.a(fArray, this.k);
            }
            return;
        }
        this.a(fArray, g.p());
    }

    private void a(float[] fArray, float f2) {
        this.a(fArray, f2, this.a);
    }

    private void a(float[] fArray, float f2, float[] fArray2) {
        fArray[0] = fArray[0] * (f2 * fArray2[0]);
        fArray[1] = fArray[1] * (f2 * fArray2[1]);
        fArray[2] = fArray[2] * (f2 * fArray2[2]);
    }

    public void a(boolean bl) {
        this.m = bl;
    }
}

