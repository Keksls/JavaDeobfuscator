/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from cbp
 */
public class cbp_1 {
    public static final cbp_1 a = new cbp_1();
    private final Map<Integer, cbo_1> b = new HashMap<Integer, cbo_1>();

    protected cbp_1() {
    }

    public void a(cbo_1 cbo_12) {
        this.b.put(cbo_12.a(), cbo_12);
    }

    public cbo_1 a(int n) {
        return this.b.get(n);
    }
}

