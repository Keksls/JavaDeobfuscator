/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eIY
 */
public class eiy_0
extends ejh_0 {
    private static final aqr_2 x = new eFw(new eFv("Decurse d'etat", new eFu("id de l'\u00e9tat \u00e0 retirer", eFx.a)), new eFv("Decurse d'etat", new eFu("id de l'\u00e9tat \u00e0 retirer", eFx.a), new eFu("Niveau de l'etat a retirer", eFx.c)));
    protected int v = 0;
    private boolean y = false;

    @Override
    public aqr_2 c_() {
        return x;
    }

    public eiy_0() {
        this.M();
    }

    public static eiy_0 a(So<efh_0> so, int n, Su su) {
        assert (su != null) : "No target defined for StateDecurse effect";
        eiy_0 eiy_02 = new eiy_0();
        eiy_02.i = efc_0.es.a();
        eiy_02.l = ((ejh_0)efc_0.es.b()).e();
        eiy_02.M();
        eiy_02.f = su;
        eiy_02.m = n;
        eiy_02.n = -1;
        eiy_02.h = so;
        return eiy_02;
    }

    public eiy_0 aD() {
        return new eiy_0();
    }

    @Override
    public void M() {
        super.M();
        this.c(2225);
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        ArrayList<eja_0> arrayList = new ArrayList<eja_0>();
        if (this.f == null) {
            a.warn((Object)"[Effect] Impossible d'appliquer un desenvoutement car la cible est null");
            this.j(true);
            return;
        }
        se_0 se_02 = this.f.x_();
        if (se_02 == null) {
            return;
        }
        int n = 0;
        n = this.a(arrayList, se_02, n);
        if (arrayList.isEmpty()) {
            this.ba();
            return;
        }
        int n2 = 0;
        int n3 = 0;
        for (eja_0 eja_02 : arrayList) {
            if (eja_02.aT()) {
                ++n2;
            } else {
                ++n3;
            }
            ((eJL)se_02).a((sd_0)eja_02, true);
        }
        this.c(sd_02, bl);
        if (this.D() && this.y && n > 0) {
            this.a(n, sd_02, n2 > n3);
        }
    }

    protected int a(List<eja_0> list, se_0 se_02, int n) {
        for (sd_0 sd_02 : se_02) {
            eja_0 eja_02;
            fie_0 fie_02;
            if (!(sd_02 instanceof eja_0) || (fie_02 = (eja_02 = (eja_0)sd_02).aF()).p() != this.m || fie_02.w() && !eGm.v.contains((int)fie_02.p())) continue;
            list.add(eja_02);
            n = fie_02.c() - this.v;
        }
        return n;
    }

    private void a(int n, sd_0 sd_02, boolean bl) {
        int n2 = fie_0.a((short)this.m, (short)n);
        eja_0 eja_02 = eja_0.a(this.h, this.e, (efi_0)this.d, n2);
        if (eja_02 == null) {
            a.error((Object)("Etat inconnu id " + this.m + ", level " + n + ", effet correspondant : " + (Serializable)(this.c != null ? Integer.valueOf(((efh_0)this.c).i()) : "null")));
            return;
        }
        efn_0 efn_02 = efn_0.a(true, false, null);
        eja_02.a(efn_02);
        eja_02.a((efi_0)this.d);
        eja_02.a(this.aE());
        eja_02.a(this.K());
        eja_02.a(sd_02);
        eja_02.g(bl);
        eja_02.c(this.f);
        eja_02.q();
    }

    private efh_0 aE() {
        if (this.f() == null) {
            return eFD.ad();
        }
        if (((efh_0)this.f()).N()) {
            if (((efh_0)this.f()).M()) {
                return eFO.ad();
            }
            return eFP.ad();
        }
        if (((efh_0)this.f()).M()) {
            return eFN.ai();
        }
        return eFD.ad();
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        if (this.c == null) {
            return;
        }
        this.m = ((efh_0)this.c).a(0, s2, eFb.a);
        if (((efh_0)this.c).F() > 1) {
            this.v = ((efh_0)this.c).a(1, s2, eFb.a);
            this.y = true;
        }
    }

    @Override
    public void al() {
        super.al();
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

