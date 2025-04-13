/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from chj
 */
final class chj_2
extends chd_1<cto_2, bvx_2> {
    private static Logger b = Logger.getLogger(chj_2.class);

    chj_2() {
    }

    @Override
    public boolean a(cto_2 cto_22) {
        bcg_0 bcg_02 = new bcg_0(alc_1.q(), emd_1.ah.a(), 0, ((bvx_2)this.a).c());
        bcg_02.a(cto_22.f());
        bcg_02.a(cto_22.c());
        bcg_02.b(cto_22.b());
        bcg_02.d(cto_22.e());
        bcg_02.a(cto_22.h());
        baa_0.a().a((bvx_2)this.a, (aku_1)bcg_02);
        baa_0.a().a(this.a);
        return false;
    }

    private void a(blx_1 blx_12, byte[] byArray, byte[] byArray2) {
        if (blx_12 == null) {
            return;
        }
        blx_12.a((bvx_2)this.a, byArray, byArray2);
    }
}

