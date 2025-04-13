/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from fiY
 */
public class fiy_0 {
    private final TIntObjectHashMap<fiv_0> a;

    public fiy_0(int n) {
        this.a = new TIntObjectHashMap(n);
    }

    public fiv_0 a(int n) {
        return (fiv_0)this.a.get(n);
    }

    public int a() {
        return this.a.size();
    }

    public TIntObjectIterator<fiv_0> b() {
        return this.a.iterator();
    }

    public fiv_0 a(evq_1 evq_12) {
        fiv_0 fiv_02 = new fiv_0(evq_12.a(), evq_12.b());
        this.a.put(evq_12.a(), (Object)fiv_02);
        return fiv_02;
    }

    public ao_0 c() {
        aq_0 aq_02 = ao_0.f();
        this.a.forEachValue((TObjectProcedure)new fiz_0(this, aq_02));
        return aq_02.g();
    }

    public void a(evp_1 evp_12, byte[] byArray) {
        ao_0 ao_02 = ao_0.a(byArray);
        this.a(evp_12, ao_02);
    }

    public void a(evp_1 evp_12, ao_0 ao_02) {
        this.a.clear();
        for (ar_0 ar_02 : ao_02.b()) {
            evq_1 evq_12 = evp_12.a(ar_02.c());
            fiv_0 fiv_02 = this.a(evq_12);
            List<kR> list = ar_02.d();
            for (kR kR2 : list) {
                exk_2 exk_22 = eyl_1.a(kR2.c());
                fiv_02.b(exk_22, (byte)kR2.f());
            }
        }
    }

    public void a(zf_1 zf_12) {
        TIntObjectIterator tIntObjectIterator = this.a.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fiv_0 fiv_02 = (fiv_0)tIntObjectIterator.value();
            zg_1 zg_12 = new zg_1();
            fiv_02.a(zg_12.a);
            zf_12.a.add(zg_12);
        }
    }

    public void a(evp_1 evp_12, zf_1 zf_12) {
        this.a.clear();
        int n = zf_12.a.size();
        for (int k = 0; k < n; ++k) {
            zg_1 zg_12 = zf_12.a.get(k);
            fiv_0 fiv_02 = (fiv_0)this.a.get(zg_12.a.a);
            if (fiv_02 == null) {
                fiv_02 = this.a(evp_12.a(zg_12.a.a));
            }
            fiv_02.b(zg_12.a);
        }
    }

    public Collection<fiv_0> d() {
        return this.a.valueCollection();
    }

    public String toString() {
        return "StorageBoxInventory{m_compartments=" + this.a.size() + "}";
    }
}

