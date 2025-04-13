/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import org.apache.log4j.Logger;

public final class bDL
extends bFN {
    static final Logger s = Logger.getLogger(bDL.class);
    private evu_1 t;
    long u;
    private final fo_1 v = new bdm_0(this);

    @Override
    protected fo_1 ad() {
        return this.v;
    }

    @Override
    public void ar_() {
        if (this.q == fjv.e) {
            this.t = new evu_1(0, 957, ezy_1.a, 0);
            this.t.a(cSY.aa.b());
        }
    }

    @Override
    public cSS[] az_() {
        TIntArrayList tIntArrayList = this.t.a();
        cSS[] cSSArray = new cSS[tIntArrayList.size()];
        int n = tIntArrayList.size();
        for (int k = 0; k < n; ++k) {
            int n2 = tIntArrayList.get(k);
            cSY cSY2 = cSY.a(n2);
            if (cSY2 != null) {
                cSSArray[k] = cSY2.a();
                continue;
            }
            s.error((Object)("Action d'id inconnu " + n2));
        }
        return cSSArray;
    }

    static /* synthetic */ void a(bDL bDL2, abm_1 abm_12) {
        bDL2.a(abm_12);
    }
}

