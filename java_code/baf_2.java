/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

/*
 * Renamed from bAf
 */
class baf_2
implements TLongObjectProcedure<blx_1> {
    final /* synthetic */ blx_1 a;
    final /* synthetic */ bae_2 b;

    baf_2(bae_2 bae_22, blx_1 blx_12) {
        this.b = bae_22;
        this.a = blx_12;
    }

    public boolean a(long l, blx_1 blx_12) {
        if (blx_12 == this.a) {
            return true;
        }
        aff_1 aff_12 = blx_12.gg();
        byte by = blx_12.X();
        for (int k = aff_12.d() - by; k <= aff_12.d() + by; ++k) {
            for (int i2 = aff_12.e() - by; i2 <= aff_12.e() + by; ++i2) {
                this.b.n.add(bae_2.b(k, i2));
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (blx_1)object);
    }
}

