/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXF
 */
public class exf_1
implements tt_0<exk_2> {
    private static final exf_1 o = new exf_1();

    private exf_1() {
    }

    public static exf_1 a() {
        return o;
    }

    @Override
    public int a(tr_0 tr_02, exk_2 exk_22) {
        return -8;
    }

    @Override
    public int a(tr_0 tr_02, exk_2 exk_22, short s2) {
        if (!(tr_02 instanceof exq_2)) {
            return -6;
        }
        exq_2 exq_22 = (exq_2)tr_02;
        if (!exq_22.d(s2)) {
            return -9;
        }
        if (enp_2.a.h(ens_2.aH).contains(exk_22.aT_())) {
            return -4;
        }
        if (!exk_22.T().F().a(exh_2.a((byte)s2))) {
            return -5;
        }
        if (exq_22.a((byte)s2)) {
            return -8;
        }
        if (!exf_1.a(exk_22)) {
            return -8;
        }
        if (exk_22.ai()) {
            return -11;
        }
        if (!exf_1.a(exq_22, null, exk_22)) {
            return -7;
        }
        exh_2[] exh_2Array = exk_22.T().F().j();
        if (exh_2Array != null) {
            for (exh_2 exh_22 : exh_2Array) {
                exk_2 exk_23;
                if (exq_22.d(exh_22.a()) || (exk_23 = (exk_2)exq_22.e(exh_22.a())) == null) continue;
                return -9;
            }
        }
        return 0;
    }

    @Override
    public int a(tr_0 tr_02, exk_2 exk_22, exk_2 exk_23) {
        if (!(tr_02 instanceof exq_2)) {
            return -6;
        }
        exq_2 exq_22 = (exq_2)tr_02;
        short s2 = exq_22.g(exk_22);
        if (!exk_23.T().F().a(exh_2.a((byte)s2))) {
            return -5;
        }
        if (exq_22.a((byte)s2)) {
            return -8;
        }
        if (!exf_1.a(exk_23)) {
            return -8;
        }
        if (exk_23.ai()) {
            return -11;
        }
        if (!exf_1.a(exq_22, exk_22, exk_23)) {
            return -7;
        }
        exh_2[] exh_2Array = exk_23.T().F().j();
        if (exh_2Array != null) {
            for (exh_2 exh_22 : exh_2Array) {
                exk_2 exk_24;
                if (exq_22.d(exh_22.a()) || (exk_24 = (exk_2)exq_22.e(exh_22.a())) == null || !exk_24.aU_() || this.b((tr_0)exq_22, exk_24) >= 0) continue;
                return -9;
            }
        }
        return 0;
    }

    @Override
    public int b(tr_0 tr_02, exk_2 exk_22) {
        if (!(tr_02 instanceof exq_2)) {
            return -6;
        }
        exq_2 exq_22 = (exq_2)tr_02;
        short s2 = exq_22.g(exk_22);
        if (exq_22.a((byte)s2)) {
            return -8;
        }
        return exk_22.aU_() ? 0 : -8;
    }

    @Override
    public boolean a(exk_2 exk_22, Su su, So so) {
        if (!exf_1.a(exk_22, (epq_2)su)) {
            return false;
        }
        if (!exf_1.a(exk_22)) {
            return false;
        }
        if (!this.a(exk_22, su)) {
            return false;
        }
        return exk_22.T().a(exz_1.c) == null || exk_22.T().a(exz_1.c).b(su, su, exk_22, so);
    }

    private boolean a(exk_2 exk_22, Su su) {
        if (su.a_() != 0L) {
            return true;
        }
        if (!exk_22.aa()) {
            return true;
        }
        return !exk_22.n().a().g();
    }

    @Override
    public boolean a(tr_0<exk_2> tr_02, Su su, So so) {
        for (exk_2 exk_22 : tr_02) {
            if (!exk_22.aU_()) continue;
            if (!exf_1.a(exk_22, (epq_2)su)) {
                return false;
            }
            if (!exf_1.a(exk_22)) {
                return false;
            }
            if (exk_22.T().a(exz_1.c) == null || exk_22.T().a(exz_1.c).b(su, su, exk_22, so)) continue;
            return false;
        }
        return true;
    }

    public static boolean a(exk_2 exk_22, epq_2 epq_22) {
        ezr_0<?> ezr_02 = exk_22.T();
        if (ezr_02.Y() || ezr_02.b(ext_1.k)) {
            return true;
        }
        short s2 = epq_22.a(eqr_1.b) ? (short)epq_22.cG().c() : (short)-1;
        short s3 = s2 <= 0 ? (short)epq_22.dr() : s2;
        return exk_22.c() <= s3;
    }

    public static boolean a(exk_2 exk_22) {
        if (!exk_22.aQ_()) {
            return true;
        }
        ffu_0 ffu_02 = exk_22.f();
        return ffu_02.p() && ffu_02.f() > 0;
    }

    public static boolean a(exq_2 exq_22, exk_2 exk_22, exk_2 exk_23) {
        return !exf_1.a(exq_22, exk_22, exk_23, ext_1.h) && !exf_1.a(exq_22, exk_22, exk_23, ext_1.l);
    }

    private static boolean a(exq_2 exq_22, exk_2 exk_22, exk_2 exk_23, ext_1 ext_12) {
        if (exk_23.T().b(ext_12)) {
            for (exk_2 exk_24 : exq_22) {
                if (exk_23 == exk_24 || exk_22 == exk_24 || !exk_24.T().b(ext_12)) continue;
                return true;
            }
        }
        return false;
    }

    public eyr_1 b(exk_2 exk_22, Su su, So so) {
        if (!exf_1.a(exk_22, (epq_2)su)) {
            return eyr_1.k;
        }
        if (!exf_1.a(exk_22)) {
            return eyr_1.A;
        }
        if (!this.a(exk_22, su)) {
            return eyr_1.j;
        }
        boolean bl = exk_22.T().a(exz_1.c) == null || exk_22.T().a(exz_1.c).b(su, su, exk_22, so);
        return bl ? eyr_1.a : eyr_1.j;
    }
}

