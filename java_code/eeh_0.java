/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from eEh
 */
final class eeh_0 {
    private static final Logger a = Logger.getLogger(eeh_0.class);

    private eeh_0() {
    }

    static void a(epq_2 epq_22) {
        int n = eeh_0.c(epq_22);
        eeh_0.d(epq_22);
        epq_22.b(epq_22.Q_(), false);
        eeh_0.a(epq_22, n);
    }

    static void a(epq_2 epq_22, eyz_0 eyz_02, int n, int n2) {
        int n3 = eeh_0.c(epq_22);
        eeh_0.d(epq_22);
        eeh_0.a(epq_22, eyz_02);
        eeh_0.a(epq_22, n == -1 ? (int)epq_22.dt() : n, n2 == -1 ? (int)epq_22.dt() : n2);
        epq_22.b(epq_22.Q_(), false);
        epq_22.bI();
        eeh_0.a(epq_22, n3);
    }

    static void b(epq_2 epq_22) {
        int n = eeh_0.c(epq_22);
        epq_22.b_(true);
        eeh_0.a(epq_22, n);
    }

    private static int c(epq_2 epq_22) {
        return epq_22.a_(eps_0.b).b();
    }

    private static void a(epq_2 epq_22, int n) {
        epq_22.o(Math.min(n, epq_22.d(eps_0.b)));
    }

    private static void d(epq_2 epq_22) {
        epq_22.dR().g(36);
    }

    private static void a(epq_2 epq_22, eyz_0 eyz_02) {
        if (eyz_02 == null) {
            return;
        }
        epq_22.a(eyz_02);
        Map<exh_2, Long> map = eyz_02.a();
        for (Map.Entry<exh_2, Long> entry : map.entrySet()) {
            try {
                Optional<exk_2> optional = eZi.a(epq_22, eyz_02, entry.getKey());
                optional.ifPresent(exk_22 -> epq_22.dR().b((Sm)exk_22));
            }
            catch (Exception exception) {
                a.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private static void a(epq_2 epq_22, int n, int n2) {
        ((epn_2)epq_22.Z_()).g().b(epq_22.gP(), Hw.c((long)n), Hw.c((long)n2));
    }
}

