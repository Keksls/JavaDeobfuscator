/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from byu
 */
class byu_2
implements TObjectProcedure<erh_1> {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ byp_2 b;

    byu_2(byp_2 byp_22, ArrayList arrayList) {
        this.b = byp_22;
        this.a = arrayList;
    }

    public boolean a(erh_1 erh_12) {
        eqd_0 eqd_02 = eqs_2.a.a(erh_12.a());
        boolean bl = bxv_1.a(erh_12, eqd_02, this.b.Q);
        if (bl) {
            wt_0 wt_02 = bxv_1.b(erh_12, eqd_02, this.b.Q);
            if (wc_0.p().b(wt_02)) {
                this.a.add(byk_2.a.a(erh_12.a()));
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((erh_1)object);
    }
}

