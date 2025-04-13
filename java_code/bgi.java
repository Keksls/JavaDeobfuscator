/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.wakfu.client.console.command.debug.DisplayStatesCommand;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class bgi
implements edm_0 {
    private static final Logger a = Logger.getLogger(bgi.class);

    @Override
    public void a(@NotNull Oy oy, @NotNull ank_2 ank_22) {
        eDi.ap = oy;
        eDi.aq = ank_22;
        eDi.ar = this;
        try {
            eDi.ao = azs_0.a().a("effectDescPlotIconUrl");
            eDi.an = eDi.aq.a().a((CharSequence)" ").a(eDi.ao, -1, -1, null).a((CharSequence)" ").r();
        }
        catch (gm_0 gm_02) {
            gm_02.printStackTrace();
        }
        eDi.as = "critical";
        eDi.at = "requirements";
        eDi.au = "hp.var.beacon";
        eDi.av = "hp.var.barrel";
        eDi.aw = "levelShort.custom";
        eDi.ax = "levelShort.customCumulable";
        eDi.ay = "WISDOMShort";
        eDi.az = "AGILITYShort";
        eDi.aA = "STRENGTHShort";
        eDi.aB = "LUCKShort";
        eDi.aC = "INTELLIGENCEShort";
        eDi.aD = "vitalityShort";
        eDi.aE = "huppermagerResource";
        eDi.aF = "ouginak.resource";
        eDi.aG = "SPShort";
        eDi.aH = "max";
        eDi.aI = "level";
        eDi.aJ = "levelReal";
        eDi.aK = 10;
        eDi.aL = 33;
        eDi.aM = 6;
        eDi.aN = 5;
    }

    @Override
    public ani_2 a(ani_2 ani_22, String string) {
        return ani_22.i().a("cc4444").a((CharSequence)string);
    }

    @Override
    public void a(ani_2 ani_22, ekk_0 ekk_02, short s2) {
        ani_22.a().g().a(bgi.g()).c("glyph_" + Hw.c((short)ekk_02.A(), s2));
        ani_22.a((CharSequence)bae.h().a(6, (long)((short)ekk_02.A()), new Object[0]));
        ani_22.h().b();
    }

    @Override
    public void a(ani_2 ani_22, fie_0 fie_02, short s2) {
        ani_22.a().g().a(bgi.g()).c("state_" + Hw.c(fie_02.p(), s2));
        ani_22.a((CharSequence)fie_02.g());
        ani_22.h().b();
    }

    @Override
    public void a(ani_2 ani_22, fin_0 fin_02) {
        ani_22.a().g().a(bgi.g()).c("spell_" + fin_02.i());
        ani_22.a((CharSequence)bae.h().a(3, (long)fin_02.i(), new Object[0]));
        ani_22.h().b();
    }

    private static String g() {
        return fys_0.a.a(elw_1.dH).w();
    }

    @Override
    public void a(ani_2 ani_22, int n) {
        ani_22.a((CharSequence)bae.h().a(String.format("spellProperty.%d", n), new Object[0]));
    }

    @Override
    public fin_0 a(short s2) {
        return bpp_0.a().a(s2);
    }

    @Override
    public String a(eoz_1 eoz_12) {
        return bae.h().a("property.fight.desc." + eoz_12.b(), new Object[0]);
    }

    @Override
    public String a(erl_2 erl_22) {
        return bae.h().a("property.world.desc." + erl_22.b(), new Object[0]);
    }

    @Override
    public String a(eld_0 eld_02) {
        return bae.h().a("property.area.desc." + eld_02.b(), new Object[0]);
    }

    @Override
    public String a(eps_0 eps_02) {
        return bae.h().a(eps_02.e(), new Object[0]);
    }

    @Override
    public String a(int n) {
        return bae.h().a(62, (long)n, new Object[0]);
    }

    @Override
    public String b(int n) {
        return bae.h().a(64, (long)n, new Object[0]);
    }

    @Override
    public String c(int n) {
        return bae.h().a(61, (long)n, new Object[0]);
    }

    @Override
    public String d(int n) {
        return bHJ.a().a(n).a();
    }

    @Override
    public String e(int n) {
        return bae.h().a(15, (long)n, new Object[0]);
    }

    @Override
    public String b(short s2) {
        return bae.h().a(43, (long)s2, new Object[0]);
    }

    @Override
    public String f(int n) {
        return bae.h().a(138, (long)n, new Object[0]);
    }

    @Override
    public String c(short s2) {
        bpb_1 bpb_12 = bpc_1.a().a(s2);
        if (bpb_12 == null) {
            return "";
        }
        return bpb_12.f();
    }

    @Override
    public String d(short s2) {
        return bae.h().a(38, (long)s2, new Object[0]);
    }

    @Override
    public String g(int n) {
        return bae.h().a("breed." + n, new Object[0]);
    }

    @Override
    public String h(int n) {
        return bae.h().a(39, (long)n, new Object[0]);
    }

    @Override
    public String a(byte by) {
        return bae.h().a("nation.alignmentName" + fbl_0.a(by).name(), new Object[0]);
    }

    @Override
    public String i(int n) {
        return bae.h().a("subscriptionLevelName" + n, new Object[0]);
    }

    @Override
    public String a(fgY fgY2) {
        return bae.h().a("nation.pvpRank." + fgY2, new Object[0]);
    }

    @Override
    public Optional<Integer> j(int n) {
        return Optional.empty();
    }

    @Override
    public String k(int n) {
        return bae.h().a(77, (long)n, new Object[0]);
    }

    @Override
    public int a() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null) {
            faV faV2 = bmr_12.fE();
            return faV2.n();
        }
        return -1;
    }

    @Override
    public ani_2 a(ani_2 ani_22) {
        try {
            String string = String.format(azs_0.a().a("elementsSmallIconsPath"), "craft");
            ani_22.a(string, -1, -1, null);
        }
        catch (gm_0 gm_02) {
            a.warn((Object)gm_02.getMessage());
        }
        return ani_22;
    }

    @Override
    public ani_2 a(ani_2 ani_22, efa_0 efa_02) {
        try {
            String string = String.format(azs_0.a().a("elementsSmallIconsPath"), efa_02.name());
            ani_22.a(string, -1, -1, null);
        }
        catch (gm_0 gm_02) {
            a.warn((Object)gm_02.getMessage());
        }
        return ani_22;
    }

    @Override
    public Optional<String> a(efa_0 efa_02) {
        return Optional.ofNullable(efa_02 != null ? bae.h().a(efa_02.name(), new Object[0]) : null);
    }

    @Override
    public ani_2 b(ani_2 ani_22, String string) {
        try {
            String string2 = String.format(azs_0.a().a("targetEffectIconsPath"), string);
            ani_22.a(string2, -1, -1, null, string);
        }
        catch (gm_0 gm_02) {
            a.warn((Object)gm_02.getMessage());
        }
        return ani_22;
    }

    @Override
    public String a(aqd_1 aqd_12) {
        try {
            String string = String.format(azs_0.a().a("areasIconsPath"), aqd_12.i().name());
            Object object = "areaRange";
            String string2 = aqd_12.g();
            if (string2 != null) {
                object = (String)object + "_" + string2;
            }
            return eDi.aq.a().a(string, -1, -1, null, (String)object).r();
        }
        catch (gm_0 gm_02) {
            a.error((Object)gm_02.toString());
            return "";
        }
    }

    @Override
    public String b() {
        try {
            return eDi.aq.a().a(bac.a(10), -1, -1, null, "critere.chrage").a((CharSequence)" ").r();
        }
        catch (gm_0 gm_02) {
            a.error((Object)("Error while loading chrage icon: " + gm_02.getMessage()));
            return "";
        }
    }

    @Override
    public String c() {
        try {
            return eDi.aq.a().a(bac.a(9), -1, -1, null, "citizenScore").a((CharSequence)" ").r();
        }
        catch (gm_0 gm_02) {
            a.error((Object)("Error while loading citizen points icon: " + gm_02.getMessage()));
            return "";
        }
    }

    @Override
    public String a(String string) {
        try {
            String string2 = String.format(azs_0.a().a("areasIconsPath"), string);
            return eDi.aq.a().a(string2, -1, -1, null).r();
        }
        catch (gm_0 gm_02) {
            a.error((Object)gm_02.toString());
            return "";
        }
    }

    @Override
    public String a(Oy oy) {
        return eDi.ap.a("cast.infiniteDuration", new Object[0]);
    }

    @Override
    public String a(Oy oy, int n) {
        return eDi.ap.a("remaining.duration.turn", n);
    }

    @Override
    public boolean a(fio_0 fio_02) {
        return ((bph_0)((bpl_0)fio_02).r()).e();
    }

    @Override
    public epq_2 d() {
        return azu_0.j().k();
    }

    @Override
    public epq_2 b(fio_0 fio_02) {
        if (fio_02 instanceof bpl_0) {
            return ((bpl_0)fio_02).g();
        }
        return this.d();
    }

    @Override
    public boolean e() {
        return DisplayStatesCommand.b();
    }

    @Override
    public Object f() {
        return this.d().ge();
    }
}

