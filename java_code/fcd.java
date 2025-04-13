/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

public class fcd {
    protected static final Logger a = Logger.getLogger(fcd.class);
    protected final faX b;
    protected fcc c;
    private final TIntObjectHashMap<fce> d = new TIntObjectHashMap();
    private final TIntObjectHashMap<fbl_0> e = new TIntObjectHashMap();

    public fcd(faX faX2) {
        this.b = faX2;
    }

    public void a(fcc fcc2) {
        this.c = fcc2;
    }

    protected void a(int n, fbl_0 fbl_02) {
        this.e.put(n, (Object)fbl_02);
    }

    protected void a(int n) {
        this.e.remove(n);
    }

    public void a() {
        this.e.clear();
    }

    public fbl_0 b(int n) {
        return (fbl_0)this.e.get(n);
    }

    public fbl_0 c(int n) {
        return this.d((int)n).a;
    }

    protected void b(int n, fbl_0 fbl_02) {
        this.d((int)n).a = fbl_02;
    }

    private fce d(int n) {
        faX faX2 = fbc_0.a.a(n);
        fce fce2 = (fce)this.d.get(n);
        if (fce2 != null) {
            return fce2;
        }
        if (faX2 != null) {
            fce2 = (fce)faX2.F().d.get(this.b.c());
            this.d.put(n, (Object)fce2);
        }
        if (fce2 != null) {
            return fce2;
        }
        fce2 = new fce(this.b.c() != n && n != 0 && this.b.c() != 0 ? fbl_0.a : fbl_0.b);
        this.d.put(n, (Object)fce2);
        return fce2;
    }

    public void b() {
        this.d.clear();
        this.e.clear();
    }

    private void c() {
        if (this.c != null) {
            this.c.a();
        }
    }

    public void a(wm_2 wm_22) {
        gs_0 gs_02;
        TIntObjectIterator tIntObjectIterator = this.d.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            gs_02 = new wn_1();
            gs_02.a = tIntObjectIterator.key();
            gs_02.b = ((fce)tIntObjectIterator.value()).a.a();
            wm_22.a.add((wn_1)gs_02);
        }
        tIntObjectIterator = this.e.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            gs_02 = new wo_1();
            ((wo_1)gs_02).a = tIntObjectIterator.key();
            ((wo_1)gs_02).b = ((fbl_0)tIntObjectIterator.value()).a();
            wm_22.b.add((wo_1)gs_02);
        }
    }

    public void b(wm_2 wm_22) {
        gs_0 gs_02;
        int n;
        int n2 = wm_22.a.size();
        for (n = 0; n < n2; ++n) {
            gs_02 = wm_22.a.get(n);
            this.b(gs_02.a, fbl_0.a(gs_02.b));
        }
        n2 = wm_22.b.size();
        for (n = 0; n < n2; ++n) {
            gs_02 = wm_22.b.get(n);
            this.e.put(((wo_1)gs_02).a, (Object)fbl_0.a(((wo_1)gs_02).b));
        }
        this.c();
    }
}

