/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Renamed from bQi
 */
class bqi_1
implements TObjectProcedure<erw_1> {
    final /* synthetic */ bql_1 a;
    final /* synthetic */ AtomicBoolean b;
    final /* synthetic */ bqg_1 c;

    bqi_1(bqg_1 bqg_12, bql_1 bql_12, AtomicBoolean atomicBoolean) {
        this.c = bqg_12;
        this.a = bql_12;
        this.b = atomicBoolean;
    }

    public boolean a(erw_1 erw_12) {
        if (this.a.g(erw_12.M)) {
            this.b.set(true);
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((erw_1)((Object)object));
    }
}

