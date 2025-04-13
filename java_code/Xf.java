/*
 * Decompiled with CFR 0.152.
 */
public final class Xf {
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    public static final byte e = 4;
    public static final byte f = 6;
    public static final byte g = 7;
    public static final byte h = 8;

    private Xf() {
    }

    public static String a(byte by) {
        switch (by) {
            case 0: {
                return "Proxy";
            }
            case 1: {
                return "Connection";
            }
            case 2: {
                return "World";
            }
            case 3: {
                return "Game";
            }
            case 4: {
                return "Chat";
            }
            case 6: {
                return "Global";
            }
            case 7: {
                return "Craft";
            }
            case 8: {
                return "Dispatch";
            }
        }
        return null;
    }
}

