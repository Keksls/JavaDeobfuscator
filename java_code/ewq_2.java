/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eWq
 */
public class ewq_2 {
    private static final Logger a = Logger.getLogger(ewq_2.class);
    private final ewx_2 b;
    private final yd_1 c;
    private final eww_2 d;

    public ewq_2(ewx_2 ewx_22, yd_1 yd_12, eww_2 eww_22) {
        this.b = ewx_22;
        this.c = yd_12;
        this.d = eww_22;
    }

    void a() {
        this.b.a(new ewr_1(this.c));
    }

    public static ye_1 a(ewz_2 ewz_22) {
        ye_1 ye_12 = new ye_1();
        ye_12.a = ewz_22.a();
        ye_12.b = ewz_22.b();
        return ye_12;
    }

    public void b() {
        ewp_1 ewp_12 = (ewp_1)this.b;
        ewp_12.a();
        int n = this.c.a.size();
        for (int k = 0; k < n; ++k) {
            ye_1 ye_12 = this.c.a.get(k);
            try {
                ewz_2 ewz_22 = ewq_2.a(ye_12, this.d);
                if (ewz_22 == null) continue;
                ewp_12.a(ewz_22);
                continue;
            }
            catch (exe_2 exe_22) {
                a.error((Object)("Probl\u00e8me \u00e0 la d\u00e9-serialisation de l'item " + ye_12), (Throwable)exe_22);
            }
        }
    }

    @Nullable
    public static ewz_2 a(ye_1 ye_12, eww_2 eww_22) {
        ezr_0 ezr_02 = (ezr_0)eww_22.e(ye_12.a);
        if (ezr_02 == null) {
            throw new exe_2("Impossible de trouver le refItem " + ye_12.a);
        }
        if (!ezr_02.b(ext_1.b)) {
            if (ezr_02.b(ext_1.u)) {
                return null;
            }
            throw new exe_2("Item " + ezr_02.n() + " / " + ezr_02.e() + " should not be in quest inventory");
        }
        ews_1 ews_12 = new ews_1(ezr_02);
        ews_12.a(Hw.a(ezr_02.o(), ye_12.b));
        return ews_12;
    }

    public String toString() {
        return "QuestInventorySerializer{m_inventory=" + this.b + "}";
    }
}

