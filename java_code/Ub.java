/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class Ub
implements TObjectProcedure<ty_0> {
    final /* synthetic */ long a;
    final /* synthetic */ Ua b;

    Ub(Ua ua, long l) {
        this.b = ua;
        this.a = l;
    }

    public boolean a(ty_0 ty_02) {
        if (ty_02.b() == this.a || ty_02.c() == this.a) {
            ty_02.d(this.a);
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ty_0)object);
    }
}

