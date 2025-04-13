/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class ZO
implements TObjectProcedure<ZS> {
    ZO() {
    }

    public boolean a(ZS zS) {
        zS.c();
        zS.d();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ZS)object);
    }
}

