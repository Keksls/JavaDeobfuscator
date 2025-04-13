/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

/*
 * Renamed from bmj
 */
class bmj_2
implements TLongObjectProcedure<blx_1> {
    final /* synthetic */ bmi_1 a;

    bmj_2(bmi_1 bmi_12) {
        this.a = bmi_12;
    }

    public boolean a(long l, blx_1 blx_12) {
        int n = blx_12.Z_().t();
        bmi_1.a(this.a, n);
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (blx_1)object);
    }
}

