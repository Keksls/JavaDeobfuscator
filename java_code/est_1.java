/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eSt
 */
public class est_1
implements esl_1 {
    private esm_2 a;
    private final TLongObjectHashMap<ese_1> b = new TLongObjectHashMap();
    private final TIntObjectHashMap<esa_2> c = new TIntObjectHashMap();
    private final List<esr_1> d = new ArrayList<esr_1>();

    est_1(esm_2 esm_22) {
        this.a = esm_22;
    }

    @Override
    public long a() {
        if (this.a == null) {
            return 0L;
        }
        return this.a.a();
    }

    @Override
    public long b() {
        if (this.a == null) {
            return 0L;
        }
        return this.a.g();
    }

    @Override
    public esm_2 c() {
        return this.a;
    }

    @Override
    public ese_1 a(long l) {
        return (ese_1)this.b.get(l);
    }

    @Override
    public boolean a(TObjectProcedure<ese_1> tObjectProcedure) {
        return this.b.forEachValue(tObjectProcedure);
    }

    @Override
    public int d() {
        eug_2 eug_22 = new eug_2();
        this.a(eug_22);
        return eug_22.b();
    }

    @Override
    public int e() {
        eug_2 eug_22 = new eug_2();
        this.a(eug_22);
        return eug_22.a();
    }

    @Override
    public int a(short s2) {
        etq_1 etq_12 = new etq_1(s2);
        this.a(etq_12);
        return etq_12.a();
    }

    @Override
    public int a(int n) {
        ets_1 ets_12 = new ets_1(n);
        this.a(ets_12);
        return ets_12.a();
    }

    @Override
    public void a(esm_2 esm_22) {
        this.a = esm_22;
        this.m();
    }

    @Override
    public int f() {
        return this.a == null ? 0 : this.a.e();
    }

    @Override
    public String i() {
        return this.a == null ? "" : this.a.b();
    }

    @Override
    public esa_2 a(short s2, short s3) {
        return (esa_2)this.c.get(Hw.c(s2, s3));
    }

    @Override
    public boolean b(TObjectProcedure<esa_2> tObjectProcedure) {
        return this.c.forEachValue(tObjectProcedure);
    }

    @Override
    public int h() {
        return 250000;
    }

    @Override
    public TLongObjectHashMap<ese_1> l() {
        return this.b;
    }

    @Override
    public long j() {
        return this.a == null ? 0L : this.a.c();
    }

    @Override
    public boolean k() {
        return this.a == null || this.a.f();
    }

    public void a(ese_1 ese_12) {
        this.b.put(ese_12.b(), (Object)ese_12);
        this.b(ese_12);
    }

    void b(long l) {
        ese_1 ese_12 = (ese_1)this.b.remove(l);
        this.c(ese_12);
    }

    void a(esa_2 esa_22) {
        int n = Hw.c(esa_22.a(), esa_22.b());
        this.c.put(n, (Object)esa_22);
        this.c(esa_22);
    }

    void b(esa_2 esa_22) {
        this.c(esa_22);
    }

    private void m() {
        for (int k = 0; k < this.d.size(); ++k) {
            this.d.get(k).a(this.a);
        }
    }

    private void n() {
        if (this.a == null) {
            return;
        }
        for (int k = 0; k < this.d.size(); ++k) {
            this.d.get(k).a(this.a.e());
        }
    }

    private void b(ese_1 ese_12) {
        for (int k = 0; k < this.d.size(); ++k) {
            this.d.get(k).a(ese_12);
        }
    }

    private void c(ese_1 ese_12) {
        for (int k = 0; k < this.d.size(); ++k) {
            this.d.get(k).b(ese_12);
        }
    }

    private void c(esa_2 esa_22) {
        for (int k = 0; k < this.d.size(); ++k) {
            this.d.get(k).a(esa_22);
        }
    }

    @Override
    public boolean a(esr_1 esr_12) {
        return !this.d.contains(esr_12) && this.d.add(esr_12);
    }

    @Override
    public boolean b(esr_1 esr_12) {
        return this.d.remove(esr_12);
    }

    @Override
    public void g() {
        this.d.clear();
    }

    public String toString() {
        return "HavenWorldModel{m_basicInfo=" + this.a + ", m_buildings=" + this.b + ", m_partitions=" + this.c + ", m_listeners=" + this.d + "}";
    }
}

