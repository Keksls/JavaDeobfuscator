/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from brJ
 */
public class brj_1 {
    public static final brj_1 a = new brj_1();
    private final Map<Integer, Map<Integer, Set<Integer>>> b = new HashMap<Integer, Map<Integer, Set<Integer>>>();

    private brj_1() {
    }

    public void a(int n, int n2, int n3, boolean bl) {
        this.b.putIfAbsent(n, new HashMap());
        Map<Integer, Set<Integer>> map = this.b.get(n);
        map.putIfAbsent(n2, new HashSet());
        if (bl) {
            map.get(n2).add(n3);
        }
    }

    @NotNull
    public Set<Integer> a(int n, ece_0 ece_02) {
        Map<Integer, Set<Integer>> map = this.b.get(n);
        if (map == null) {
            return Collections.emptySet();
        }
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
            int n3 = entry.getKey();
            Set<Integer> set = entry.getValue();
            if (set == null || set.isEmpty()) {
                hashSet.add(n3);
                break;
            }
            if (!set.stream().anyMatch(n2 -> ece_02.d(n3, (int)n2))) continue;
            hashSet.add(n3);
            break;
        }
        return hashSet;
    }
}

