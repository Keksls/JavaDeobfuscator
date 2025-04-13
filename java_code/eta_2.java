/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eTA
 */
public class eta_2 {
    private static final Logger b = Logger.getLogger(eta_2.class);
    static final TShortObjectHashMap<ArrayList<etw_2>> c = new TShortObjectHashMap();
    static final TShortObjectHashMap<etk_2> d = new TShortObjectHashMap();
    private static boolean e;

    public static void a() {
        e = true;
    }

    public static void b() {
        if (!e) {
            return;
        }
        eti_2.a.b(new etb_2());
        eti_2.a.c(new etc_2());
        e = false;
    }

    private static etk_2 g(etw_2 etw_22) {
        return eta_2.a(etw_22.a());
    }

    public static etk_2 a(short s2) {
        eta_2.b();
        return (etk_2)d.get(s2);
    }

    static ArrayList<etw_2> c(etk_2 etk_22) {
        List<etg_2> list = eti_2.a.b(etk_22);
        ArrayList<etw_2> arrayList = new ArrayList<etw_2>(list.size());
        if (!list.isEmpty()) {
            arrayList.add(eti_2.a.a(list.get(0).b()));
            for (etg_2 etg_22 : list) {
                etw_2 etw_22 = eti_2.a.a(etg_22.c());
                if (etw_22 == null || etw_22.d() != etk_22.i()) continue;
                arrayList.add(etw_22);
            }
        } else {
            eti_2.a.b(new etd_2(etk_22, arrayList));
        }
        return arrayList;
    }

    public static wx_0 a(etw_2 etw_22) {
        ww_0 ww_02 = ww_0.a(0L);
        etk_2 etk_22 = eta_2.g(etw_22);
        List<etg_2> list = eti_2.a.b(etk_22);
        if (!list.isEmpty()) {
            for (etg_2 etg_22 : list) {
                if (etg_22.e()) continue;
                ww_02.e(etg_22.d());
            }
        }
        return ww_02;
    }

    public static wx_0 b(etw_2 etw_22) {
        etg_2 etg_22 = eti_2.a.b(etw_22.a());
        return etg_22 != null ? etg_22.d() : ww_0.g;
    }

    @Nullable
    public static etw_2 c(etw_2 etw_22) {
        if (etw_22 == null) {
            return null;
        }
        if (etw_22.i()) {
            return etw_22;
        }
        etk_2 etk_22 = eta_2.g(etw_22);
        if (etk_22 == null) {
            return null;
        }
        return eta_2.a(etk_22);
    }

    @Nullable
    public static etw_2 a(etk_2 etk_22) {
        eta_2.b();
        ArrayList arrayList = (ArrayList)c.get(etk_22.i());
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (etw_2)arrayList.get(arrayList.size() - 1);
    }

    @Nullable
    public static etw_2 b(etk_2 etk_22) {
        eta_2.b();
        ArrayList arrayList = (ArrayList)c.get(etk_22.i());
        if (arrayList == null) {
            return null;
        }
        return (etw_2)arrayList.get(0);
    }

    @Nullable
    public static etw_2 d(etw_2 etw_22) {
        if (etw_22 == null) {
            return null;
        }
        etk_2 etk_22 = eta_2.g(etw_22);
        if (etk_22 == null) {
            return null;
        }
        return eta_2.b(etk_22);
    }

    public static etf_2 e(etw_2 etw_22) {
        if (etw_22.i()) {
            return etf_2.c;
        }
        etw_2 etw_23 = eta_2.d(etw_22);
        if (etw_23 == etw_22) {
            return etf_2.a;
        }
        etw_2 etw_24 = eta_2.c(etw_22);
        if (etw_24 == etw_22) {
            return etf_2.c;
        }
        return etf_2.b;
    }

    public static boolean a(short s2, short s3) {
        etg_2 etg_22 = eti_2.a.b(s2);
        while (etg_22 != null) {
            if ((etg_22 = eti_2.a.b(etg_22.c())) == null || etg_22.c() != s3) continue;
            return true;
        }
        return false;
    }

    public static ArrayList<String> f(etw_2 etw_22) {
        if (etw_22 == null) {
            return null;
        }
        if (!etw_22.j()) {
            return null;
        }
        ArrayList<efh_0> arrayList = new ArrayList<efh_0>();
        ((etz_2)etw_22).b(new ete_2(arrayList));
        assert (!arrayList.isEmpty());
        return eDi.a(new eDr(arrayList, 0, 0, true, eDk.b, 0));
    }
}

