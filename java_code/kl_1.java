/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from KL
 */
public abstract class kl_1
extends Enum<kl_1> {
    public static final /* enum */ kl_1 a = new km_1(0);
    public static final /* enum */ kl_1 b = new kx_1(1);
    public static final /* enum */ kl_1 c = new ld_1(2);
    public static final /* enum */ kl_1 d = new le_1(4);
    public static final /* enum */ kl_1 e = new lf_1(5);
    public static final /* enum */ kl_1 f = new lg_1(6);
    public static final /* enum */ kl_1 g = new lh_1(7);
    public static final /* enum */ kl_1 h = new li_1(8);
    public static final /* enum */ kl_1 i = new lj_1(9);
    public static final /* enum */ kl_1 j = new kn_1(10);
    public static final /* enum */ kl_1 k = new ko_1(11);
    public static final /* enum */ kl_1 l = new kp_1(13);
    public static final /* enum */ kl_1 m = new kq_1(14);
    public static final /* enum */ kl_1 n = new kr_1(15);
    public static final /* enum */ kl_1 o = new ks_1(16);
    public static final /* enum */ kl_1 p = new kt_1(18);
    public static final /* enum */ kl_1 q = new ku_1(20);
    public static final /* enum */ kl_1 r = new kv_1(21);
    public static final /* enum */ kl_1 s = new kw_1(22);
    public static final /* enum */ kl_1 t = new ky_1(23);
    public static final /* enum */ kl_1 u = new kz_1(24);
    public static final /* enum */ kl_1 v = new la_1(25);
    public static final /* enum */ kl_1 w = new lb_1(100);
    public static final /* enum */ kl_1 x = new lc_1(200);
    private final int y;
    private static final /* synthetic */ kl_1[] z;

    public static kl_1[] values() {
        return (kl_1[])z.clone();
    }

    public static kl_1 valueOf(String string) {
        return Enum.valueOf(kl_1.class, string);
    }

    kl_1(int n2) {
        this.y = n2;
    }

    public int a() {
        return this.y;
    }

    public abstract ll_2 b();

    public static kl_1 a(int n) {
        kl_1[] kl_1Array;
        for (kl_1 kl_12 : kl_1Array = kl_1.values()) {
            if (kl_12.y != n) continue;
            return kl_12;
        }
        throw new IllegalArgumentException("unable to find tag " + n);
    }

    static {
        z = new kl_1[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x};
    }
}

