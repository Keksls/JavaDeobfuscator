/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class Ve
implements TObjectProcedure<TQuotaType> {
    final /* synthetic */ Vd a;

    Ve(Vd vd) {
        this.a = vd;
    }

    public boolean a(TQuotaType TQuotaType) {
        ((UZ)TQuotaType).c();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((Va)object);
    }
}

