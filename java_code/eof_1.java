/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.List;

/*
 * Renamed from eOF
 */
class eof_1
implements TIntObjectProcedure<eou_2<efh_0>> {
    final /* synthetic */ abx_2 a;

    eof_1(abx_2 abx_22) {
        this.a = abx_22;
    }

    public boolean a(int n, eou_2<efh_0> eou_22) {
        List<efh_0> list = eou_22.a();
        this.a.a(n);
        this.a.a((byte)list.size());
        for (efh_0 efh_02 : list) {
            this.a.a(efh_02.i());
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (eou_2)object);
    }
}

