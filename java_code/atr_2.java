/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;

/*
 * Renamed from atR
 */
class atr_2
implements TIntProcedure {
    final /* synthetic */ atp_2 a;

    atr_2(atp_2 atp_22) {
        this.a = atp_22;
    }

    public boolean execute(int n) {
        if (this.a.h.contains(n)) {
            return true;
        }
        this.a.d.add(n);
        return true;
    }
}

