/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from Or
 */
public class or_2 {
    private final oq_2 a;
    private final Map<oi_2, Map<op_2, Integer>> b = new HashMap<oi_2, Map<op_2, Integer>>();
    private final Set<nm_1> c = new HashSet<nm_1>();
    private final Map<oi_2, Long> d = new HashMap<oi_2, Long>();

    public or_2(long l, long l2, byte[] byArray, long l3) {
        this.a = new oq_2(l, l2, byArray, l3);
        for (oi_2 oi_22 : oi_2.values()) {
            this.b.put(oi_22, new HashMap());
            this.d.put(oi_22, System.currentTimeMillis());
            for (op_2 op_22 : op_2.values()) {
                this.b.get((Object)oi_22).put(op_22, 0);
            }
        }
    }

    public oq_2 a() {
        return this.a;
    }

    public int a(oi_2 oi_22, op_2 op_22) {
        return this.b.get((Object)oi_22).get((Object)op_22);
    }

    public void a(nz_1 nz_12) {
        oi_2 oi_22 = nz_12.f();
        for (Map.Entry<op_2, Integer> entry : this.b.get((Object)oi_22).entrySet()) {
            this.b.get((Object)oi_22).put(entry.getKey(), entry.getValue() + 1);
            if (entry.getKey() != op_2.b || this.d.get((Object)oi_22) >= System.currentTimeMillis() - TimeUnit.HOURS.toMillis(1L)) continue;
            this.d.put(oi_22, System.currentTimeMillis());
            this.b.get((Object)oi_22).put(op_2.b, 1);
        }
    }

    public void a(nm_1 nm_12) {
        oi_2 oi_22 = nm_12.a();
        op_2 op_22 = nm_12.b();
        this.b.get((Object)oi_22).put(op_22, 0);
        if (op_22 == op_2.b) {
            this.d.put(oi_22, System.currentTimeMillis());
        }
    }

    public boolean b(nm_1 nm_12) {
        return this.c.contains((Object)nm_12);
    }

    public void c(nm_1 nm_12) {
        this.c.add(nm_12);
    }

    public boolean equals(Object object) {
        if (!(object instanceof or_2)) {
            return false;
        }
        return ((or_2)object).a.a() == this.a.a();
    }
}

