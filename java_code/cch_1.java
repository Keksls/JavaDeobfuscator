/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cch
 */
public class cch_1
extends agy_0<cch_1> {
    private static final TObjectProcedure<pj_0> t = new cci_1();
    private static final TLongProcedure u = new ccj_1();
    private final TLongProcedure v = new cck_1(this);
    protected static final Logger p = Logger.getLogger(cch_1.class);
    protected final TLongObjectHashMap<bNK> q = new TLongObjectHashMap();
    protected final TLongObjectHashMap<pj_0> r = new TLongObjectHashMap();
    protected final TLongObjectHashMap<bvw_2> s = new TLongObjectHashMap();
    private final List<cch_1> w = new ArrayList<cch_1>(5);

    cch_1(int n, int n2, int n3, int n4, boolean bl) {
        this.a(n, n2, n3, n4);
        if (bl) {
            this.a(new cch_1[9]);
        }
    }

    @Override
    public void g() {
        Object object;
        Object object2;
        super.g();
        short s2 = (short)this.k;
        short s3 = (short)this.l;
        TIntObjectIterator<bwh_0> tIntObjectIterator = bwj_1.a().b();
        block0: while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            object2 = (bwh_0)tIntObjectIterator.value();
            if (!(object2 instanceof bvw_2)) continue;
            object = (bvw_2)object2;
            for (abo_2<Short, Short> abo_22 : ((bvw_2)object).w()) {
                if (s2 != abo_22.a() || s3 != abo_22.b()) continue;
                this.c((bvw_2)object);
                continue block0;
            }
        }
        object2 = (aoc_0)aew_0.a().d(s2, s3);
        if (object2 == null) {
            return;
        }
        object = ((aet_0)object2).h();
        if (object != null) {
            ccg_2.a(this, (afc[])object);
            ccg_2.b(this, (afc[])object);
        }
    }

    void a(bNK bNK2) {
        if (!this.q.containsKey(bNK2.a())) {
            this.q.put(bNK2.a(), (Object)bNK2);
        } else {
            p.error((Object)("Impossible d'ajouter une resource d'ID=" + bNK2.a() + " \u00e0 la partition " + this + " qui la contient d\u00e9j\u00e0."));
        }
    }

    public void j() {
    }

    public void k() {
        this.q.clear();
        this.s.clear();
        this.r.clear();
    }

    void a(bvw_2 bvw_22) {
        this.s.remove((long)bvw_22.c());
    }

    void b(bNK bNK2) {
        this.q.remove(bNK2.a());
    }

    boolean b(bvw_2 bvw_22) {
        return this.s.contains((long)bvw_22.c());
    }

    boolean c(bNK bNK2) {
        return this.q.contains(bNK2.a());
    }

    void b(long l) {
        pj_0 pj_02 = (pj_0)this.r.remove(l);
        if (pj_02 != null) {
            pj_02.aE_();
        }
    }

    void a(pj_0 pj_02) {
        this.r.remove(pj_02.a_());
        pj_02.aE_();
    }

    void b(pj_0 pj_02) {
        try {
            if (!this.r.containsKey(pj_02.a_())) {
                this.r.put(pj_02.a_(), (Object)pj_02);
                pj_02.aD_();
            } else {
                p.error((Object)("Impossible d'ajouter un \u00e9l\u00e9ments interactif d'ID=" + pj_02.a_() + " \u00e0 la partition " + this + " qui le contient d\u00e9j\u00e0."));
            }
        }
        catch (Exception exception) {
            p.error((Object)"", (Throwable)exception);
        }
    }

    boolean c(long l) {
        return this.r.contains(l);
    }

    public void b(TObjectProcedure<pj_0> tObjectProcedure) {
        this.r.forEachValue(tObjectProcedure);
    }

    pj_0 d(long l) {
        return (pj_0)this.r.get(l);
    }

    void c(bvw_2 bvw_22) {
        if (!this.s.contains((long)bvw_22.c())) {
            bvw_22.t();
            this.s.put((long)bvw_22.c(), (Object)bvw_22);
        } else {
            p.error((Object)("Impossible d'ajouter un item d'ID=" + bvw_22.c() + " \u00e0 la partition " + this + " qui le contient d\u00e9j\u00e0."));
        }
    }

    @Override
    protected void i() {
        super.i();
        this.q.clear();
        this.r.clear();
        this.s.clear();
    }

    @Override
    public void h() {
        super.h();
        this.q.forEachKey(u);
        this.s.forEachKey(this.v);
        ccg_2.a(this.k, this.l);
        this.r.forEachValue(t);
        this.i();
    }

    private static cch_1 a(cch_1 cch_12, int n, int n2) {
        cch_1 cch_13 = new cch_1(cch_12.a() + n, cch_12.b() + n2, 18, 18, false);
        cch_13.g();
        return cch_13;
    }

    private void c(int n) {
        cch_1[] cch_1Array = (cch_1[])this.f();
        cch_1 cch_12 = cch_1Array[4];
        switch (n) {
            case 7: {
                cch_1Array[7] = cch_1.a(cch_12, 0, 1);
                break;
            }
            case 1: {
                cch_1Array[1] = cch_1.a(cch_12, 0, -1);
                break;
            }
            case 3: {
                cch_1Array[3] = cch_1.a(cch_12, -1, 0);
                break;
            }
            case 5: {
                cch_1Array[5] = cch_1.a(cch_12, 1, 0);
                break;
            }
            case 0: {
                cch_1Array[0] = cch_1.a(cch_12, -1, -1);
                break;
            }
            case 2: {
                cch_1Array[2] = cch_1.a(cch_12, 1, -1);
                break;
            }
            case 8: {
                cch_1Array[8] = cch_1.a(cch_12, 1, 1);
                break;
            }
            case 6: {
                cch_1Array[6] = cch_1.a(cch_12, -1, 1);
                break;
            }
            default: {
                p.error((Object)"Tentative de renew d'une LocalPartition inexistante");
            }
        }
    }

    void b(int n) {
        cch_1[] cch_1Array = (cch_1[])this.f();
        switch (n) {
            case 7: {
                this.w.add(cch_1Array[1]);
                this.w.add(cch_1Array[0]);
                this.w.add(cch_1Array[2]);
                cch_1Array[1] = cch_1Array[4];
                cch_1Array[0] = cch_1Array[3];
                cch_1Array[2] = cch_1Array[5];
                cch_1Array[4] = cch_1Array[7];
                cch_1Array[3] = cch_1Array[6];
                cch_1Array[5] = cch_1Array[8];
                this.c(7);
                this.c(6);
                this.c(8);
                break;
            }
            case 1: {
                this.w.add(cch_1Array[7]);
                this.w.add(cch_1Array[6]);
                this.w.add(cch_1Array[8]);
                cch_1Array[7] = cch_1Array[4];
                cch_1Array[6] = cch_1Array[3];
                cch_1Array[8] = cch_1Array[5];
                cch_1Array[4] = cch_1Array[1];
                cch_1Array[3] = cch_1Array[0];
                cch_1Array[5] = cch_1Array[2];
                this.c(1);
                this.c(0);
                this.c(2);
                break;
            }
            case 3: {
                this.w.add(cch_1Array[5]);
                this.w.add(cch_1Array[2]);
                this.w.add(cch_1Array[8]);
                cch_1Array[5] = cch_1Array[4];
                cch_1Array[2] = cch_1Array[1];
                cch_1Array[8] = cch_1Array[7];
                cch_1Array[4] = cch_1Array[3];
                cch_1Array[1] = cch_1Array[0];
                cch_1Array[7] = cch_1Array[6];
                this.c(0);
                this.c(3);
                this.c(6);
                break;
            }
            case 5: {
                this.w.add(cch_1Array[3]);
                this.w.add(cch_1Array[0]);
                this.w.add(cch_1Array[6]);
                cch_1Array[3] = cch_1Array[4];
                cch_1Array[0] = cch_1Array[1];
                cch_1Array[6] = cch_1Array[7];
                cch_1Array[4] = cch_1Array[5];
                cch_1Array[1] = cch_1Array[2];
                cch_1Array[7] = cch_1Array[8];
                this.c(2);
                this.c(5);
                this.c(8);
                break;
            }
            case 0: {
                this.w.add(cch_1Array[5]);
                this.w.add(cch_1Array[2]);
                this.w.add(cch_1Array[8]);
                this.w.add(cch_1Array[7]);
                this.w.add(cch_1Array[6]);
                cch_1Array[8] = cch_1Array[4];
                cch_1Array[4] = cch_1Array[0];
                cch_1Array[5] = cch_1Array[1];
                cch_1Array[7] = cch_1Array[3];
                this.c(1);
                this.c(2);
                this.c(0);
                this.c(3);
                this.c(6);
                break;
            }
            case 2: {
                this.w.add(cch_1Array[0]);
                this.w.add(cch_1Array[3]);
                this.w.add(cch_1Array[6]);
                this.w.add(cch_1Array[7]);
                this.w.add(cch_1Array[8]);
                cch_1Array[6] = cch_1Array[4];
                cch_1Array[3] = cch_1Array[1];
                cch_1Array[7] = cch_1Array[5];
                cch_1Array[4] = cch_1Array[2];
                this.c(0);
                this.c(1);
                this.c(2);
                this.c(5);
                this.c(8);
                break;
            }
            case 8: {
                this.w.add(cch_1Array[2]);
                this.w.add(cch_1Array[1]);
                this.w.add(cch_1Array[0]);
                this.w.add(cch_1Array[3]);
                this.w.add(cch_1Array[6]);
                cch_1Array[0] = cch_1Array[4];
                cch_1Array[1] = cch_1Array[5];
                cch_1Array[3] = cch_1Array[7];
                cch_1Array[4] = cch_1Array[8];
                this.c(2);
                this.c(5);
                this.c(8);
                this.c(7);
                this.c(6);
                break;
            }
            case 6: {
                this.w.add(cch_1Array[0]);
                this.w.add(cch_1Array[1]);
                this.w.add(cch_1Array[2]);
                this.w.add(cch_1Array[5]);
                this.w.add(cch_1Array[8]);
                cch_1Array[1] = cch_1Array[3];
                cch_1Array[2] = cch_1Array[4];
                cch_1Array[4] = cch_1Array[6];
                cch_1Array[5] = cch_1Array[7];
                this.c(0);
                this.c(3);
                this.c(6);
                this.c(7);
                this.c(8);
                break;
            }
            default: {
                p.error((Object)"Translation d'une LocalPartition dans une direction invalide, bizarre...");
            }
        }
        int n2 = this.w.size();
        for (int k = 0; k < n2; ++k) {
            this.w.get(k).h();
        }
        this.w.clear();
    }

    public String toString() {
        return "(" + this.a() + "," + this.b() + ")";
    }

    void a(int n, int n2, short s2) {
        if (this.r.isEmpty()) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (!bmr_12.cR()) {
            return;
        }
        aff_1 aff_12 = new aff_1();
        this.r.forEachValue((TObjectProcedure)new ccl_1(this, aff_12, n, n2, s2, bmr_12));
    }
}

