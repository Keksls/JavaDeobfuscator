/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from ccl
 */
class ccl_1
implements TObjectProcedure<pj_0> {
    final /* synthetic */ aff_1 a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ short d;
    final /* synthetic */ bmr_1 e;
    final /* synthetic */ cch_1 f;

    ccl_1(cch_1 cch_12, aff_1 aff_12, int n, int n2, short s2, bmr_1 bmr_12) {
        this.f = cch_12;
        this.a = aff_12;
        this.b = n;
        this.c = n2;
        this.d = s2;
        this.e = bmr_12;
    }

    public boolean a(pj_0 pj_02) {
        this.a.c(this.b, this.c, this.d);
        if ((pj_02 instanceof bEA || pj_02 instanceof bcb_2) && pj_02.G() == this.b && pj_02.H() == this.c && pj_02.I() <= this.d && pj_02.I() + 6 > this.d) {
            pj_02.a(Tv.f, this.e);
        } else if (pj_02 instanceof bge_1) {
            bge_1 bge_12 = (bge_1)pj_02;
            boolean bl = bge_12.b(this.a);
            boolean bl2 = bge_12.ao();
            if (bl && !bl2) {
                pj_02.a(Tv.j, this.e);
            } else if (!bl && bl2) {
                pj_02.a(Tv.k, this.e);
            } else if (bl && bl2) {
                pj_02.a(Tv.f, this.e);
            }
        } else if (pj_02.b(this.a)) {
            pj_02.a(pj_02.v(), this.e);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((pj_0)object);
    }
}

