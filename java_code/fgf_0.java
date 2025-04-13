/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.Collection;

/*
 * Renamed from fgF
 */
class fgf_0
implements TIntObjectProcedure<TProtector> {
    final /* synthetic */ fgm_0 a;
    final /* synthetic */ Collection b;
    final /* synthetic */ fge_0 c;

    fgf_0(fge_0 fge_02, fgm_0 fgm_02, Collection collection) {
        this.c = fge_02;
        this.a = fgm_02;
        this.b = collection;
    }

    public boolean a(int n, TProtector TProtector) {
        if (this.a == null || this.a.match(TProtector)) {
            this.b.add(TProtector);
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (fgy_0)object);
    }
}

