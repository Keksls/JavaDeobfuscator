/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class fgV {
    public static final fgV a = new fgV();
    private static final Logger b = Logger.getLogger(fgV.class);
    private final ArrayList<fgw_0> c = new ArrayList();

    private fgV() {
    }

    public void a(fgw_0 fgw_02) {
        if (!this.c.contains(fgw_02)) {
            this.c.add(fgw_02);
        }
    }

    public void b(fgw_0 fgw_02) {
        this.c.remove(fgw_02);
    }

    public void a(fgU fgU2) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            Object p2 = fgU2.e();
            if (p2 == null) continue;
            fgw_0 fgw_02 = this.c.get(k);
            try {
                fgw_02.a(fgU2);
                continue;
            }
            catch (Exception exception) {
                b.error((Object)("Exception lev\u00e9e lors du traitement d'un evenement de protecteur " + ((fgy_0)p2).B() + ", par un listener : " + fgw_02.getClass().getSimpleName()), (Throwable)exception);
            }
        }
    }
}

