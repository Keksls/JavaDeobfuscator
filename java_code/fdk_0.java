/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from fdk
 */
public class fdk_0 {
    private static final TLongHashSet e = new TLongHashSet();
    private final TLongObjectProcedure<fde> f = new fdl_0(this);
    private final TLongProcedure g = new fdm_0(this);
    protected faX a;
    private List<fck> h;
    protected final TLongObjectHashMap<fde> b = new TLongObjectHashMap();
    protected final TIntObjectHashMap<TLongHashSet> c = new TIntObjectHashMap();
    protected final TLongHashSet d = new TLongHashSet();
    private boolean i = false;

    public void a(fde fde2) {
        long l = fde2.a();
        if (this.b.containsKey(l)) {
            return;
        }
        this.b.put(l, (Object)fde2);
        int n = fde2.i().D.ordinal();
        TLongHashSet tLongHashSet = (TLongHashSet)this.c.get(n);
        if (tLongHashSet == null) {
            tLongHashSet = new TLongHashSet();
            this.c.put(n, (Object)tLongHashSet);
        }
        tLongHashSet.add(l);
        if (fde2.d()) {
            this.d.add(l);
        }
    }

    public void a() {
        this.i = true;
    }

    public boolean b() {
        return this.i;
    }

    public boolean c() {
        boolean bl = this.i;
        this.i = false;
        return bl;
    }

    public void a(fdg fdg2) {
        throw new UnsupportedOperationException();
    }

    public ArrayList<fde> b(fdg fdg2) {
        ArrayList<fde> arrayList = new ArrayList<fde>();
        TLongHashSet tLongHashSet = (TLongHashSet)this.c.get(fdg2.d().ordinal());
        if (tLongHashSet == null) {
            return arrayList;
        }
        for (long l : tLongHashSet) {
            fde fde2;
            if (!this.d.contains(l) || !this.a(fde2 = (fde)this.b.get(l), fdg2) || !fde2.a(fdg2)) continue;
            arrayList.add(fde2);
        }
        return arrayList;
    }

    protected boolean a(fde fde2, fdg fdg2) {
        epq_2 epq_22 = (epq_2)fdg2.a();
        int n = epq_22.fE().n();
        boolean bl = epq_22.fI() == n;
        fcd fcd2 = epq_22.fE().m().F();
        fbl_0 fbl_02 = fcd2.c(epq_22.fI());
        switch (fbl_02) {
            case a: {
                return fde2.h();
            }
            case b: {
                return bl ? fde2.f() : fde2.g();
            }
        }
        throw new UnsupportedOperationException("Type d'alignement non reconnu " + fbl_02);
    }

    public TLongObjectIterator<fde> d() {
        return this.b.iterator();
    }

    public int a(long l) {
        return ((fde)this.b.get(l)).b();
    }

    public int b(long l) {
        return ((fde)this.b.get(l)).e();
    }

    public boolean c(long l) {
        return this.d.contains(l);
    }

    public void e() {
        this.a(e);
    }

    public void f() {
        this.a(e);
    }

    public void a(TLongHashSet tLongHashSet) {
        this.d.clear();
        this.b.forEachEntry(this.f);
        tLongHashSet.forEach(this.g);
        if (this.a != null && this.h != null) {
            for (int k = 0; k < this.h.size(); ++k) {
                this.h.get(k).a(this.a);
            }
        }
    }

    public void a(faX faX2, List<fck> list) {
        this.a = faX2;
        this.h = list;
    }

    public int b(TLongHashSet tLongHashSet) {
        int n = 0;
        TLongIterator tLongIterator = tLongHashSet.iterator();
        while (tLongIterator.hasNext()) {
            n += ((fde)this.b.get(tLongIterator.next())).c();
        }
        return n;
    }

    public void a(wv_2 wv_22) {
        wv_22.a = this.i;
        TLongIterator tLongIterator = this.d.iterator();
        while (tLongIterator.hasNext()) {
            ww_1 ww_12 = new ww_1();
            ww_12.a = tLongIterator.next();
            wv_22.b.add(ww_12);
        }
    }

    public void b(wv_2 wv_22) {
        this.i = wv_22.a;
        TLongHashSet tLongHashSet = new TLongHashSet();
        int n = wv_22.b.size();
        for (int k = 0; k < n; ++k) {
            tLongHashSet.add(wv_22.b.get((int)k).a);
        }
        this.a(tLongHashSet);
    }
}

