/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public abstract class eHs
extends ejh_0 {
    private aff_1 x;
    private aff_1 y;
    protected int v = 0;
    protected boolean w = true;
    private int z;
    private boolean A;
    private int B;
    private ti_0 C;
    private List<aff_1> D;

    @Override
    public void M() {
        super.M();
        this.c(185);
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        aff_1 aff_12;
        eKm eKm2 = this.aG();
        if (eKm2 == null) {
            this.j(true);
            return;
        }
        if (eKm2.t() && !this.aA()) {
            this.ba();
            return;
        }
        if (this.D()) {
            this.bx();
        }
        if (this.x == null) {
            if (this.D()) {
                this.bB();
            }
            this.j(true);
            return;
        }
        if (this.h instanceof efq_0 && this.D()) {
            this.aD();
        }
        if (!(aff_12 = new aff_1(eKm2.G(), eKm2.H(), eKm2.I())).equals(this.x)) {
            this.aK();
            this.bw();
        }
        this.m = this.D.size();
        this.c(sd_02, bl);
        if (!this.D()) {
            return;
        }
        this.bB();
        this.a(aff_12);
        if (eKm2 instanceof ekh_0 && this.D()) {
            this.a((ekh_0)eKm2);
        }
    }

    protected void aK() {
        eKm eKm2 = this.aG();
        if (!(eKm2 instanceof erb_2)) {
            return;
        }
        erb_2 erb_22 = (erb_2)((Object)eKm2);
        if (!erb_22.hg()) {
            return;
        }
        int n = egt_0.v.get(eKm2.a_());
        fil_0 fil_02 = fim_0.a().a(n);
        if (fil_02 == null || fil_02.i() == 0) {
            return;
        }
        efh_0 efh_02 = fil_02.b(0);
        efn_0 efn_02 = efn_0.a(true, false, null);
        try {
            efh_02.a((Sm)this.k(), eKm2, this.m(), efc_0.a(), eKm2.G(), eKm2.H(), eKm2.I(), null, efn_02, false);
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
        }
        efn_02.a();
    }

    @Override
    private void a(ekh_0 ekh_02) {
        So so = ekh_02.O();
        if (so == null) {
            return;
        }
        ss_0 ss_02 = so.g();
        if (ss_02 == null) {
            return;
        }
        aff_1 aff_12 = ekh_02.P_();
        Collection<sr_0> collection = ss_02.f();
        ArrayList<sr_0> arrayList = new ArrayList<sr_0>(collection);
        for (sr_0 sr_02 : arrayList) {
            if (!sr_02.P_().equals(aff_12) || sr_02 == ekh_02 || sr_02.w() != ele_0.j.a()) continue;
            sr_02.a(this, null);
        }
    }

    private void aD() {
        elm_0 elm_02 = ((efq_0)this.h).l();
        if (this.D.isEmpty()) {
            return;
        }
        if (!(this.aG() instanceof epq_2)) {
            return;
        }
        elr_0 elr_02 = new elr_0(elm_02, this.aG(), this.D.get(0));
        elr_02.b();
        int n = this.D.size();
        for (int k = 0; k < n; ++k) {
            aff_1 aff_12 = this.D.get(k);
            elr_02.a(aff_12);
            elr_02.c();
            if (elr_02.d() && elr_02.e()) {
                this.D = this.D.subList(0, k + 1);
                this.x = this.D.get(this.D.size() - 1);
                break;
            }
            elr_02.b(aff_12);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    private void a(aff_1 aff_12) {
        if (this.D == null) {
            return;
        }
        elm_0 elm_02 = ((efq_0)this.h).l();
        elr_0 elr_02 = new elr_0(elm_02, this.aG(), this.D.get(0));
        elr_02.b(aff_12);
        aej_2 aej_22 = new afs_2(aff_12.d(), aff_12.e(), aff_12.f(), this.aG().G(), this.aG().H(), this.aG().I()).h();
        int n = this.D.size();
        for (int k = 0; k < n; ++k) {
            aff_1 aff_13 = this.D.get(k);
            elr_02.a(aff_13);
            elr_02.c();
            if (elr_02.d()) {
                this.aG().b(aej_22);
                try {
                    elr_02.g();
                }
                catch (Exception exception) {
                    a.error((Object)"Exception levee", (Throwable)exception);
                }
                finally {
                    this.aG().b((aej_2)null);
                }
            }
            elr_02.b(aff_13);
        }
    }

    boolean aM() {
        return this.aG().hh();
    }

    boolean aN() {
        return this.aG().a(eoz_1.d);
    }

    boolean aP() {
        if (this.a(eff_0.I)) {
            return false;
        }
        eKm eKm2 = this.aG();
        boolean bl = (long)((eqq_1)((Object)this.e)).Y() == eKm2.a_();
        boolean bl2 = bl && eKm2.a(eoz_1.be);
        boolean bl3 = !bl && eKm2.a(eoz_1.bd);
        return eKm2.a(eoz_1.l) || bl3 || bl2;
    }

    boolean aQ() {
        return this.aG().a(eoz_1.ac);
    }

    boolean aR() {
        return this.aG().a(eoz_1.aD);
    }

    boolean aS() {
        return this.aG().a(eoz_1.ar);
    }

    private void bw() {
        this.aG().b(this.x.d(), this.x.e(), this.x.f());
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.aG() == null) {
            return;
        }
        if (!this.aE()) {
            this.x = null;
            return;
        }
        short s2 = this.aZ();
        if (this.c != null) {
            this.v = ((efh_0)this.c).F() >= 1 ? ((efh_0)this.c).a(0, s2, eFb.a) : this.g.c(this.aG().G(), this.aG().H());
            if (((efh_0)this.c).F() >= 2) {
                this.w = ((efh_0)this.c).a(1, s2, eFb.a) > 0;
            }
        } else {
            this.v = this.g.c(this.aG().G(), this.aG().H());
        }
    }

    private void bx() {
        this.bA();
        this.aT();
        this.by();
        this.m = this.z;
    }

    private void by() {
        if (!this.aF()) {
            return;
        }
        if (this.bz()) {
            return;
        }
        int n = this.v - this.z;
        if (n > 0) {
            this.B = 1;
            this.A = true;
        }
    }

    private boolean bz() {
        if (this.x == null) {
            return false;
        }
        aff_1 aff_12 = this.aI();
        return aff_12.d() == this.x.d() && aff_12.e() == this.x.e() && aff_12.f() == this.x.f();
    }

    public void aT() {
        eKn eKn2;
        if (this.h == null || this.h.e() == null) {
            a.error((Object)("Pas de fightMap pour le context " + this.h));
            return;
        }
        eKo eKo2 = new eKo(this.aG(), this.aI(), this.v, this.h);
        if (!this.aJ()) {
            eKo2.a(true);
        }
        if ((eKn2 = eKo2.a()) == null) {
            return;
        }
        this.C = eKn2.f();
        if (eKn2.b() == null) {
            return;
        }
        this.D = eKn2.c();
        this.z = eKn2.e();
        this.y = new aff_1(this.aG().G(), this.aG().H(), this.aG().I());
        this.x = new aff_1(eKn2.b());
    }

    @Override
    public void z() {
        super.z();
        this.bA();
        this.v = 0;
        this.x = null;
        this.w = true;
        this.A = false;
    }

    private void bA() {
        this.x = null;
        this.y = null;
        this.C = null;
        this.z = 0;
        this.B = 0;
    }

    @Override
    protected boolean bq_() {
        return this.bi();
    }

    @Override
    protected void b(iQ iQ2) {
        is is2 = iq_0.ai();
        ii_0 ii_02 = ig_0.f();
        if (this.D != null && !this.D.isEmpty()) {
            for (aff_1 aff_12 : this.D) {
                ii_02.a(ik_0.i().a(aff_12.d()).b(aff_12.e()).c(aff_12.f()));
            }
            is2.a(ii_02);
        }
        iQ2.a(is2);
    }

    @Override
    protected void c(iO iO2) {
        iq_0 iq_02;
        if (iO2.q() && (iq_02 = iO2.r()).ab() && iq_02.ac().d() > 0) {
            List<ik_0> list = iq_02.ac().b();
            this.D = new ArrayList<aff_1>();
            for (ik_0 ik_02 : list) {
                this.D.add(new aff_1(ik_02.c(), ik_02.e(), Hw.c((long)ik_02.g())));
            }
            this.x = this.D.get(this.D.size() - 1);
        }
    }

    public aff_1 aU() {
        return this.x;
    }

    public int aV() {
        return this.z;
    }

    public aff_1 aW() {
        return this.y;
    }

    private void bB() {
        Optional<Su> optional;
        boolean bl = this.C != null && this.C instanceof Su;
        Optional<Su> optional2 = optional = bl ? Optional.of((Su)((Object)this.C)) : Optional.empty();
        if (this.w && this.B > 0) {
            this.d(this.f);
            optional.ifPresent(this::d);
        }
        if (this.A) {
            BitSet bitSet = new BitSet();
            bitSet.set(204);
            this.e.a(bitSet, this, (byte)30);
            this.f.a(bitSet, this, (byte)3);
            optional.ifPresent(su -> {
                sd_0 sd_02 = this.w();
                sd_02.b((Su)su);
                this.e.a(bitSet, sd_02, (byte)30);
                su.a(bitSet, this, (byte)3);
            });
        }
    }

    private void d(Su su) {
        if (!su.a(eps_0.c)) {
            return;
        }
        eFT eFT2 = eFT.a(this.h, eps_0.c, this.e, su);
        eFC eFC2 = eFC.ai();
        eFT2.a(eFC2);
        eFT2.c(2254);
        eFT2.c(su);
        eFT2.q();
    }

    abstract boolean aJ();

    public abstract boolean aE();

    abstract boolean aF();

    public abstract eKm aG();

    abstract aff_1 aI();

    boolean aX() {
        return this.f.G() == this.e.G() && this.f.H() == this.e.H();
    }

    protected boolean aY() {
        return this.a(eff_0.l);
    }
}

