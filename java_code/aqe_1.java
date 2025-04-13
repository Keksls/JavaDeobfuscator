/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aqe
 */
public abstract class aqe_1
extends Enum<aqe_1>
implements aqk_2,
aqs_2 {
    public static final /* enum */ aqe_1 a = new aqf_2(1, aqa_2.b, 1);
    public static final /* enum */ aqe_1 b = new aqk_1(2, aqt_1.b, 8);
    public static final /* enum */ aqe_1 c = new aql_1(3, aqu_1.b, 4);
    public static final /* enum */ aqe_1 d = new aqm_1(4, aqf_1.b, 2);
    public static final /* enum */ aqe_1 e = new aqn_1(5, aqe_2.b, 7);
    public static final /* enum */ aqe_1 f = new aqo_1(6, aqd_2.b, 5);
    public static final /* enum */ aqe_1 g = new aqp_1(7, aqc_2.b, 6);
    public static final /* enum */ aqe_1 h = new aqq_1(8, aqb_2.b, 3);
    public static final /* enum */ aqe_1 i = new aqr_1(9, aqg_2.b, 2);
    public static final /* enum */ aqe_1 j = new aqg_1(10, aqx_1.b, 5);
    public static final /* enum */ aqe_1 k = new aqh_1(11, aqv_1.b, 4);
    public static final /* enum */ aqe_1 l = new aqi_1(12, aqw_1.b, 4);
    public static final /* enum */ aqe_1 m = new aqj_1((short)Short.MAX_VALUE, aqy_1.b, 0);
    private final short n;
    private final aqr_2 o;
    private final short p;
    private static final /* synthetic */ aqe_1[] q;

    public static aqe_1[] values() {
        return (aqe_1[])q.clone();
    }

    public static aqe_1 valueOf(String string) {
        return Enum.valueOf(aqe_1.class, string);
    }

    aqe_1(short s2, aqr_2 aqr_22, short s3) {
        this.n = s2;
        this.o = aqr_22;
        this.p = s3;
    }

    public short a() {
        return this.n;
    }

    abstract aqd_1 b();

    public aqd_1 a(int[] nArray, short s2) {
        aqd_1 aqd_12 = this.b();
        aqd_12.a(nArray);
        aqd_12.a(s2);
        return aqd_12;
    }

    public static aqd_1 a(int n, int[] nArray, short s2) {
        for (aqe_1 aqe_12 : aqe_1.values()) {
            if (aqe_12.n != n) continue;
            return aqe_12.a(nArray, s2);
        }
        return null;
    }

    public static aqd_1 a(ArrayList<aqd_1> arrayList) {
        aqd_1 aqd_12 = null;
        for (aqd_1 aqd_13 : arrayList) {
            if (aqd_12 == null) {
                aqd_12 = aqd_13;
                continue;
            }
            if (aqd_12.d().p >= aqd_13.d().p) continue;
            aqd_12 = aqd_13;
        }
        return aqd_12;
    }

    @Override
    public String d() {
        return Short.valueOf(this.n).toString();
    }

    @Override
    public String e() {
        return this.toString();
    }

    @Override
    public aqr_2 c_() {
        return this.o;
    }

    @Override
    public String f() {
        return null;
    }

    static {
        q = new aqe_1[]{a, b, c, d, e, f, g, h, i, j, k, l, m};
    }
}

