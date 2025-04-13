/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;
import java.util.List;

class bhC
implements TIntProcedure {
    final /* synthetic */ String a;
    final /* synthetic */ List b;
    final /* synthetic */ bhA c;

    bhC(bhA bhA2, String string, List list) {
        this.c = bhA2;
        this.a = string;
        this.b = list;
    }

    public boolean execute(int n) {
        bhu bhu2 = (bhu)this.c.d.get(n);
        if (!bhu2.m().toLowerCase().contains(this.a.toLowerCase())) {
            return true;
        }
        this.b.add(bhu2);
        return true;
    }
}

