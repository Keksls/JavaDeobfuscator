/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from eUL
 */
public final class eul_1 {
    public static final List<aej_2> a = List.of(aej_2.b, aej_2.d);

    private eul_1() {
    }

    public static aej_2 a(aej_2 aej_22) {
        int n = aej_22.a();
        if (n < aej_2.b.a() || n >= aej_2.d.a()) {
            return aej_2.b;
        }
        return aej_2.d;
    }

    public static aej_2 b(aej_2 aej_22) {
        if (a.contains((Object)aej_22)) {
            return aej_22;
        }
        if (aej_22 == aej_2.f) {
            return aej_2.b;
        }
        return aej_2.d;
    }
}

