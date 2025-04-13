/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

/*
 * Renamed from cdp
 */
public class cdp_1 {
    static final byte a = 6;
    static final byte b = 2;
    static final int c = 3;
    static final int d = 9;
    private final TByteObjectHashMap<cdq_1> e = new TByteObjectHashMap();

    public cdp_1(short s2, short s3) {
        aoc_0 aoc_02 = (aoc_0)aew_0.a().d(s2, s3);
        long l = aoc_02 != null ? aoc_02.l() : 0L;
        long l2 = aoc_02 != null ? aoc_02.m() : 0L;
        long l3 = aoc_02 != null ? aoc_02.n() : 0L;
        long l4 = aoc_02 != null ? aoc_02.o() : 0L;
        this.e.put(cdu_1.a.a(), (Object)new cdq_1(l));
        this.e.put(cdu_1.b.a(), (Object)new cdq_1(l2));
        this.e.put(cdu_1.c.a(), (Object)new cdq_1(l3));
        this.e.put(cdu_1.d.a(), (Object)new cdq_1(l4));
    }

    public byte a(byte by, int n, int n2) {
        cdq_1 cdq_12 = (cdq_1)this.e.get(by);
        if (cdq_12 == null) {
            return 0;
        }
        return cdq_12.a(n, n2);
    }

    public byte b(byte by, int n, int n2) {
        cdq_1 cdq_12 = (cdq_1)this.e.get(by);
        if (cdq_12 == null) {
            return 0;
        }
        return cdq_12.b(n, n2);
    }

    public boolean c(byte by, int n, int n2) {
        cdq_1 cdq_12 = (cdq_1)this.e.get(by);
        return cdq_12 != null && cdq_12.c(n, n2);
    }

    public boolean a(byte by) {
        cdq_1 cdq_12 = (cdq_1)this.e.get(by);
        return cdq_12 != null && cdq_12.a();
    }

    static int g(int n) {
        return n / 9;
    }

    static int h(int n) {
        return n * 2 / 6;
    }

    static int a(int n, int n2, int n3) {
        return n2 + n3 * n;
    }

    public static int a(int n) {
        return (int)Math.floor((double)n / 3.0);
    }

    public static int b(int n) {
        return (int)Math.floor((double)n / 9.0);
    }

    public static int c(int n) {
        return (int)(((double)n + 0.5) * 3.0);
    }

    public static int d(int n) {
        return (int)(((double)n + 0.5) * 9.0);
    }

    public static short e(int n) {
        return (short)Math.floor((double)n / 6.0);
    }

    public static short f(int n) {
        return (short)Math.floor((double)n / 2.0);
    }
}

