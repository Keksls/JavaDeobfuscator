/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from byr
 */
class byr_2
implements TObjectProcedure<bxy_1> {
    final /* synthetic */ byq_2 a;

    byr_2(byq_2 byq_22) {
        this.a = byq_22;
    }

    public boolean a(bxy_1 bxy_12) {
        bxy_12.f();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bxy_1)object);
    }
}

