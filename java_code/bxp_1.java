/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bxP
 */
public class bxp_1 {
    private static final Logger c = Logger.getLogger(bxp_1.class);
    private static final bxp_1 d = new bxp_1();
    private static final int e = 45;
    private static final int f = 376;
    public static final int a = 46;
    public static final int b = 377;
    private static final String g = "generatedGuildEmblem-%d-%d";
    private static final azi_2 h = new azi_2(true);

    private bxp_1() {
    }

    public static bxp_1 a() {
        return d;
    }

    private String a(int n) {
        n = Hw.a(n, 0, 45);
        try {
            return String.format(azs_0.a().a("guildBlazonBackgroundPartPath"), n);
        }
        catch (gm_0 gm_02) {
            c.warn((Object)"Impossible de trouver la propri\u00e9t\u00e9 guildBlazonBackgroundPartPath");
            return null;
        }
    }

    private String b(int n) {
        n = Hw.a(n, 0, 376);
        try {
            return String.format(azs_0.a().a("guildBlazonForegroundPartPath"), n);
        }
        catch (gm_0 gm_02) {
            c.warn((Object)"Impossible de trouver la propri\u00e9t\u00e9 guildBlazonForegroundPartPath");
            return null;
        }
    }

    public ays_2 a(bxo_1 bxo_12) {
        long l = bxo_12.g();
        ays_2 ays_22 = ayu_2.a().a(l);
        if (ays_22 != null) {
            return ays_22;
        }
        String[] stringArray = new String[]{this.a(bxo_12.a()), this.b(bxo_12.b())};
        azk_2 azk_22 = new azk_2();
        azk_22.a(stringArray);
        h.b(bxo_12.d().m(), bxo_12.d().n(), bxo_12.d().o(), bxo_12.d().l());
        azk_22.a(0, h);
        h.b(bxo_12.c().m(), bxo_12.c().n(), bxo_12.c().o(), bxo_12.c().l());
        azk_22.a(1, h);
        azk_22.A();
        ays_22 = ayu_2.a().b((aui_2)auj_1.a.a(), l, azk_22, true);
        azk_22.u();
        return ays_22;
    }

    public ays_2 a(int n, azj_2 azj_22) {
        String string = String.format(g, n, azj_22.i());
        int n2 = string.hashCode();
        ays_2 ays_22 = ayu_2.a().a(n2);
        if (ays_22 != null) {
            return ays_22;
        }
        String[] stringArray = new String[]{this.b(n)};
        azk_2 azk_22 = new azk_2();
        azk_22.a(stringArray);
        h.b(azj_22.m(), azj_22.n(), azj_22.o(), azj_22.l());
        azk_22.a(0, h);
        azk_22.A();
        ays_22 = ayu_2.a().b((aui_2)auj_1.a.a(), (long)n2, azk_22, true);
        azk_22.u();
        return ays_22;
    }

    public bxo_1 b() {
        int n = Hw.b(0, 46);
        int n2 = Hw.b(0, 377);
        int n3 = bxm_1.a().b();
        azj_2 azj_22 = bxm_1.a().a(Hw.a(n3));
        azj_2 azj_23 = bxm_1.a().a(Hw.a(n3));
        return new bxo_1((short)n, (short)n2, azj_22, azj_23);
    }

    public void b(bxo_1 bxo_12) {
        short s2 = bxo_12.a();
        s2 = (short)((s2 + 1) % 46);
        bxo_12.a(s2);
    }

    public void c(bxo_1 bxo_12) {
        short s2 = bxo_12.a();
        s2 = (short)((46 + s2 - 1) % 46);
        bxo_12.a(s2);
    }

    public void d(bxo_1 bxo_12) {
        short s2 = bxo_12.b();
        s2 = (short)((s2 + 1) % 377);
        bxo_12.b(s2);
    }

    public void e(bxo_1 bxo_12) {
        short s2 = bxo_12.b();
        s2 = (short)((377 + s2 - 1) % 377);
        bxo_12.b(s2);
    }
}

