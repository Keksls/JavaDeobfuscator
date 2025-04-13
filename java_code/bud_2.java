/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bUd
 */
class bud_2
implements TObjectProcedure<etx_2> {
    final /* synthetic */ ani_2 a;
    final /* synthetic */ buc_2 b;

    bud_2(buc_2 buc_22, ani_2 ani_22) {
        this.b = buc_22;
        this.a = ani_22;
    }

    public boolean a(etx_2 etx_22) {
        int n;
        fkP fkP2;
        if (this.a.q() > 0) {
            this.a.m();
        }
        if ((fkP2 = this.b.a(etx_22.a())) != null) {
            this.a.a(azf_2.h.w());
        }
        if ((n = etx_22.b()) > 1) {
            this.a.d(n).a((CharSequence)"x");
        }
        this.a.a((CharSequence)bae.h().a(134, (long)etx_22.a(), new Object[0]));
        if (fkP2 != null) {
            this.a.j();
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((etx_2)object);
    }
}

