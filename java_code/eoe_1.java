/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongIntProcedure
 */
import gnu.trove.procedure.TLongIntProcedure;

/*
 * Renamed from eOE
 */
class eoe_1
implements TLongIntProcedure {
    final /* synthetic */ abx_2 a;
    final /* synthetic */ eoi_1 b;

    eoe_1(abx_2 abx_22, eoi_1 eoi_12) {
        this.a = abx_22;
        this.b = eoi_12;
    }

    public boolean execute(long l, int n) {
        this.a.a(l);
        this.a.a(n);
        this.a.a((byte)(this.b.b(l) ? 1 : 0));
        return true;
    }
}

