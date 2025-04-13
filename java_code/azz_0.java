/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aZZ
 */
abstract class azz_0
extends Enum<azz_0> {
    public static final /* enum */ azz_0 a = new baa();
    public static final /* enum */ azz_0 b = new bab();
    private static final /* synthetic */ azz_0[] c;

    public static azz_0[] values() {
        return (azz_0[])c.clone();
    }

    public static azz_0 valueOf(String string) {
        return Enum.valueOf(azz_0.class, string);
    }

    abstract String a();

    static {
        c = new azz_0[]{a, b};
    }
}

