/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

/*
 * Renamed from eNu
 */
class enu_2
implements TLongObjectProcedure<enr_0> {
    final /* synthetic */ abx_2 a;

    enu_2(abx_2 abx_22) {
        this.a = abx_22;
    }

    public boolean a(long l, enr_0 enr_02) {
        this.a.a(l);
        byte[] byArray = ens_0.a(enr_02);
        this.a.a(byArray.length);
        this.a.b(byArray);
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (enr_0)object);
    }
}

