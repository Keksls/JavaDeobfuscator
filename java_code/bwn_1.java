/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.Collection;

/*
 * Renamed from bwn
 */
public final class bwn_1 {
    private final bvx_2 a;

    public bwn_1(bvx_2 bvx_22) {
        this.a = bvx_22;
    }

    public bvw_2 a() {
        blx_1 blx_1222;
        bvw_2 bvw_22 = new bvw_2(this.a.af_(), this.a.aE().h(), this.a.G(), this.a.H());
        bvw_22.a(this.a.c());
        bvw_22.a(this.a.e());
        tg_0 tg_02 = this.a.g();
        bvw_22.a(tg_02);
        bmr_1 bmr_12 = azu_0.j().k();
        for (blx_1 blx_1222 : this.a.ax()) {
            if (blx_1222 != bmr_12) {
                bvw_22.a(blx_1222, blx_1222.Y());
            }
            blx_1222.bv().bZ();
        }
        blx_1 blx_13 = (blx_1)this.a.s((byte)1);
        blx_1222 = (blx_1)this.a.s((byte)0);
        if (blx_13 != null) {
            bvw_22.e(blx_13);
            bvw_22.f(blx_13.a_());
        }
        if (blx_1222 != null) {
            bvw_22.f(blx_1222);
            bvw_22.g(blx_1222.a_());
        }
        bvw_22.a(this.a.A().u());
        Collection<sr_0> collection = this.a.aB();
        for (sr_0 object : collection) {
            apw_0.a().c(object);
        }
        apw_0.a().c(this.a.ad());
        bxo_2 bxo_22 = this.a.A();
        if (bxo_22 != null) {
            bxo_22.c();
            bxo_22.z();
        }
        this.a.m();
        tg_02.a(true, false);
        bwj_1.a().a(bvw_22);
        this.a(bvw_22);
        for (blx_1 blx_12 : bvw_22.j()) {
            blx_12.a(-1);
            eJL eJL2 = blx_12.dR();
            for (sd_0 sd_02 : eJL2) {
                sd_02.a(bvw_22.h());
            }
            blx_12.a((bwm_2)null);
            blx_12.a(bvw_22);
            blx_12.a(bvw_22.c());
        }
        return bvw_22;
    }

    private void a(bvw_2 bvw_22) {
        aff_1 aff_12 = bvw_22.g().s();
        cch_1 cch_12 = (cch_1)ccm_1.g().c(aff_12.d(), aff_12.e());
        if (cch_12 == null) {
            return;
        }
        abo_2<Short, Short> abo_22 = new abo_2<Short, Short>((short)cch_12.a(), (short)cch_12.b());
        bvw_22.a(Lists.newArrayList((Object[])new abo_2[]{abo_22}));
        ccm_1.g().a(bvw_22);
    }
}

