/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bPf
implements TObjectProcedure<bPb> {
    bPf() {
    }

    public boolean a(bPb bPb2) {
        bPb2.release();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bPb)object);
    }
}

