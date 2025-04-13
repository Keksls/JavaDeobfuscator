/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eTB
 */
class etb_2
implements TObjectProcedure<etw_2> {
    etb_2() {
    }

    public boolean a(etw_2 etw_22) {
        etk_2 etk_22 = eti_2.a.c(etw_22.d());
        eta_2.d.put(etw_22.a(), (Object)etk_22);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((etw_2)object);
    }
}

