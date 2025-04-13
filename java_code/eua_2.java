/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eUa
 */
class eua_2
implements TObjectProcedure<etx_2> {
    final /* synthetic */ etz_1 a;

    eua_2(etz_1 etz_12) {
        this.a = etz_12;
    }

    public boolean a(etx_2 etx_22) {
        int n = this.a.a(etx_22);
        if (n > 0) {
            this.a.c.adjustOrPutValue(etx_22.a(), n, n);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((etx_2)object);
    }
}

