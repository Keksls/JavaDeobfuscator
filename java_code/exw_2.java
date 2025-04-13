/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eXw
 */
class exw_2
implements TObjectProcedure<MI> {
    final /* synthetic */ ext_2 a;

    exw_2(ext_2 ext_22) {
        this.a = ext_22;
    }

    public boolean a(MI MI) {
        for (eyi_2 eyi_22 : this.a.c) {
            eyi_22.b((exs_2)MI);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((exs_2)object);
    }
}

