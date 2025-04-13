/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*
 * Renamed from Nm
 */
public abstract class nm_1
extends Enum<nm_1> {
    public static final /* enum */ nm_1 a = new nn_2(oi_2.a, op_2.b, og_2.a);
    public static final /* enum */ nm_1 b = new ny_2(oi_2.a, op_2.b, og_2.b);
    public static final /* enum */ nm_1 c = new nj_2(oi_2.a, op_2.b, og_2.c);
    public static final /* enum */ nm_1 d = new np_2(oi_2.a, op_2.a, og_2.a);
    public static final /* enum */ nm_1 e = new nq_1(oi_2.a, op_2.a, og_2.b);
    public static final /* enum */ nm_1 f = new nr_2(oi_2.a, op_2.a, og_2.c);
    public static final /* enum */ nm_1 g = new ns_2(oi_2.b, op_2.b, og_2.a);
    public static final /* enum */ nm_1 h = new nt_1(oi_2.b, op_2.b, og_2.b);
    public static final /* enum */ nm_1 i = new nu_1(oi_2.b, op_2.b, og_2.c);
    public static final /* enum */ nm_1 j = new no_2(oi_2.b, op_2.a, og_2.a);
    public static final /* enum */ nm_1 k = new np_1(oi_2.b, op_2.a, og_2.b);
    public static final /* enum */ nm_1 l = new nq_2(oi_2.b, op_2.a, og_2.c);
    public static final /* enum */ nm_1 m = new nr_1(oi_2.c, op_2.b, og_2.a);
    public static final /* enum */ nm_1 n = new ns_1(oi_2.c, op_2.b, og_2.b);
    public static final /* enum */ nm_1 o = new nt_2(oi_2.c, op_2.b, og_2.c);
    public static final /* enum */ nm_1 p = new nu_2(oi_2.c, op_2.a, og_2.a);
    public static final /* enum */ nm_1 q = new nv_2(oi_2.c, op_2.a, og_2.b);
    public static final /* enum */ nm_1 r = new nw_1(oi_2.c, op_2.a, og_2.c);
    public static final /* enum */ nm_1 s = new nx_1(oi_2.d, op_2.b, og_2.a);
    public static final /* enum */ nm_1 t = new nz_2(oi_2.d, op_2.b, og_2.b);
    public static final /* enum */ nm_1 u = new na_2(oi_2.d, op_2.b, og_2.c);
    public static final /* enum */ nm_1 v = new nb_2(oi_2.d, op_2.a, og_2.a);
    public static final /* enum */ nm_1 w = new nc_2(oi_2.d, op_2.a, og_2.b);
    public static final /* enum */ nm_1 x = new nd_2(oi_2.d, op_2.a, og_2.c);
    public static final /* enum */ nm_1 y = new ne_2(oi_2.e, op_2.b, og_2.a);
    public static final /* enum */ nm_1 z = new nf_2(oi_2.e, op_2.b, og_2.b);
    public static final /* enum */ nm_1 A = new ng_2(oi_2.e, op_2.a, og_2.a);
    public static final /* enum */ nm_1 B = new nh_2(oi_2.e, op_2.a, og_2.b);
    public static final /* enum */ nm_1 C = new ni_2(oi_2.f, op_2.b, og_2.a);
    public static final /* enum */ nm_1 D = new nk_2(oi_2.f, op_2.b, og_2.b);
    public static final /* enum */ nm_1 E = new nl_2(oi_2.f, op_2.b, og_2.c);
    public static final /* enum */ nm_1 F = new nm_2(oi_2.f, op_2.a, og_2.a);
    public static final /* enum */ nm_1 G = new nn_1(oi_2.f, op_2.a, og_2.b);
    public static final /* enum */ nm_1 H = new no_1(oi_2.f, op_2.a, og_2.c);
    private final oi_2 I;
    private final op_2 J;
    private final og_2 K;
    private int L;
    private static final /* synthetic */ nm_1[] M;

    public static nm_1[] values() {
        return (nm_1[])M.clone();
    }

    public static nm_1 valueOf(String string) {
        return Enum.valueOf(nm_1.class, string);
    }

    protected abstract Set<or_2> a(nz_1 var1);

    public oi_2 a() {
        return this.I;
    }

    public op_2 b() {
        return this.J;
    }

    public og_2 c() {
        return this.K;
    }

    public boolean d() {
        return this.I.b();
    }

    protected abstract int e();

    public int f() {
        return this.L;
    }

    public void a(int n) {
        this.L = n;
    }

    public String g() {
        return "WAKFU_" + this.I + "_BY_" + this.J + "_BY_" + this.K + "_REACH";
    }

    nm_1(oi_2 oi_22, op_2 op_22, og_2 og_22) {
        this.I = oi_22;
        this.J = op_22;
        this.K = og_22;
        this.L = this.e();
    }

    protected static List<nm_1> a(oi_2 oi_22) {
        ArrayList<nm_1> arrayList = new ArrayList<nm_1>();
        for (nm_1 nm_12 : nm_1.values()) {
            if (nm_12.I != oi_22) continue;
            arrayList.add(nm_12);
        }
        return arrayList;
    }

    static {
        M = new nm_1[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H};
    }
}

