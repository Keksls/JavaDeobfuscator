/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import org.apache.log4j.Logger;

/*
 * Renamed from fkC
 */
public class fkc_0 {
    private static final Logger a = Logger.getLogger(fkc_0.class);
    private final esi_1 b;
    private long c;
    private int d;
    private long e;
    private long f;
    private int g;
    private int h;
    private int i;
    private long j;
    private final TLongObjectHashMap<esy_2> k = new TLongObjectHashMap();
    private int l;

    public fkc_0(esi_1 esi_12) {
        this.b = esi_12;
    }

    public fkc_0(fkc_0 fkc_02) {
        this.b = fkc_02.b;
        this.c = fkc_02.c;
        this.d = fkc_02.d;
        this.e = fkc_02.e;
        this.f = fkc_02.f;
        this.g = fkc_02.g;
        this.h = fkc_02.h;
        this.i = fkc_02.i;
        this.l = fkc_02.l;
        this.j = fkc_02.j;
        this.k.putAll(fkc_02.k);
    }

    public long a() {
        return this.c;
    }

    public long b() {
        return this.e;
    }

    public long c() {
        return this.a() - this.b();
    }

    public int d() {
        return this.d + this.i;
    }

    public int e() {
        return this.g;
    }

    public int f() {
        return this.h;
    }

    public int g() {
        return this.d() - this.e() - this.f();
    }

    public int h() {
        return this.d() - this.e();
    }

    public long i() {
        return this.j;
    }

    public boolean a(TObjectProcedure<esy_2> tObjectProcedure) {
        return this.k.forEachValue(tObjectProcedure);
    }

    public void a(esl_1 esl_12) {
        this.a(this.c, esl_12);
    }

    public void a(long l, esl_1 esl_12) {
        this.k.clear();
        this.g = 0;
        this.i = 0;
        this.e = 0L;
        this.f = 0L;
        this.c = l;
        this.d = esl_12.d();
        this.l = esl_12.f();
        this.e = 0L;
        this.f = 0L;
        this.h = 0;
        esl_12.a((TObjectProcedure<ese_1>)((TObjectProcedure)ese_12 -> {
            esd_1 esd_12 = this.b.a((ese_1)ese_12);
            this.k.put(esd_12.c(), (Object)esd_12);
            this.g += esd_12.g().e();
            return true;
        }));
        this.j = esl_12.a();
    }

    public void a(esy_2 esy_22) {
        etk_2 etk_22 = esy_22.n();
        this.h += etk_22.d();
        this.i += etk_22.e();
        etw_2 etw_22 = esy_22.g();
        etw_2 etw_23 = eta_2.d(etw_22);
        this.e += fkb_0.a(etw_23, this.j);
        this.f += (long)fkb_0.b(etw_23, this.j);
        this.k.put(esy_22.c(), (Object)esy_22);
    }

    public boolean b(esy_2 esy_22) {
        long l = esy_22.c();
        etw_2 etw_22 = esy_22.g();
        if (esy_22.b()) {
            etk_2 etk_22 = esy_22.n();
            this.h -= etk_22.d();
            this.i -= etk_22.e();
            etw_2 etw_23 = eta_2.d(etw_22);
            this.e -= fkb_0.a(etw_23, this.j);
            this.f -= (long)fkb_0.b(etw_23, this.j);
        } else if (eta_2.e(esy_22.g()) != etf_2.c) {
            this.g -= etw_22.e();
            this.i -= etw_22.f();
        }
        return this.k.remove(l) != null;
    }

    public void a(etn_2 etn_22) {
        this.e += (long)etn_22.a();
    }

    public void a(etm_2 etm_22) {
        this.e += (long)etm_22.a();
    }

    public long j() {
        return this.f;
    }

    public int k() {
        return this.l;
    }

    public void a(int n) {
        this.l = n;
    }

    public boolean b(int n) {
        return (long)n <= this.c();
    }
}

