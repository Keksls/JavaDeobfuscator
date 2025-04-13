/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from fau
 */
class fau_0
implements TIntObjectProcedure<D> {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ fat e;

    fau_0(fat fat2, Object object, Object object2, Object object3, Object object4) {
        this.e = fat2;
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = object4;
    }

    public boolean a(int n, D d2) {
        short s2 = d2.c();
        if (this.e.a(d2, this.a, this.b, this.c, this.d)) {
            fat.c.a(s2);
            fat.d.put(fat.c.c(), n);
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (UG)object);
    }
}

