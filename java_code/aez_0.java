/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from aeZ
 */
class aez_0
implements TObjectProcedure<aet_0> {
    final /* synthetic */ aew_0 a;

    aez_0(aew_0 aew_02) {
        this.a = aew_02;
    }

    public boolean a(aet_0 aet_02) {
        try {
            this.a.a(aet_02);
        }
        catch (Exception exception) {
            aew_0.g.error((Object)"", (Throwable)exception);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((aet_0)object);
    }
}

