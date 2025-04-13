/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eBb
 */
public class ebb_0
extends eBf
implements tt_0<exk_2> {
    public ebb_0(euw_1 euw_12) {
        super(euw_12);
    }

    @Override
    public boolean a(eyu_1 eyu_12, long l) {
        return true;
    }

    @Override
    public boolean b(eyu_1 eyu_12, long l) {
        return !this.b.d() && eyu_12.a() >= l;
    }

    @Override
    public int a(tr_0<exk_2> tr_02, long l, short s2) {
        int n;
        exk_2 exk_22 = tr_02.e(l);
        if (exk_22 == null) {
            return -2;
        }
        short s3 = exk_22.e();
        int n2 = Math.min(s2, s3);
        int n3 = n2 == s3 ? this.b(tr_02, exk_22) : (n = n2 < s3 ? 0 : -1);
        if (n < 0) {
            return n;
        }
        return 0;
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
        return s2 <= 0 || !tr_02.l() ? 0 : -1;
    }

    @Override
    public int a(tr_0 tr_02, exk_2 exk_22, short s2) {
        return -1;
    }

    @Override
    public int a(tr_0 tr_02, exk_2 exk_22, exk_2 exk_23) {
        throw new UnsupportedOperationException("Pas de remplacement");
    }

    @Override
    public int b(tr_0 tr_02, exk_2 exk_22) {
        return !this.b.d() && tr_02.e(exk_22) ? 0 : -1;
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

