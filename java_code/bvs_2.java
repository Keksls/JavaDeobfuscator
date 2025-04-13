/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.set.hash.TLongHashSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from bvs
 */
public class bvs_2
implements eLm<eLo> {
    protected static final Logger a = Logger.getLogger(bvs_2.class);
    private static final bvs_2 c = new bvs_2();
    private final LinkedList<eLo> d = new LinkedList();
    private final TByteObjectHashMap<TLongHashSet> e = new TByteObjectHashMap();
    private final HashMap<Long, eLo> f = new HashMap();
    private final TLongObjectHashMap<TLongHashSet> g = new TLongObjectHashMap();

    public static bvs_2 a() {
        return c;
    }

    @Override
    public void a(eLo eLo2) {
        this.f(eLo2);
        this.d.addFirst(eLo2);
        this.f.put(eLo2.i(), eLo2);
        this.i(eLo2);
    }

    public void b(eLo eLo2) {
        if (eLo2 == null) {
            return;
        }
        eLo eLo3 = this.f.get(eLo2.i());
        this.h(eLo3);
        this.g(eLo3);
        this.i(eLo2);
        this.f(eLo2);
        this.f.put(eLo2.i(), eLo2);
    }

    private void f(eLo eLo2) {
        long l = eLo2.a().g();
        TLongHashSet tLongHashSet = (TLongHashSet)this.g.get(l);
        if (tLongHashSet == null) {
            tLongHashSet = new TLongHashSet();
            this.g.put(l, (Object)tLongHashSet);
        }
        tLongHashSet.add(eLo2.i());
    }

    @Override
    public void c(eLo eLo2) {
        this.g(eLo2);
        this.d.remove(eLo2);
        this.h(eLo2);
        this.f.remove(eLo2.i());
    }

    private boolean g(eLo eLo2) {
        long l = eLo2.a().g();
        TLongHashSet tLongHashSet = (TLongHashSet)this.g.get(l);
        if (tLongHashSet == null) {
            return true;
        }
        tLongHashSet.remove(eLo2.i());
        if (tLongHashSet.isEmpty()) {
            this.g.remove(l);
        }
        return false;
    }

    @Override
    public Set<eLo> b() {
        return new HashSet<eLo>(this.f.values());
    }

    @Override
    public boolean c() {
        return this.g.isEmpty() && this.f.isEmpty() && this.e.isEmpty() && this.d.isEmpty();
    }

    @Override
    public boolean d(eLo eLo2) {
        if (this.c()) {
            return false;
        }
        Collection<eLo> collection = this.f.values();
        int n = eLo2.s();
        for (eLo eLo3 : collection) {
            if (eLo3.s() != n) continue;
            return true;
        }
        return false;
    }

    @Override
    public void d() {
        this.f.clear();
        this.d.clear();
        this.e.clear();
        this.g.clear();
    }

    private void h(eLo eLo2) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.e.get(eLo2.e());
        if (tLongHashSet == null) {
            return;
        }
        tLongHashSet.remove(eLo2.i());
        if (tLongHashSet.isEmpty()) {
            this.e.remove(eLo2.e());
        }
    }

    private void i(eLo eLo2) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.e.get(eLo2.e());
        if (tLongHashSet == null) {
            tLongHashSet = new TLongHashSet();
            this.e.put(eLo2.e(), (Object)tLongHashSet);
        }
        tLongHashSet.add(eLo2.i());
    }

    public void e() {
        TLongHashSet tLongHashSet;
        eLo eLo2 = this.d.removeFirst();
        if (eLo2 != null && (tLongHashSet = (TLongHashSet)this.e.get(eLo2.e())) != null) {
            tLongHashSet.remove(eLo2.i());
        }
        this.f.remove(eLo2.i());
        this.c(eLo2);
    }

    public void f() {
        this.d.clear();
    }

    public eLo a(long l) {
        return this.f.get(l);
    }

    public TLongHashSet a(byte by) {
        return (TLongHashSet)this.e.get(by);
    }

    @Override
    public Set<eLo> a(wu_0 wu_02) {
        long l = wu_02.g();
        TLongHashSet tLongHashSet = (TLongHashSet)this.g.get(l);
        if (tLongHashSet == null || tLongHashSet.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet<eLo> hashSet = new HashSet<eLo>();
        for (long l2 : tLongHashSet) {
            assert (this.f.get(l2) != null) : "Liste des eventsById foireuse";
            hashSet.add(this.f.get(l2));
        }
        return hashSet;
    }

    public void b(long l) {
        for (eLo eLo2 : this.d) {
            if ((long)eLo2.s() != l) continue;
            this.d.remove(eLo2);
            return;
        }
    }

    public void e(eLo eLo2) {
        this.d.remove(eLo2);
    }

    public eLo c(long l) {
        Set<eLo> set = this.b();
        for (eLo eLo2 : set) {
            if ((long)eLo2.s() != l) continue;
            return eLo2;
        }
        return null;
    }

    public void g() {
        a.info((Object)this.toString());
    }

    public void b(byte by) {
        TLongHashSet tLongHashSet = this.a(by);
        long[] lArray = tLongHashSet.toArray();
        for (int k = 0; k < lArray.length; ++k) {
            long l = lArray[k];
            this.c(this.a(l));
        }
    }

    public void a(eLo eLo2, long l) {
        long l2 = eLo2.a().g();
        TLongHashSet tLongHashSet = (TLongHashSet)this.g.get(l2);
        if (tLongHashSet == null) {
            tLongHashSet = new TLongHashSet();
            this.g.put(l2, (Object)tLongHashSet);
        } else {
            tLongHashSet.remove(eLo2.i());
        }
        TLongHashSet tLongHashSet2 = (TLongHashSet)this.e.get(eLo2.e());
        if (tLongHashSet2 == null) {
            tLongHashSet2 = new TLongHashSet();
            this.e.put(eLo2.e(), (Object)tLongHashSet2);
        } else {
            tLongHashSet2.remove(eLo2.i());
        }
        this.f.remove(eLo2.i());
        eLo2.a(l);
        tLongHashSet.add(l);
        tLongHashSet2.add(l);
        this.f.put(l, eLo2);
    }

    @Override
    public int h() {
        return this.f.size();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CharacterEventsCalendar{\n");
        long[] lArray = this.g.keys();
        Arrays.sort(lArray);
        for (int k = 0; k < lArray.length; ++k) {
            long l = lArray[k];
            TLongHashSet tLongHashSet = (TLongHashSet)this.g.get(l);
            for (long l2 : tLongHashSet) {
                stringBuilder.append(this.f.get(l2));
                stringBuilder.append("\n");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void a(long l, wu_0 wu_02) {
        eLo eLo2 = this.f.get(l);
        this.g(eLo2);
        eLo2.a(wu_02);
        this.f(eLo2);
    }
}

