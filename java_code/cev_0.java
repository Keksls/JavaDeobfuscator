/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEV
 */
public enum cev_0 {
    a(0, "D\u00e9but de la pluie", 0),
    b(1, "Fin de la pluie", 0),
    c(2, "D\u00e9but de la neige", 0),
    d(3, "Fin de la neige", 0),
    e(4, "Eclair", 1),
    f(5, "Chaos-Debut", 2),
    g(6, "Chaos-Fin", 2);

    private final String h;
    private final byte i;
    private final byte j;

    public static cev_0 a(byte by) {
        for (cev_0 cev_02 : cev_0.values()) {
            if (cev_02.i != by) continue;
            return cev_02;
        }
        return null;
    }

    private cev_0(byte by, String string2, byte by2) {
        this.h = string2;
        this.i = by;
        this.j = by2;
    }

    public String a() {
        return this.h;
    }

    public byte b() {
        return this.i;
    }

    public byte c() {
        return this.j;
    }

    public String toString() {
        return this.h;
    }
}

