/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from cio
 */
class cio_2
implements TObjectProcedure<enu_1> {
    final /* synthetic */ cim_2 a;

    cio_2(cim_2 cim_22) {
        this.a = cim_22;
    }

    public boolean a(enu_1 enu_12) {
        this.a.a(enu_12);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((enu_1)object);
    }
}

