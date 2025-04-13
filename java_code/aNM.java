/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class aNM {
    private static final Logger a = Logger.getLogger(aNM.class);
    private static final int b = 50000;
    private static final int c = 6000;
    private static final int d = 70000;
    private static final int e = 15000;
    private static final int f = 141000;
    private static final int g = 50000;
    private static final int h = 6000;
    private static final int i = 70000;
    private static final int j = 15000;
    private static final int k = 141000;

    public static String a() {
        try {
            return azs_0.a().a("shadersPath");
        }
        catch (gm_0 gm_02) {
            a.error((Object)"", (Throwable)gm_02);
            return "";
        }
    }

    public static int a(adN adN2) {
        adj_0 adj_02 = new adj_0(aNM.a() + "death.cgfx", "death0");
        adj_02.b(true);
        aNM.a(adj_02, adN2);
        return adj_02.f();
    }

    public static int b() {
        adj_0 adj_02 = new adj_0(aNM.a() + "death.cgfx", "death0");
        aNM.a(adj_02, new adK(3000));
        return adj_02.f();
    }

    public static int c() {
        adj_0 adj_02 = new adj_0(aNM.a() + "incarnam.cgfx", "incarnam");
        aNM.a(adj_02, new adN(1.0f));
        return adj_02.f();
    }

    public static int d() {
        adj_0 adj_02 = new adj_0(aNM.a() + "bag.cgfx", "bag");
        aNM.a(adj_02, new adN(1.0f));
        return adj_02.f();
    }

    public static int e() {
        ava_1 ava_12 = new ava_1(new aut_1("gStrength", auu_1.a), new aut_1("radius", auu_1.a));
        aNN aNN2 = new aNN(aNM.a() + "ogrest.cgfx", "ogrest", ava_12);
        aNM.a(aNN2, new adN(1.0f));
        return aNN2.f();
    }

    public static int f() {
        adj_0 adj_02 = new adj_0(aNM.a() + "zinit.cgfx", "zinit");
        aNM.a(adj_02, new adN(1.0f));
        return adj_02.f();
    }

    public static int g() {
        adj_0 adj_02 = new adj_0(aNM.a() + "mine.cgfx", "mine");
        aNM.a(adj_02, new adN(1.0f));
        return adj_02.f();
    }

    public static int h() {
        ava_1 ava_12 = new ava_1(new aut_1("gStrength", auu_1.a), new aut_1("position", auu_1.b));
        anp_0 anp_02 = new anp_0(aNM.a() + "moon_light.cgfx", "moon_light", ava_12, ava_12);
        aNM.a(anp_02, new adN(1.0f));
        return anp_02.f();
    }

    public static int i() {
        ava_1 ava_12 = new ava_1(new aut_1("gStrength", auu_1.a), new aut_1("gDistordLow", auu_1.b), new aut_1("gDistordHigh", auu_1.b));
        ava_12.a("gStrength", 1.0f);
        aNQ aNQ2 = new aNQ(aNM.a() + "postprocess.cgfx", "shukrute1", ava_12, ava_12);
        aNM.a(aNQ2, new adN(1.0f));
        return aNQ2.f();
    }

    public static void a(adj_0 adj_02, adN adN2) {
        adj_02.a(ans_0.D().c().b());
        adj_02.a(adN2);
        aui_1.a().a(adj_02);
    }

    public static void a(int n) {
        auh_1 auh_12 = aui_1.a().b(n);
        if (auh_12 != null) {
            auh_12.b(500);
        }
    }

    public static int j() {
        ava_1 ava_12 = new ava_1(new aut_1("gStrength", auu_1.a), new aut_1("gDistordLow", auu_1.b), new aut_1("gDistordHigh", auu_1.b), new aut_1("camera", auu_1.c));
        ava_12.a("gStrength", 1.0f);
        aNR aNR2 = new aNR(aNM.a() + "brume.cgfx", "brume", ava_12, ava_12);
        aNM.a(aNR2, new adN(1.0f));
        return aNR2.f();
    }

    public static int k() {
        ava_1 ava_12 = new ava_1(new aut_1("screen_size", auu_1.b), new aut_1("pixel_size", auu_1.b), new aut_1("camera", auu_1.c));
        ava_12.a("pixel_size", 10.0f, 10.0f);
        aNS aNS2 = new aNS(aNM.a() + "pixelate.cgfx", "pixelate", ava_12, ava_12);
        aNM.a(aNS2, new adN(1.0f));
        return aNS2.f();
    }

    public static int b(adN adN2) {
        ava_1 ava_12 = new ava_1(new aut_1("gStrength", auu_1.a), new aut_1("caniculeToSirroco", auu_1.a), new aut_1("gDistordLow", auu_1.b), new aut_1("gDistordHigh", auu_1.b), new aut_1("gHeatDistordLow", auu_1.b), new aut_1("gHeatDistordHigh", auu_1.b), new aut_1("camera", auu_1.c));
        aNT aNT2 = new aNT(aNM.a() + "Sirocco.cgfx", "sirocco", ava_12, adN2, ava_12);
        aNM.a(aNT2, adN2);
        return aNT2.f();
    }

    public static int c(adN adN2) {
        ava_1 ava_12 = new ava_1(new aut_1("gStrength", auu_1.a), new aut_1("caniculeToTemporal", auu_1.a), new aut_1("gDistordLow", auu_1.b), new aut_1("gDistordHigh", auu_1.b), new aut_1("gHeatDistordLow", auu_1.b), new aut_1("gHeatDistordHigh", auu_1.b), new aut_1("camera", auu_1.c));
        anu_0 anu_02 = new anu_0(aNM.a() + "temporal.cgfx", "temporal", ava_12, adN2, ava_12);
        aNM.a(anu_02, adN2);
        return anu_02.f();
    }

    public static int d(adN adN2) {
        ava_1 ava_12 = new ava_1(new aut_1("gStrength", auu_1.a), new aut_1("gDistordLow", auu_1.b), new aut_1("gDistordHigh", auu_1.b), new aut_1("camera", auu_1.c));
        aNV aNV2 = new aNV(aNM.a() + "blizzard.cgfx", "blizzard", ava_12, adN2, ava_12);
        aNM.a(aNV2, adN2);
        return aNV2.f();
    }

    public static int e(adN adN2) {
        ava_1 ava_12 = new ava_1(new aut_1("gStrength", auu_1.a), new aut_1("gColorVariation", auu_1.c), new aut_1("gDistordLow", auu_1.b), new aut_1("gDistordHigh", auu_1.b), new aut_1("gHeatDistordLow", auu_1.b), new aut_1("gHeatDistordHigh", auu_1.b), new aut_1("camera", auu_1.c));
        anw_0 anw_02 = new anw_0(aNM.a() + "hallucination.cgfx", "hallucination", ava_12, adN2, ava_12);
        aNM.a(anw_02, adN2);
        return anw_02.f();
    }

    public static int f(adN adN2) {
        ava_1 ava_12 = new ava_1(new aut_1("gStrength", auu_1.a), new aut_1("gDistordLow", auu_1.b), new aut_1("gDistordHigh", auu_1.b), new aut_1("camera", auu_1.c));
        aNO aNO2 = new aNO(aNM.a() + "Gloomy.cgfx", "Gloomy", ava_12, adN2, ava_12);
        aNM.a(aNO2, adN2);
        return aNO2.f();
    }
}

