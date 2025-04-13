/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

/*
 * Renamed from cin
 */
class cin_2
implements TLongObjectProcedure<enr_0> {
    final /* synthetic */ enm_0 a;
    final /* synthetic */ cim_2 b;

    cin_2(cim_2 cim_22, enm_0 enm_02) {
        this.b = cim_22;
        this.a = enm_02;
    }

    public boolean a(long l, enr_0 enr_02) {
        this.a.a(l, enr_02);
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (enr_0)object);
    }
}

