/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.procedure.TIntIntProcedure
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.procedure.TIntIntProcedure;

/*
 * Renamed from eUb
 */
public class eub_2 {
    private final fkc_0 a;
    private final short b;
    final TIntIntHashMap c = new TIntIntHashMap();

    public eub_2(fkc_0 fkc_02, short s2) {
        this.a = fkc_02;
        this.b = s2;
        this.b();
    }

    private void b() {
        etw_2 etw_22 = eti_2.a.a(this.b);
        etk_2 etk_22 = eti_2.a.c(etw_22.d());
        etk_22.a(new euc_2(this));
    }

    int a(etx_2 etx_22) {
        ett_1 ett_12 = new ett_1(etx_22.a());
        this.a.a(ett_12);
        return Hw.a(0, etx_22.b() - ett_12.a(), new int[0]);
    }

    public boolean a(TIntIntProcedure tIntIntProcedure) {
        return this.c.forEachEntry(tIntIntProcedure);
    }

    public boolean a() {
        return !this.c.isEmpty();
    }
}

