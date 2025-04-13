/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from aLl
 */
public class all_2 {
    private final TIntObjectHashMap<alm_2> a = new TIntObjectHashMap();

    public boolean a(akx_2 akx_22) {
        this.a.remove(akx_22.d());
        return this.a.isEmpty();
    }

    public boolean a(alk_2 alk_22) {
        Object[] objectArray = new alm_2[this.a.size()];
        for (alm_2 alm_22 : (alm_2[])this.a.values(objectArray)) {
            alm_22.a(alk_22);
            if (!alm_22.a()) continue;
            this.a.remove(alm_22.b());
        }
        return this.a.isEmpty();
    }

    public void a(akx_2 akx_22, String string, akr_2[] akr_2Array, boolean bl) {
        this.a.put(akx_22.d(), (Object)new alm_2(akx_22, string, akr_2Array, bl));
    }
}

