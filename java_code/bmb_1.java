/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectIntProcedure
 */
import gnu.trove.procedure.TObjectIntProcedure;

/*
 * Renamed from bmb
 */
class bmb_1
implements TObjectIntProcedure<exh_2> {
    final /* synthetic */ blx_1 a;

    bmb_1(blx_1 blx_12) {
        this.a = blx_12;
    }

    public boolean a(exh_2 exh_22, int n) {
        this.a.bv().a(n, (short)exh_22.a(), true);
        return true;
    }

    public /* synthetic */ boolean execute(Object object, int n) {
        return this.a((exh_2)object, n);
    }
}

