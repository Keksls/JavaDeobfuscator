/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cen
 */
public enum cen_2 {
    a(0),
    b(30),
    c(31),
    d(32),
    e(33);

    private final int f;

    private cen_2(int n2) {
        this.f = n2;
    }

    public int a() {
        return this.f;
    }

    public String b() {
        return bae.h().a(39, (long)this.f, new Object[0]);
    }

    public static cen_2 a(int n) {
        for (cen_2 cen_22 : cen_2.values()) {
            if (n != cen_22.f) continue;
            return cen_22;
        }
        return a;
    }

    public static cen_2 a(String string) {
        for (cen_2 cen_22 : cen_2.values()) {
            if (!string.equals(cen_22.b())) continue;
            return cen_22;
        }
        return a;
    }
}

