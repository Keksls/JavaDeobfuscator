/*
 * Decompiled with CFR 0.152.
 */
public enum bWd implements ajh_1
{
    a(0),
    b(1),
    d(2),
    e(3);

    private static final String f = "name";
    private final byte g;

    private bWd(byte by) {
        this.g = by;
    }

    public byte a() {
        return this.g;
    }

    public static bWd a(byte by) {
        for (bWd bWd2 : bWd.values()) {
            if (bWd2.g != by) continue;
            return bWd2;
        }
        return null;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(f)) {
            return bae.h().a("options.graphicalPresetsLevel." + this.g, new Object[0]);
        }
        return null;
    }
}

