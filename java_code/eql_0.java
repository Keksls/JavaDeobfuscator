/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eQl
 */
class eql_0
implements TObjectProcedure<erl_1> {
    private final long a;

    eql_0(long l) {
        this.a = l;
    }

    public boolean a(erl_1 erl_12) {
        return erl_12.d() != this.a;
    }

    public String toString() {
        return "CheckMemberRank{m_rankId=" + this.a + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((erl_1)object);
    }
}

