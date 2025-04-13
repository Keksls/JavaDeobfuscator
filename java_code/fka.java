/*
 * Decompiled with CFR 0.152.
 */
public enum fka {
    a(1),
    b(2),
    c(4);

    public static final fka d;
    private final byte e;

    private fka(byte by) {
        this.e = by;
    }

    public static fka a(String string) {
        if (string.equals("Zone libre")) {
            return a;
        }
        if (string.equals("Zone limit\u00e9e")) {
            return b;
        }
        if (string.equals("Zone bloqu\u00e9e")) {
            return c;
        }
        return d;
    }

    public static fka a(byte by) {
        for (fka fka2 : fka.values()) {
            if (fka2.e != by) continue;
            return fka2;
        }
        return d;
    }

    public byte a() {
        return this.e;
    }

    static {
        d = a;
    }
}

