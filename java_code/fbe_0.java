/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.Collection;

/*
 * Renamed from fbe
 */
class fbe_0
implements TIntObjectProcedure<faX> {
    final /* synthetic */ Collection a;
    final /* synthetic */ fbd_0 b;

    fbe_0(fbd_0 fbd_02, Collection collection) {
        this.b = fbd_02;
        this.a = collection;
    }

    public boolean a(int n, faX faX2) {
        return !this.a.contains(n);
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (faX)object);
    }
}

