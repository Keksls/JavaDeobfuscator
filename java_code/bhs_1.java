/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from bhS
 */
class bhs_1
implements TIntObjectProcedure<bic_1> {
    final /* synthetic */ bhr_1 a;

    bhs_1(bhr_1 bhr_12) {
        this.a = bhr_12;
    }

    public boolean a(int n, bic_1 bic_12) {
        this.a.e.put(n, (Object)new bic_1(bic_12));
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (bic_1)object);
    }
}

