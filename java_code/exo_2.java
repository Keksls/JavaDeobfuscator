/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eXo
 */
public class exo_2<R extends ezr_0>
implements Iterable<R> {
    private static final Logger a = Logger.getLogger(exo_2.class);
    private final short b;
    private final int d;
    protected final List<R> c;
    protected final TIntObjectHashMap<exz_2> q = new TIntObjectHashMap(1);

    public exo_2(short s2, int n, List<R> list) {
        this.b = s2;
        this.d = n;
        this.c = list;
    }

    public exo_2(short s2, int n) {
        this.b = s2;
        this.d = n;
        this.c = new ArrayList<R>();
    }

    public short h() {
        return this.b;
    }

    @Override
    @NotNull
    public Iterator<R> iterator() {
        return this.c.iterator();
    }

    protected List<R> i() {
        return this.c;
    }

    public void a(R r2) {
        if (r2 == null) {
            a.warn((Object)("ajout d'un item null dans le set " + this.h()));
            return;
        }
        this.c.add(r2);
    }

    public void a(Collection<R> collection) {
        this.c.addAll(collection);
    }

    public void a(int n, efh_0 efh_02) {
        exz_2 exz_22 = (exz_2)this.q.get(n);
        if (exz_22 == null) {
            exz_22 = new exz_2((short)n, this.b);
            this.q.put(n, (Object)exz_22);
        }
        exz_22.a(efh_02);
    }

    public exz_2 a(int n, boolean bl) {
        if (n == 0) {
            return null;
        }
        exz_2 exz_22 = (exz_2)this.q.get(n);
        if (exz_22 != null) {
            return exz_22;
        }
        if (bl) {
            return this.a(--n, bl);
        }
        return null;
    }

    public ArrayList<efh_0> b(int n) {
        exz_2 exz_22 = this.a(n, false);
        if (exz_22 == null) {
            return null;
        }
        ArrayList<efh_0> arrayList = new ArrayList<efh_0>(0);
        for (efh_0 efh_02 : exz_22) {
            arrayList.add(efh_02);
        }
        return arrayList;
    }

    public exz_2 c(int n) {
        return this.a(n, true);
    }

    public ArrayList<exz_2> d(int n) {
        ArrayList<exz_2> arrayList = new ArrayList<exz_2>();
        for (int k = 1; k <= n; ++k) {
            exz_2 exz_22 = this.a(k, false);
            if (exz_22 == null) continue;
            arrayList.add(exz_22);
        }
        return arrayList;
    }

    public int e(int n) {
        if (n == 0) {
            return 0;
        }
        exz_2 exz_22 = (exz_2)this.q.get(n);
        if (exz_22 == null) {
            return this.e(--n);
        }
        return exz_22.g();
    }

    public int f() {
        return this.c.size();
    }

    public int j() {
        return this.d;
    }

    public final int[] k() {
        int[] nArray = new int[this.c.size()];
        for (int k = 0; k < this.c.size(); ++k) {
            nArray[k] = ((ezr_0)this.c.get(k)).n();
        }
        return nArray;
    }
}

