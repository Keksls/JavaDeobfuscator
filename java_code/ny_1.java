/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ArrayListMultimap
 */
import com.google.common.collect.ArrayListMultimap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

/*
 * Renamed from NY
 */
public class ny_1 {
    protected static final ny_1 a = new ny_1();
    private final ArrayListMultimap<oi_2, nm_1> b = ny_1.c();
    private final Map<Long, or_2> c = new HashMap<Long, or_2>();
    private final Map<Long, Set<or_2>> d = new HashMap<Long, Set<or_2>>();
    private final Map<String, Set<or_2>> e = new HashMap<String, Set<or_2>>();

    public static ny_1 a() {
        return a;
    }

    public Optional<nm_1> a(oi_2 oi_22, op_2 op_22, og_2 og_22) {
        for (nm_1 nm_12 : this.b.get((Object)oi_22)) {
            if (nm_12.b() != op_22 || nm_12.c() != og_22) continue;
            return Optional.of(nm_12);
        }
        return Optional.empty();
    }

    public Stream<nm_1> b() {
        return this.b.values().stream();
    }

    or_2 a(long l) {
        return this.c.get(l);
    }

    Set<or_2> b(long l) {
        return this.d.get(l);
    }

    Set<or_2> a(byte[] byArray) {
        return this.e.get(new String(byArray));
    }

    private static ArrayListMultimap<oi_2, nm_1> c() {
        ArrayListMultimap arrayListMultimap = ArrayListMultimap.create();
        return arrayListMultimap;
    }

    void a(nz_1 nz_12) {
        long l = nz_12.a();
        long l2 = nz_12.b();
        byte[] byArray = nz_12.c();
        long l3 = nz_12.d();
        String string = new String(byArray);
        or_2 or_22 = new or_2(l, l2, byArray, l3);
        if (!this.c.containsKey(l) && l != -1L) {
            this.c.put(l, or_22);
        }
        if (!this.d.containsKey(l2)) {
            this.d.put(l2, new HashSet());
        }
        this.d.get(l2).add(or_22);
        if (!this.e.containsKey(string)) {
            this.e.put(string, new HashSet());
        }
        this.e.get(string).add(or_22);
        nw_2.a(this.b.get((Object)nz_12.f()), nz_12);
    }

    void c(long l) {
        Map.Entry<Object, Object> entry;
        Iterator<Map.Entry<Object, Object>> iterator = this.c.entrySet().iterator();
        while (iterator.hasNext()) {
            entry = iterator.next();
            if (entry.getValue().a().b() != l) continue;
            iterator.remove();
        }
        this.d.remove(l);
        iterator = this.e.entrySet().iterator();
        while (iterator.hasNext()) {
            entry = iterator.next();
            Iterator iterator2 = ((Set)entry.getValue()).iterator();
            while (iterator2.hasNext()) {
                or_2 or_22 = (or_2)iterator2.next();
                if (or_22.a().b() != l) continue;
                iterator2.remove();
            }
            if (!((Set)entry.getValue()).isEmpty()) continue;
            iterator.remove();
        }
    }
}

