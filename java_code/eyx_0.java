/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from eYX
 */
public class eyx_0 {
    public static final eyx_0 a = new eyx_0();
    private final Map<Long, eyv_0> b = new HashMap<Long, eyv_0>();

    public void a(long l, eyv_0 eyv_02) {
        this.b.put(l, eyv_02);
    }

    public boolean a(long l) {
        return this.b.containsKey(l);
    }

    public eyv_0 b(long l) {
        return this.b.get(l);
    }

    public void c(long l) {
        this.b.remove(l);
    }

    public eyt_0 a(long l, long l2) {
        eyv_0 eyv_02 = this.b.get(l);
        if (eyv_02 == null) {
            return null;
        }
        return eyv_02.a(l2);
    }

    public final Map<Long, eyv_0> a() {
        return this.b;
    }
}

