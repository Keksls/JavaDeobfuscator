/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bTR
 */
class btr_2
implements TObjectProcedure<btj_2> {
    final /* synthetic */ fkc_0 a;
    final /* synthetic */ bto_2 b;

    btr_2(bto_2 bto_22, fkc_0 fkc_02) {
        this.b = bto_22;
        this.a = fkc_02;
    }

    public boolean a(btj_2 btj_22) {
        btj_22.h.forEachValue((TObjectProcedure)new bts_2(this));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((btj_2)object);
    }
}

