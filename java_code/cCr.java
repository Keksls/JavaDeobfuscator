/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class cCr
implements adx_1<cwo_1> {
    private static final Logger a = Logger.getLogger(cCr.class);

    @Override
    public boolean a(cwo_1 cwo_12) {
        long l = cwo_12.c();
        long l2 = cwo_12.b();
        long l3 = cwo_12.d();
        bmv_1 bmv_12 = (bmv_1)bmf_2.a().c(l);
        if (bmv_12 == null) {
            a.warn((Object)("Reception d'un messsage d'action pour le monstre " + l + " alors qu'on ne le connait pas"));
            return false;
        }
        bnh_1 bnh_12 = (bnh_1)bmf_2.a().c(l2);
        if (bnh_12 == null) {
            a.warn((Object)("Reception d'un messsage d'action pour le monstre " + l + "\tiniti\u00e9 par le joueur " + l2 + " alors qu'on ne le connait pas"));
            return false;
        }
        bpp_1 bpp_12 = bmv_12.cW().a(l3);
        if (bpp_12 == null) {
            a.error((Object)("Reception d'un messsage d'action " + l3 + " inconnu pour le monstre " + l));
            return false;
        }
        fii fii2 = bpp_12.a();
        bOE.a(bnh_12.bv(), fii2);
        bbs bbs2 = new bbs(alc_1.q(), 0, 0, bpp_12.d(), bmv_12, bnh_12);
        bbt.a.a(bbs2);
        bbt.a.a();
        return false;
    }

    @Override
    public int a() {
        return 12299;
    }
}

