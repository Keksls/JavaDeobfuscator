/*
 * Decompiled with CFR 0.152.
 */
public enum bRw {
    a(1),
    b(2),
    c(3),
    d(4),
    e(5),
    f(6);

    private final byte g;
    private static final int h = 3;

    private bRw(byte by) {
        this.g = by;
    }

    public byte a() {
        return this.g;
    }

    public static bRw a(byte by) {
        for (bRw bRw2 : bRw.values()) {
            if (bRw2.g != by) continue;
            return bRw2;
        }
        return null;
    }

    public static bRw a(int n) {
        bRw[] bRwArray = bRw.values();
        if (bRwArray.length < n || n >= 3) {
            return null;
        }
        return bRwArray[n];
    }

    public static bRw b(int n) {
        int n2;
        bRw[] bRwArray = bRw.values();
        if (bRwArray.length < (n2 = n + 3) || n2 < 3) {
            return null;
        }
        return bRwArray[n2];
    }

    public boolean b() {
        return this.ordinal() < 3;
    }
}

