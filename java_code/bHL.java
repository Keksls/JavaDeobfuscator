/*
 * Decompiled with CFR 0.152.
 */
public enum bHL implements aqk_2
{
    a(0, "Utilisation sur le lanceur uniquement"),
    b(1, "Utilisable sur une cellule du monde (port\u00e9e infinie)"),
    c(2, "Utilisable sur une cellule du monde (avec port\u00e9e min max)");

    public final byte d;
    private final String e;

    private bHL(byte by, String string2) {
        this.d = by;
        this.e = string2;
    }

    @Override
    public String d() {
        return Integer.toString(this.d);
    }

    @Override
    public String e() {
        return this.e;
    }

    @Override
    public String f() {
        return this.e;
    }

    public static bHL a(byte by) {
        for (bHL bHL2 : bHL.values()) {
            if (bHL2.d != by) continue;
            return bHL2;
        }
        return null;
    }
}

