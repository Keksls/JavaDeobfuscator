/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.commons.lang3.ArrayUtils
 */
import gnu.trove.list.array.TIntArrayList;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from eqT
 */
public class eqt_2 {
    private static eqp_2[] a;

    private eqt_2() {
    }

    public static boolean a(eqm_0 eqm_02, erl_1 erl_12, eQt eQt2) {
        ern_1 ern_12 = eqm_02.c(erl_12.d());
        return ern_12 != null && ern_12.a(eQt2);
    }

    private static void a() {
        if (a == null) {
            a = new eqp_2[]{eqp_2.an, eqp_2.ao, eqp_2.ap, eqp_2.aq, eqp_2.ar, eqp_2.as, eqp_2.at, eqp_2.au, eqp_2.av, eqp_2.aw};
        }
    }

    public static eqp_2 a(int n) {
        eqt_2.a();
        for (eqp_2 eqp_22 : a) {
            eqd_0 eqd_02 = eqp_22.a();
            eqp_0 eqp_02 = (eqp_0)eqd_02.f();
            if (eqp_02.b().a().a() != n) continue;
            return eqp_22;
        }
        return null;
    }

    public static boolean a(eqp_2 eqp_22) {
        eqt_2.a();
        return ArrayUtils.contains((Object[])a, (Object)((Object)eqp_22));
    }

    public static boolean a(eqd_0 eqd_02) {
        eqh_0 eqh_02 = eqd_02.f();
        switch (eqh_02.a()) {
            case a: {
                eqk_0 eqk_02 = (eqk_0)eqh_02;
                if (eqk_02.b() != 0) break;
                return false;
            }
        }
        return true;
    }

    public static int[] a(int[] nArray) {
        TIntArrayList tIntArrayList = new TIntArrayList();
        for (int n : nArray) {
            if (eqs_2.a.a(n) == null) continue;
            tIntArrayList.add(n);
        }
        return nArray;
    }
}

