/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.Collection;

/*
 * Renamed from eOP
 */
public class eop_1 {
    public static final eop_1 a = new eop_1();
    private final fat<eok_1> b = new fat();
    private final TIntObjectHashMap<eok_1> c = new TIntObjectHashMap();
    private final TIntObjectHashMap<eoq_1> d = new TIntObjectHashMap();

    public void a(eok_1 eok_12) {
        this.c.put(eok_12.a(), (Object)eok_12);
        if (eok_12.i()) {
            this.b.a(eok_12);
        }
    }

    public void a(eoq_1 eoq_12) {
        this.d.put(eoq_12.a(), (Object)eoq_12);
    }

    public eoq_1 a(int n) {
        return (eoq_1)this.d.get(n);
    }

    public eok_1 a(Collection<? extends epq_2> collection, Collection<? extends epq_2> collection2, Object object, Object object2) {
        return this.b.a(collection, collection2, object, object2);
    }

    public eok_1 b(int n) {
        return (eok_1)this.c.get(n);
    }

    public boolean a(TObjectProcedure<eok_1> tObjectProcedure) {
        return this.c.forEachValue(tObjectProcedure);
    }

    public String toString() {
        return "FightChallengeManager{m_dropTable=" + this.b + ", m_challenges=" + this.c + ", m_monsterDefinitions=" + this.d + "}";
    }
}

