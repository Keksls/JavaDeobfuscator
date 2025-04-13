/*
 * Decompiled with CFR 0.152.
 */
public final class eFm {
    public static long a(int n, short s2) {
        return (n << 16) + (s2 & 0xFF);
    }

    public static int a(long l) {
        return (int)(l >> 16);
    }

    public static short b(long l) {
        return (short)(l & 0xFFL);
    }
}

