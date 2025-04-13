/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from chW
 */
final class chw_1
extends chd_1<ctj_1, bvx_2> {
    private static final Logger b = Logger.getLogger(chw_1.class);

    chw_1() {
    }

    @Override
    public boolean a(ctj_1 ctj_12) {
        if (this.a != null) {
            chv_1.d.b = true;
            chv_1.d.c.a((bvx_2)this.a);
            azu_0.j().a(cgz_1.a());
            bcj_0 bcj_02 = new bcj_0(alc_1.q(), emd_1.ab.a(), 0, (bvx_2)this.a, ctj_12, chv_1.d.c);
            baa_0.a().a((bvx_2)this.a, (aku_1)bcj_02);
            baa_0.a().a(this.a);
        } else {
            b.error((Object)String.format("Impossible de crer le fight typeId=%d fightId=%d !", ctj_12.i(), ctj_12.d()));
        }
        return false;
    }
}

