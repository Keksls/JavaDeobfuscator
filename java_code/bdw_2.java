/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.stream.Stream;
import org.apache.log4j.Logger;

/*
 * Renamed from bdW
 */
public class bdw_2
implements agw_0 {
    static final Logger a = Logger.getLogger(bdw_2.class);

    public void a(YK yK) {
        asw_2.a().a(new ari_0(), new bdx_1(this));
        bdw_2.a();
        yK.b(this);
    }

    private static void a() {
        ecn_0.a.b(ect_02 -> {
            try {
                brs_0.a.a((ect_0)ect_02);
            }
            catch (Exception exception) {
                a.error((Object)"Exception raised", (Throwable)exception);
            }
        });
    }

    static ect_0 a(ari_0 ari_02) {
        ect_0 ect_02 = new ect_0(ari_02.c(), ari_02.d(), ari_02.e(), ari_02.f(), ari_02.g(), ari_02.h());
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        TIntObjectHashMap tIntObjectHashMap2 = new TIntObjectHashMap();
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> hashMap2 = new HashMap<Integer, Integer>();
        asw_2.a().a(new aTn(), "craft_id", ect_02.a(), new bdy_2(ect_02, tIntObjectHashMap2, tIntObjectHashMap, hashMap, hashMap2));
        ect_02.a((TIntObjectHashMap<ArrayList<eco_0>>)tIntObjectHashMap);
        ect_02.b((TIntObjectHashMap<ArrayList<eco_0>>)tIntObjectHashMap2);
        ect_02.a(hashMap);
        ect_02.b(hashMap2);
        return ect_02;
    }

    public static eco_0 a(aTn aTn2) {
        int[] nArray = aTn2.j();
        EnumSet<ecp_0> enumSet = EnumSet.noneOf(ecp_0.class);
        for (int k = 0; k < nArray.length; ++k) {
            int n = nArray[k];
            ato_0[] ato_0Array = ecp_0.a(n);
            if (ato_0Array == null) {
                throw new Exception("Impossible de trouver la propri\u00e9t\u00e9 " + n + " de la recette " + aTn2.c());
            }
            if (enumSet.contains(ato_0Array)) {
                throw new Exception("Duplication de la propri\u00e9t\u00e9 " + n + " sur la recette " + aTn2.c());
            }
            enumSet.add((ecp_0)ato_0Array);
        }
        ecs_0 ecs_02 = Stream.of(aTn2.s()).findFirst().map(atq_02 -> new ecs_0(atq_02.a(), atq_02.b())).orElse(ecs_0.a);
        eco_0 eco_02 = new eco_0(aTn2.c(), aTn2.d(), (short)aTn2.i(), aTn2.e(), aTn2.k(), eyS.c(aTn2.f()), eyS.c(aTn2.g()), aTn2.h(), enumSet, ecs_02, aTn2.q(), aTn2.l());
        for (ato_0 ato_02 : aTn2.r()) {
            if (eco_02.a(ato_02.a())) {
                throw new Exception("Duplication d'ingredient " + ato_02.a() + " sur la recette " + aTn2.c());
            }
            int n = ato_02.a();
            eco_02.a(n, ato_02.b(), ato_02.c());
        }
        return eco_02;
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.craft", new Object[0]);
    }
}

