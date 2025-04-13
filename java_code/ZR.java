/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

class ZR
implements TObjectProcedure<ArrayList<aaf>> {
    final /* synthetic */ ZN a;

    ZR(ZN zN) {
        this.a = zN;
    }

    public boolean a(ArrayList<aaf> arrayList) {
        int n = arrayList.size();
        float f2 = 1.0f / (float)n;
        for (int k = 0; k < n; ++k) {
            arrayList.get(k).a(f2);
        }
        arrayList.clear();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ArrayList)object);
    }
}

