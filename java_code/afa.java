/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class afa
implements TObjectProcedure<aet_0> {
    final /* synthetic */ aew_0 a;

    afa(aew_0 aew_02) {
        this.a = aew_02;
    }

    public boolean a(aet_0 aet_02) {
        if (aet_02.j) {
            aew_0.g.error((Object)"Map non d\u00e9charg\u00e9e. Il faut appeler unloadDynamicDataFromAllMaps");
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((aet_0)object);
    }
}

