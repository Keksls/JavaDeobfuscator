/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eYh
 */
public class eyh_2
implements tt_0<exx_2> {
    private static final eyh_2 o = new eyh_2();

    public static eyh_2 a() {
        return o;
    }

    private eyh_2() {
    }

    @Override
    public int a(tr_0 tr_02, exx_2 exx_22) {
        exs_2 exs_22 = (exs_2)tr_02;
        if (exx_22.q().f > exs_22.s()) {
            return -10;
        }
        return this.a(exs_22.t(), exx_22.h());
    }

    public int a(eyk_1 eyk_12, exk_2 exk_22) {
        if (exk_22 == null) {
            return -3;
        }
        if (exk_22.T() == null) {
            return -3;
        }
        if (exk_22.T().F() == null) {
            return -3;
        }
        if (eyk_12 != null && !eyk_12.a(exk_22.T().F())) {
            return -3;
        }
        return 0;
    }

    @Override
    public int a(tr_0 tr_02, exx_2 exx_22, short s2) {
        return this.a(tr_02, exx_22);
    }

    @Override
    public int a(tr_0 tr_02, exx_2 exx_22, exx_2 exx_23) {
        return this.a(tr_02, exx_23);
    }

    @Override
    public int b(tr_0 tr_02, exx_2 exx_22) {
        return 0;
    }

    @Override
    public boolean a(exx_2 exx_22, Su su, So so) {
        return true;
    }

    @Override
    public boolean a(tr_0<exx_2> tr_02, Su su, So so) {
        return true;
    }
}

