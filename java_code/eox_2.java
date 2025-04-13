/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.set.hash.TIntHashSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from eOx
 */
public class eox_2 {
    private static final Logger b = Logger.getLogger(eox_2.class);
    public static final eox_2 a = new eox_2();
    private final TIntIntHashMap c = new TIntIntHashMap();
    private final Map<eoy_2, TIntHashSet> d = new HashMap<eoy_2, TIntHashSet>();
    private final TIntIntHashMap e = new TIntIntHashMap();
    private final TIntObjectHashMap<efh_0> f = new TIntObjectHashMap();
    private final HashSet<efh_0> g = new HashSet();

    private eox_2() {
    }

    public void a(eoy_2 eoy_22, int n) {
        TIntHashSet tIntHashSet = this.d.get(eoy_22);
        if (tIntHashSet == null) {
            tIntHashSet = new TIntHashSet();
            this.d.put(eoy_22, tIntHashSet);
        }
        tIntHashSet.add(n);
    }

    public boolean b(eoy_2 eoy_22, int n) {
        TIntHashSet tIntHashSet = this.d.get(eoy_22);
        if (tIntHashSet == null) {
            return false;
        }
        return tIntHashSet.contains(n);
    }

    public void a(int n, int n2) {
        if (this.c.put(n, n2) != 0) {
            b.error((Object)("Ajout multiple du gfx de buff de v\u00e9locit\u00e9 " + n), (Throwable)new UnsupportedOperationException());
        }
    }

    public int a(int n) {
        return this.c.get(n);
    }

    public void a(efh_0 efh_02, int n) {
        this.f.put(efh_02.i(), (Object)efh_02);
        this.e.put(n, efh_02.i());
    }

    public List<efh_0> a() {
        Object[] objectArray = new efh_0[this.f.size()];
        this.f.values(objectArray);
        return Arrays.asList(objectArray);
    }

    public efh_0 b(int n) {
        return (efh_0)this.f.get(n);
    }

    public efh_0 c(int n) {
        return (efh_0)this.f.get(this.e.get(n));
    }

    public static efi_0 a(long l, efh_0 efh_02) {
        return new eov_2(l, efh_02);
    }

    public void a(efh_0 efh_02) {
        this.g.add(efh_02);
    }

    public HashSet<efh_0> b() {
        return this.g;
    }
}

