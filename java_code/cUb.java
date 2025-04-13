/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 */
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cUb
extends bpd_2 {
    private final brw_1 m;
    private final fii n;

    @Override
    public List<fde> k() {
        if (cUb.j() != fbl_0.b) {
            return null;
        }
        ArrayList<fde> arrayList = new ArrayList<fde>();
        bMn bMn2 = bwy_2.h().j();
        bmr_1 bmr_12 = azu_0.j().k();
        feu feu2 = new feu(bmr_12, (bmv_1)this.l, this.m, bMn2 == null ? null : bMn2.y());
        arrayList.addAll(feu2.b());
        return arrayList;
    }

    @Override
    public List<fde> l() {
        return null;
    }

    public cUb(brw_1 brw_12) {
        this.m = brw_12;
        this.n = fij.a().a(this.m.h());
        this.a = (afe_02, n, n2, s2) -> {
            afe_02.c(this.a);
            bmr_1 bmr_12 = azu_0.j().k();
            if (!bmr_12.a(false, true)) {
                return;
            }
            this.a((blx_1)this.l, true);
        };
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
    public void o() {
        this.a(false);
    }

    @Override
    public boolean d() {
        return this.y() == bNB.a;
    }

    @Override
    public void a(boolean bl) {
        boolean bl2;
        int n;
        int n2;
        Iterable<efh_0> iterable;
        bmr_1 bmr_12 = azu_0.j().k();
        if (!this.c()) {
            bqg_2.a().b();
            return;
        }
        if (this.l == null) {
            bqg_2.a().b();
            return;
        }
        bmv_1 bmv_12 = (bmv_1)this.l;
        if (!cUb.a(bmr_12)) {
            return;
        }
        Object var6_4 = null;
        if (this.n.g()) {
            iterable = this.n.b(bmr_12);
            if (iterable == null) {
                bqg_2.a().b();
                return;
            }
            n2 = ((exk_2)iterable).T().I();
            n = ((exk_2)iterable).T().H();
        } else {
            n2 = 1;
            n = 1;
        }
        yz_0.a(bmr_12.W(), bmr_12.X(), bmr_12.fV());
        iterable = yz_0.a(bmv_12.P_(), n2, n, false);
        aff_1 aff_12 = bmr_12.P_();
        boolean bl3 = iterable.stream().noneMatch(aff_12::equals);
        if (iterable.isEmpty()) {
            bQG.a();
            bQG.a(2, new Object[0]);
            bqg_2.a().b();
            return;
        }
        if (bmr_12.bv().ba()) {
            bl3 = true;
        }
        if (!bl3) {
            this.a(bmv_12, false);
            return;
        }
        bmr_12.bv().a(aft_0.class);
        bmr_12.bv().b(this.a);
        boolean bl4 = bl2 = aff_12.e(bmv_12.P_()) > 2;
        if (!bmr_12.a(false, bl2, (List<aff_1>)iterable) && !iterable.contains(aff_12)) {
            bmr_12.bv().c(this.a);
            bQG.a();
            bQG.a(2, new Object[0]);
        }
    }

    @Override
    public brw_1 e() {
        return this.m;
    }

    @Override
    public aby_0 f() {
        if (!(this.l instanceof bmv_1)) {
            return null;
        }
        return ((bmv_1)this.l).e();
    }

    public aff_1 w() {
        return null;
    }

    private bNB y() {
        bmr_1 bmr_12 = azu_0.j().k();
        bmv_1 bmv_12 = (bmv_1)this.l;
        Optional<ece_0> optional = bmr_12.eW();
        if (optional.isEmpty()) {
            return bNB.p;
        }
        if (!emj_0.b.a(new emh_0[]{bmr_12})) {
            return bNB.m;
        }
        if (!bmv_12.e(this.m.g())) {
            return bNB.f;
        }
        if (!this.n.a(bmr_12)) {
            return bNB.j;
        }
        if (optional.get().f(this.m.l()) < this.m.k()) {
            return bNB.d;
        }
        if (this.m.i() != null && !this.m.i().b(bmr_12, this.l, null, null)) {
            return bNB.b;
        }
        if (!optional.get().e(this.m.l())) {
            return bNB.h;
        }
        if (azu_0.j().n().f()) {
            return bNB.c;
        }
        return bNB.a;
    }

    @Override
    public boolean c() {
        if (!this.n.e()) {
            return false;
        }
        bNB bNB2 = this.y();
        if (bNB2 == bNB.h) {
            return false;
        }
        bmv_1 bmv_12 = (bmv_1)this.l;
        if (bmv_12.ak()) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.be()) {
            return false;
        }
        if (bmr_12.a(erl_2.Y)) {
            return false;
        }
        boolean bl = this.m.i() == null || this.m.i().b(bmr_12, this.l, null, null);
        boolean bl2 = !bmr_12.ak();
        boolean bl3 = !bvz_2.a.a();
        return bl && bl2 && bl3;
    }

    @Override
    public String r() {
        if (this.n == null) {
            return "undefined";
        }
        return this.n.d();
    }

    public azj_2 x() {
        return this.y() == bNB.a ? azf_2.j : azf_2.h;
    }

    @Override
    protected int t() {
        return this.n.c();
    }

    @Override
    public String q() {
        ani_2 ani_22 = new ani_2().a();
        ani_22.a((CharSequence)bae.h().a("desc.mru." + this.r(), new Object[0]));
        ani_22.b().a((CharSequence)"\n");
        Object r2 = eyo_1.g().d(this.m.c());
        ani_22.a((CharSequence)(r2 != null ? ((ezr_0)r2).e() : "#ERROR#")).a((CharSequence)"\n");
        String string = bae.h().a(43, (long)this.m.l(), new Object[0]);
        ani_22.a((CharSequence)string).a((CharSequence)" ");
        bNB bNB2 = this.y();
        azf_2 azf_22 = bNB2 == bNB.d ? azf_2.h : azf_2.j;
        ani_22.i().a(azf_22.w());
        ani_22.a((CharSequence)bae.h().a("desc.mru.levelRequired", this.m.k()));
        ani_22.j();
        if (bNB2 != bNB.a) {
            ani_22.i().a(azf_2.h.w());
            switch (bNB2) {
                case e: {
                    ani_22.a((CharSequence)"\n").a((CharSequence)bae.h().a("collect.error.npc.inFight", new Object[0]));
                    break;
                }
                case m: {
                    ani_22.a((CharSequence)"\n").a((CharSequence)bae.h().a("error.playerNotSubscribed", new Object[0]));
                    break;
                }
                case d: {
                    ani_22.a((CharSequence)"\n").a((CharSequence)bae.h().a("collect.error.wrongLevel", new Object[0]));
                    break;
                }
                case f: {
                    ani_22.a((CharSequence)"\n").a((CharSequence)bae.h().a("collect.error.npc.collected", new Object[0]));
                    break;
                }
                case b: {
                    apc_2 apc_22 = this.m.i();
                    if (apc_22 != null) {
                        ani_22.m().a((CharSequence)eDm.a((aot_2)apc_22));
                        break;
                    }
                    ani_22.a((CharSequence)"\n").a((CharSequence)bae.h().a("error.unknown", new Object[0]));
                    break;
                }
                case j: {
                    ani_22.a((CharSequence)"\n").a((CharSequence)bae.h().a("action.error.wrongItemEquiped", new Object[0]));
                    break;
                }
                case c: {
                    ani_22.m().a((CharSequence)bae.h().a("security.impossible.action.account.locked", new Object[0]));
                }
            }
            ani_22.j();
        }
        return ani_22.r();
    }

    private void a(blx_1 blx_12, boolean bl) {
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        int n = aob_2.c((aoc_2)biI2, blx_12);
        if (n <= 1) {
            exk_2 exk_22;
            aej_2 aej_22 = biI2.ap().b(((blx_1)this.l).P_());
            if (aej_22 != null) {
                biI2.a(aej_22);
            }
            if (this.n.g() && (exk_22 = this.n.b(bmr_12)) == null) {
                bqg_2.a().b();
                return;
            }
            float f2 = Math.abs((float)blx_12.I() - biI2.L());
            if (f2 > (float)biI2.aU()) {
                b.error((Object)("Plantation impossible sur la cellule " + blx_12.P_() + " : hauteur maximale de saut de " + biI2.aU()));
                bQG.a();
                bQG.a(2, new Object[0]);
                bqg_2.a().b();
                return;
            }
            biI2.c(this.a);
            bqg_2.a().f();
            ckx_1 ckx_12 = new ckx_1(3, 13659, (MessageLite)zy_2.g().a(this.m.g()).a(blx_12.a_()).h());
            azu_0.j().K().c(ckx_12);
        } else if (bl && n <= 2) {
            bmr_12.bv().a(aft_0.class);
            biI2.b(this.a);
            if (!bmr_12.a((apq_2)this.l, false, false)) {
                biI2.c(this.a);
                bQG.a();
                bQG.a(2, new Object[0]);
                bqg_2.a().b();
                return;
            }
        }
    }
}

