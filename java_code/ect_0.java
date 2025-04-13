/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eCt
 */
public class ect_0 {
    private final int a;
    private final int b;
    private final float c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final TIntObjectHashMap<eco_0> g = new TIntObjectHashMap();
    private TIntObjectHashMap<ArrayList<eco_0>> h = null;
    private TIntObjectHashMap<ArrayList<eco_0>> i = null;
    private Map<Integer, Integer> j = null;
    private Map<Integer, Integer> k = null;

    public ect_0(int n, int n2, float f2, boolean bl, boolean bl2, boolean bl3) {
        this.a = n;
        this.b = n2;
        this.c = f2;
        this.d = bl;
        this.e = bl2;
        this.f = bl3;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public float c() {
        return this.c;
    }

    public boolean d() {
        return this.d || this.e;
    }

    public boolean e() {
        return this.e;
    }

    public eco_0 a(int n) {
        return (eco_0)this.g.get(n);
    }

    public TIntObjectIterator<eco_0> f() {
        return this.g.iterator();
    }

    public Map<Integer, Integer> g() {
        if (this.j == null) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(this.j);
    }

    public Map<Integer, Integer> h() {
        if (this.k == null) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(this.k);
    }

    @Nullable
    public Iterator<eco_0> b(int n) {
        ArrayList arrayList = (ArrayList)this.h.get(n);
        return arrayList != null ? arrayList.iterator() : null;
    }

    @Nullable
    public Iterator<eco_0> c(int n) {
        ArrayList arrayList = (ArrayList)this.i.get(n);
        return arrayList != null ? arrayList.iterator() : null;
    }

    public boolean d(int n) {
        return this.h.get(n) != null;
    }

    public int i() {
        return this.g.size();
    }

    public boolean j() {
        return this.f;
    }

    public void a(TIntObjectHashMap<ArrayList<eco_0>> tIntObjectHashMap) {
        this.h = tIntObjectHashMap;
    }

    public void b(TIntObjectHashMap<ArrayList<eco_0>> tIntObjectHashMap) {
        this.i = tIntObjectHashMap;
    }

    public void a(Map<Integer, Integer> map) {
        this.j = map;
    }

    public void a(int n, eco_0 eco_02) {
        this.g.put(n, (Object)eco_02);
    }

    public Collection<eco_0> k() {
        return this.g.valueCollection();
    }

    public void b(Map<Integer, Integer> map) {
        this.k = map;
    }
}

