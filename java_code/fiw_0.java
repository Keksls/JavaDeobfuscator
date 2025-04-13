/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fiW
 */
public class fiw_0
implements tt_0<exk_2> {
    public static final fiw_0 o = new fiw_0();

    private fiw_0() {
    }

    @Override
    public int a(tr_0 tr_02, exk_2 exk_22) {
        ArrayList arrayList = tr_02.d(exk_22.aT_());
        short s2 = exk_22.e();
        for (int k = 0; k < arrayList.size() && s2 > 0; ++k) {
            exk_2 exk_23 = (exk_2)arrayList.get(k);
            s2 = (short)(s2 - (exk_23.a(exk_22) ? exk_23.D() : (short)0));
        }
        return s2 <= 0 || !tr_02.l() ? 0 : -1;
    }

    @Override
    public int a(tr_0 tr_02, exk_2 exk_22, short s2) {
        if (s2 < 0) {
            return -5;
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
        return tr_02.e(exk_22) ? 0 : -1;
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

