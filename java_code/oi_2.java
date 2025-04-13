/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Oi
 */
public abstract class oi_2
extends Enum<oi_2> {
    public static final /* enum */ oi_2 a = new oj_2(0);
    public static final /* enum */ oi_2 b = new ok_2(1);
    public static final /* enum */ oi_2 c = new ol_2(2);
    public static final /* enum */ oi_2 d = new om_2(3);
    public static final /* enum */ oi_2 e = new on_2(4);
    public static final /* enum */ oi_2 f = new oo_2(5);
    private final int g;
    private static final /* synthetic */ oi_2[] h;

    public static oi_2[] values() {
        return (oi_2[])h.clone();
    }

    public static oi_2 valueOf(String string) {
        return Enum.valueOf(oi_2.class, string);
    }

    oi_2(int n2) {
        this.g = n2;
    }

    public int a() {
        return this.g;
    }

    public boolean b() {
        return true;
    }

    public static oi_2 a(int n) {
        for (oi_2 oi_22 : oi_2.values()) {
            if (oi_22.g != n) continue;
            return oi_22;
        }
        return null;
    }

    public abstract nz_1 a(long var1, long var3, byte[] var5, long var6, int var8);

    public abstract boolean c();

    static {
        h = new oi_2[]{a, b, c, d, e, f};
    }
}

