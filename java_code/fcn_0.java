/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fcN
 */
class fcn_0
implements TObjectProcedure<fcf> {
    public int a;

    fcn_0() {
    }

    public boolean a(fcf fcf2) {
        this.a += fcf2.c();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fcf)object);
    }
}

