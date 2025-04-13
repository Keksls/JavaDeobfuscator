/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eNn
 */
class enn_0
implements TObjectProcedure<enr_0> {
    final /* synthetic */ epq_2 a;
    final /* synthetic */ enm_0 b;

    enn_0(enm_0 enm_02, epq_2 epq_22) {
        this.b = enm_02;
        this.a = epq_22;
    }

    public boolean a(enr_0 enr_02) {
        if (enr_02.a(this.a.a_())) {
            enr_02.a(null, (byte)-1);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((enr_0)object);
    }
}

