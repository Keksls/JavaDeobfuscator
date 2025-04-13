/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 */
import java.net.URL;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

/*
 * Renamed from fwJ
 */
public class fwj_0 {
    private static final Logger g = Logger.getLogger(fwj_0.class);
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final int e;
    public final int f;

    private fwj_0(double d2, double d3, double d4, double d5, int n, int n2) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
        this.e = n;
        this.f = n2;
    }

    public static fwj_0 a(aqx_2 aqx_22) {
        if (aqx_22.b().equals("#text") || aqx_22.b().equals("#comment")) {
            return null;
        }
        double d2 = fwj_0.a(aqx_22, "isoX", 0.0);
        double d3 = fwj_0.a(aqx_22, "isoY", 0.0);
        double d4 = fwj_0.a(aqx_22, "isoWidth", -1.0);
        double d5 = fwj_0.a(aqx_22, "isoHeight", -1.0);
        int n = fwj_0.a(aqx_22, "width", -1);
        int n2 = fwj_0.a(aqx_22, "height", -1);
        return new fwj_0(d2, d3, d4, d5, n, n2);
    }

    public static ays_2 a(aqx_2 aqx_22, URL uRL) {
        aqx_2 aqx_23 = aqx_22.f("texture");
        if (aqx_23 == null) {
            return null;
        }
        String string = aqx_23.c();
        try {
            URL uRL2 = cd_0.a(uRL, string);
            String string2 = uRL2.toString();
            return fwj_0.a(string2);
        }
        catch (Exception exception) {
            g.error((Object)"Probl\u00e8me lors de la r\u00e9cup\u00e9ration de la texture de la map");
            return null;
        }
    }

    public static ays_2 a(aqx_2 aqx_22, URL uRL, String string) {
        aqx_2 aqx_23 = aqx_22.f("texture");
        if (aqx_23 == null) {
            return null;
        }
        try {
            String string2 = gi_0.k(string);
            URL uRL2 = cd_0.a(uRL, "mask" + StringUtils.capitalize((String)string2) + ".png");
            return cd_0.a(uRL2) ? fwj_0.a(uRL2.toString(), true) : null;
        }
        catch (Exception exception) {
            g.error((Object)"Probl\u00e8me lors de la r\u00e9cup\u00e9ration de la texture de la map");
            return null;
        }
    }

    private static double a(aqx_2 aqx_22, String string, double d2) {
        aqx_2 aqx_23 = aqx_22.f(string);
        return aqx_23 == null ? d2 : aqx_23.j();
    }

    private static int a(aqx_2 aqx_22, String string, int n) {
        aqx_2 aqx_23 = aqx_22.f(string);
        return aqx_23 == null ? n : aqx_23.g();
    }

    public static ays_2 a(String string) {
        return fwj_0.a(string, false);
    }

    public static ays_2 a(String string, boolean bl) {
        if (cd_0.b(string)) {
            return ayu_2.a().b(auj_1.a.a(), auc_1.d(string), string, bl, true);
        }
        g.info((Object)("Impossible de trouver le fichier " + string));
        return null;
    }

    public ayo_2 a(ays_2 ays_22) {
        if (this.e != -1 && this.f != -1) {
            return new ayo_2(ays_22, 0, 0, this.e, this.f);
        }
        return new ayo_2(ays_22);
    }
}

