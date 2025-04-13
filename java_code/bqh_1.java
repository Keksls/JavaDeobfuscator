/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * Renamed from bQh
 */
class bqh_1
implements TObjectProcedure<erw_1> {
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ bqg_1 b;

    bqh_1(bqg_1 bqg_12, AtomicInteger atomicInteger) {
        this.b = bqg_12;
        this.a = atomicInteger;
    }

    public boolean a(erw_1 erw_12) {
        this.a.addAndGet(erw_12.N);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((erw_1)((Object)object));
    }
}

