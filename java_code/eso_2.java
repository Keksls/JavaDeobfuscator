/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eSo
 */
class eso_2
implements TObjectProcedure<eth_2> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ esq_2 d;
    final /* synthetic */ esn_1 e;

    eso_2(esn_1 esn_12, int n, int n2, long l, esq_2 esq_22) {
        this.e = esn_12;
        this.a = n;
        this.b = n2;
        this.c = l;
        this.d = esq_22;
    }

    public boolean a(eth_2 eth_22) {
        aff_1 aff_12 = new aff_1(eth_22.b());
        aff_12.a(this.a, this.b);
        long l = esy_1.a();
        long l2 = TC.a();
        this.e.a(this.c, l, l2);
        TG tG = this.d.a(this.c, eth_22.a(), l, l2, aff_12);
        if (tG == null) {
            this.e.c(l);
            throw new eto_2(esz_1.D, "Impossible de spawner l'\u00e9l\u00e9ment.");
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((eth_2)object);
    }
}

