/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Renamed from arU
 */
class aru_1
implements TIntObjectProcedure<ArrayList<arx_1>> {
    final /* synthetic */ DataOutputStream a;
    final /* synthetic */ art_1 b;

    aru_1(art_1 art_12, DataOutputStream dataOutputStream) {
        this.b = art_12;
        this.a = dataOutputStream;
    }

    public boolean a(int n, ArrayList<arx_1> arrayList) {
        for (int k = 0; k < arrayList.size(); ++k) {
            arx_1 arx_12 = arrayList.get(k);
            try {
                this.a.writeInt(n);
                this.a.writeInt(arx_12.a);
                this.a.writeInt(arx_12.b);
                this.a.writeInt(arx_12.c);
                continue;
            }
            catch (IOException iOException) {
                arm_1.a.error(iOException.getMessage(), (Throwable)iOException);
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (ArrayList)object);
    }
}

