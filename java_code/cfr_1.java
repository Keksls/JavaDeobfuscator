/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from cfR
 */
class cfr_1
implements TObjectProcedure<blx_1> {
    cfr_1() {
    }

    public boolean a(blx_1 blx_12) {
        bUH bUH2 = (bUH)blx_12.fE();
        if (azu_0.j().k().fE().n() == bUH2.n()) {
            bUH2.c(false);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((blx_1)object);
    }
}

