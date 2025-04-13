/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;
import java.util.ArrayList;

class bLz
implements TIntProcedure {
    final /* synthetic */ ArrayList a;

    bLz(ArrayList arrayList) {
        this.a = arrayList;
    }

    public boolean execute(int n) {
        String string = String.format("havenWorld.buildingWorldEffect%d", n);
        if (bae.h().d(string)) {
            this.a.add(bae.h().a(string, new Object[0]));
        }
        return true;
    }
}

