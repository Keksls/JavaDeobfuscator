/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.net.URL;
import org.apache.log4j.Logger;

/*
 * Renamed from fDO
 */
public class fdo_2 {
    private final Logger a = Logger.getLogger(fdo_2.class);
    private static final fdo_2 b = new fdo_2();

    private fdo_2() {
    }

    public ays_2 a(URL uRL) {
        if (uRL == null) {
            return null;
        }
        String string = uRL.toString();
        long l = auc_1.d(string);
        ays_2 ays_22 = ayu_2.a().b(auj_1.a.a(), l, string, false, true);
        if (ays_22 == null) {
            this.a.error((Object)("Probl\u00e8me au chargement de la texture " + uRL));
            azk_2 azk_22 = new azk_2();
            ays_22 = ayu_2.a().b((aui_2)auj_1.a.a(), l, azk_22, false);
            azk_22.u();
        }
        return ays_22;
    }

    public ays_2 a(String string) {
        return fze.a().d(string);
    }

    public ays_2 b(String string) {
        long l = Co.a((Object)string, -1L);
        if (l == -1L) {
            return null;
        }
        return ayu_2.a().a(l);
    }

    public void a() {
    }

    public static fdo_2 b() {
        return b;
    }
}

