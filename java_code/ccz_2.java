/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from ccZ
 */
class ccz_2
implements TObjectProcedure<esy_2> {
    final /* synthetic */ cde_1 a;
    final /* synthetic */ ccy_2 b;

    ccz_2(ccy_2 ccy_22, cde_1 cde_12) {
        this.b = ccy_22;
        this.a = cde_12;
    }

    public boolean a(esy_2 esy_22) {
        this.a.a((cdj_1)esy_22);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((esy_2)object);
    }
}

