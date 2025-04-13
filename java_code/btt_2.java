/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bTT
 */
class btt_2
implements TObjectProcedure<esa_2> {
    final /* synthetic */ ahh_2 a;
    final /* synthetic */ bts_2 b;

    btt_2(bts_2 bts_22, ahh_2 ahh_22) {
        this.b = bts_22;
        this.a = ahh_22;
    }

    public boolean a(esa_2 esa_22) {
        if (this.b.a.b.b(esa_22.e())) {
            this.a.a();
        }
        if (this.b.a.b.b(esa_22.c())) {
            this.a.a();
        }
        if (this.b.a.b.b(esa_22.f())) {
            this.a.a();
        }
        if (this.b.a.b.b(esa_22.d())) {
            this.a.a();
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((esa_2)object);
    }
}

