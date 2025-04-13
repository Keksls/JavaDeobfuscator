/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import org.apache.commons.lang3.ArrayUtils;

public abstract class amU {
    private static amU a;
    private final acg_2 b = new acg_2();
    private static final int c = 1000;
    private final long[] d = Cn.g;

    public static amU a() {
        return a;
    }

    public static void a(amU amU2) {
        a = amU2;
    }

    public boolean a(long l, long l2) {
        this.a(l);
        long l3 = ami_2.a(l2);
        if (!ArrayUtils.contains((long[])this.d, (long)l3)) {
            return true;
        }
        long l4 = this.b.e(l2);
        return 1000L <= Math.abs(l - l4);
    }

    private void a(long l) {
        if (this.b.d() > 10) {
            for (int k = this.b.d() - 1; k >= 0; --k) {
                long l2 = this.b.d(k);
                if (1000L > Math.abs(l - l2)) continue;
                this.b.c(k);
            }
        }
    }

    public void b(long l, long l2) {
        this.b.a(l2, l);
    }

    public void a(aty_1 aty_12, long l) {
        this.b(aty_12, l);
    }

    protected abstract void b(aty_1 var1, long var2);
}

