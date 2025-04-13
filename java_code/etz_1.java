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
 * Renamed from eTZ
 */
public class etz_1 {
    private final esl_1 a;
    private final short b;
    final TIntIntHashMap c = new TIntIntHashMap();

    public etz_1(esl_1 esl_12, short s2) {
        this.a = esl_12;
        this.b = s2;
        this.b();
    }

    private void b() {
        etw_2 etw_22 = eti_2.a.a(this.b);
        etk_2 etk_22 = eti_2.a.c(etw_22.d());
        etk_22.a(new eua_2(this));
    }

    int a(etx_2 etx_22) {
        return Hw.a(0, etx_22.b() - this.a.a(etx_22.a()), new int[0]);
    }

    public boolean a(TIntIntProcedure tIntIntProcedure) {
        return this.c.forEachEntry(tIntIntProcedure);
    }

    public boolean a() {
        return !this.c.isEmpty();
    }
}

