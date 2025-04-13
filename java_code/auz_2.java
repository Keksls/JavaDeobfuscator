/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from auz
 */
public abstract class auz_2
extends Enum<auz_2> {
    public static final /* enum */ auz_2 a = new aua_2();
    public static final /* enum */ auz_2 b = new aub_2();
    public static final /* enum */ auz_2 c = new auc_2();
    public static final /* enum */ auz_2 d = new aud_2();
    private static final /* synthetic */ auz_2[] e;

    public static auz_2[] values() {
        return (auz_2[])e.clone();
    }

    public static auz_2 valueOf(String string) {
        return Enum.valueOf(auz_2.class, string);
    }

    abstract void a(auxx_2 var1);

    auz_2 a() {
        auz_2[] auz_2Array;
        int n = this.ordinal();
        if (n == (auz_2Array = auz_2.values()).length - 1) {
            return auz_2Array[0];
        }
        return auz_2Array[n + 1];
    }

    static {
        e = new auz_2[]{a, b, c, d};
    }
}

