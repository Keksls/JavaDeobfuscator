/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from bxA
 */
public class bxa_1 {
    private static final bxa_1 a = new bxa_1();
    private final Map<Integer, bxz_2> b = new HashMap<Integer, bxz_2>();

    public static bxa_1 a() {
        return a;
    }

    public void a(bxz_2 bxz_22) {
        this.b.put(bxz_22.a(), bxz_22);
    }

    public bxz_2 a(Integer n) {
        return this.b.getOrDefault(n, bxz_2.a);
    }
}

