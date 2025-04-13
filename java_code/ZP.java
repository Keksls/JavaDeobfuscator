/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class ZP
implements TObjectProcedure<ZS> {
    ZP() {
    }

    public boolean a(ZS zS) {
        zS.d();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ZS)object);
    }
}

