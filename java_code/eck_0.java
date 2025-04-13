/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eCk
 */
enum eck_0 {
    a,
    b,
    c,
    d;


    public static eck_0 a(byte by) {
        if (by == 0) {
            return d;
        }
        if (by == 1) {
            return a;
        }
        if (by == 2) {
            return b;
        }
        if (by == 3) {
            return c;
        }
        return null;
    }

    public static byte a(eck_0 eck_02) {
        switch (eck_02) {
            case d: {
                return 0;
            }
            case a: {
                return 1;
            }
            case b: {
                return 2;
            }
            case c: {
                return 3;
            }
        }
        return 0;
    }
}

