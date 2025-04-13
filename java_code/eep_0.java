/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/*
 * Renamed from eEP
 */
public class eep_0 {
    private final HashMap<Integer, Integer> a = new HashMap();

    public void a(int n, int n2) {
        this.a.put(n, n2);
    }

    public int a(int n) {
        return Optional.ofNullable(this.a.get(n)).orElse(0);
    }

    public Set<Map.Entry<Integer, Integer>> a() {
        return this.a.entrySet();
    }

    public boolean b(int n) {
        return this.a.containsKey(n);
    }
}

