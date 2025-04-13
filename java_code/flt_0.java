/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from flt
 */
public enum flt_0 {
    a(0, "normal"),
    b(1, "hidden");

    private final int c;
    private final String d;

    private flt_0(int n2, String string2) {
        this.c = n2;
        this.d = string2;
    }

    public int a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    public static flt_0 a(int n) {
        for (flt_0 flt_02 : flt_0.values()) {
            if (n != flt_02.c) continue;
            return flt_02;
        }
        return null;
    }
}

