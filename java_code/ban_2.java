/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Renamed from bAn
 */
public class ban_2 {
    public static final ban_2 a = new ban_2();
    private final HashMap<Integer, bao_2> b = new HashMap();
    private final HashMap<Integer, Integer> c = new HashMap();
    private final Map<Long, Integer> d = new HashMap<Long, Integer>();

    private ban_2() {
    }

    public void a(int n, bao_2 bao_22) {
        this.b.put(n, bao_22);
    }

    public void a(int n, int n2, long[] lArray) {
        this.c.put(n2, n);
        for (long l : lArray) {
            this.d.put(l, n2);
        }
    }

    public Optional<bao_2> a(int n) {
        return Optional.ofNullable(this.b.get(n));
    }

    public int a(long l) {
        if (!this.d.containsKey(l)) {
            return 0;
        }
        return this.d.get(l);
    }

    public Optional<bao_2> b(int n) {
        if (!this.c.containsKey(n)) {
            return Optional.empty();
        }
        int n2 = this.c.get(n);
        return Optional.ofNullable(this.b.get(n2));
    }

    public Optional<bao_2> c(int n) {
        for (bao_2 bao_22 : this.b.values()) {
            if (n != bao_22.c()) continue;
            return Optional.of(bao_22);
        }
        return Optional.empty();
    }

    public Map<Integer, bao_2> a() {
        return this.c.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> this.b.get(entry.getValue())));
    }
}

