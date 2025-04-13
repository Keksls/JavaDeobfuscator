/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.TIntObjectMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.ImmutableSet;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from fbc
 */
public class fbc_0 {
    public static final fbc_0 a = new fbc_0();
    private static final Logger c = Logger.getLogger(fbc_0.class);
    private final TIntObjectHashMap<faX> d = new TIntObjectHashMap();
    private final ArrayList<fbf_0> e = new ArrayList();
    public static final int b = 1;

    private fbc_0() {
    }

    public void a(fbf_0 fbf_02) {
        if (this.e.contains(fbf_02)) {
            return;
        }
        this.e.add(fbf_02);
        TIntObjectIterator<faX> tIntObjectIterator = this.a();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            faX faX2 = (faX)tIntObjectIterator.value();
            fbf_02.a(faX2);
        }
    }

    private void b(faX faX2) {
        for (int k = 0; k < this.e.size(); ++k) {
            this.e.get(k).a(faX2);
        }
    }

    public boolean a(faX faX2) {
        int n = faX2.c();
        faX faX3 = (faX)this.d.get(n);
        if (faX3 != null && faX2.c() == 0) {
            c.info((Object)"[NATION] Overriding VOID_NATION with loaded data");
            faX3.a(faX2.n(), faX2.o(), faX2.p(), faX2.q());
            faX3.a(faX2.T(), faX2.U(), faX2.V());
            return true;
        }
        if (faX3 != null && faX3 != faX2) {
            c.error((Object)("[NATION] Overriding an unauthorized nation for id " + n));
            return false;
        }
        this.d.put(n, (Object)faX2);
        this.b(faX2);
        return true;
    }

    public faX a(int n) {
        return (faX)this.d.get(n);
    }

    public TIntObjectIterator<faX> a() {
        return this.d.iterator();
    }

    public TIntObjectIterator<faX> a(Integer ... integerArray) {
        return new fbd_0((TIntObjectMap<faX>)this.d, (Collection<Integer>)ImmutableSet.builder().add((Object[])integerArray).add((Object)0).build());
    }

    public int[] b() {
        return this.d.keys();
    }

    public int a(long l) {
        TIntObjectIterator<faX> tIntObjectIterator = this.a(new Integer[0]);
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            faX faX2 = (faX)tIntObjectIterator.value();
            if (faX2.i(l) == null) continue;
            return faX2.c();
        }
        return 0;
    }
}

