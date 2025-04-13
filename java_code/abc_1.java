/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBc
 */
public final class abc_1 {
    public static final abc_1 a = new abc_1("RAW");
    public static final abc_1 b = new abc_1("TGA");
    public static final abc_1 c = new abc_1("TGAM");
    public static final abc_1 d = new abc_1("PNG");
    public static final abc_1 e = new abc_1("BMP");
    public static final abc_1 f = new abc_1("JPG");
    private final int g;

    public abc_1(int n) {
        this.g = n;
    }

    public abc_1(String string) {
        this.g = abc_1.a(string);
    }

    public static int a(String string) {
        byte[] byArray = string.getBytes();
        int n = 0;
        if (byArray.length == 0) {
            return n;
        }
        if (byArray.length >= 1) {
            n |= aba_1.a(byArray[0]);
        }
        if (byArray.length >= 2) {
            n |= aba_1.a(byArray[1]) << 8;
        }
        if (byArray.length >= 3) {
            n |= aba_1.a(byArray[2]) << 16;
        }
        if (byArray.length >= 4) {
            n |= aba_1.a(byArray[3]) << 24;
        }
        return n;
    }

    public static String a(int n) {
        byte[] byArray = new byte[4];
        byArray[3] = (byte)(n >> 24);
        byArray[2] = (byte)(n >> 16 & 0xFF);
        byArray[1] = (byte)(n >> 8 & 0xFF);
        byArray[0] = (byte)(n & 0xFF);
        return new String(byArray);
    }

    public String toString() {
        return abc_1.a(this.g);
    }

    public int a() {
        return this.g;
    }
}

