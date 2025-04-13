/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bQr
 */
class bqr_1
implements TObjectProcedure<esb_1> {
    final /* synthetic */ bqp_1 a;

    bqr_1(bqp_1 bqp_12) {
        this.a = bqp_12;
    }

    public boolean a(esb_1 esb_12) {
        this.a.f.add(new bqo_1(esb_12));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((esb_1)object);
    }
}

