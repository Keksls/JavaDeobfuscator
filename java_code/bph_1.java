/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bph
 */
class bph_1
implements TObjectProcedure<bpk_1> {
    final /* synthetic */ bpk_1 a;
    final /* synthetic */ boolean[] b;
    final /* synthetic */ bpg_1 c;

    bph_1(bpg_1 bpg_12, bpk_1 bpk_12, boolean[] blArray) {
        this.c = bpg_12;
        this.a = bpk_12;
        this.b = blArray;
    }

    public boolean a(bpk_1 bpk_12) {
        if (bpk_12.a.equals(this.a.a)) {
            bpk_12.a(this.a.b);
            this.b[0] = true;
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bpk_1)object);
    }
}

