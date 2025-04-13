/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class flh
implements TObjectProcedure<fld_0> {
    final /* synthetic */ int[] a;
    final /* synthetic */ flf_0 b;

    flh(flf_0 flf_02, int[] nArray) {
        this.b = flf_02;
        this.a = nArray;
    }

    public boolean a(fld_0 fld_02) {
        this.a[0] = this.a[0] + fld_02.d();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fld_0)object);
    }
}

