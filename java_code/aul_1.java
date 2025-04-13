/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from auL
 */
class aul_1
implements TObjectProcedure<auh_1> {
    final /* synthetic */ aui_1 a;

    aul_1(aui_1 aui_12) {
        this.a = aui_12;
    }

    public boolean a(auh_1 auh_12) {
        auh_12.a(false);
        auh_12.a();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((auh_1)object);
    }
}

