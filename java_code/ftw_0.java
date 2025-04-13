/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ftw
 */
public abstract class ftw_0
extends Enum<ftw_0> {
    public static final /* enum */ ftw_0 a = new ftx(fqy_0.a);
    public static final /* enum */ ftw_0 b = new fty_0(fqy_0.b);
    public static final /* enum */ ftw_0 c = new ftz(fqy_0.c);
    public static final /* enum */ ftw_0 d = new ftA(fqy_0.d);
    public static final /* enum */ ftw_0 e = new ftB(fqy_0.e);
    public static final /* enum */ ftw_0 f = new ftc_0(fqy_0.f);
    public final fqy_0 g;
    private static final /* synthetic */ ftw_0[] h;

    public static ftw_0[] values() {
        return (ftw_0[])h.clone();
    }

    public static ftw_0 valueOf(String string) {
        return Enum.valueOf(ftw_0.class, string);
    }

    ftw_0(fqy_0 fqy_02) {
        this.g = fqy_02;
    }

    public abstract fwk_0 a();

    public static ftw_0 a(String string) {
        ftw_0[] ftw_0Array;
        for (ftw_0 ftw_02 : ftw_0Array = ftw_0.values()) {
            if (!ftw_02.name().equals(string.toUpperCase())) continue;
            return ftw_02;
        }
        return ftw_0Array[0];
    }

    static {
        h = new ftw_0[]{a, b, c, d, e, f};
    }
}

