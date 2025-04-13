/*
 * Decompiled with CFR 0.152.
 */
public class bac
implements cb_0 {
    public static final bac a = new bac();
    public static final byte b = 0;
    public static final byte c = 1;
    public static final byte d = 2;
    public static final byte e = 3;
    public static final byte f = 4;
    public static final byte g = 5;
    public static final byte h = 6;
    public static final byte i = 7;
    public static final byte j = 9;
    public static final byte k = 10;
    public static final byte l = 11;
    public static final byte m = 12;
    public static final byte n = 13;
    public static final byte o = 39;
    public static final byte p = 83;
    public static final byte q = 116;
    public static final short r = 138;
    public static final short s = 137;
    public static final short t = 168;

    private bac() {
    }

    @Override
    public String a(CC cC, String string, String string2, int n, int n2) {
        String string3;
        switch (cC) {
            case b: {
                string3 = bac.a(string);
                break;
            }
            default: {
                string3 = bac.a(Co.c(string));
            }
        }
        return new ani_2().a(string3, n, n2, string2).r();
    }

    public static String a(int n) {
        return String.format(azs_0.a().a("textIconsPath"), n);
    }

    public static String a(String string) {
        return String.format(azs_0.a().a("characteristicsIconsPath"), string);
    }
}

