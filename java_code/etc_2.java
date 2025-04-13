/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eTC
 */
class etc_2
implements TObjectProcedure<etk_2> {
    etc_2() {
    }

    public boolean a(etk_2 etk_22) {
        eta_2.c.put(etk_22.i(), eta_2.c(etk_22));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((etk_2)object);
    }
}

