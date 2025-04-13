/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.array.TIntArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eqW
 */
public class eqw_2 {
    private static final Logger d = Logger.getLogger(eqw_2.class);
    public static final int a = 10;
    public static final eqw_2 b = new eqw_2();
    private final eqv_2[] e = new eqv_2[11];

    private eqw_2() {
    }

    public void a(@NotNull eqv_2 eqv_22) {
        this.e[eqv_22.a()] = eqv_22;
    }

    public int a(int n) {
        assert (eqw_2.b(n)) : "Level de guilde invalide !";
        eqp_2 eqp_22 = eqt_2.a(n);
        if (eqp_22 == null) {
            return 0;
        }
        return eqp_22.a().g();
    }

    public static boolean b(int n) {
        return n >= 0 && n <= 10;
    }

    public int c(int n) {
        for (int k = 0; k <= 10; ++k) {
            eqv_2 eqv_22 = this.e[k];
            if (eqv_22 == null || !eqv_22.a(n)) continue;
            return eqv_22.a();
        }
        return 0;
    }

    public boolean a(int n, int n2) {
        TIntArrayList tIntArrayList = this.d(n2);
        return tIntArrayList.contains(n);
    }

    public TIntArrayList d(int n) {
        TIntArrayList tIntArrayList = new TIntArrayList();
        for (int k = 0; k <= n; ++k) {
            if (this.e[k] == null) continue;
            this.e[k].a(tIntArrayList);
        }
        return tIntArrayList;
    }
}

