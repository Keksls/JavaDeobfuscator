/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bQq
 */
class bqq_1
implements TObjectProcedure<esa_1> {
    final /* synthetic */ bqp_1 a;

    bqq_1(bqp_1 bqp_12) {
        this.a = bqp_12;
    }

    public boolean a(esa_1 esa_12) {
        try {
            this.a.f.add(new bqn_1(esa_12));
        }
        catch (Exception exception) {
            bqp_1.d.error((Object)exception.getMessage(), (Throwable)exception);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((esa_1)object);
    }
}

