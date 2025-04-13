/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bpm
 */
class bpm_1
implements TObjectProcedure<bpk_1> {
    final /* synthetic */ String a;
    final /* synthetic */ biI b;

    bpm_1(String string, biI biI2) {
        this.a = string;
        this.b = biI2;
    }

    public boolean a(bpk_1 bpk_12) {
        String string = String.format(this.a, bpk_12.a);
        this.b.a(string, atn_2.a(bpk_12.b));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bpk_1)object);
    }
}

