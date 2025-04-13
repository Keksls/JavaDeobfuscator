/*
 * Decompiled with CFR 0.152.
 */
public enum Xd {
    a,
    b;


    public final byte a() {
        return (byte)this.ordinal();
    }

    public static Xd a(byte by) {
        if (by < 0) {
            return a;
        }
        Xd[] xdArray = Xd.values();
        if (by >= xdArray.length) {
            return a;
        }
        return xdArray[by];
    }

    public static Xd a(long l) {
        byte by = (byte)(l >>> 56);
        return Xd.a(by);
    }

    public static Xd a(String string) {
        if (string == null) {
            return a;
        }
        return Xd.valueOf(string.toUpperCase());
    }
}

