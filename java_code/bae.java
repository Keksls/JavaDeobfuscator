/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class bae
extends Oy {
    private static final Logger f = Logger.getLogger(bae.class);
    private final bag_2[] g = new bag_2[]{new bag_2(Ow.b), new bag_2(Ow.a), new bag_2(Ow.e), new bag_2(Ow.c)};

    public bae() {
        String string = System.getProperty("wakfu.language");
        string = azs_0.a().a("language.force", string);
        Ow ow = string == null ? Oy.g() : Ow.a(string);
        this.b(ow);
        cbf_2.a(ow.a());
        try {
            this.a(azs_0.a().a("i18nPath"));
        }
        catch (gm_0 gm_02) {
            f.error((Object)"Erreur avec le fichier de traduction", (Throwable)gm_02);
        }
        Cr.q = bac.a;
        enp_2.a.a((ens_2 ens_22, Object object) -> {
            if (ens_22 != ens_2.e) {
                return;
            }
            ArrayList<String> arrayList = enp_2.a.f(ens_2.e);
            ArrayList<xr_0> arrayList2 = new ArrayList<xr_0>();
            arrayList2.add(xr_0.a);
            for (String string : arrayList) {
                Ow ow = Ow.a(string, true);
                if (ow == null) continue;
                arrayList2.add(xr_0.a(ow));
            }
            this.a((List<xr_0>)arrayList2);
        });
    }

    public static String c(Ow ow) {
        try {
            return String.format(azs_0.a().a("langIconsPath"), ow.b().getLanguage().toUpperCase());
        }
        catch (gm_0 gm_02) {
            f.warn((Object)gm_02);
            return null;
        }
    }

    public static String a(xz_0 xz_02) {
        try {
            return String.format(azs_0.a().a("langIconsPath"), xz_02.b().toUpperCase());
        }
        catch (gm_0 gm_02) {
            f.warn((Object)gm_02);
            return null;
        }
    }

    public static bae h() {
        if (c == null) {
            c = new bae();
        }
        return (bae)c;
    }

    public static String a(String string, int n) {
        Matcher matcher = azq_0.d.matcher(string);
        while (matcher.find()) {
            int n2 = Integer.parseInt(matcher.group(1));
            String string2 = new ani_2().a(azs_0.a().a("textIconsPath", "defaultIconPath", n2), n, n, null).r();
            string = StringUtils.replace((String)string, (String)matcher.group(), (String)string2);
        }
        return string;
    }

    public bag_2[] i() {
        return this.g;
    }

    public bag_2 j() {
        Ow ow = this.f();
        for (bag_2 bag_22 : this.g) {
            if (bag_22.d != ow) continue;
            return bag_22;
        }
        return null;
    }

    public String a(boolean bl) {
        return this.a(bl ? "yes" : "no", new Object[0]);
    }

    public String a(wu_0 wu_02) {
        return this.a(wu_02.i());
    }

    public String b(wu_0 wu_02) {
        return this.b(wu_02.i());
    }

    public String c(wu_0 wu_02) {
        return this.c(wu_02.i());
    }

    public String d(wu_0 wu_02) {
        return this.d(wu_02.i());
    }

    @NotNull
    public String e(Date date) {
        DateFormat dateFormat = DateFormat.getDateTimeInstance(3, 3, this.f().a());
        dateFormat.setTimeZone(wt_0.a);
        return dateFormat.format(date);
    }

    @NotNull
    public static Date f(Date date) {
        TimeZone timeZone = TimeZone.getTimeZone(enp_2.a.e(ens_2.c));
        long l = enp_2.a.c(ens_2.b);
        return new Date(date.getTime() + (long)timeZone.getRawOffset() + l);
    }

    @Override
    public void b(Ow ow) {
        super.b(ow);
        xu_0.a().a(xr_0.a, xr_0.a(ow));
        if (!ow.e()) {
            ayq_1.a((byte)2);
        }
        ayf_2.q = !ow.g();
        eau_0.a();
        ayk_1.a(ow);
    }

    public void a(List<xr_0> list) {
        xr_0 xr_02 = xr_0.a(this.f());
        if (!list.contains(xr_02)) {
            list.add(xr_02);
        }
        xu_0.a().a(list);
    }

    public String d(Ow ow) {
        switch (ow) {
            case a: {
                return this.a("options.french", new Object[0]);
            }
            case b: {
                return this.a("options.english", new Object[0]);
            }
            case c: {
                return this.a("options.spanish", new Object[0]);
            }
            case d: {
                return this.a("options.portuguese", new Object[0]);
            }
        }
        return "";
    }
}

