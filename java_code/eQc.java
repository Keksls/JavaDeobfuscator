/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.List;

class eQc
implements TObjectProcedure<epl_0> {
    private final long a;
    private final List<epl_0> b;

    eQc(long l, List<epl_0> list) {
        this.a = l;
        this.b = list;
    }

    public boolean a(epl_0 epl_02) {
        if (epl_02.o() == this.a) {
            this.b.add(epl_02);
        }
        return true;
    }

    public String toString() {
        return "GetOwnedMembersProcedure{m_clientId=" + this.a + ", m_res=" + this.b + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((epl_0)object);
    }
}

