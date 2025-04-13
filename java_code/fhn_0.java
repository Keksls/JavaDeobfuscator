/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TShortObjectProcedure
 */
import gnu.trove.procedure.TShortObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from fhN
 */
class fhn_0
implements TShortObjectProcedure<ArrayList<fho_0>> {
    final /* synthetic */ abx_2 a;
    final /* synthetic */ fhm_0 b;

    fhn_0(fhm_0 fhm_02, abx_2 abx_22) {
        this.b = fhm_02;
        this.a = abx_22;
    }

    public boolean a(short s2, ArrayList<fho_0> arrayList) {
        abx_2 abx_22 = new abx_2(4 * arrayList.size());
        short s3 = 0;
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            fho_0 fho_02 = arrayList.get(k);
            try {
                int n2 = fho_02.a(this.b.b, this.b.c);
                abx_22.a(n2);
                s3 = (short)(s3 + 1);
                continue;
            }
            catch (Exception exception) {
                fhm_0.a.error((Object)"Exception raised", (Throwable)exception);
            }
        }
        this.a.a(s2);
        this.a.a(s3);
        if (s3 > 0) {
            this.a.b(abx_22.c());
        }
        return true;
    }

    public /* synthetic */ boolean execute(short s2, Object object) {
        return this.a(s2, (ArrayList)object);
    }
}

