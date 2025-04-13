/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from btq
 */
class btq_0
implements TObjectProcedure<bts_0> {
    final /* synthetic */ boolean a;
    final /* synthetic */ btn_0 b;
    final /* synthetic */ bto_0 c;

    btq_0(bto_0 bto_02, boolean bl, btn_0 btn_02) {
        this.c = bto_02;
        this.a = bl;
        this.b = btn_02;
    }

    public boolean a(bts_0 bts_02) {
        bts_02.a(this.a);
        if (this.b.c(this.c.f, bts_02.a())) {
            this.b.d(this.c.f, bts_02.a());
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bts_0)object);
    }
}

