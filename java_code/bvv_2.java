/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongFloatHashMap
 */
import gnu.trove.map.hash.TLongFloatHashMap;

/*
 * Renamed from bvV
 */
public class bvv_2
extends aiD
implements aei_0 {
    private static final int d = 3;
    private static final azj_2 e = new azf_2(1.0f, 1.0f, 1.0f);
    private static final azj_2 f = new azf_2(0.35f, 0.35f, 0.35f);
    private static final long g = 500L;
    private static final int h = 2;
    private tg_0 i;
    private boolean j;
    private final TLongFloatHashMap k = new TLongFloatHashMap();

    public bvv_2() {
        super(e, f, 500L);
    }

    public void a(tg_0 tg_02) {
        this.i = tg_02;
        cct_1 cct_12 = ccs_1.a().a(tg_02.p());
        this.j = cct_12 != null && !cct_12.v;
    }

    @Override
    public int e() {
        return 700;
    }

    @Override
    public boolean d() {
        return this.j;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        long l = Hw.c(n, n2);
        if (this.k.contains(l)) {
            float f2 = this.k.get(l);
            fArray[0] = fArray[0] * Math.min(this.a[0] + f2, 1.0f);
            fArray[1] = fArray[1] * Math.min(this.a[1] + f2, 1.0f);
            fArray[2] = fArray[2] * Math.min(this.a[2] + f2, 1.0f);
        }
    }
}

