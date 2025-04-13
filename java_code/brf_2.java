/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.procedure.TIntProcedure;
import java.util.ArrayList;

/*
 * Renamed from bRf
 */
class brf_2
implements TIntProcedure {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ bre_2 b;

    brf_2(bre_2 bre_22, ArrayList arrayList) {
        this.b = bre_22;
        this.a = arrayList;
    }

    public boolean execute(int n) {
        btZ btZ2 = bua_0.a.a(n);
        if (btZ2 == null) {
            return true;
        }
        TIntObjectIterator tIntObjectIterator = btZ2.a().b().iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            for (bue_0 bue_02 : ((bui_1)tIntObjectIterator.value()).b()) {
                if (!(bue_02 instanceof buh_1)) continue;
                brg_2 brg_22 = new brg_2((buh_1)bue_02);
                if (brg_22.c()) {
                    ddB.a().a(brg_22);
                }
                this.a.add(brg_22);
            }
        }
        return true;
    }
}

