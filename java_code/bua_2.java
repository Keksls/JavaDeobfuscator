/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bUa
 */
public class bua_2 {
    private static final Logger b = Logger.getLogger(bua_2.class);
    private static final TObjectProcedure<btv_2> c = new bub_2();
    public static final bua_2 a = new bua_2();
    private final TIntObjectHashMap<bth_2> d = new TIntObjectHashMap();
    private final TIntObjectHashMap<buc_2> e = new TIntObjectHashMap();
    private final TIntObjectHashMap<bug_2> f = new TIntObjectHashMap();
    private final TLongObjectHashMap<btv_2> g = new TLongObjectHashMap();
    private final cco_1 h = cco_1.a;
    private long i;

    public void a(esl_1 esl_12) {
        etk_1 etk_12;
        ArrayList<ese_1> arrayList = new ArrayList<ese_1>();
        this.i = esl_12.a();
        try {
            etk_12 = etl_1.a.a(this.i);
        }
        catch (etf_1 etf_12) {
            b.error((Object)"Exception raised", (Throwable)etf_12);
            return;
        }
        int n = etk_12.b();
        etk_12 = etl_1.a.b(this.i);
        etk_12.b(n);
        esl_12.a((TObjectProcedure<ese_1>)((TObjectProcedure)ese_12 -> {
            arrayList.add((ese_1)ese_12);
            if (ese_12.a().i()) {
                return true;
            }
            etz_2 etz_22 = (etz_2)ese_12.a();
            etz_22.a(n -> {
                etg_1 etg_12 = bzc_2.a.a(n);
                if (etg_12 == null) {
                    return true;
                }
                etg_12.a(this.i, ese_12.b());
                return true;
            });
            return true;
        }));
        this.a(arrayList);
    }

    public void a(ArrayList<ese_1> arrayList) {
        this.c();
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        arrayList.forEach(this::a);
    }

    public long a() {
        return this.i;
    }

    public void a(long l) {
        this.i = l;
    }

    private void c() {
        this.g.forEachValue(c);
        this.g.clear();
    }

    public void b() {
        this.d.clear();
        this.h.c();
        this.c();
    }

    public bth_2 a(etw_2 etw_22) {
        return this.a(etw_22.a());
    }

    public bth_2 a(short s2) {
        bth_2 bth_22 = (bth_2)this.d.get((int)s2);
        if (bth_22 == null) {
            bth_22 = new bth_2(eti_2.a.a(s2), this.h);
            this.d.put((int)s2, (Object)bth_22);
        }
        return bth_22;
    }

    private buc_2 a(etk_2 etk_22) {
        buc_2 buc_22 = (buc_2)this.e.get((int)etk_22.i());
        if (buc_22 == null) {
            buc_22 = new buc_2(etk_22);
            this.e.put((int)etk_22.i(), (Object)buc_22);
        }
        return buc_22;
    }

    public buc_2 b(short s2) {
        return this.a(eti_2.a.c(s2));
    }

    public bug_2 a(etn_2 etn_22) {
        short s2 = etn_22.b();
        bug_2 bug_22 = (bug_2)this.f.get((int)s2);
        if (bug_22 == null) {
            bug_22 = new bug_2(eti_2.a.d(s2), this.h);
            this.f.put((int)s2, (Object)bug_22);
        }
        return bug_22;
    }

    private buf_2 a(etm_2 etm_22) {
        return new buf_2(etm_22);
    }

    public btv_2 b(long l) {
        return (btv_2)this.g.get(l);
    }

    public bue_2 a(etl_2 etl_22) {
        if (etl_22 instanceof etk_2) {
            return this.a((etk_2)etl_22);
        }
        if (etl_22 instanceof etn_2) {
            return this.a((etn_2)etl_22);
        }
        if (etl_22 instanceof etm_2) {
            return this.a((etm_2)etl_22);
        }
        return null;
    }

    public btv_2 a(ese_1 ese_12) {
        long l = ese_12.b();
        btv_2 btv_22 = btv_2.a(this.a(ese_12.a()), l, ese_12.g(), wt_0.b(ese_12.c()));
        if (btv_22 != null) {
            this.g.put(l, (Object)btv_22);
            btv_22.h();
        }
        return btv_22;
    }
}

