/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azn
 */
public abstract class azn_1
extends Enum<azn_1> {
    public static final /* enum */ azn_1 a = new azo_2();
    public static final /* enum */ azn_1 b = new azp_2();
    private static final /* synthetic */ azn_1[] c;

    public static azn_1[] values() {
        return (azn_1[])c.clone();
    }

    public static azn_1 valueOf(String string) {
        return Enum.valueOf(azn_1.class, string);
    }

    abstract int[] a();

    static {
        c = new azn_1[]{a, b};
    }
}

