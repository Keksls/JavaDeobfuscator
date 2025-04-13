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
import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cDL {
    static final Logger a = Logger.getLogger(cDL.class);
    private static final long b = 5000L;
    private final TIntObjectHashMap<cdr_0> c = new TIntObjectHashMap();
    private final ArrayList<cDO> d = new ArrayList();
    private long e = 5000L;
    private long f;
    private final Object g = new Object();
    private final ArrayList<cdn_0> h = new ArrayList();
    private final cDM i = new cDM(this);

    public cDL() {
        this.i.setName("SoundAmbEngine");
        this.i.start();
    }

    public ArrayList<cDO> a() {
        return this.d;
    }

    public long b() {
        return this.e;
    }

    public void a(long l) {
        this.e = l;
        for (int k = this.d.size() - 1; k >= 0; --k) {
            this.d.get(k).a(this.e);
        }
    }

    public void a(cdn_0 cdn_02) {
        this.h.add(cdn_02);
    }

    public void b(cdn_0 cdn_02) {
        this.h.remove(cdn_02);
    }

    public void a(String string) {
        try {
            arf_1 arf_12 = arf_1.a(gg_0.b(string));
            cfa_2 cfa_22 = new cfa_2();
            cfa_22.a(arf_12);
            this.a(cfa_22);
        }
        catch (IOException iOException) {
            a.error((Object)("Probl\u00e8me \u00e0 la lecture du fichier " + string));
        }
    }

    public void a(cfa_2 cfa_22) {
        Object object;
        Object object2;
        this.d();
        this.d.clear();
        this.c.clear();
        ArrayList<cez_2> arrayList = cfa_22.a();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            this.d.add(this.a(arrayList.get(k)));
        }
        ArrayList<cey_2> arrayList2 = cfa_22.b();
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        int n2 = arrayList2.size();
        for (int k = 0; k < n2; ++k) {
            object2 = arrayList2.get(k);
            object = this.a((cey_2)object2);
            if (object == null) continue;
            this.c.put(((cdr_0)object).c(), object);
            tIntObjectHashMap.put(((cdr_0)object).c(), object2);
        }
        TIntObjectIterator tIntObjectIterator = this.c.iterator();
        block2: while (tIntObjectIterator.hasNext()) {
            int n3;
            int n4;
            cdr_0 cdr_02;
            tIntObjectIterator.advance();
            n2 = tIntObjectIterator.key();
            object2 = (cdr_0)tIntObjectIterator.value();
            object = (cey_2)tIntObjectHashMap.get(n2);
            if (object2 instanceof cdx_0) {
                Object object3;
                cdr_02 = (cdx_0)object2;
                n4 = ((cey_2)object).h.size();
                for (n3 = 0; n3 < n4; ++n3) {
                    object3 = (cdr_0)this.c.get((int)((cey_2)object).h.get(n3));
                    cdr_02.a(object3);
                }
                if (((cey_2)object).b == -1) continue;
                n4 = this.d.size();
                for (n3 = 0; n3 < n4; ++n3) {
                    object3 = this.d.get(n3);
                    if (((cDO)object3).a() != ((cey_2)object).b) continue;
                    ((cDO)object3).a((cdx_0)cdr_02);
                    continue block2;
                }
                continue;
            }
            cdr_02 = (cDY)object2;
            n4 = ((cey_2)object).h.size();
            for (n3 = 0; n3 < n4; ++n3) {
                ((cDY)cdr_02).c(((cey_2)object).h.get(n3));
            }
        }
        this.c.clear();
    }

    private cDO a(cez_2 cez_22) {
        cDO cDO2 = new cDO();
        cDO2.a(cez_22.a);
        cDO2.a(cez_22.b);
        cDO2.a(this.e);
        return cDO2;
    }

    private cdr_0 a(cey_2 cey_22) {
        cdr_0 cdr_02 = this.b(cey_22);
        if (cdr_02 == null) {
            return null;
        }
        cdr_02.a(cey_22.a);
        cdr_02.a(cey_22.f);
        ArrayList<ceo_1> arrayList = cey_22.g;
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            cdr_02.a(arrayList.get(k));
        }
        cdr_02.a(cey_22.y >= 0 ? (float)cey_22.y / 100.0f : -1.0f);
        cdr_02.b(cey_22.z >= 0 ? (float)cey_22.z / 100.0f : -1.0f);
        return cdr_02;
    }

    private cdr_0 b(cey_2 cey_22) {
        if (cey_22.e) {
            cDS cDS2 = new cDS();
            cDS2.a(cdh_0.a(cey_22.l));
            return cDS2;
        }
        if (cey_22.d) {
            cdu_0 cdu_02 = new cdu_0();
            cdu_02.a(cel_0.a(cey_22.i));
            cdu_02.a(cey_22.k);
            cdu_02.a(cey_22.j);
            return cdu_02;
        }
        if (cey_22.c) {
            return new cdx_0();
        }
        cDY cDY2 = null;
        cdl_0 cdl_02 = cdl_0.a(cey_22.m);
        if (cey_22.n == 0 && cdl_02.c() != null) {
            cDY2 = new cdt_0();
            cDY2.a(cdl_02.c());
        } else if (cey_22.n == 1 && cdl_02.d() != null) {
            cDW cDW2 = new cDW();
            cDW2.a(cdl_02.d());
            cDW2.a(true);
            cDW2.b(cey_22.x);
            cDY2 = cDW2;
        } else if (cey_22.n == 2 && cdl_02.d() != null) {
            cDW cDW3 = new cDW();
            cDW3.a(cdl_02.d());
            cDW3.b(cey_22.x);
            cDY2 = cDW3;
        }
        if (cDY2 == null) {
            return null;
        }
        cDY2.j(cey_22.o);
        cDY2.c(cey_22.p);
        cDY2.d(cey_22.q);
        cDY2.e(cey_22.r);
        cDY2.f(cey_22.s);
        cDY2.g(cey_22.t);
        cDY2.i(cey_22.v);
        cDY2.h(cey_22.w);
        cDY2.k(cey_22.A);
        return cDY2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        Object object = this.g;
        synchronized (object) {
            this.f = System.currentTimeMillis();
        }
        this.i.a(true);
    }

    public void d() {
        long l = System.currentTimeMillis();
        this.i.a(false);
        for (int k = this.d.size() - 1; k >= 0; --k) {
            cDO cDO2 = this.d.get(k);
            cDO2.c(l);
        }
    }

    public void a(cer_0 cer_02) {
        int n;
        long l = System.currentTimeMillis();
        for (n = this.h.size() - 1; n >= 0; --n) {
            this.h.get(n).a(cer_02);
        }
        for (n = this.d.size() - 1; n >= 0; --n) {
            cDO cDO2 = this.d.get(n);
            cDO2.a(cer_02, l);
        }
    }

    public void a(long l, alo_1 alo_12, cdh_0 cdh_02) {
        long l2 = System.currentTimeMillis();
        for (int k = this.d.size() - 1; k >= 0; --k) {
            cDO cDO2 = this.d.get(k);
            cDO2.a(l, alo_12, cdh_02, l2);
        }
    }

    public void b(long l) {
        long l2 = System.currentTimeMillis();
        for (int k = this.d.size() - 1; k >= 0; --k) {
            cDO cDO2 = this.d.get(k);
            cDO2.a(l, l2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void c(long l) {
        Object object = this.g;
        synchronized (object) {
            int n;
            if (l < this.f) {
                return;
            }
            int n2 = this.h.size();
            for (n = 0; n < n2; ++n) {
                this.h.get(n).a(l);
            }
            for (n = this.d.size() - 1; n >= 0; --n) {
                cDO cDO2 = this.d.get(n);
                cDO2.b(this.f);
            }
            this.f += this.e;
        }
    }
}

