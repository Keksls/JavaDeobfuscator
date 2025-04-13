/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntShortProcedure
 */
import gnu.trove.procedure.TIntShortProcedure;

/*
 * Renamed from bvL
 */
class bvl_1
implements TIntShortProcedure {
    final /* synthetic */ bvk_1 a;

    bvl_1(bvk_1 bvk_12) {
        this.a = bvk_12;
    }

    public boolean execute(int n, short s2) {
        Object r2 = eyo_1.g().d(n);
        if (r2 != null) {
            this.a.s.add(new brk_1(s2, (bjw_1)r2));
        }
        return true;
    }
}

