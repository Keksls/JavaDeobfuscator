/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongProcedure
 */
import gnu.trove.procedure.TLongProcedure;

/*
 * Renamed from cck
 */
class cck_1
implements TLongProcedure {
    final /* synthetic */ cch_1 a;

    cck_1(cch_1 cch_12) {
        this.a = cch_12;
    }

    public boolean execute(long l) {
        ((bvw_2)this.a.s.get(l)).u();
        return true;
    }
}

