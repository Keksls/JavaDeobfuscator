/*
 * Decompiled with CFR 0.152.
 */
public class bNS
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "iconUrl";
    public static final String d = "extendedMinTemperature";
    public static final String e = "extendedMaxTemperature";
    public static final String f = "idealMinTemperature";
    public static final String g = "idealMaxTemperature";
    public static final String h = "idealRainIconUrl";
    private final bNI i;
    private final int j;

    public bNS(bNI bNI2, int n) {
        this.i = bNI2;
        this.j = n;
    }

    public bNI a() {
        return this.i;
    }

    public int b() {
        return this.j;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.i.c();
        }
        if (string.equals(b)) {
            return azs_0.a().f(this.i.g());
        }
        if (string.equals(d)) {
            return this.i.p() + "\u00b0";
        }
        if (string.equals(e)) {
            return this.i.q() + "\u00b0";
        }
        if (string.equals(f)) {
            return this.i.n() + "\u00b0";
        }
        if (string.equals(g)) {
            return this.i.o() + "\u00b0";
        }
        if (string.equals(h)) {
            fjr_0 fjr_02 = fjr_0.a(this.i.m());
            return brg_0.a(fjr_02);
        }
        return null;
    }
}

