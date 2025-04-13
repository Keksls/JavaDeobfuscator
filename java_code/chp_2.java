/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from chp
 */
final class chp_2
extends chd_1<ctu_2, bvx_2> {
    private static final Logger b = Logger.getLogger(chp_2.class);

    chp_2() {
    }

    @Override
    public boolean a(ctu_2 ctu_22) {
        int n = ctu_22.d();
        if (this.a == null || ((bvx_2)this.a).c() != n) {
            b.error((Object)("[_FL_] Frame invalide \u00e0 la r\u00e9ception d'un message " + ctu_2.class.getSimpleName()));
            return false;
        }
        bbi_0 bbi_02 = new bbi_0(ctu_22.a(), emd_1.X.a(), 0, n, ctu_22.g());
        baa_0.a().a((bvx_2)this.a, (aku_1)bbi_02);
        baa_0.a().a(this.a);
        return false;
    }
}

