/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/*
 * Renamed from eUM
 */
public final class eum_1 {
    public static final int a = -1;
    private final Map<Integer, Long> b = new HashMap<Integer, Long>();
    private final Map<Long, Integer> c = new HashMap<Long, Integer>();
    private final Map<Integer, List<Integer>> d = new HashMap<Integer, List<Integer>>();
    private final Map<Integer, Integer> e = new HashMap<Integer, Integer>();
    private int f;
    private int g;
    private int h;
    private static final eum_1 i = new eum_1();

    public static eum_1 a() {
        return i;
    }

    public void a(int n, long l) {
        this.b.put(n, l);
        this.c.put(l, n);
        ++this.f;
    }

    public long a(int n) {
        return this.b.get(n);
    }

    public boolean b(int n) {
        return this.b.containsKey(n);
    }

    public void a(int n2, int n3) {
        this.d.computeIfAbsent(n2, n -> new ArrayList()).add(n3);
        this.e.put(n3, n2);
        ++this.h;
    }

    public int c(int n) {
        return this.e.getOrDefault(n, -1);
    }

    public Optional<Integer> a(long l) {
        return Optional.ofNullable(this.c.get(l));
    }

    public int d(int n) {
        return Optional.ofNullable(this.d.get(n)).map(List::size).orElse(0);
    }

    public void b() {
        this.g = this.f - this.h;
    }

    public int c() {
        return this.g;
    }
}

