/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from eUw
 */
public class euw_2 {
    private static final Logger b = Logger.getLogger(euw_2.class);
    public static final euw_2 a = new euw_2();
    private final TLongObjectHashMap<TLongHashSet> c = new TLongObjectHashMap();
    private final TLongObjectHashMap<TLongHashSet> d = new TLongObjectHashMap();
    private final TLongObjectHashMap<epq_2> e = new TLongObjectHashMap();
    private final List<eux_2> f = new ArrayList<eux_2>();

    private euw_2() {
    }

    public void a(long l, epq_2 epq_22) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.c.get(l);
        if (tLongHashSet == null) {
            tLongHashSet = new TLongHashSet();
            this.c.put(l, (Object)tLongHashSet);
        }
        tLongHashSet.add(epq_22.a_());
        this.e.put(epq_22.a_(), (Object)epq_22);
        this.e(epq_22);
    }

    public void a(long l) {
        epq_2 epq_22 = (epq_2)this.e.get(l);
        this.a(epq_22);
    }

    public void a(epq_2 epq_22) {
        if (epq_22 == null) {
            return;
        }
        this.b(epq_22.U_(), epq_22.a_());
        this.e.remove(epq_22.a_());
        if (!this.d(epq_22)) {
            return;
        }
        this.f(epq_22);
    }

    private boolean d(epq_2 epq_22) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.c.get(epq_22.U_());
        if (tLongHashSet == null) {
            return false;
        }
        tLongHashSet.remove(epq_22.a_());
        if (tLongHashSet.isEmpty()) {
            this.c.remove(epq_22.U_());
        }
        return true;
    }

    public boolean a(long l, long l2) {
        boolean bl;
        TLongHashSet tLongHashSet = (TLongHashSet)this.d.get(l);
        if (tLongHashSet == null) {
            tLongHashSet = new TLongHashSet();
            this.d.put(l, (Object)tLongHashSet);
        }
        if (bl = tLongHashSet.add(l2)) {
            this.j(l2);
        }
        return bl;
    }

    public void b(long l, long l2) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.d.get(l);
        if (tLongHashSet == null) {
            return;
        }
        boolean bl = tLongHashSet.remove(l2);
        if (bl) {
            this.k(l2);
        }
        if (tLongHashSet.isEmpty()) {
            this.d.remove(l);
        }
    }

    public void b(long l) {
        this.d.remove(l);
    }

    public TLongHashSet c(long l) {
        return (TLongHashSet)this.c.get(l);
    }

    public <T extends epq_2> boolean b(T t) {
        return this.e.containsKey(t.a_());
    }

    public <T extends epq_2> T d(long l) {
        return (T)((epq_2)this.e.get(l));
    }

    public <T extends epq_2> epq_2 c(T t) {
        return (epq_2)this.e.put(t.a_(), t);
    }

    public boolean a(TLongProcedure tLongProcedure) {
        return this.e.forEach(tLongProcedure);
    }

    public <T extends epq_2> boolean a(long l, TObjectProcedure<T> tObjectProcedure) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.c.get(l);
        if (tLongHashSet == null) {
            return true;
        }
        return this.a(tLongHashSet, tObjectProcedure);
    }

    public <T extends epq_2> boolean b(long l, TObjectProcedure<T> tObjectProcedure) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.d.get(l);
        if (tLongHashSet == null) {
            return true;
        }
        return this.a(tLongHashSet, tObjectProcedure);
    }

    private <T extends epq_2> boolean a(TLongHashSet tLongHashSet, TObjectProcedure<T> tObjectProcedure) {
        TLongIterator tLongIterator = tLongHashSet.iterator();
        while (tLongIterator.hasNext()) {
            boolean bl;
            epq_2 epq_22 = (epq_2)this.e.get(tLongIterator.next());
            if (epq_22 == null) continue;
            try {
                bl = !tObjectProcedure.execute((Object)epq_22);
            }
            catch (Exception exception) {
                b.error((Object)("Exception raised while executing procedure on heroes " + tLongHashSet + " with procedure " + tObjectProcedure), (Throwable)exception);
                return false;
            }
            if (!bl) continue;
            return false;
        }
        return true;
    }

    public TLongHashSet e(long l) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.d.get(l);
        if (tLongHashSet != null) {
            return new TLongHashSet(tLongHashSet.toArray());
        }
        return new TLongHashSet();
    }

    public TLongHashSet f(long l) {
        epq_2 epq_22 = (epq_2)this.e.get(l);
        if (epq_22 == null) {
            return new TLongHashSet();
        }
        TLongHashSet tLongHashSet = (TLongHashSet)this.d.get(epq_22.U_());
        if (tLongHashSet != null) {
            return new TLongHashSet(tLongHashSet.toArray());
        }
        return new TLongHashSet();
    }

    public <T extends epq_2> Set<T> g(long l2) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.d.get(l2);
        if (tLongHashSet != null) {
            HashSet hashSet = new HashSet();
            tLongHashSet.forEach(l -> {
                hashSet.add(this.d(l));
                return true;
            });
            return hashSet;
        }
        return new HashSet();
    }

    public <T extends epq_2> T c(long l, long l2) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.d.get(l);
        if (tLongHashSet != null && tLongHashSet.contains(l2)) {
            return this.d(l2);
        }
        return null;
    }

    public boolean d(long l, long l2) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.d.get(l);
        if (tLongHashSet == null) {
            return false;
        }
        return tLongHashSet.contains(l2);
    }

    public int h(long l) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.d.get(l);
        return tLongHashSet != null ? tLongHashSet.size() : 0;
    }

    public short i(long l) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.d.get(l);
        if (tLongHashSet == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        this.b(l, epq_22 -> {
            arrayList.add(epq_22.dr());
            return true;
        });
        short s2 = 0;
        for (Short s3 : arrayList) {
            if (s2 >= s3) continue;
            s2 = s3;
        }
        return s2;
    }

    public <T extends epq_2> void a(eux_2<T> eux_22) {
        this.f.add(eux_22);
    }

    public <T extends epq_2> void b(eux_2<T> eux_22) {
        this.f.remove(eux_22);
    }

    private void e(epq_2 epq_22) {
        ArrayList<eux_2> arrayList = new ArrayList<eux_2>(this.f);
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            try {
                ((eux_2)arrayList.get(k)).d(epq_22);
                continue;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                b.error((Object)("[Hero] No listener at index " + k + " to notify hero added: " + epq_22), (Throwable)indexOutOfBoundsException);
                continue;
            }
            catch (Exception exception) {
                b.error((Object)("[Hero] An error occurred while notifying listener " + ((eux_2)arrayList.get(k)).getClass().getSimpleName() + " of hero addition: " + epq_22), (Throwable)exception);
            }
        }
    }

    private void j(long l) {
        ArrayList<eux_2> arrayList = new ArrayList<eux_2>(this.f);
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            try {
                ((eux_2)arrayList.get(k)).c(this.d(l));
                continue;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                b.error((Object)("[Hero] No listener at index " + k + " to notify hero added to party: " + l), (Throwable)indexOutOfBoundsException);
                continue;
            }
            catch (Exception exception) {
                b.error((Object)("[Hero] An error occurred while notifying listener " + ((eux_2)arrayList.get(k)).getClass().getSimpleName() + " of hero addition to party: " + l), (Throwable)exception);
            }
        }
    }

    private void f(epq_2 epq_22) {
        ArrayList<eux_2> arrayList = new ArrayList<eux_2>(this.f);
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            try {
                ((eux_2)arrayList.get(k)).a(epq_22);
                continue;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                b.error((Object)("[Hero] No listener at index " + k + " to notify hero removed: " + epq_22), (Throwable)indexOutOfBoundsException);
                continue;
            }
            catch (Exception exception) {
                b.error((Object)("[Hero] An error occurred while notifying listener " + ((eux_2)arrayList.get(k)).getClass().getSimpleName() + " of hero removal: " + epq_22), (Throwable)exception);
            }
        }
    }

    private void k(long l) {
        ArrayList<eux_2> arrayList = new ArrayList<eux_2>(this.f);
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            try {
                ((eux_2)arrayList.get(k)).b(this.d(l));
                continue;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                b.error((Object)("[Hero] No listener at index " + k + " to notify hero removed from party: " + l), (Throwable)indexOutOfBoundsException);
                continue;
            }
            catch (Exception exception) {
                b.error((Object)("[Hero] An error occurred while notifying listener " + ((eux_2)arrayList.get(k)).getClass().getSimpleName() + " of hero removal from party: " + l), (Throwable)exception);
            }
        }
    }

    public void a() {
        this.d.clear();
    }

    public void b() {
        this.e.clear();
        this.c.clear();
    }

    public String toString() {
        return "HeroesManager{m_heroes=" + this.c + ", m_heroesById=" + this.e + ", m_listeners=" + this.f + "}";
    }
}

