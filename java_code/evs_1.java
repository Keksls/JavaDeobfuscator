/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TShortHashSet
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TShortHashSet;

/*
 * Renamed from eVs
 */
public class evs_1
extends evk_1 {
    public static final evs_1 a = new evs_1(0);
    private final fat<evt_1> b = new fat();
    private final TShortHashSet c = new TShortHashSet();

    public evs_1(int n) {
        super(n, 0, ezy_1.a, 0);
    }

    @Override
    public int n() {
        throw new UnsupportedOperationException("On essaye de r\u00e9cup\u00e9rer un visuel qu'on ne doit pas r\u00e9cup\u00e9rer");
    }

    public void a(evt_1 evt_12) {
        this.b.a(evt_12);
        this.c.add(evt_12.n());
    }

    public evt_1 a(Object object, Object object2, Object object3, Object object4) {
        return this.b.a(object, object2, object3, object4);
    }

    public evt_1 a(int n) {
        return this.b.a(n);
    }

    public TIntObjectHashMap<evt_1> a() {
        return this.b.b();
    }

    public boolean d() {
        return this.b.c() != 0;
    }

    public short[] e() {
        return this.c.toArray();
    }

    public boolean a(TObjectProcedure<evt_1> tObjectProcedure) {
        return this.b.b().forEachValue(tObjectProcedure);
    }

    public String toString() {
        return "IETeleporterParameter{m_id=" + this.m() + ", m_destinations=" + this.b + ", m_instanceIds=" + this.c + "}";
    }
}

