/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntIntHashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from akg
 */
public class akg_0 {
    private static final Logger b = Logger.getLogger(akg_0.class);
    private static final boolean c = true;
    private static final String d = "scenario/";
    final TIntIntHashMap e = new TIntIntHashMap();
    static final akg_0 f = new akg_0();

    private akg_0() {
    }

    public static akg_0 a() {
        return f;
    }

    public String a(int n) {
        assert (aks_1.a().e() != null);
        return String.format("%s%d%s", d, n, aks_1.a().c());
    }

    @Nullable
    public akx_2 a(int n, boolean bl) {
        akx_2 akx_22 = null;
        int n2 = this.e.get(n);
        if (n2 > 0 && (akx_22 = aks_1.a().a(n2)) != null) {
            return akx_22;
        }
        if (bl) {
            akx_22 = aks_1.a().a(this.a(n), (akr_1[])null, false);
            if (akx_22 != null) {
                akx_22.a(new akh_0(n));
                this.e.put(n, akx_22.d());
                return akx_22;
            }
            b.trace((Object)("On a pas trouv\u00e9 le script du sc\u00e9nario " + n));
        }
        return akx_22;
    }

    public void a(int n, int n2, long[] lArray, boolean bl) {
        akx_2 akx_22 = this.a(n, true);
        if (akx_22 == null) {
            b.error((Object)("runEvent : impossible de trouver un script d'id de sc\u00e9nario " + n));
            return;
        }
        akr_2[] akr_2Array = new akr_2[lArray.length];
        for (int k = 0; k < akr_2Array.length; ++k) {
            akr_2Array[k] = new akr_2(lArray[k]);
        }
        String string = null;
        string = bl ? "reward_" + n + "_" + n2 : "event_" + n + "_" + n2;
        akx_22.a(string.replaceAll("-", "_"), akr_2Array, new akq_1[0]);
    }

    public void b() {
        this.e.clear();
    }
}

