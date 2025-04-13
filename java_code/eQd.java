/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;

class eQd
implements TLongObjectProcedure<epl_0> {
    private final int a;
    private final TLongObjectHashMap<epl_0> b;

    eQd(int n, TLongObjectHashMap<epl_0> tLongObjectHashMap) {
        this.a = n;
        this.b = tLongObjectHashMap;
    }

    public boolean a(long l, epl_0 epl_02) {
        if (epl_02.x() == this.a) {
            this.b.put(l, (Object)epl_02);
        }
        return true;
    }

    public String toString() {
        return "MembersTypeProcedure{m_type=" + this.a + ", m_res=" + this.b + "}";
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (epl_0)object);
    }
}

