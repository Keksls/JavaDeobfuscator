/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class cDV
implements TObjectProcedure<cDY> {
    cDV() {
    }

    public boolean a(cDY cDY2) {
        cDY2.x();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((cDY)object);
    }
}

