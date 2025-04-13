/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Yr
 */
public abstract class yr_0 {
    public int a;
    public int b;
    public short c;
    public byte d;
    public boolean e;

    public int a() {
        return this.c - this.d;
    }

    public boolean a(yr_0 yr_02) {
        return yr_02.a() <= this.c && yr_02.c >= this.c;
    }

    public static boolean a(yr_0 yr_02, yr_0 yr_03) {
        return yr_02.a(yr_03) || yr_03.a(yr_02);
    }

    public abstract yr_0 b(yr_0 var1);

    protected static void a(yr_0 yr_02, yr_0 yr_03, yr_0 yr_04) {
        assert (yr_02.a == yr_03.a && yr_02.b == yr_03.b);
        yr_04.a = yr_02.a;
        yr_04.b = yr_02.b;
        yr_04.c = (short)Math.max(yr_02.c, yr_03.c);
        int n = Math.min(yr_02.a(), yr_03.a());
        yr_04.d = Hw.b((long)(yr_04.c - n));
        yr_04.e = yr_02.e && yr_03.e;
    }
}

