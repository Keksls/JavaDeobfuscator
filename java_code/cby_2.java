/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

/*
 * Renamed from cby
 */
public class cby_2
extends xu_0 {
    public static String b(String string) {
        try {
            return cby_2.c(string);
        }
        catch (Exception exception) {
            return xu_0.a().a(string, cby_2.e());
        }
    }

    private static boolean e() {
        return true;
    }

    public static void a(aUm aUm2) {
        String string = aUm2.e();
        try {
            aUm2.b(cby_2.c(string));
        }
        catch (Exception exception) {
            aUm2.b(xu_0.a().a(aUm2.e(), cby_2.e()));
        }
    }

    private static String c(String string) {
        ath_2 ath_22 = new ath_2();
        atg_2 atg_22 = new atg_2();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(String.format("<text>%s</text>", string).getBytes(StandardCharsets.UTF_8));
        atg_22.a(byteArrayInputStream);
        atg_22.a(ath_22, new aqy_2[0]);
        atg_22.l();
        cby_2.a(ath_22.a());
        atg_2 atg_23 = new atg_2();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        atg_23.a(byteArrayOutputStream);
        atg_23.a(ath_22, true, false, false);
        String string2 = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
        return string2.substring(6, string2.length() - 7);
    }

    private static void a(ati_2 ati_22) {
        if ("#text".equals(ati_22.b())) {
            ati_22.b(xu_0.a().a(ati_22.c(), cby_2.e()));
        } else {
            for (aqx_2 aqx_22 : ati_22.k()) {
                ati_2 ati_23 = (ati_2)aqx_22;
                cby_2.a(ati_23);
            }
        }
    }
}

