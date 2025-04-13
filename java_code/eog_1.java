/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.List;

/*
 * Renamed from eOG
 */
class eog_1
implements TIntObjectProcedure<List<efh_0>> {
    final /* synthetic */ ahh_2 a;
    final /* synthetic */ abx_2 b;

    eog_1(ahh_2 ahh_22, abx_2 abx_22) {
        this.a = ahh_22;
        this.b = abx_22;
    }

    public boolean a(int n, List<efh_0> list) {
        this.a.a();
        this.b.a(n);
        this.b.a((byte)list.size());
        for (efh_0 efh_02 : list) {
            this.b.a(efh_02.i());
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (List)object);
    }
}

