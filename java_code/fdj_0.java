/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fdj
 */
public enum fdj_0 implements aqk_2,
aqs_2
{
    a(1, fek.b, fdh_0.a),
    b(2, fee_0.b, fdh_0.b),
    c(3, fdp.b, fdh_0.c),
    d(4, fdr.b, fdh_0.c),
    e(5, fdy_0.b, fdh_0.d),
    f(6, feg_0.b, fdh_0.e),
    g(7, fdd_0.b, fdh_0.f),
    h(8, fdz.b, fdh_0.f),
    i(9, fdb_0.b, fdh_0.f),
    j(10, fdL.b, fdh_0.g),
    k(11, fdJ.b, fdh_0.g),
    l(12, feq.b, fdh_0.h),
    m(13, fdT.b, fdh_0.i),
    n(14, fdr_0.b, fdh_0.i),
    o(15, fdN.b, fdh_0.k),
    p(16, fdp_0.b, fdh_0.k),
    q(17, fdF.b, fdh_0.f),
    r(18, fdH.b, fdh_0.f),
    s(19, fdv.b, fdh_0.l),
    t(20, fdx.b, fdh_0.l),
    u(21, fdw_0.b, fdh_0.m),
    v(22, fea_0.b, fdh_0.m),
    w(23, fec.b, fdh_0.m),
    x(24, fei_0.b, fdh_0.n),
    y(25, fem.b, fdh_0.o),
    z(26, feo.b, fdh_0.o),
    A(27, fdt_0.b, fdh_0.p);

    public final int B;
    public final fdv_0<? extends fde> C;
    public final fdh_0 D;

    private fdj_0(int n2, fdv_0<? extends fde> fdv_02, fdh_0 fdh_02) {
        this.B = n2;
        this.C = fdv_02;
        this.D = fdh_02;
    }

    public static fdj_0 a(int n) {
        fdj_0[] fdj_0Array = fdj_0.values();
        for (int k = 0; k < fdj_0Array.length; ++k) {
            fdj_0 fdj_02 = fdj_0Array[k];
            if (fdj_02.B != n) continue;
            return fdj_02;
        }
        return null;
    }

    @Override
    public String d() {
        return String.valueOf(this.B);
    }

    @Override
    public String e() {
        return this.toString();
    }

    @Override
    public String f() {
        return this.toString();
    }

    @Override
    public aqr_2 c_() {
        return this.C.a();
    }
}

