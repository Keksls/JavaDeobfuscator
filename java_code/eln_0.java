/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.List;

/*
 * Renamed from eLN
 */
class eln_0
implements TIntObjectProcedure<List<efh_0>> {
    final /* synthetic */ elm_0 a;

    eln_0(elm_0 elm_02) {
        this.a = elm_02;
    }

    public boolean a(int n, List<efh_0> list) {
        this.a.O().a().a(n, list);
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (List)object);
    }
}

