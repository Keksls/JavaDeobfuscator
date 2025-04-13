/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortLongIterator
 *  gnu.trove.map.hash.TShortLongHashMap
 */
import gnu.trove.iterator.TShortLongIterator;
import gnu.trove.map.hash.TShortLongHashMap;

public class eDh {
    public static final int a = 50;
    public static final int b = 5;
    public static final int c = 10;
    public static final int d = 5;
    public static final int e = 2;
    public static final int f = 20;
    public static final int g = 30;
    public static final int h = 3;
    public static final int i = 2;
    public static final int j = 20;
    public static final int k = 1;
    public static final int l = 200;
    private static final TShortLongHashMap m = new TShortLongHashMap();

    private static void a() {
        for (short s2 = 1; s2 <= 200; s2 = (short)(s2 + 1)) {
            m.put(s2, eDh.d(s2));
        }
    }

    public static long a(int n) {
        return (long)Math.floor(10.0 * Math.pow(2.0, (float)n / 20.0f));
    }

    public static long b(int n) {
        long l = 0L;
        for (int k = n - n % 50; k <= n; k += 5) {
            if (k % 50 == 0) {
                l += eDh.a(k) * 5L * 2L;
                continue;
            }
            l += eDh.a(k) * 5L;
        }
        return l;
    }

    public static float c(int n) {
        long l = 0L;
        long l2 = 0L;
        int n2 = (int)Math.floor(1 + n % 50 / 5);
        for (int k = n - n % 50; k <= n; k += 5) {
            l2 += eDh.b(k);
        }
        l = (long)((float)l2 / (float)n2 * 60.0f / 30.0f);
        return l;
    }

    public static long d(int n) {
        return (long)((double)(eDh.c(n) * 3.0f) * Math.pow(2.0, (float)n / 20.0f));
    }

    public static short a(long l) {
        short s2 = 0;
        TShortLongIterator tShortLongIterator = m.iterator();
        while (tShortLongIterator.hasNext()) {
            tShortLongIterator.advance();
            s2 = tShortLongIterator.key();
            if (l >= tShortLongIterator.value()) continue;
            break;
        }
        return s2;
    }

    public static void a(String[] stringArray) {
        int n;
        Object object = "";
        for (n = 1; n <= 200; ++n) {
            if (n % 5 != 0) continue;
            object = (String)object + " ||| Recipe level " + n + " xp=" + eDh.b(n);
            if (n % 10 != 0) continue;
            object = (String)object + "\n";
        }
        for (n = 1; n <= 200; ++n) {
            object = (String)object + " ||| Craft level " + n + " xp=" + eDh.d(n);
            if (n % 5 != 0) continue;
            object = (String)object + "\n";
        }
        System.out.println((String)object);
    }

    static {
        eDh.a();
    }
}

