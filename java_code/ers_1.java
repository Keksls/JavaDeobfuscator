/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eRS
 */
public class ers_1
implements tt_0<exk_2> {
    public static final ers_1 o = new ers_1();

    private ers_1() {
    }

    @Override
    public int a(tr_0 tr_02, exk_2 exk_22) {
        ArrayList arrayList = tr_02.d(exk_22.aT_());
        short s2 = exk_22.e();
        apc_2 apc_22 = exk_22.T().a(exz_1.e);
        if (exk_22.ab() || apc_22 != null && !apc_22.b(null, null, null, null)) {
            return -4;
        }
        for (int k = 0; k < arrayList.size() && s2 > 0; ++k) {
            exk_2 exk_23 = (exk_2)arrayList.get(k);
            s2 = (short)(s2 - (exk_23.a(exk_22) ? exk_23.D() : (short)0));
        }
        return s2 <= 0 || !tr_02.l() ? 1 : -1;
    }

    @Override
    public int a(tr_0 tr_02, exk_2 exk_22, short s2) {
        if (s2 < 0) {
            return -5;
        }
        apc_2 apc_22 = exk_22.T().a(exz_1.e);
        if (exk_22.ab() || apc_22 != null && !apc_22.b(null, null, null, null)) {
            return -4;
        }
        TK tK = (TK)tr_02;
        exk_2 exk_23 = (exk_2)tK.e(s2);
        if (exk_23 == null) {
            return 0;
        }
        if (!exk_22.a(exk_23)) {
            return -1;
        }
        return exk_22.e() <= exk_23.D() ? 1 : -1;
    }

    @Override
    public int a(tr_0 tr_02, exk_2 exk_22, exk_2 exk_23) {
        throw new UnsupportedOperationException("Pas de remplacement");
    }

    @Override
    public int b(tr_0 tr_02, exk_2 exk_22) {
        return tr_02.e(exk_22) ? 0 : -2;
    }

    @Override
    public boolean a(exk_2 exk_22, Su su, So so) {
        throw new UnsupportedOperationException("Pas de v\u00e9rification de crit\u00e8re");
    }

    @Override
    public boolean a(tr_0<exk_2> tr_02, Su su, So so) {
        throw new UnsupportedOperationException("Pas de v\u00e9rification de crit\u00e8re");
    }
}

