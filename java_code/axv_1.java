/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from axV
 */
class axv_1
implements TObjectProcedure<axx_1> {
    final /* synthetic */ axu_1 a;

    axv_1(axu_1 axu_12) {
        this.a = axu_12;
    }

    public boolean a(axx_1 axx_12) {
        if (axx_12.i != null) {
            axx_12.i.e();
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((axx_1)object);
    }
}

