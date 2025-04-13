/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.Collection;

/*
 * Renamed from eNo
 */
class eno_0
implements TObjectProcedure<F> {
    final /* synthetic */ enw_2[] a;
    final /* synthetic */ Collection b;
    final /* synthetic */ enm_0 c;

    eno_0(enm_0 enm_02, enw_2[] enw_2Array, Collection collection) {
        this.c = enm_02;
        this.a = enw_2Array;
        this.b = collection;
    }

    public boolean a(F f2) {
        if (this.c.a(f2, this.a)) {
            this.b.add(f2);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((epq_2)object);
    }
}

