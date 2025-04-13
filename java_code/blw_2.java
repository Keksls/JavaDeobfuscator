/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from blw
 */
@fpw_0
public class blw_2 {
    public static final String PACKAGE = "wakfu.challenge";
    private static final Logger a = Logger.getLogger(blw_2.class);

    public static void parseInput(fck_2 fck_22, fug_0 fug_02, blo_2 blo_22) {
        blw_2.a(fug_02.getText(), blo_22);
    }

    public static void parseInput(fcd_2 fcd_22, fug_0 fug_02, blo_2 blo_22) {
        if (fcd_22.k() != 10) {
            return;
        }
        blw_2.a(fug_02.getText(), blo_22);
    }

    private static void a(String string, blo_2 blo_22) {
        long l;
        if (Cz.f(string)) {
            return;
        }
        try {
            l = Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            a.error((Object)("Non numerical answer " + string), (Throwable)numberFormatException);
            return;
        }
        cqz cqz2 = new cqz();
        cqz2.a(l);
        cqz2.b(blo_22.a());
        cqz2.a(blo_22.b());
        cqz2.a(blo_22.c());
        azu_0.j().K().c(cqz2);
        fpm_0.b().e(PACKAGE);
        fpm_0.b().o("challengeInputDialog");
    }
}

