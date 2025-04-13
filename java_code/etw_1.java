/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eTW
 */
class etw_1
implements TObjectProcedure<esf_1> {
    final /* synthetic */ ese_1 a;
    final /* synthetic */ etv_1 b;

    etw_1(etv_1 etv_12, ese_1 ese_12) {
        this.b = etv_12;
        this.a = ese_12;
    }

    public boolean a(esf_1 esf_12) {
        if (esf_12.b() == this.b.a) {
            this.b.b = this.a.b();
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((esf_1)object);
    }
}

