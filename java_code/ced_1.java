/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cED
 */
public enum ced_1 {
    a(0, "Ev\u00e8nement m\u00e9t\u00e9o", new cee_1()),
    b(1, "Id de famille", new cef_1()),
    c(2, "Ev\u00e8nement g\u00e9ographique", new ceg_1()),
    d(3, "Marqueur Audio", new ceh_1()),
    e(4, "Temps", new cei_0());

    private final cek_0 f;
    private final byte g;
    private final String h;

    private ced_1(byte by, String string2, cek_0 cek_02) {
        this.f = cek_02;
        this.h = string2;
        this.g = by;
    }

    public static ced_1 a(byte by) {
        for (ced_1 ced_12 : ced_1.values()) {
            if (ced_12.a() != by) continue;
            return ced_12;
        }
        return null;
    }

    public byte a() {
        return this.g;
    }

    public String b() {
        return this.h;
    }

    public cej_0 c() {
        return this.f.a();
    }

    public String toString() {
        return this.h;
    }
}

