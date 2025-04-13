/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.THashSet
 */
import gnu.trove.set.hash.THashSet;
import java.util.Collection;

/*
 * Renamed from XS
 */
public class xs_0 {
    private final int a;
    private final String b;
    private final THashSet<xr_0> c;
    private final xq_0 d;
    private final boolean e;

    public xs_0(int n, String string, xr_0 xr_02, xq_0 xq_02, boolean bl) {
        this.a = n;
        this.b = string;
        this.c = new THashSet();
        this.c.add((Object)xr_02);
        this.d = xq_02;
        this.e = bl;
    }

    public xs_0(int n, String string, Collection<xr_0> collection, xq_0 xq_02, boolean bl) {
        this.a = n;
        this.b = string;
        this.c = new THashSet();
        this.c.addAll(collection);
        this.d = xq_02;
        this.e = bl;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean a(xr_0 xr_02) {
        return this.c.contains((Object)xr_02);
    }

    public xq_0 c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }
}

