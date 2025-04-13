/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/*
 * Renamed from eCn
 */
public class ecn_0 {
    public static final ecn_0 a = new ecn_0();
    private final Map<Integer, ebs_0> b = new HashMap<Integer, ebs_0>();
    private final Map<Integer, ect_0> c = new HashMap<Integer, ect_0>();

    public void a(ect_0 ect_02) {
        int n = ect_02.a();
        this.c.put(n, ect_02);
        if (ect_02.e()) {
            this.b.put(n, new ebs_0());
        }
    }

    public ect_0 a(int n) {
        return this.c.get(n);
    }

    public Collection<ect_0> a() {
        return this.c.values();
    }

    public ebs_0 b(int n) {
        return this.b.get(n);
    }

    public void a(Consumer<ect_0> consumer) {
        this.c.values().forEach(ect_02 -> {
            if (!ect_02.d()) {
                return;
            }
            consumer.accept((ect_0)ect_02);
        });
    }

    public void b(Consumer<ect_0> consumer) {
        this.c.values().forEach(consumer);
    }

    public boolean a(int ... nArray) {
        for (ect_0 ect_02 : this.c.values()) {
            for (int n : nArray) {
                if (!ect_02.d(n)) continue;
                return true;
            }
        }
        return false;
    }

    public boolean a(int n, int n2) {
        if (n == n2) {
            return true;
        }
        for (ect_0 ect_02 : this.c.values()) {
            int n3;
            Map<Integer, Integer> map = ect_02.g();
            if (!map.containsKey(n) || !this.a(n3 = map.get(n).intValue(), n2)) continue;
            return true;
        }
        return false;
    }
}

