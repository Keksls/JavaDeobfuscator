/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from ezi
 */
public final class ezi_2 {
    public static final ezi_2 a = new ezi_2();
    private final Map<Integer, ezw_2> b = new HashMap<Integer, ezw_2>();
    private final Map<Integer, Integer> c = new HashMap<Integer, Integer>();
    private final Map<Integer, List<Integer>> d = new HashMap<Integer, List<Integer>>();
    private final Map<Short, Set<Integer>> e = new HashMap<Short, Set<Integer>>();
    private final Map<Short, ezj_2> f = new HashMap<Short, ezj_2>();

    public ezi_2() {
        for (short s2 = 1; s2 <= 245; s2 = (short)(s2 + 1)) {
            this.e.put(s2, new HashSet());
            this.f.put(s2, new ezj_2());
        }
    }

    public void a(ezw_2 ezw_22) {
        int n = ezw_22.a();
        this.b.put(n, ezw_22);
        this.d.put(n, new ArrayList());
        Set set = ezw_22.b();
        for (ezv_2 ezv_22 : set) {
            if (ezv_22 == null) continue;
            this.c.put(ezv_22.b(), n);
            this.d.get(n).add(ezv_22.b());
        }
        for (short s2 = 1; s2 <= 245; s2 = (short)(s2 + 1)) {
            if (!ezw_22.a(s2)) continue;
            this.e.get(s2).add(n);
            for (short s3 = s2; s3 <= 245; s3 = (short)(s3 + 1)) {
                this.f.get(s3).a(n, (short)1);
            }
        }
    }

    public @Unmodifiable Set<Integer> a() {
        return Collections.unmodifiableSet(this.b.keySet());
    }

    public boolean a(int n) {
        return this.c.containsKey(n);
    }

    public int b(int n) {
        return this.c.get(n);
    }

    public ezw_2 c(int n) {
        return this.b.get(n);
    }

    public @Unmodifiable Set<Integer> a(short s2) {
        return Collections.unmodifiableSet(this.e.get(s2));
    }

    public ezj_2 b(short s2) {
        return this.f.get(s2);
    }

    public @Unmodifiable List<Integer> d(int n) {
        return Collections.unmodifiableList(this.d.get(n));
    }

    public void a(Consumer<ezw_2> consumer) {
        this.b.values().forEach(consumer);
    }
}

