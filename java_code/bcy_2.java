/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCy
 */
abstract class bcy_2
extends Enum<bcy_2> {
    public static final /* enum */ bcy_2 a = new bcz_1();
    public static final /* enum */ bcy_2 b = new bca_2();
    private static final /* synthetic */ bcy_2[] c;

    public static bcy_2[] values() {
        return (bcy_2[])c.clone();
    }

    public static bcy_2 valueOf(String string) {
        return Enum.valueOf(bcy_2.class, string);
    }

    static boolean a(long l, bos_2 bos_22) {
        long l2 = cci_2.a.b(bos_22.d());
        return l == l2;
    }

    public abstract boolean a(bcx_2 var1, TF var2);

    static {
        c = new bcy_2[]{a, b};
    }
}

