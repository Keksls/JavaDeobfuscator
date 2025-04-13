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
import java.util.Iterator;
import org.jetbrains.annotations.Nullable;

public class eCV {
    private final int a;
    private final int b;
    private final float c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final TIntObjectHashMap<eCQ> g = new TIntObjectHashMap();
    private TIntObjectHashMap<ArrayList<eCQ>> h = null;

    public eCV(int n, int n2, float f2, boolean bl, boolean bl2, boolean bl3) {
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
        return this.d || this.e();
    }

    public boolean e() {
        return this.e;
    }

    public eCQ a(int n) {
        return (eCQ)this.g.get(n);
    }

    public TIntObjectIterator<eCQ> f() {
        return this.g.iterator();
    }

    @Nullable
    public Iterator<eCQ> b(int n) {
        ArrayList arrayList = (ArrayList)this.h.get(n);
        return arrayList != null ? arrayList.iterator() : null;
    }

    public boolean c(int n) {
        return this.h.get(n) != null;
    }

    public int g() {
        return this.g.size();
    }

    public boolean h() {
        return this.f;
    }

    public void a(TIntObjectHashMap<ArrayList<eCQ>> tIntObjectHashMap) {
        this.h = tIntObjectHashMap;
    }

    public void a(int n, eCQ eCQ2) {
        this.g.put(n, (Object)eCQ2);
    }
}

