/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cjj
 */
final class cjj_2
implements adx_1<cam_0> {
    private static final Logger a = Logger.getLogger(cjj_2.class);

    cjj_2() {
    }

    @Override
    public boolean a(cam_0 cam_02) {
        long l = cam_02.d();
        long l2 = cam_02.c();
        long l3 = cam_02.b();
        bnh_1 bnh_12 = (bnh_1)euw_2.a.d(l);
        if (bnh_12 == null) {
            return false;
        }
        if (l2 == 0L) {
            bnh_12.eV().j();
            bnh_12.m(0L);
        } else {
            bnh_12.eV().b(l2);
            bnh_12.m(l3);
        }
        byp_2.a().b();
        fis_1.a().a((ajf_1)bnh_12, "hasGuild");
        return false;
    }

    @Override
    public int a() {
        return 14588;
    }
}

