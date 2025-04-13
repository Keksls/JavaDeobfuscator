/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bvM
 */
class bvm_1
implements TObjectProcedure<evf_1> {
    final /* synthetic */ bvk_1 a;

    bvm_1(bvk_1 bvk_12) {
        this.a = bvk_12;
    }

    public boolean a(evf_1 evf_12) {
        Object r2 = eyo_1.g().d(evf_12.a());
        if (r2 != null) {
            this.a.t.add(new brk_1(evf_12.b(), (bjw_1)r2));
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((evf_1)object);
    }
}

