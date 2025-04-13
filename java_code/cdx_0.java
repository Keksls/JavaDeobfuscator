/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from cDX
 */
public class cdx_0
extends cdr_0<cea_1> {
    @Override
    public void b(long l) {
    }

    @Override
    public void a(long l) {
    }

    @Override
    public cDY bh_() {
        if (!this.a()) {
            return null;
        }
        for (int k = this.a.size() - 1; k >= 0; --k) {
            cDY cDY2 = ((cea_1)this.a.get(k)).bh_();
            if (cDY2 == null) continue;
            return cDY2;
        }
        return null;
    }

    @Override
    public void a(ArrayList<cDY> arrayList) {
        if (!this.a()) {
            return;
        }
        for (int k = this.a.size() - 1; k >= 0; --k) {
            ((cea_1)this.a.get(k)).a(arrayList);
        }
    }

    @Override
    public void a(ArrayList<cDY> arrayList, cer_0 cer_02) {
        if (!this.a()) {
            return;
        }
        for (int k = this.a.size() - 1; k >= 0; --k) {
            ((cea_1)this.a.get(k)).a(arrayList, cer_02);
        }
    }

    @Override
    public void a(ArrayList<cDY> arrayList, cdh_0 cdh_02) {
        if (!this.a()) {
            return;
        }
        for (int k = this.a.size() - 1; k >= 0; --k) {
            ((cea_1)this.a.get(k)).a(arrayList, cdh_02);
        }
    }

    @Override
    protected void a(cey_2 cey_22) {
        super.a(cey_22);
        cey_22.c = true;
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            cey_22.h.add((long)((cea_1)this.a.get(k)).c());
        }
    }

    @Override
    public void a(TObjectProcedure<cDY> tObjectProcedure) {
        for (int k = this.a.size() - 1; k >= 0; --k) {
            ((cea_1)this.a.get(k)).a(tObjectProcedure);
        }
    }
}

