/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cbs
 */
public class cbs_2
implements fka_1 {
    private static final int a = 30;

    @Override
    public fje_1 a() {
        return new fje_1(null, bae.h().a("theme.noTheme", new Object[0]), bae.h().a("theme.noTheme.description", new Object[0]));
    }

    @Override
    public String b() {
        return bae.h().a("theme.auto.generated.name", new Object[0]);
    }

    @Override
    public String c() {
        return bae.h().a("theme.auto.generated.description", new Object[0]);
    }

    @Override
    public String a(ati_2 ati_22, String string) {
        String string2 = this.b(ati_22, "name");
        return bae.h().a("theme.displayName", string2.isEmpty() ? string : string2, this.b(ati_22, "version"), this.b(ati_22, "author"), this.b(ati_22, "wakfuVersion"));
    }

    @NotNull
    private String b(ati_2 ati_22, String string) {
        return this.a(ati_22, string, 30);
    }

    @Override
    @NotNull
    public String a(ati_2 ati_22, String string, int n) {
        String string2 = bae.h().f().h().toLowerCase();
        String string3 = cbs_2.b(ati_22, string + "-" + string2, n);
        if (!string3.isEmpty()) {
            return string3;
        }
        return cbs_2.b(ati_22, string, n);
    }

    @NotNull
    private static String b(ati_2 ati_22, String string, int n) {
        aqx_2 aqx_22 = ati_22.c(string);
        if (aqx_22 == null) {
            return "";
        }
        aqx_2 aqx_23 = aqx_22.c("#text");
        if (aqx_23 == null || aqx_23.c() == null) {
            return "";
        }
        String string2 = aqx_23.c().trim().replaceAll("[^\\x0A\\x20-\\x7F\\xA0-\\xFF]", "");
        if (string2.length() < n) {
            return string2;
        }
        return string2.substring(0, n);
    }
}

