/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.Collection;

/*
 * Renamed from fav
 */
class fav_0
implements TIntObjectProcedure<D> {
    final /* synthetic */ Collection a;
    final /* synthetic */ Collection b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ fat e;

    fav_0(fat fat2, Collection collection, Collection collection2, Object object, Object object2) {
        this.e = fat2;
        this.a = collection;
        this.b = collection2;
        this.c = object;
        this.d = object2;
    }

    public boolean a(int n, D d2) {
        short s2 = d2.c();
        for (Object e2 : this.a) {
            for (Object e3 : this.b) {
                if (!this.e.a(d2, e2, e3, this.c, this.d)) continue;
                fat.c.a(s2);
                fat.d.put(fat.c.c(), n);
                return true;
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (UG)object);
    }
}

