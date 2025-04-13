/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 */
import gnu.trove.map.hash.THashMap;
import java.util.Map;

public class amZ
extends amU {
    private static final String b = "anm/";

    private static String a(long l) {
        assert (aks_1.a().e() != null);
        return String.format("%s%d%s", b, l, aks_1.a().c());
    }

    @Override
    protected void b(aty_1 aty_12, long l) {
        THashMap tHashMap = new THashMap(1);
        tHashMap.put((Object)"fightId", (Object)aty_12.az());
        akr_1[] akr_1Array = new anu_2[]{new anu_2((abu)aty_12)};
        aks_1.a().a(amZ.a(l), akr_1Array, (Map<String, Object>)tHashMap, null, false);
    }
}

