/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxQ
 */
public abstract class bxq_1
extends Enum<bxq_1> {
    public static final /* enum */ bxq_1 a = new bxr_1();
    public static final /* enum */ bxq_1 b = new bxs_1();
    private static final /* synthetic */ bxq_1[] c;

    public static bxq_1[] values() {
        return (bxq_1[])c.clone();
    }

    public static bxq_1 valueOf(String string) {
        return Enum.valueOf(bxq_1.class, string);
    }

    public abstract void a(azj_2 var1, bxo_1 var2);

    static {
        c = new bxq_1[]{a, b};
    }
}

