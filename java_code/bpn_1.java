/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bpn
 */
class bpn_1
implements TObjectProcedure<bpj_1> {
    final /* synthetic */ biI a;

    bpn_1(biI biI2) {
        this.a = biI2;
    }

    public boolean a(bpj_1 bpj_12) {
        bpl_1.a(this.a, bpj_12);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bpj_1)object);
    }
}

