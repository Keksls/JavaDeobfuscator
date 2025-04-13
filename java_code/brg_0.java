/*
 * Decompiled with CFR 0.152.
 */
import java.text.DateFormat;
import java.util.Locale;

/*
 * Renamed from bRG
 */
public class brg_0
implements ajh_1 {
    public static final String a = "iconUrl";
    public static final String b = "dayDescription";
    public static final String d = "actualMinTemperature";
    public static final String e = "actualMaxTemperature";
    public static final String f = "minTemperature";
    public static final String g = "maxTemperature";
    public static final String h = "minTemperatureWithMods";
    public static final String i = "maxTemperatureWithMods";
    public static final String j = "currentTemperature";
    public static final String k = "seasonDescription";
    public static final String l = "windForceIconUrl";
    public static final String m = "windStrength";
    public static final String n = "windStrengthDescription";
    private wy_0 o = wy_0.b;
    private brf_0 p = new brf_0();
    private int q;

    public brf_0 a() {
        return this.p;
    }

    public void a(wy_0 wy_02) {
        this.o = wy_02;
    }

    public wy_0 b() {
        return this.o;
    }

    public void a(int n) {
        this.q = n;
    }

    public void a(brf_0 brf_02) {
        this.p = brf_02;
        fis_1.a().a((ajf_1)this, j, d, e, f, g, h, i, a, b, m, n, l, k);
    }

    @Override
    public String[] d() {
        return null;
    }

    public static String a(fjr_0 fjr_02) {
        return azs_0.a().a("weatherIconsPath", "defaultIconPath", fjr_02.name().toLowerCase());
    }

    @Override
    public Object b(String string) {
        if (this.p == null) {
            return null;
        }
        if (string.equals(a)) {
            return brg_0.a(this.p.i());
        }
        if (string.equals(b)) {
            long l = wc_0.p().a().h();
            long l2 = wb_0.d.h();
            long l3 = l / l2;
            wt_0 wt_02 = wt_0.b(l3 * l2);
            wt_02.a(ww_0.b((long)this.q * l2));
            Locale locale = bae.h().f().a();
            DateFormat dateFormat = DateFormat.getTimeInstance(3, locale);
            dateFormat.setTimeZone(wt_0.a);
            return dateFormat.format(wt_02.i());
        }
        if (string.equals(d)) {
            String string2 = String.format("%.0f", Float.valueOf(this.p.d()));
            return bae.h().a("weather.info.minTemperature", string2);
        }
        if (string.equals(e)) {
            String string3 = String.format("%.0f", Float.valueOf(this.p.e()));
            return bae.h().a("weather.info.maxTemperature", string3);
        }
        if (string.equals(f)) {
            String string4 = String.format("%.0f", Float.valueOf(this.p.b()));
            return bae.h().a("weather.info.minTemperature", string4);
        }
        if (string.equals(g)) {
            String string5 = String.format("%.0f", Float.valueOf(this.p.c()));
            return bae.h().a("weather.info.maxTemperature", string5);
        }
        if (string.equals(h)) {
            String string6 = String.format("%.0f", Float.valueOf(Math.min(this.p.e(), Math.max(this.p.b() + this.p.f(), this.p.d()))));
            return string6 + "\u00b0";
        }
        if (string.equals(i)) {
            String string7 = String.format("%.0f", Float.valueOf(Math.max(this.p.d(), Math.min(this.p.c() + this.p.f(), this.p.e()))));
            return string7 + "\u00b0";
        }
        if (string.equals(j)) {
            String string8 = String.format("%.0f", Float.valueOf(this.p.a()));
            return string8 + "\u00b0";
        }
        if (string.equals(m)) {
            return Float.valueOf(this.p.g());
        }
        if (string.equals(n)) {
            int n = (int)(this.p.g() * 100.0f);
            return bae.h().a("weather.info.windForceValue", n);
        }
        if (string.equals(k)) {
            wy_0 wy_02 = wy_0.a(wc_0.p().a());
            return bae.h().a("season." + wy_02.name().toLowerCase(), new Object[0]);
        }
        if (string.equals(l)) {
            return this.p.j().a();
        }
        return null;
    }
}

