/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from Ud
 */
class ud_0
implements TObjectProcedure<ts_0> {
    static final ud_0 a = new ud_0();

    ud_0() {
    }

    public boolean a(ts_0 ts_02) {
        ts_02.release();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ts_0)object);
    }
}

