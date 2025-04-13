/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from aDX
 */
class adx_2
implements TIntObjectProcedure<ady_1> {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ adw_1 b;

    adx_2(adw_1 adw_12, ArrayList arrayList) {
        this.b = adw_12;
        this.a = arrayList;
    }

    public boolean a(int n, ady_1 ady_12) {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            Runnable runnable = (Runnable)iterator.next();
            if (ady_12.a(runnable)) continue;
            iterator.remove();
        }
        return !this.a.isEmpty();
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (ady_1)object);
    }
}

