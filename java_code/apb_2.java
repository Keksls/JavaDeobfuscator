/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apb
 */
public abstract class apb_2
extends aoq_1 {
    public static final int a = 18;
    public static final int b = 10;
    private static final long c = 262143L;
    private static final long d = 1023L;
    private static final long e = 131071L;
    private static final long f = 511L;

    public static long a(int n, int n2, short s2) {
        long l = (long)n + 131071L & 0x3FFFFL;
        long l2 = (long)n2 + 131071L & 0x3FFFFL;
        long l3 = (long)s2 + 511L & 0x3FFL;
        if (Math.abs(n) <= 131072 - (n < 0 ? 1 : 0) && Math.abs(n2) <= 131072 - (n2 < 0 ? 1 : 0) && Math.abs(s2) <= 512 - (s2 < 0 ? 1 : 0)) {
            return l << 28 | l2 << 10 | l3;
        }
        throw new aob_1("Param\u00e8tres d'une position en dehors de la map - position : " + n + ", " + n2 + ", " + s2);
    }

    public static long a(aff_1 aff_12) {
        return apb_2.a(aff_12.d(), aff_12.e(), aff_12.f());
    }

    public static aff_1 a(long l) {
        short s2 = (short)((l & 0x3FFL) - 511L);
        int n = (int)((l >> 10 & 0x3FFFFL) - 131071L);
        int n2 = (int)((l >> 28 & 0x3FFFFL) - 131071L);
        return new aff_1(n2, n, s2);
    }

    public static int b(long l) {
        return (int)((l >> 28 & 0x3FFFFL) - 131071L);
    }

    public static int c(long l) {
        return (int)((l >> 10 & 0x3FFFFL) - 131071L);
    }

    public static short d(long l) {
        return (short)((l & 0x3FFL) - 511L);
    }

    @Override
    public aov_1 t_() {
        return aov_1.f;
    }

    @Override
    public abstract boolean b();

    @Override
    public void s_() {
    }

    @Override
    public boolean a() {
        return false;
    }
}

