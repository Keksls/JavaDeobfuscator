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
 * Renamed from byD
 */
public class byd_1
implements ajh_1 {
    private static final Logger h = Logger.getLogger(byd_1.class);
    public static final String a = "id";
    public static final String b = "emblemPath";
    public static final String d = "backgroundPath";
    public static final String e = "emblemTexture";
    public static final azf_2 f = new azf_2(0.18f, 0.31f, 0.31f, 1.0f);
    public static final String[] g = new String[]{"id", "emblemPath", "backgroundPath", "emblemTexture"};
    private final int i;

    public byd_1(int n) {
        this.i = n;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.i;
        }
        if (b.equals(string)) {
            return this.a("guildBlazonForegroundPartPath");
        }
        if (d.equals(string)) {
            return this.a("guildBlazonBackgroundPartPath");
        }
        if (e.equals(string)) {
            return bxp_1.a().a(this.i, f);
        }
        return null;
    }

    private String a(String string) {
        String string2 = "";
        try {
            string2 = String.format(azs_0.a().a(string), this.i);
        }
        catch (gm_0 gm_02) {
            h.error((Object)("Can't retrieve blazon " + string + " for id " + this.i), (Throwable)gm_02);
        }
        return string2;
    }

    public int a() {
        return this.i;
    }

    @Override
    public String[] d() {
        return g;
    }
}

