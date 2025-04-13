/*
 * Decompiled with CFR 0.152.
 */
public enum eox implements aqk_2
{
    a(0, "Par co\u00fbt"),
    b(1, "Selon l'ordre d'AGT");

    private final byte c;
    private final String d;

    private eox(byte by, String string2) {
        this.c = by;
        this.d = string2;
    }

    @Override
    public String d() {
        return String.valueOf(this.c);
    }

    @Override
    public String e() {
        return this.d;
    }

    @Override
    public String f() {
        return null;
    }

    public static eox a(byte by) {
        for (eox eox2 : eox.values()) {
            if (eox2.c != by) continue;
            return eox2;
        }
        return null;
    }
}

