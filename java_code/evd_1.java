/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eVd
 */
public class evd_1
extends evk_1 {
    private final TIntObjectHashMap<eve_1> a;
    private final eox b;

    public evd_1(int n, int n2, ezy_1 ezy_12, int n3, byte by, int n4) {
        super(n, n2, ezy_12, n3);
        this.b = eox.a(by);
        this.a = new TIntObjectHashMap(n4, 1.0f);
    }

    public void a(eve_1 eve_12) {
        int n = eve_12.g();
        if (this.a.contains(n)) {
            throw new IllegalArgumentException("La d\u00e9finition de l'\u00e9change " + eve_12 + " est d\u00e9j\u00e0 enregistr\u00e9e");
        }
        this.a.put(n, (Object)eve_12);
    }

    public eve_1 a(int n) {
        return (eve_1)this.a.get(n);
    }

    public boolean a(TObjectProcedure<eve_1> tObjectProcedure) {
        return this.a.forEachValue(tObjectProcedure);
    }

    public eox a() {
        return this.b;
    }

    public String toString() {
        return "IEExchangeParameter{m_id=" + this.m() + "}";
    }
}

