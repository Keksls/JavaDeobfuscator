/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.List;

class eBq
implements TObjectProcedure<eBt> {
    final /* synthetic */ List a;
    final /* synthetic */ eBo b;

    eBq(eBo eBo2, List list) {
        this.b = eBo2;
        this.a = list;
    }

    public boolean a(eBt eBt2) {
        if (eBt2.i() || eBC.a.b(eBt2.a()) || eBt2.m()) {
            this.a.add(eBt2);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((eBt)object);
    }
}

