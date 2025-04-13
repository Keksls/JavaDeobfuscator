/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongLongHashMap
 */
import gnu.trove.map.hash.TLongLongHashMap;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from aoz
 */
public class aoz_1
extends aon_2 {
    private final Map<aoq_1, aoq_1> a;

    @Override
    public TLongLongHashMap a(Object object, Object object2, Object object3, Object object4) {
        TLongLongHashMap tLongLongHashMap = new TLongLongHashMap();
        for (Map.Entry<aoq_1, aoq_1> entry : this.a.entrySet()) {
            long l = entry.getKey().a(object, object2, object3, object4);
            long l2 = entry.getValue().a(object, object2, object3, object4);
            tLongLongHashMap.put(l, l2);
        }
        return tLongLongHashMap;
    }

    public aoz_1() {
        this(new HashMap());
    }

    public aoz_1(Map<? extends aot_2, ? extends aot_2> map) {
        this(map, false);
    }

    public aoz_1(Map<? extends aot_2, ? extends aot_2> map, boolean bl) {
        if (bl) {
            this.a = map;
        } else {
            this.a = new HashMap<aoq_1, aoq_1>();
            for (Map.Entry<? extends aot_2, ? extends aot_2> entry : map.entrySet()) {
                aot_2 aot_22 = entry.getKey();
                if (aot_22.t_() != aov_1.b) {
                    throw new aos_2("On essaie d'ajouter " + aot_22 + " de type " + aot_22.t_().name() + " \u00e0 une map de cl\u00e9 num\u00e9rique");
                }
                aot_2 aot_23 = entry.getValue();
                if (aot_23.t_() != aov_1.b) {
                    throw new aos_2("On essaie d'ajouter " + aot_23 + " de type " + aot_23.t_().name() + " \u00e0 une map de valeur num\u00e9rique");
                }
                this.a.put((aoq_1)aot_22, (aoq_1)aot_23);
            }
        }
    }

    @Override
    public int b() {
        return this.a.size();
    }

    @Override
    public Enum c() {
        return aoc_1.t;
    }
}

