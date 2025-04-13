/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aLF
 */
public abstract class alf_1 {
    private static alf_1 a;

    protected alf_1() {
    }

    public static alf_1 b() {
        return a;
    }

    public static void a(alf_1 alf_12) {
        a = alf_12;
    }

    public abstract boolean a(long var1, long var3);

    public abstract void a(int var1, long var2, long var4, long var6);

    public abstract void a(int var1, boolean var2);

    public abstract boolean a(int var1, int var2, int var3, int var4);
}

