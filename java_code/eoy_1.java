/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TIntObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import org.apache.log4j.Logger;

/*
 * Renamed from eOY
 */
class eoy_1 {
    private static final Logger a = Logger.getLogger(eoy_1.class);
    private final epa_1[] b = new epa_1[eps_0.y() + 1];

    eoy_1() {
    }

    public boolean a(byte by) {
        return this.b[by] != null;
    }

    public epa_1 b(byte by) {
        return this.b[by];
    }

    public void a(byte by, epa_1 epa_12) {
        this.b[by] = epa_12;
    }

    public void a(TIntObjectProcedure<epa_1> tIntObjectProcedure) {
        int n = this.b.length;
        for (int k = 0; k < n; ++k) {
            epa_1 epa_12 = this.b[k];
            if (epa_12 == null || tIntObjectProcedure.execute(k, (Object)epa_12)) continue;
            return;
        }
    }

    public void a(TObjectProcedure<epa_1> tObjectProcedure) {
        for (epa_1 epa_12 : this.b) {
            if (epa_12 == null || tObjectProcedure.execute((Object)epa_12)) continue;
            return;
        }
    }
}

