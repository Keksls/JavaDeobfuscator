/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from eUB
 */
public final class eub_1 {
    private eub_1() {
    }

    public static short a(int n, int n2) {
        short s2 = eub_1.a(n2);
        Optional<abe_2> optional = eua_1.a.a(n, s2);
        return optional.map(abe_22 -> (short)abe_22.b()).orElse((short)0);
    }

    public static Optional<Integer> b(int n, int n2) {
        short s2 = eub_1.a(n2);
        Optional<abe_2> optional = eua_1.a.a(n, s2);
        return optional.map(abe_2::a);
    }

    private static short a(int n) {
        if (n < 1) {
            return 1;
        }
        if (n < 60) {
            return 2;
        }
        return 3;
    }
}

