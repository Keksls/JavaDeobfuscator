/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from epN
 */
public enum epn_2 implements epq_1
{
    a(-2, 0, eqb_1.a, eqb_1.a, eqb_1.a),
    b(-1, 0, eqb_1.a, eqb_1.a, eqb_1.a),
    c(1, 2, eqb_1.d, eqb_1.j, eqb_1.i),
    d(2, 3, eqb_1.h, eqb_1.j, eqb_1.f),
    e(3, 2, eqb_1.b, eqb_1.c, eqb_1.f),
    f(4, 1, eqb_1.b, eqb_1.f, eqb_1.c),
    g(5, 3, eqb_1.f, eqb_1.c, eqb_1.g),
    h(6, 1, eqb_1.f, eqb_1.i, eqb_1.e),
    i(7, 2, eqb_1.b, eqb_1.e, eqb_1.j),
    j(8, 2, eqb_1.b, eqb_1.f, eqb_1.d),
    k(9, 1, eqb_1.b, eqb_1.f, eqb_1.i),
    l(10, 2, eqb_1.h, eqb_1.j, eqb_1.e),
    m(11, 1, eqb_1.f, eqb_1.d, eqb_1.g),
    n(12, 3, eqb_1.g, eqb_1.d, eqb_1.e),
    o(13, 3, eqb_1.b, eqb_1.f, eqb_1.i),
    p(14, 1, eqb_1.g, eqb_1.e, eqb_1.f),
    q(15, 1, eqb_1.f, eqb_1.d, eqb_1.i),
    r(16, 3, eqb_1.i, eqb_1.f, eqb_1.d),
    s(17, 0, eqb_1.a, eqb_1.a, eqb_1.a),
    t(18, 2, eqb_1.g, eqb_1.i, eqb_1.f),
    u(19, 3, eqb_1.b, eqb_1.f, eqb_1.i);

    private static final int x = -1;
    public static final int v = 6;
    public static final int w = 0;
    private static final Logger y;
    private final short z;
    private final short A;
    private final eqb_1 B;
    private final eqb_1 C;
    private final eqb_1 D;
    private epp_2 E;

    private epn_2(int n2, int n3, eqb_1 eqb_12, eqb_1 eqb_13, eqb_1 eqb_14) {
        this.z = (short)n2;
        this.E = epp_2.a;
        this.A = (short)n3;
        this.B = eqb_12;
        this.C = eqb_13;
        this.D = eqb_14;
    }

    public eqb_1 a() {
        return this.B;
    }

    public eqb_1 b() {
        return this.C;
    }

    public eqb_1 c() {
        return this.D;
    }

    public short e() {
        return this.A;
    }

    public static epn_2 a(int n) {
        for (epn_2 epn_22 : epn_2.values()) {
            if (epn_22.s() != n) continue;
            return epn_22;
        }
        return b;
    }

    public boolean f() {
        return this.E != null;
    }

    public static epn_2 a(String string) {
        String string2 = string.toUpperCase();
        for (epn_2 epn_22 : epn_2.values()) {
            if (!epn_22.toString().equals(string2)) continue;
            return epn_22;
        }
        y.warn((Object)("breed inconnue " + string2), (Throwable)new Exception(""));
        return b;
    }

    public void a(epp_2 epp_22) {
        this.E = epp_22;
    }

    public String toString() {
        return this.name();
    }

    @Override
    public short s() {
        return this.z;
    }

    @Override
    public int t() {
        return -1;
    }

    @Override
    public int a(eps_0 eps_02) {
        return this.E.a(eps_02);
    }

    @Override
    public float a(epr_1 epr_12) {
        return this.E.a(epr_12);
    }

    @Override
    public int m() {
        return this.E.a();
    }

    @Override
    public eke_0 n() {
        return this.E.b();
    }

    @Override
    public int[] q() {
        return Cn.f;
    }

    @Override
    public int[] r() {
        return Cn.f;
    }

    @Override
    public byte d() {
        return 6;
    }

    @Override
    public byte z() {
        return 0;
    }

    @Override
    public int C() {
        return 0;
    }

    @Override
    public int D() {
        return 0;
    }

    @Override
    public UL E() {
        return UL.b;
    }

    @Override
    public UL F() {
        return UL.a;
    }

    @Override
    public int B() {
        throw new UnsupportedOperationException("Pas de script de mort pour les perso joueurs");
    }

    @Override
    public int a(int n, eps_0 eps_02) {
        return this.E.a(n, eps_02);
    }

    public eqe_1 g() {
        return this.E.c();
    }

    public void a(HashMap<Byte, Float> hashMap) {
        this.E.a(hashMap);
    }

    public void a(TObjectProcedure<efa_0> tObjectProcedure) {
        this.E.a(tObjectProcedure);
    }

    public boolean a(efa_0 efa_02) {
        return this.E.a(efa_02);
    }

    public String h() {
        return Short.toString(this.s());
    }

    public void a(eps_0 eps_02, int n) {
        this.E.a(eps_02, n);
    }

    @Override
    public short[] w() {
        return this.E.d();
    }

    static {
        y = Logger.getLogger(epn_2.class);
    }
}

