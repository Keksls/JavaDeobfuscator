/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;

public class eEt {
    public static final eEt a = new eEt();
    private final TLongObjectHashMap<eej_0> b = new TLongObjectHashMap();

    private eEt() {
    }

    public void a(eej_0 eej_02) {
        this.b.put((long)eej_02.a(), (Object)eej_02);
    }

    public eej_0 a(long l) {
        return (eej_0)this.b.get(l);
    }

    public TLongObjectHashMap<eej_0> a() {
        return this.b;
    }

    public void b() {
        this.b.forEachValue((TObjectProcedure)new eEu());
        this.b.clear();
    }

    public String toString() {
        return "DungeonLadderManager{m_laddersByInstanceId=" + this.b + "}";
    }
}

