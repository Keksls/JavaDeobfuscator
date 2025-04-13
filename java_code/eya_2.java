/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from eYa
 */
public class eya_2 {
    private static final Logger a = Logger.getLogger(eya_2.class);

    private eya_2() {
    }

    public static boolean a(exo_2<? extends ezr_0> exo_22) {
        boolean bl = enp_2.a.d(ens_2.aM);
        if (!bl) {
            return false;
        }
        Object r2 = eyo_1.g().d(exo_22.j());
        return r2 != null;
    }

    public static eyb_1 a(epq_2 epq_22, exo_2<? extends ezr_0> exo_22, exk_2 exk_22) {
        ead_0 ead_02 = epq_22.fl();
        if (ead_02 != null && ead_02.ac_() == 24) {
            return eyb_1.c;
        }
        int n = exo_22.f();
        int n2 = epq_22.dS().o();
        if (exk_22.e() == 1) {
            ++n2;
        }
        if (n <= n2) {
            return eyb_1.a;
        }
        for (ezr_0 ezr_02 : exo_22) {
            boolean bl;
            exk_2 exk_23 = epq_22.dS().e(ezr_02.n());
            boolean bl2 = bl = exk_23 != null && exk_23.D() != 0 && (!ezr_02.ag() || exk_23.ak());
            if (bl) continue;
            --n2;
        }
        return n2 >= 0 ? eyb_1.a : eyb_1.b;
    }

    public static boolean a(epq_2 epq_22, exo_2<? extends ezr_0> exo_22) {
        return eya_2.a(epq_22, exo_22, false);
    }

    public static boolean a(epq_2 epq_22, exo_2<? extends ezr_0> exo_22, boolean bl) {
        boolean bl2 = true;
        Iterator<? extends ezr_0> iterator = exo_22.iterator();
        while (iterator.hasNext() && bl2) {
            ezr_0 ezr_02 = iterator.next();
            exk_2 exk_22 = epq_22.dS().a(ezr_02.n(), eZL.a);
            if (exk_22 != null) continue;
            bl2 = false;
            if (!bl) continue;
            a.error((Object)("Fusion de panoplie : le joueur id=" + epq_22.a_() + " ne poss\u00e8de pas l'item de refId=" + ezr_02.n()));
        }
        return bl2;
    }
}

