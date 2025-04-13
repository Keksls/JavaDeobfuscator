/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fje
 */
public class fje_0 {
    private static final Logger b = Logger.getLogger(fje_0.class);
    public static final fje_0 a = new fje_0();
    private final ArrayList<fjc_0> c = new ArrayList();

    private fje_0() {
    }

    public void a(fjc_0 fjc_02) {
        if (this.c.contains(fjc_02)) {
            b.error((Object)("Tentative d'ajout multiple du TaxHandler=" + fjc_02 + " \u00e0 la liste des percepteurs de taxe globaux"));
            return;
        }
        this.c.add(fjc_02);
    }

    public double a(eyg_2 eyg_22, fjb_0 fjb_02) {
        int n = 1000000;
        return (double)this.a(eyg_22, fjb_02, 1000000L) / 1000000.0;
    }

    public long a(eyg_2 eyg_22, fjb_0 fjb_02, long l) {
        return this.a(eyg_22, fjb_02, l, false);
    }

    public long b(eyg_2 eyg_22, fjb_0 fjb_02, long l) {
        return this.a(eyg_22, fjb_02, l, true);
    }

    private long a(eyg_2 eyg_22, fjb_0 fjb_02, long l, boolean bl) {
        long l2 = 0L;
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            fjc_0 fjc_02 = this.c.get(k);
            if (!fjc_02.a(eyg_22)) continue;
            long l3 = fjc_02.a(eyg_22, fjb_02, l);
            if (l3 > 0L && bl) {
                fjc_02.a(fjb_02, Hw.e(l3));
            }
            l2 += l3;
        }
        if (bl) {
            eyg_22.dK().d(l2);
        }
        return l2;
    }

    public void b(fjc_0 fjc_02) {
        if (this.c.contains(fjc_02)) {
            this.c.remove(fjc_02);
        } else {
            b.error((Object)("Tentative de suppression du TaxHandler=" + fjc_02 + " alors qu'il n'est pas pr\u00e9sent dans la liste"));
        }
    }

    public String toString() {
        return "TaxManager{m_taxHandlers=" + this.c.size() + "}";
    }

    public void a() {
        this.c.clear();
    }
}

