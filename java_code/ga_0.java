/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Ordering
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from Ga
 */
public class ga_0 {
    private final TShortObjectHashMap<gc_0> a = new TShortObjectHashMap();
    private final TIntObjectHashMap<gc_0> b = new TIntObjectHashMap();
    private int c = -1;
    private gc_0[] d;

    @NotNull
    private static Function<gc_0, Integer> d() {
        return new gb_0();
    }

    public int a() {
        return this.c;
    }

    public List<gc_0> b() {
        return Collections.unmodifiableList(Arrays.asList(this.d));
    }

    public void a(gc_0 ... gc_0Array) {
        for (gc_0 gc_02 : gc_0Array) {
            if (gc_02 == null) continue;
            this.a.put(gc_02.a(), (Object)gc_02);
            this.b.put(gc_02.c(), (Object)gc_02);
        }
        this.d = (gc_0[])gc_0Array.clone();
        this.c = gc_0Array.length == 0 ? -1 : ((gc_0)Ordering.natural().onResultOf(ga_0.d()).nullsFirst().max(Arrays.asList(this.d))).g();
    }

    @Nullable
    public gc_0 a(int n) {
        return (gc_0)this.b.get(n);
    }

    @Nullable
    public gc_0 a(short s2) {
        return (gc_0)this.a.get(s2);
    }

    public void c() {
        this.c = -1;
        this.d = null;
        this.a.clear();
        this.b.clear();
    }
}

