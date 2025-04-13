/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bFb
 */
public class bfb_0
extends bfr_0 {
    private bFc al;

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.al = new bFc(this);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.al = null;
    }

    @Override
    public void a(@NotNull pj_0 pj_02) {
        super.a(pj_02);
        ((bcr_1)pj_02).a(this);
    }

    private void aR() {
        if (this.ad == null) {
            super.e();
            return;
        }
        bcr_1 bcr_12 = (bcr_1)this.ad;
        int n = this.aG();
        super.b(n);
        this.e(bcr_12.ao());
        this.g(bcr_12.ao());
        int n2 = bcr_12.aq();
        Object r2 = eyo_1.g().d(n2);
        if (r2 == null) {
            super.e();
            return;
        }
        if (this.a(bcr_12, (ezr_0)r2)) {
            super.e();
            return;
        }
        if (this.a((ezr_0)r2)) {
            super.e();
        }
    }

    private boolean a(ezr_0 ezr_02) {
        abc_2<efh_0> abc_22 = ezr_02.q();
        for (efh_0 efh_02 : abc_22) {
            if (efh_02.j() != efc_0.eq.a()) continue;
            int n = efh_02.a(0, (short)0, eFb.a);
            fie_0 fie_02 = fih_0.a().a(n);
            if (fie_02 == null) continue;
            this.a(fie_02);
        }
        return false;
    }

    private void a(fie_0 fie_02) {
        ArrayList<efh_0> arrayList = fie_02.e((short)0);
        for (efh_0 efh_02 : arrayList) {
            byte by = ((bcr_1)this.d()).ap();
            apc_2 apc_22 = efh_02.Q();
            if (apc_22 == null) {
                this.a(efh_02);
                continue;
            }
            if (!(apc_22 instanceof exS) || ((exS)apc_22).d() != by) continue;
            this.a(efh_02);
        }
    }

    private void a(efh_0 efh_02) {
        List<rg_0> list = efh_02.X();
        for (rg_0 rg_02 : list) {
            this.a(efh_02, rg_02);
        }
    }

    private boolean a(efh_0 efh_02, rg_0 rg_02) {
        if (rg_02.a() == ri_0.f) {
            Rv rv = (Rv)rg_02;
            bjy_0 bjy_02 = new bjy_0(efh_02, rv.e(), rv.g(), rv.f());
            bjy_02.a(this, false);
            return true;
        }
        if (rg_02.a() == ri_0.r) {
            Rw rw = (Rw)rg_02;
            bjd_0 bjd_02 = new bjd_0(efh_02, rw.e(), rw.f(), rw.g());
            bjd_02.a((abz_0)this, false);
            return true;
        }
        return false;
    }

    private boolean a(bcr_1 bcr_12, ezr_0 ezr_02) {
        eyw_1 eyw_12 = ezr_02.p();
        if (eyw_12 == null) {
            super.e();
            return false;
        }
        if (eyw_12.f() != eyx_1.u) {
            super.e();
            return false;
        }
        short s2 = ((bjf_2)eyw_12).g();
        bhd_1 bhd_12 = bhe_0.a().a(s2);
        if (bhd_12 == null) {
            Y.error((Object)("Panoplie inconnue " + s2));
            super.e();
            return false;
        }
        for (bjw_1 bjw_12 : bhd_12) {
            exq_1 exq_12 = bjw_12.F();
            byte by = exq_12.h()[0].a();
            this.al.a(bjw_12, (short)by, bcr_12.ap());
        }
        return true;
    }

    @Override
    protected void a(byte by, boolean bl, TI tI, aej_2 aej_22) {
        this.a(aej_22);
    }

    @Override
    public void e() {
        this.aR();
    }

    @Override
    public void b(int n) {
        if (this.ad == null) {
            super.b(n);
            return;
        }
        this.aR();
    }

    static /* synthetic */ void a(bfb_0 bfb_02, abm_1 abm_12) {
        bfb_02.a(abm_12);
    }

    static /* synthetic */ Logger aK() {
        return Y;
    }

    static /* synthetic */ Logger aL() {
        return Y;
    }
}

