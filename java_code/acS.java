/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.Arrays;
import java.util.Comparator;
import org.apache.log4j.Logger;

public class acS<T> {
    private static final Logger b = Logger.getLogger(acS.class);
    public static final Comparator<acu_0> a = new act_0();
    private final float c = 0.5f;
    private final TLongObjectHashMap<acu_0> d;
    private final acu_0[] e;

    public acS(int n) {
        this.d = new TLongObjectHashMap(n, 1.0f);
        this.e = new acu_0[n];
    }

    T a(int n, int n2, int n3) {
        long l = Hw.c(Hw.d(n, n2), n3);
        acu_0 acu_02 = (acu_0)this.d.get(l);
        if (acu_02 != null) {
            acu_02.c = this.b();
            return acu_02.b;
        }
        return null;
    }

    private long b() {
        return 0L;
    }

    void a(int n, int n2, int n3, T t) {
        acu_0<T> acu_02;
        this.c();
        long l = Hw.c(Hw.d(n, n2), n3);
        this.e[this.d.size()] = acu_02 = new acu_0<T>(l, t);
        this.d.put(l, acu_02);
        acu_02.c = this.b();
    }

    private void c() {
        int n = this.e.length;
        if (this.d.size() > n - 1) {
            Arrays.sort(this.e, a);
            for (int k = Hw.c((float)n * 0.5f); k < n; ++k) {
                this.d.remove(this.e[k].a);
                this.e[k] = null;
            }
        }
    }

    void a() {
        this.d.clear();
        Arrays.fill(this.e, null);
    }
}

