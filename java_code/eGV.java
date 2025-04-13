/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class eGV
extends ejh_0 {
    private static final int v = Integer.MIN_VALUE;
    private static final aqr_2 w = new eFw(new eFv("D\u00e9faut (on retire tous les effets)", new eFu[0]), new eFv("D\u00e9senvoutement avec l'id AGT", new eFu("Id de l'effet a retirer (ID AGT)", eFx.b)), new eFv("D\u00e9senvoutement avec l'id de l'action", new eFu("Id de l'effet a retirer (ID de l'action)", eFx.b), new eFu("Pas d'utilit\u00e9", eFx.b)));

    @Override
    public aqr_2 c_() {
        return w;
    }

    public eGV aD() {
        eGV eGV2 = new eGV();
        return eGV2;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        this.j(true);
        if (this.c == null || this.f == null || this.f.x_() == null) {
            return;
        }
        ArrayList<ejh_0> arrayList = new ArrayList<ejh_0>();
        boolean bl2 = ((efh_0)this.c).F() == 2;
        int n = ((efh_0)this.c).F() > 0 ? ((efh_0)this.c).a(0, this.aZ(), eFb.a) : Integer.MIN_VALUE;
        for (sd_0 sd_03 : this.f.x_()) {
            if (sd_03.f() == null) continue;
            int n2 = bl2 ? sd_03.f().j() : ((efh_0)((ejh_0)sd_03).f()).i();
            if (((ejh_0)sd_03).f() != null && n == n2) {
                arrayList.add((ejh_0)sd_03);
                continue;
            }
            if (!this.l(sd_03) || sd_03.bt_() == efc_0.eT.a() || n != Integer.MIN_VALUE) continue;
            arrayList.add((ejh_0)sd_03);
        }
        for (ejh_0 ejh_02 : arrayList) {
            ejh_02.i(true);
            this.f.x_().b(ejh_02);
        }
    }

    private boolean l(sd_0 sd_02) {
        fie_0 fie_02;
        boolean bl;
        boolean bl2;
        boolean bl3 = bl2 = sd_02.f() != null && sd_02.f().h() == 2;
        if (bl2 && !(bl = ((efp_0)sd_02.f()).ad())) {
            return false;
        }
        if (sd_02 instanceof eja_0 && (fie_02 = ((eja_0)sd_02).aF()) != null && (fie_02.w() || !fie_02.x())) {
            return false;
        }
        Object EC = sd_02.k();
        if (EC == null) {
            return false;
        }
        int n = EC.G_();
        if (n == 3) {
            return true;
        }
        if (n == 1) {
            return true;
        }
        if (n != 11) {
            return false;
        }
        if (!(EC instanceof fio_0)) {
            return true;
        }
        fio_0 fio_02 = (fio_0)EC;
        return !((fin_0)fio_02.r()).w();
    }

    @Override
    public void j(sd_0 sd_02) {
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

