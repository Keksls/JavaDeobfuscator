/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from bRe
 */
class bre_2
implements TIntObjectProcedure<bri_2> {
    final /* synthetic */ brd_2 a;

    bre_2(brd_2 brd_22) {
        this.a = brd_22;
    }

    public boolean a(int n, bri_2 bri_22) {
        ArrayList<brg_2> arrayList = new ArrayList<brg_2>();
        bri_22.a(new brf_2(this, arrayList));
        brj_2 brj_22 = new brj_2(bri_22, arrayList);
        this.a.j.put(bri_22.a(), (Object)brj_22);
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (bri_2)object);
    }
}

