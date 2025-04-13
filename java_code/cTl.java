/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 *  gnu.trove.list.array.TIntArrayList
 */
import com.google.protobuf.MessageLite;
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cTl
extends bpd_2 {
    private bNK m;
    private brw_1 n;
    private fii o;

    public cTl() {
    }

    public cTl(bNK bNK2, brw_1 brw_12) {
        this.m = bNK2;
        this.n = brw_12;
        this.o = fij.a().a(this.n.h());
        this.a = (afe_02, n, n2, s2) -> {
            afe_02.c(this.a);
            bmr_1 bmr_12 = azu_0.j().k();
            if (!bmr_12.a(false, true)) {
                return;
            }
            this.a(this.m);
        };
    }

    @Override
    public brw_1 e() {
        return this.n;
    }

    @Override
    public aby_0 f() {
        return this.m;
    }

    public aff_1 w() {
        return this.m.ap();
    }

    @Override
    public cSS v() {
        return new cTl();
    }

    @Override
    public cSY n() {
        return cSY.m;
    }

    @Override
    public List<fde> k() {
        Object object;
        if (cTl.j() == fbl_0.a) {
            return null;
        }
        ArrayList<fde> arrayList = new ArrayList<fde>();
        bNI bNI2 = this.m.aR();
        bMn bMn2 = bwy_2.h().j();
        bmr_1 bmr_12 = azu_0.j().k();
        if (this.n.o()) {
            object = new ArrayList<bRz>();
            if (bNI2 instanceof bNF) {
                for (int object2 : ((bNF)bNI2).b()) {
                    ((ArrayList)object).add(bRC.c().a(object2));
                }
            } else {
                ((ArrayList)object).add(bRD.c().a(bNI2.j()));
            }
            Object object3 = ((ArrayList)object).iterator();
            while (object3.hasNext()) {
                bRz bRz2 = (bRz)object3.next();
                if (bRz2 == null || !bRz2.c() || bRz2.e()) continue;
                fec_0 fec_02 = new fec_0(bmr_12);
                int n = bRz2.f();
                if (n == 0) continue;
                fed_0 fed_02 = n > 0 ? fed_0.b : fed_0.a;
                fec_02.a(fed_02);
                arrayList.addAll(fec_02.b());
            }
        }
        if (!this.m.aR().c(fhr_0.d)) {
            object = new feu(bmr_12, this.m, this.n, bMn2 == null ? null : bMn2.y());
            arrayList.addAll(((fdg)object).b());
        }
        return arrayList;
    }

    @Override
    public List<fde> l() {
        return null;
    }

    @Override
    public boolean c() {
        boolean bl;
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.a(erl_2.an)) {
            return false;
        }
        bNB bNB2 = this.y();
        if (bNB2 == bNB.b && this.n.f()) {
            return false;
        }
        boolean bl2 = bl = this.o.e() && bNB2 != bNB.h && !bmr_12.ak() && !bmr_12.be() && !bvz_2.a.a();
        if (bl) {
            this.c(true);
            bsx_2 bsx_22 = bmr_12.di();
            if (bsx_22 != null && !bsx_22.a(bmr_12, this.m.G(), this.m.H())) {
                this.c(false);
            }
        }
        return bl;
    }

    @Override
    public String r() {
        if (this.o == null) {
            return "undefined";
        }
        return this.o.d();
    }

    public azj_2 x() {
        int n;
        boolean bl;
        if (this.n.l() == 0) {
            return azf_2.j;
        }
        ect_0 ect_02 = ecn_0.a.a(this.n.l());
        bmr_1 bmr_12 = azu_0.j().k();
        ece_0 ece_02 = bmr_12.eX();
        short s2 = ece_02.f(this.n.l());
        boolean bl2 = bl = ecu_0.a(s2, (short)(n = this.n.k()), ect_02, bmr_12) == 0L;
        return this.y() == bNB.d ? azf_2.h : (bl ? azf_2.o : azf_2.j);
    }

    @Override
    public boolean d() {
        return this.y() == bNB.a;
    }

    @Override
    protected int t() {
        return this.o.c();
    }

    private bNB y() {
        Object object;
        Object object2;
        bmr_1 bmr_12 = azu_0.j().k();
        Optional<ece_0> optional = bmr_12.eW();
        if (optional.isEmpty()) {
            return bNB.p;
        }
        Object Info = this.n.p();
        boolean bl = emj_0.b.a(new emh_0[]{bmr_12});
        if (!bl) {
            return bNB.m;
        }
        if (this.m.aH() && this.m.aI() != bmr_12.R()) {
            if (!ccs_1.a().a(bmr_12.T_()).a()) {
                return bNB.n;
            }
            object2 = cxj_2.a.a();
            TIntArrayList tIntArrayList = ((fhe_0)object2).i();
            if (tIntArrayList.contains(bmr_12.bM()) && tIntArrayList.contains(this.m.aJ())) {
                return bNB.n;
            }
            object = ((fhe_0)object2).j();
            if (object.contains(bmr_12.bM()) && object.contains(this.m.aJ())) {
                return bNB.n;
            }
        }
        if ((object2 = bmr_12.di()) != null && !((bsx_2)object2).a(bmr_12, this.m.G(), this.m.H())) {
            return bNB.o;
        }
        if (this.n.l() != 0 && (!optional.get().e(this.n.l()) || bqg_2.a().a(this.m))) {
            return bNB.h;
        }
        if (optional.get().f(this.n.l()) < this.n.k()) {
            return bNB.d;
        }
        if (!this.o.a(bmr_12)) {
            return bNB.h;
        }
        if (this.n.i() != null && !this.n.i().b(bmr_12, this.l, null, null)) {
            return bNB.b;
        }
        if (((ecm_0)Info).c() && bmr_12.da().d(((ecm_0)Info).d()) == null && ((ewx_2)bmr_12.a(ewl_1.a)).a(((ecm_0)Info).d()) == null && evl_2.a(bmr_12.R(), ((ecm_0)Info).d()) <= 0) {
            return bNB.i;
        }
        boolean bl2 = enp_2.a.d(ens_2.aw);
        if (!this.z() && bl2 && !bmr_12.gR()) {
            object = bmr_12.N_();
            wt_0 wt_02 = wc_0.p().j();
            long l = ((emg_0)object).j();
            if (wt_02.h() - l < 60000L) {
                return bNB.l;
            }
        }
        if (azu_0.j().n().f()) {
            return bNB.c;
        }
        if (this.m == bmr_12.bB()) {
            return bNB.g;
        }
        return bNB.a;
    }

    private boolean z() {
        bNI bNI2 = this.m.aR();
        if (bNI2 == null) {
            return false;
        }
        return bNI2.c(fhr_0.b);
    }

    @Override
    public String q() {
        int n;
        Object object;
        int n2;
        ani_2 ani_22 = new ani_2();
        ani_22.a().a((CharSequence)bae.h().a("desc.mru." + this.r(), new Object[0])).b();
        if (this.n.c() != 0) {
            ani_22.m();
            Object r2 = eyo_1.g().d(this.n.c());
            if (r2 != null) {
                ani_22.a((CharSequence)((ezr_0)r2).e());
            } else {
                ani_22.a((CharSequence)"#ERROR#");
            }
        }
        if ((n2 = this.n.l()) != 0) {
            ani_22.m();
            object = bae.h().a(43, (long)n2, new Object[0]);
            ani_22.a((CharSequence)object).a((CharSequence)" : ").i().a(this.x().w()).a((CharSequence)bae.h().a("desc.mru.levelRequired", this.n.k())).j();
        }
        object = this.y();
        Object Info = this.n.p();
        if (((ecm_0)Info).c()) {
            ani_22.m();
            n = ((ecm_0)Info).d();
            Object r3 = eyo_1.g().d(n);
            String string = ((ezr_0)r3).e();
            ani_22.a((CharSequence)bae.h().a("itemNeeded", new Object[0]));
            ani_22.i().a(object == bNB.i ? h : g).a((CharSequence)string).j();
        }
        if (object != bNB.a) {
            switch (cTm.a[((Enum)object).ordinal()]) {
                case 1: {
                    ani_22.m().i().a(h).a((CharSequence)bae.h().a("error.playerNotSubscribed", new Object[0])).j();
                    break;
                }
                case 2: {
                    ani_22.m().i().a(h).a((CharSequence)bae.h().a("error.timerNotFinished", new Object[0])).j();
                    break;
                }
                case 3: {
                    ani_22.m().i().a(h).a((CharSequence)bae.h().a("collect.error.wrongLevel", new Object[0])).j();
                    break;
                }
                case 4: {
                    apc_2 apc_22 = this.n.i();
                    if (apc_22 != null) {
                        ani_22.m().i().a(h).a((CharSequence)eDm.a((aot_2)apc_22)).j();
                        break;
                    }
                    ani_22.m().i().a(h).a((CharSequence)bae.h().a("error.unknown", new Object[0])).j();
                    break;
                }
                case 5: {
                    ani_22.m().i().a(h).a((CharSequence)bae.h().a("collect.error.tooEarly", new Object[0])).j();
                    break;
                }
                case 6: {
                    ani_22.m().i().a(h).a((CharSequence)bae.h().a("collect.resourceAlreadyUseByPlayer", new Object[0])).j();
                    break;
                }
                case 7: {
                    ani_22.m().i().a(h).a((CharSequence)bae.h().a("action.error.wrongItemEquiped", new Object[0])).j();
                    break;
                }
                case 8: {
                    ani_22.m().i().a(h).a((CharSequence)bae.h().a("action.error.resourceReserved", new Object[0])).j();
                    break;
                }
                case 9: {
                    ani_22.m().i().a(h).a((CharSequence)bae.h().a("dimensionalBag.error.roomLocked", new Object[0])).j();
                    break;
                }
                case 10: {
                    break;
                }
                case 11: {
                    ani_22.m().i().a(h).a((CharSequence)bae.h().a("security.impossible.action.account.locked", new Object[0])).j();
                    break;
                }
                default: {
                    ani_22.m().i().a(h).a((CharSequence)bae.h().a("unknown", new Object[0])).j();
                }
            }
        }
        if ((n = this.n.j()) > 1) {
            ani_22.m().a((CharSequence)bae.h().a("collect.nbPlayers", n));
        }
        return ani_22.r();
    }

    private void a(bNK bNK2) {
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        biI2.a(bmr_12.P_().b(this.m.ap()));
        boolean bl = true;
        int n = fhs_0.a(this.n.l());
        int n2 = bmr_12.P_().e(this.m.ap());
        if (n2 < 1 || n2 > n) {
            bqg_2.a().b();
            return;
        }
        bqg_2.a().f();
        ckx_1 ckx_12 = new ckx_1(3, 13286, (MessageLite)zc_2.i().a(this.n.g()).b(bNK2.G()).c(bNK2.H()).j());
        azu_0.j().K().c(ckx_12);
    }

    @Override
    public void o() {
        this.a(false);
    }

    @Override
    public void a(boolean bl) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (!this.c()) {
            bqg_2.a().b();
            return;
        }
        if (this.m == null || !this.m.aP()) {
            bqg_2.a().b();
            return;
        }
        abz_0 abz_02 = bmr_12.bB();
        if (abz_02 != null && abz_02 == this.m) {
            bqg_2.a().b();
            return;
        }
        if (!cTl.a(bmr_12)) {
            return;
        }
        yz_0.a(bmr_12.W(), bmr_12.X(), bmr_12.fV());
        List<aff_1> list = yz_0.a(this.m.ap(), 1, fhs_0.a(this.n.l()), false, aff_12 -> fhs_0.a(bmr_12.W(), aff_12.f(), this.m.P_().f(), this.n.l()));
        aff_1 aff_13 = bmr_12.P_();
        boolean bl2 = list.stream().noneMatch(aff_13::equals);
        if (list.isEmpty()) {
            bQG.a();
            bQG.a(2, new Object[0]);
            bqg_2.a().b();
            return;
        }
        if (bmr_12.bv().ba()) {
            bl2 = true;
        }
        if (bl2) {
            boolean bl3;
            bmr_12.bv().a(aft_0.class);
            bmr_12.bv().b(this.a);
            boolean bl4 = bl3 = aff_13.e(this.m.ap()) > 2;
            if (!bmr_12.a(false, bl3, list) && !list.contains(aff_13)) {
                bmr_12.bv().c(this.a);
                bQG.a();
                bQG.a(2, new Object[0]);
                bqg_2.a().b();
            }
        } else {
            this.a(this.m);
        }
    }
}

