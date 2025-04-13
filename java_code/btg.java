/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class btg
implements ajh_1 {
    public static final btg a = new btg();
    public static final String b = "currentDifficulty";
    public static final String d = "isAutoDownscaled";
    public static final String e = "instanceName";
    public static final String f = "tooltipDifficulty";
    public static final String g = "tooltipDownscaling";
    public static final String h = "tooltipBonus";
    public static final String[] i = new String[]{"currentDifficulty", "isAutoDownscaled", "instanceName", "tooltipDifficulty", "tooltipDownscaling", "tooltipBonus"};

    @Override
    public String[] d() {
        return i;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(b)) {
            return cdn_1.a.d();
        }
        if (string.equals(d)) {
            return cdn_1.a.c() > 0;
        }
        if (string.equals(e)) {
            Optional<ezb_2> optional = ezd_2.a.a(cdn_1.a.a());
            int n = optional.map(ezb_2::a).orElse(-1);
            return bae.h().a(137, (long)n, new Object[0]);
        }
        if (string.equals(f)) {
            return btg.b();
        }
        if (string.equals(g)) {
            return btg.c();
        }
        if (string.equals(h)) {
            int n = cdn_1.a.d();
            Optional<ezb_2> optional = ezd_2.a.a(cdn_1.a.a());
            return optional.map(ezb_22 -> bae.h().a(ezb_22.j(), n, ezb_22.k().a())).orElse(bae.h().a("error.unknown", new Object[0]));
        }
        return null;
    }

    public static String a() {
        int n = cdn_1.a.d();
        Optional<ezb_2> optional = ezd_2.a.a(cdn_1.a.a());
        if (optional.isPresent()) {
            // empty if block
        }
        return bae.h().a("error.unknown", new Object[0]);
    }

    @NotNull
    public static String b() {
        int n = cdn_1.a.d();
        eer_0 eer_02 = eer_0.b(n);
        String string = bae.h().a("stasis.dungeon.difficulty" + eer_02.b(), new Object[0]);
        return bae.h().a("stasis.dungeon.tooltip.difficulty", n, string);
    }

    public static String c() {
        int n = cdn_1.a.c();
        if (n > 0) {
            return bae.h().a("stasis.dungeon.tooltip.downscaled", n);
        }
        return bae.h().a("stasis.dungeon.tooltip.not.downscaled", new Object[0]);
    }

    public void e() {
        fis_1.a().a((ajf_1)this, b);
    }
}

