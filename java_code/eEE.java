/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public final class eEE {
    public static final int a = 27083;

    private eEE() {
    }

    public static int a(int n, int n2) {
        if (n2 >= 13) {
            return 0;
        }
        int n3 = n2 < 1 ? 10 : (n2 < 7 ? 6 : 3);
        return (int)eZq.a((short)n, exw_1.e) * n3;
    }

    public static int a(int n, short s2) {
        return eED.a.a(n, s2).map(Cm::b).orElse(0);
    }

    public static Optional<Integer> b(int n, short s2) {
        return eED.a.a(n, s2).map(Cm::a);
    }
}

