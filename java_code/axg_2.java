/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from axg
 */
class axg_2
implements TObjectProcedure<axc_2> {
    final /* synthetic */ ArrayList a;

    axg_2(ArrayList arrayList) {
        this.a = arrayList;
    }

    public boolean a(axc_2 axc_22) {
        axc_22.a(axd_2.h);
        if (axc_22.f < axd_2.h - 500L) {
            this.a.add(axc_22.a);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((axc_2)object);
    }
}

