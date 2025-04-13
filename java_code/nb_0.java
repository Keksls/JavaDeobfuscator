/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 */
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*
 * Renamed from nB
 */
public class nb_0 {
    private final List<nw_0> a = new ArrayList<nw_0>();
    private final Map<Integer, Long> b = new HashMap<Integer, Long>();
    private final Map<Integer, ns_0> c = new HashMap<Integer, ns_0>();
    private final Set<Integer> d = new HashSet<Integer>();
    private final LinkedList<Integer> e = new LinkedList();

    public List<nw_0> a() {
        return Collections.unmodifiableList(this.a);
    }

    public Map<Integer, Long> b() {
        return this.b;
    }

    public LinkedList<Integer> c() {
        return this.e;
    }

    public boolean a(int n) {
        return this.e.contains(n);
    }

    public int d() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.removeFirst();
    }

    public boolean b(int n) {
        return this.e.removeFirstOccurrence(n);
    }

    public void c(int n) {
        this.e.addLast(n);
    }

    public Long a(int n, long l) {
        return this.b.put(n, l);
    }

    public Long d(int n) {
        return this.b.get(n);
    }

    public void e(int n) {
        this.b.remove(n);
    }

    public void a(nw_0 nw_02) {
        this.a.add(nw_02);
    }

    public void a(Iterable<nw_0> iterable) {
        Iterables.addAll(this.a, iterable);
    }

    public void a(BiConsumer<Integer, ns_0> biConsumer) {
        this.c.forEach(biConsumer);
    }

    public void a(ns_0 ns_02) {
        this.c.put(ns_02.a(), ns_02);
    }

    public boolean f(int n) {
        return this.c.containsKey(n);
    }

    public ns_0 g(int n) {
        return this.c.get(n);
    }

    public void h(int n) {
        this.c.remove(n);
    }

    public int e() {
        return this.c.size();
    }

    public void a(Consumer<Integer> consumer) {
        this.d.forEach(consumer);
    }

    public void i(int n) {
        this.d.add(n);
    }

    public boolean j(int n) {
        return this.d.contains(n);
    }

    public void k(int n) {
        this.d.remove(n);
    }

    public int f() {
        return this.d.size();
    }

    public Optional<Long> g() {
        if (this.c.size() == 0) {
            return Optional.empty();
        }
        return this.c.values().stream().filter(ns_0::c).filter(ns_0::g).map(ns_0::d).sorted().findFirst();
    }

    public Optional<ns_0> h() {
        if (this.c.isEmpty()) {
            return Optional.empty();
        }
        return this.c.values().stream().filter(ns_0::c).filter(ns_0::g).min(Comparator.comparing(ns_0::d));
    }

    public Map<Integer, ns_0> i() {
        return this.c;
    }

    public String toString() {
        return "ServerAchievementData{m_history=" + this.a + ", m_variables=" + this.b + ", m_achievements=" + this.c + ", m_objectives=" + this.d + ", m_follow=" + this.e + "}";
    }
}

