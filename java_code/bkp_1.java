/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkP
 */
public class bkp_1
implements ajh_1 {
    public static final String a = "noticeTitle";
    public static final String b = "noticeText";
    public static final String d = "noticeBoosterPack";
    public static final String e = "noticeType";
    public static final String f = "noticeMainIcon";
    public static final String g = "noticePrivileges";
    public static final String h = "noticeAlign";
    public static final String i = "noticeXOffset";
    public static final String j = "noticeYOffset";
    public static final String k = "buyBoosterButton";
    public static final String l = "isBoosterButton";
    public static final byte m = 0;
    public static final byte n = 1;
    public static final byte o = 0;
    public static final byte p = 1;
    public static final byte q = 2;
    public static final byte r = 3;
    public static final byte s = 4;
    public static final byte t = 5;
    public static final byte u = 0;
    public static final byte v = 1;
    public static long w = 900000L;
    public static long x = 1800000L;
    public static long y = 43200000L;
    public static final long z = 604800000L;
    public static final long A = 86400000L;
    public static final String[] B = new String[]{"noticeTitle", "noticeText", "noticeType", "noticeMainIcon", "noticePrivileges", "noticeAlign", "noticeXOffset", "noticeYOffset"};
    private static final List<bkq_1> C = new ArrayList<bkq_1>();
    private static final long D = System.currentTimeMillis();
    private final String E;
    private final String F;
    private final byte G;
    private final byte H;
    private final String I;
    private final int J;
    private final int K;

    public static boolean a(String string) {
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        long l = ((bvo_0)bvx_02.g()).r(string);
        if (bkp_1.a() && (l + y <= System.currentTimeMillis() || l > System.currentTimeMillis())) {
            ((bvo_0)bvx_02.g()).a(string, System.currentTimeMillis());
            return true;
        }
        return false;
    }

    public static boolean a() {
        boolean bl;
        bai_0 bai_02 = azu_0.j().n();
        bmr_1 bmr_12 = azu_0.j().k();
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        Long l = bvx_02.e(bWe.ay);
        long l2 = System.currentTimeMillis();
        boolean bl2 = bl = !bkr_1.d.a(bai_02.g()) && !eoe_0.j.contains(bmr_12.T_()) && bmr_12.T_() != eoi_0.b().d && (l + x <= l2 || l > l2) && D + w <= l2;
        if (bl) {
            bvx_02.a((agp_0)bWe.ay, l2);
        }
        return bl;
    }

    public bkp_1(String string, String string2, byte by, byte by2, String string3, int n, int n2) {
        this.E = string;
        this.F = string2;
        this.G = by;
        this.H = by2;
        this.I = string3;
        this.J = n;
        this.K = n2;
    }

    @Override
    public String[] d() {
        return B;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.E;
        }
        if (string.equals(b)) {
            return this.F;
        }
        if (string.equals(d)) {
            return bae.h().a("booster.pack", new Object[0]);
        }
        if (string.equals(e)) {
            return this.G;
        }
        if (string.equals(f)) {
            return azs_0.a().b(this.H, 3);
        }
        if (string.equals(g)) {
            return C;
        }
        if (string.equals(h)) {
            return this.I;
        }
        if (string.equals(i)) {
            return this.J;
        }
        if (string.equals(j)) {
            return this.K;
        }
        if (string.equals(l)) {
            return this.G == 1 || this.H == 0;
        }
        return null;
    }

    static {
        for (bkr_1 bkr_12 : bkr_1.values()) {
            bkq_1 bkq_12 = new bkq_1(bkr_12);
            C.add(bkq_12);
        }
    }
}

