/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bvv
 */
public class bvv_1
implements ajh_1 {
    public static final String a = "description";
    public static final String b = "value";
    private final int d;

    public bvv_1(int n) {
        this.d = n;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a("realMonth." + this.d, new Object[0]);
        }
        if (string.equals(b)) {
            return this.d;
        }
        return null;
    }

    public int a() {
        return this.d;
    }

    @Override
    public String[] d() {
        return new String[0];
    }
}

