/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class eDe
implements TObjectProcedure<eCV> {
    int a = 1;
    final /* synthetic */ eCD b;
    final /* synthetic */ eDd c;

    eDe(eDd eDd2, eCD eCD2) {
        this.c = eDd2;
        this.b = eCD2;
    }

    public boolean a(eCV eCV2) {
        if (this.b.a(eCV2.a()) >= this.c.c) {
            if (this.a >= this.c.a) {
                this.c.b = true;
                return false;
            }
            ++this.a;
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((eCV)object);
    }
}

