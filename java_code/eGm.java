/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class eGm
extends eGX {
    private static final aqr_2 A = new eFw(new eFv("apply avec gestion des resistances/boosts", new eFu("stateId", eFx.a), new eFu("level", eFx.c), new eFu("pourcentage d'application (-1 = application forc\u00e9e)", eFx.c)), new eFv("Level en fonction d'un autre sort", new eFu("stateId", eFx.a), new eFu("level (Inutile)", eFx.c), new eFu("pourcentage d'application (-1 = application forc\u00e9e)", eFx.c), new eFu("id du sort", eFx.c)), new eFv("Level en fonction d'un autre sort", new eFu("stateId", eFx.a), new eFu("level (Inutile)", eFx.c), new eFu("pourcentage d'application (-1 = application forc\u00e9e)", eFx.c), new eFu("id du sort", eFx.c), new eFu("Multiplicateur", eFx.c)), new eFv("Proba en fonction du level d'un autre \u00e9tat", new eFu("stateId", eFx.a), new eFu("level", eFx.c), new eFu("pourcentage d'application (-1 = application forc\u00e9e)", eFx.c), new eFu("id de l'\u00e9tat qui va modifier la proba", eFx.c), new eFu("appliquer si \u00e9tat pas pr\u00e9sent (0=non, 1=oui)", eFx.c), new eFu("modification du % par niveau de l'\u00e9tat", eFx.c)), new eFv("Verifier l'etat modificateur sur la cible", new eFu("stateId", eFx.a), new eFu("level", eFx.c), new eFu("pourcentage d'application (-1 = application forc\u00e9e)", eFx.c), new eFu("id de l'\u00e9tat qui va modifier la proba", eFx.c), new eFu("appliquer si \u00e9tat pas pr\u00e9sent (0=non, 1=oui)", eFx.c), new eFu("modification du % par niveau de l'\u00e9tat", eFx.c), new eFu("etat modificateur sur la cible (0=non (defaut), 1=oui)", eFx.c)));
    public static final TIntArrayList v = new TIntArrayList();
    protected int w;
    protected short x;
    protected short y = (short)-1;
    protected short z;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;

    public eGm() {
        this.M();
    }

    @Override
    public aqr_2 c_() {
        return A;
    }

    public eGm aD() {
        eGm eGm2 = new eGm();
        this.a(eGm2);
        return eGm2;
    }

    @Override
    protected void a(eGm eGm2) {
        eGm2.x = this.x;
        eGm2.w = this.w;
        eGm2.y = this.y;
        eGm2.z = this.z;
    }

    @Override
    public void z() {
        this.B = false;
        this.w = 0;
        this.D = false;
        this.C = false;
        this.E = false;
        this.z = 0;
        super.z();
    }

    public static eGm a(So<efh_0> so, Su su, short s2, short s3, boolean bl) {
        eGm eGm2 = new eGm();
        eGm2.i = efc_0.eq.a();
        eGm2.l = ((ejh_0)efc_0.eq.b()).e();
        eGm2.M();
        eGm2.f = su;
        eGm2.s = true;
        eGm2.x = s2;
        eGm2.y = s3;
        eGm2.z = s3;
        eGm2.w = fie_0.a(eGm2.x, eGm2.y);
        eGm2.B = bl;
        eGm2.n = -1;
        eGm2.h = so;
        return eGm2;
    }

    @Override
    public void M() {
        super.M();
        this.c(2226);
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null || this.f.x_() == null) {
            this.j(true);
            return;
        }
        if (this.e == null) {
            this.j(true);
            return;
        }
        this.b((byte)5);
        List<eja_0> list = this.aP();
        if (this.D) {
            return;
        }
        this.a(list);
        if (this.D()) {
            this.c(sd_02, bl);
            try {
                this.l(sd_02);
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    public void a(int n, float f2, boolean bl) {
        switch (n) {
            case 4: {
                this.y = bl ? (short)f2 : (short)((float)this.y + f2);
                this.w = fie_0.a(this.x, this.y);
                this.z = this.y;
                break;
            }
            case 7: {
                this.y = bl ? (short)xh_0.a((float)this.y * f2 / 100.0f) : (short)(this.y + xh_0.a((float)this.y * f2 / 100.0f));
                this.w = fie_0.a(this.x, this.y);
                this.z = this.y;
            }
        }
    }

    private boolean aN() {
        if (this.f == null) {
            return true;
        }
        if (!this.f.y_()) {
            return false;
        }
        se_0 se_02 = this.f.x_();
        if (se_02 == null) {
            a.warn((Object)("Try to apply state on target without " + se_0.class + " (But target declare have it) (Target: " + this.f + " , effect related: " + this.o() + ")"));
            return false;
        }
        for (sd_0 sd_02 : se_02) {
            if (sd_02.bt_() != efc_0.b.a() || !((eja_0)sd_02).aF().y().contains((int)this.x)) continue;
            this.b((byte)2);
            return true;
        }
        return false;
    }

    private List<eja_0> aP() {
        this.x = fie_0.b(this.w);
        this.y = fie_0.c(this.w);
        ArrayList<eja_0> arrayList = new ArrayList<eja_0>();
        for (sd_0 sd_02 : this.f.x_()) {
            if (sd_02 == null || sd_02.bt_() != efc_0.b.a() || ((eja_0)sd_02).aF().p() != this.x) continue;
            fie_0 fie_02 = ((eja_0)sd_02).aF();
            if (fie_02.w() && !fie_02.A()) {
                this.j(true);
                this.D = true;
                return Collections.emptyList();
            }
            if (fie_02.A() && (fie_02.c() < fie_02.D() || fie_02.J())) {
                this.y = (short)(this.y + fie_02.c());
                this.w = fie_0.a(this.x, this.y);
                arrayList.add((eja_0)sd_02);
                continue;
            }
            if (fie_02.v() && this.y >= fie_02.c()) {
                arrayList.add((eja_0)sd_02);
                continue;
            }
            this.j(true);
            this.D = true;
            return Collections.emptyList();
        }
        return arrayList;
    }

    @Override
    private void a(List<eja_0> list) {
        if (list != null) {
            for (eja_0 eja_02 : list) {
                eja_02.i(true);
                this.f.x_().b(eja_02);
            }
        }
    }

    private efh_0 aQ() {
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

    private void l(sd_0 sd_02) {
        efh_0 efh_02;
        this.w = fie_0.a(this.x, this.y);
        eja_0 eja_02 = eja_0.a(this.h, this.e, (efi_0)this.d, this.w);
        if (eja_02 == null) {
            return;
        }
        if (this.B) {
            eja_02.aD();
        }
        if (v.contains((int)this.x)) {
            eja_02.aD();
        }
        this.a(eja_02);
        efn_0 efn_02 = efn_0.a(true, false, null);
        if (this.E) {
            efn_02.c(true);
        }
        eja_02.a(efn_02);
        eja_02.a((efi_0)this.d);
        eja_02.e(this.E);
        eja_02.a(this.aQ());
        eja_02.a(this.K());
        eja_02.a(sd_02);
        eja_02.V();
        if (this.bc()) {
            eja_02.h(true);
        }
        eja_02.g((efh_02 = (efh_0)this.f()) != null && efh_02.a(1L));
        eja_02.c(this.f);
        eja_02.q();
    }

    @Override
    protected void a(eja_0 eja_02) {
    }

    protected int aE() {
        if (this.c == null) {
            return 100;
        }
        int n = this.aF();
        if (n == -1) {
            return 100;
        }
        if (n == -2) {
            return 0;
        }
        short s2 = (short)((efh_0)this.c).a(0, this.aZ(), eFb.a);
        fie_0 fie_02 = fih_0.a().a(s2);
        if (fie_02 == null) {
            a.error((Object)("UNable to check application probability for state " + s2 + " : this state is unknown"));
            return 0;
        }
        fii_0 fii_02 = fie_02.I();
        if (fii_02 == fii_0.c) {
            return Hw.a(n, 0, 100);
        }
        float f2 = 0.0f;
        if (this.f != null && this.f.a(eps_0.O)) {
            f2 -= (float)this.f.c(eps_0.O);
        }
        if (this.e != null && this.e.a(eps_0.N)) {
            f2 += (float)this.e.c(eps_0.N);
        }
        n += (int)((float)n * f2 / 100.0f);
        return Hw.a(n, 0, 100);
    }

    protected int aF() {
        int n = ((efh_0)this.c).a(2, this.aZ(), eFb.a);
        if (((efh_0)this.c).F() < 6) {
            return n;
        }
        se_0 se_02 = this.aG();
        if (!(se_02 instanceof eJL)) {
            return n;
        }
        eJL eJL2 = (eJL)se_02;
        int n2 = ((efh_0)this.c).a(3, this.aZ(), eFb.a);
        boolean bl = ((efh_0)this.c).a(4, this.aZ(), eFb.a) == 1;
        float f2 = ((efh_0)this.c).a(5, this.aZ());
        eja_0 eja_02 = eJL2.i(n2);
        if (eja_02 != null) {
            if (n != -1) {
                int n3 = Math.round(f2 * (float)eja_02.aF().c());
                n += n3;
            }
        } else if (!bl) {
            return -2;
        }
        return n;
    }

    protected se_0 aG() {
        boolean bl;
        if (((efh_0)this.c).F() <= 6) {
            return this.e.x_();
        }
        boolean bl2 = bl = ((efh_0)this.c).a(6, this.aZ(), eFb.a) == 1;
        if (bl) {
            return this.f.x_();
        }
        return this.e.x_();
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        short s2 = this.aZ();
        this.x = (short)((efh_0)this.c).a(0, s2, eFb.a);
        this.a(s2);
        this.z = this.y;
        this.w = fie_0.a(this.x, this.y);
    }

    @Override
    protected void a(short s2) {
        this.y = (short)((efh_0)this.c).a(1, s2, eFb.a);
        int n = ((efh_0)this.c).F();
        if (n != 4 && n != 5) {
            return;
        }
        if (this.e == null || !(this.e instanceof epq_2)) {
            a.error((Object)"Impossible d'appliquer l'etat au niveau param\u00e9tr\u00e9, le caster n'est pas valide");
            return;
        }
        int n2 = ((efh_0)this.c).a(3, s2, eFb.a);
        fiz<? extends fio_0> fiz2 = ((epq_2)this.e).aZ();
        if (fiz2 == null) {
            a.error((Object)"Impossible d'appliquer l'etat au niveau param\u00e9tr\u00e9, le caster n'a pas d'inventaire de sort");
            return;
        }
        fio_0 fio_02 = (fio_0)fiz2.c(n2);
        if (fio_02 == null) {
            a.error((Object)("Impossible d'appliquer l'etat au niveau param\u00e9tr\u00e9, l'inventaire de sort ne contient pas le sort " + n2 + ", breed caster : " + ((epq_2)this.e).gO() + " effect id = " + this.o()));
            return;
        }
        this.y = fio_02.c();
        if (n < 5) {
            return;
        }
        float f2 = ((efh_0)this.c).a(4, s2);
        this.y = (short)((float)this.y * f2);
    }

    @Override
    protected boolean bq_() {
        fie_0 fie_02 = fih_0.a().a(this.x);
        if (fie_02 != null && fie_02.H() == epg.a) {
            return false;
        }
        return this.f != null && this.f.a(eoz_1.av);
    }

    @Override
    public boolean ab() {
        if (this.D()) {
            fie_0 fie_02 = fih_0.a().c(this.w);
            if (fie_02 != null && fie_02.l() != null && !fie_02.l().b(this.e, this.f, this.k(), this.m())) {
                return false;
            }
            if (this.f != null && this.f.a(eoz_1.as) && fie_02 != null && fie_02.H() != epg.a) {
                return false;
            }
            if (this.f != null && this.f.x_() == null) {
                return false;
            }
            if (this.x > 0) {
                int n;
                int n2;
                if (this.aN()) {
                    return false;
                }
                if (!this.C && (n2 = this.aE()) < 100 && n2 < (n = xc_0.a(100))) {
                    this.m = 0;
                    return false;
                }
            }
        }
        return super.ab();
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    public short aI() {
        return this.x;
    }

    public short aJ() {
        return this.y;
    }

    public short aK() {
        return this.z;
    }

    public void aL() {
        this.C = true;
    }

    public void d(boolean bl) {
        this.E = bl;
    }

    public boolean aM() {
        return this.E;
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().b(this.x).d(this.y));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.x = Hw.c((long)iq_02.g());
            this.y = Hw.c((long)iq_02.m());
            this.w = fie_0.a(this.x, this.y);
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }

    static {
        v.add(Cn.f);
    }
}

