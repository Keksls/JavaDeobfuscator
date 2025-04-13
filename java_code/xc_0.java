/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from XC
 */
public final class xc_0 {
    protected static final Logger a = Logger.getLogger(xc_0.class);

    public static int a(int n) {
        if (n <= 0) {
            a.error((Object)("DiceRoll.roll appel\u00e9 avec une valeur de d\u00e9 de " + n + "\n" + aho_2.a(new RuntimeException("StackTrace de DiceRoll"))));
            return 1;
        }
        return Hx.d().nextInt(n) + 1;
    }

    public static long a(long l) {
        if (l <= 0L) {
            a.error((Object)("DiceRoll.roll appel\u00e9 avec une valeur de d\u00e9 de " + l + "\n" + aho_2.a(new RuntimeException("StackTrace de DiceRoll"))));
            return 1L;
        }
        return Hx.d().a(l) + 1L;
    }

    public static int a(int n, int n2, int n3) {
        if (n2 <= 0) {
            a.error((Object)("DiceRoll.roll appel\u00e9 avec une valeur de d\u00e9 de " + n2 + "\n" + aho_2.a(new RuntimeException("StackTrace de DiceRoll"))));
            return 1;
        }
        int n4 = n3 + n;
        if (n2 > 0 && n > 0) {
            for (int k = n; k > 0; --k) {
                n4 += Hx.d().nextInt(n2);
            }
        }
        return n4;
    }

    public static int a(int n, int n2) {
        assert (n > 0);
        assert (n2 >= n);
        int n3 = n;
        if (n > 0 && n2 > 0 && n2 - n > 0) {
            n3 = n + Hx.d().nextInt(n2 - n + 1);
        }
        return n3;
    }
}

