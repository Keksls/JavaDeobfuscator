/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bTP
 */
class btp_2
implements TObjectProcedure<etn_2> {
    final /* synthetic */ btj_2 a;
    final /* synthetic */ bto_2 b;

    btp_2(bto_2 bto_22, btj_2 btj_22) {
        this.b = bto_22;
        this.a = btj_22;
    }

    public boolean a(etn_2 etn_22) {
        if (fkk_0.a(etn_22.b())) {
            bto_2.a(etn_22, btu_2.a, this.a);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((etn_2)object);
    }
}

