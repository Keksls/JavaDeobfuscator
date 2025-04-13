/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJO
 */
public class bjo_1 {
    private static final bjo_1 a = new bjo_1();
    private final Map<Integer, long[]> b = new HashMap<Integer, long[]>();

    public static bjo_1 a() {
        return a;
    }

    private bjo_1() {
    }

    public void a(Map<Integer, long[]> map) {
        this.b.putAll(map);
    }

    @Nullable
    public Long a(int n) {
        return this.a(n, 0);
    }

    public long a(bjw_1 bjw_12, long l) {
        Long l2 = this.a(bjw_12.n(), 0);
        return l2 != null && l2 > 0L ? l2 : l;
    }

    @Nullable
    public Long a(exk_2 exk_22) {
        return this.a(exk_22.aT_(), exk_22.A());
    }

    public long a(exk_2 exk_22, long l) {
        Long l2 = this.a(exk_22.aT_(), exk_22.A());
        return l2 != null && l2 > 0L ? l2 : l;
    }

    @Nullable
    public Long a(int n, int n2) {
        long[] lArray = this.b.get(n);
        if (lArray == null || n2 >= lArray.length) {
            return null;
        }
        return lArray[n2];
    }

    public void b() {
        this.b.clear();
    }

    public void c() {
        if (this.b.isEmpty()) {
            this.d();
            ado_1.a().a(this::d, faE.x, 1);
        }
    }

    private void d() {
        if (this.b.isEmpty()) {
            azu_0.j().K().c(new cAW());
        }
    }
}

