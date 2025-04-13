/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.VisibleForTesting
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public final class faH {
    public static final List<Integer> a = Collections.nCopies(4, faL.a.a());
    public static final List<Integer> b = Collections.nCopies(4, faL.g.a());
    private static final Map<Integer, Set<Integer>> c = Map.of(faL.a.a(), Set.of(Integer.valueOf(faL.a.a())), faL.b.a(), Set.of(Integer.valueOf(faL.b.a()), Integer.valueOf(faL.e.a())), faL.c.a(), Set.of(Integer.valueOf(faL.c.a()), Integer.valueOf(faL.e.a())), faL.d.a(), Set.of(Integer.valueOf(faL.d.a()), Integer.valueOf(faL.e.a())), faL.e.a(), Set.of(Integer.valueOf(faL.e.a())), faL.f.a(), Set.of(Integer.valueOf(faL.b.a()), Integer.valueOf(faL.c.a()), Integer.valueOf(faL.d.a()), Integer.valueOf(faL.e.a())), faL.g.a(), Set.of(Integer.valueOf(faL.a.a()), Integer.valueOf(faL.b.a()), Integer.valueOf(faL.c.a()), Integer.valueOf(faL.d.a()), Integer.valueOf(faL.e.a())));
    private static final Map<Integer, Set<Integer>> d = Map.of(faL.a.a(), Set.of(Integer.valueOf(faL.a.a()), Integer.valueOf(faL.g.a())), faL.b.a(), Set.of(Integer.valueOf(faL.b.a()), Integer.valueOf(faL.f.a()), Integer.valueOf(faL.g.a())), faL.c.a(), Set.of(Integer.valueOf(faL.c.a()), Integer.valueOf(faL.f.a()), Integer.valueOf(faL.g.a())), faL.d.a(), Set.of(Integer.valueOf(faL.d.a()), Integer.valueOf(faL.f.a()), Integer.valueOf(faL.g.a())), faL.e.a(), Set.of(Integer.valueOf(faL.e.a()), Integer.valueOf(faL.f.a()), Integer.valueOf(faL.g.a())), faL.f.a(), Set.of(Integer.valueOf(faL.b.a()), Integer.valueOf(faL.c.a()), Integer.valueOf(faL.d.a()), Integer.valueOf(faL.e.a()), Integer.valueOf(faL.f.a()), Integer.valueOf(faL.g.a())), faL.g.a(), Set.of(Integer.valueOf(faL.a.a()), Integer.valueOf(faL.b.a()), Integer.valueOf(faL.c.a()), Integer.valueOf(faL.d.a()), Integer.valueOf(faL.e.a()), Integer.valueOf(faL.f.a()), Integer.valueOf(faL.g.a())));
    private static final int[] e;
    private static final int[] f;
    private static final Comparator<Integer> g;
    private static final Comparator<Integer> h;
    private static final Map<List<Integer>, Set<List<Integer>>> i;
    private static final Map<List<Integer>, Set<List<Integer>>> j;
    private static final Map<List<Integer>, Set<List<Integer>>> k;
    private static final Map<List<Integer>, Set<List<Integer>>> l;

    private faH() {
    }

    public static Set<List<Integer>> a(List<Integer> list, boolean bl) {
        if (bl) {
            return i.get(list);
        }
        return j.get(list);
    }

    public static Set<List<Integer>> b(List<Integer> list, boolean bl) {
        if (bl) {
            return k.get(list);
        }
        return l.get(list);
    }

    public static boolean a(List<Integer> list, List<Integer> list2, boolean bl) {
        if (bl) {
            return faH.a(list2, list);
        }
        return faH.c(list2, list);
    }

    public static void a() {
        i.clear();
        j.clear();
        k.clear();
        l.clear();
        List<List<Integer>> list = faH.c();
        List<List<Integer>> list2 = faH.b();
        for (List<Integer> list3 : list2) {
            HashSet<List<Integer>> hashSet = new HashSet<List<Integer>>();
            HashSet<List<Integer>> hashSet2 = new HashSet<List<Integer>>();
            for (List<Integer> list4 : list) {
                if (faH.a(list4, list3)) {
                    hashSet.add(list4);
                }
                if (!faH.c(list4, list3)) continue;
                hashSet2.add(list4);
            }
            i.put(list3, hashSet);
            j.put(list3, hashSet2);
            hashSet = new HashSet();
            hashSet2 = new HashSet();
            for (List<Integer> list4 : list2) {
                if (faH.b(list4, list3)) {
                    hashSet.add(list4);
                }
                if (!faH.d(list4, list3)) continue;
                hashSet2.add(list4);
            }
            k.put(list3, hashSet);
            l.put(list3, hashSet2);
        }
    }

    @VisibleForTesting
    public static List<List<Integer>> b() {
        return faH.a(faL.i);
    }

    @VisibleForTesting
    public static List<List<Integer>> c() {
        return faH.a(tc_0.values().length);
    }

    private static List<List<Integer>> a(int n) {
        int n3 = Hw.e(n, 3);
        int n4 = Hw.e(n, 4);
        return IntStream.concat(IntStream.of(0), IntStream.range(n3, n4)).boxed().map(n2 -> faH.a((int)n2, n)).filter(Objects::nonNull).collect(Collectors.toList());
    }

    @VisibleForTesting
    @Nullable
    public static List<Integer> a(int n, int n2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int k = 0; k < 4; ++k) {
            if (k > 0 && ((Integer)arrayList.get(0)).intValue() != faL.a.a() && n % n2 == faL.a.a()) {
                return null;
            }
            arrayList.add(0, n % n2);
            n /= n2;
        }
        return arrayList;
    }

    public static boolean a(List<Integer> list, List<Integer> list2) {
        return faH.a(list, list2, c);
    }

    public static boolean b(List<Integer> list, List<Integer> list2) {
        return faH.a(list, list2, d);
    }

    private static boolean a(List<Integer> list, List<Integer> list2, Map<Integer, Set<Integer>> map) {
        List<Integer> list3 = faH.a(list2);
        if (list3.isEmpty()) {
            return true;
        }
        for (int k = 0; k <= 4 - list3.size(); ++k) {
            if (!faH.a(list, list3, k, map)) continue;
            return true;
        }
        return false;
    }

    @NotNull
    private static List<Integer> a(List<Integer> list) {
        int n = 3;
        int n2 = -1;
        for (int k = 0; k < 4; ++k) {
            if (list.get(k).intValue() == faL.g.a()) continue;
            n = k;
            if (n2 != -1) continue;
            n2 = k;
        }
        if (n2 == -1) {
            return List.of();
        }
        return list.subList(n2, n + 1);
    }

    private static boolean a(List<Integer> list, List<Integer> list2, int n, Map<Integer, Set<Integer>> map) {
        for (int k = 0; k < list2.size(); ++k) {
            if (map.get(list2.get(k)).contains(list.get(n + k))) continue;
            return false;
        }
        return true;
    }

    public static boolean c(List<Integer> list, List<Integer> list2) {
        return faH.a(list, list2, c, g);
    }

    public static boolean d(List<Integer> list, List<Integer> list2) {
        return faH.a(list, list2, d, h);
    }

    private static boolean a(List<Integer> list, List<Integer> list2, Map<Integer, Set<Integer>> map, Comparator<Integer> comparator) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(list);
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(list2);
        for (int k = arrayList2.size() - 1; k >= 0; --k) {
            if (!arrayList.remove(arrayList2.get(k))) continue;
            arrayList2.remove(k);
        }
        arrayList.sort(comparator);
        arrayList2.sort(comparator);
        for (int n : arrayList2) {
            boolean bl = false;
            for (int k = 0; k < arrayList.size(); ++k) {
                Integer n2 = arrayList.get(k);
                if (!map.get(n).contains(n2)) continue;
                arrayList.remove(n2);
                bl = true;
                break;
            }
            if (bl) continue;
            return false;
        }
        return true;
    }

    public static List<Integer> a(eZw eZw2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(a);
        if (eZw2.c() != null) {
            eZw2.c().forEach((by, eze_02) -> arrayList.set(by.byteValue(), Integer.valueOf(eze_02.c().a())));
        }
        return arrayList;
    }

    static {
        faL[] faLArray = faL.values();
        e = new int[faLArray.length];
        f = new int[faLArray.length];
        for (faL faL2 : faLArray) {
            faH.e[faL2.a()] = c.get(faL2.a()).size();
            faH.f[faL2.a()] = d.get(faL2.a()).size();
        }
        g = Comparator.comparingInt(n -> e[n]);
        h = Comparator.comparingInt(n -> f[n]);
        i = new HashMap<List<Integer>, Set<List<Integer>>>();
        j = new HashMap<List<Integer>, Set<List<Integer>>>();
        k = new HashMap<List<Integer>, Set<List<Integer>>>();
        l = new HashMap<List<Integer>, Set<List<Integer>>>();
    }
}

