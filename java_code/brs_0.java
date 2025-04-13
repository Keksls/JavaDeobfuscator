/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Renamed from brS
 */
public final class brs_0 {
    public static final brs_0 a = new brs_0();
    private static final brt_0 b = new brt_0();
    private final Map<Integer, List<eco_0>> c = new HashMap<Integer, List<eco_0>>();

    private brs_0() {
    }

    public void a(ect_0 ect_02) {
        ArrayList<eco_0> arrayList = new ArrayList<eco_0>(ect_02.k());
        arrayList.sort(b);
        this.c.put(ect_02.a(), Collections.unmodifiableList(arrayList));
    }

    public List<eco_0> a(int n) {
        return this.c.get(n);
    }

    public List<eco_0> a() {
        return this.c.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
    }

    public Optional<eco_0> b(int n) {
        return this.a().stream().filter(eco_02 -> eco_02.e() == n).findFirst();
    }
}

