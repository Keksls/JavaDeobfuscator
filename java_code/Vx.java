/*
 * Decompiled with CFR 0.152.
 */
public enum Vx {
    a,
    b,
    c;


    public static Vx a(int n) {
        for (Vx vx : Vx.values()) {
            if (vx.ordinal() != n) continue;
            return vx;
        }
        return null;
    }

    public static Vx b(int n) {
        switch (n) {
            case 0: {
                return a;
            }
            case 1: {
                return b;
            }
        }
        return c;
    }
}

