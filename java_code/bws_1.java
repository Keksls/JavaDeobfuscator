/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bws
 */
public final class bws_1 {
    private static final Logger a = Logger.getLogger(bws_1.class);
    private final bwh_0 b;
    private final cui_2 c;

    public bws_1(bwh_0 bwh_02, cui_2 cui_22) {
        this.b = bwh_02;
        this.c = cui_22;
    }

    public void a() {
        if (this.b == null) {
            a.error((Object)("[FIGHT] On veut executer un sort sur un combat inconnu " + this.c.d()));
            return;
        }
        blx_1 blx_12 = this.b.e(this.c.g());
        if (blx_12 == null) {
            return;
        }
        biI biI2 = blx_12.bv();
        biI2.bZ();
        bpl_0 bpl_02 = this.a(blx_12);
        if (bpl_02 == null) {
            return;
        }
        bwa_0.a(this.c.e(), this.c.b(), this.c.d(), blx_12);
        this.a(this.c.h());
    }

    private bpl_0 a(blx_1 blx_12) {
        bpl_0 bpl_02;
        fiz<bpl_0> fiz2 = blx_12.aZ();
        if (fiz2 != null && fiz2.a() != null) {
            bpl_02 = (bpl_0)fiz2.a().a(this.c.h());
        } else {
            bpn_0 bpn_02 = new bpn_0(blx_12);
            bpl_02 = bpn_02.a(this.c.h());
        }
        return bpl_02;
    }

    private void a(yt_2 yt_22) {
        bbL bbL2 = new bbL(this.c.e(), this.c.c().a(), this.c.b(), this.c.d(), yt_22, this.c.o(), this.c.p(), this.c.g(), this.c.i(), this.c.j(), this.c.k());
        akx_1 akx_12 = baa_0.a().a(this.c.d(), (aku_1)bbL2);
        bbL2.a(new bZR(akx_12), new alb_1(akx_12));
    }
}

