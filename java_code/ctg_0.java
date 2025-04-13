/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cTg
 */
public class ctg_0
extends cSR {
    private emr_2 a;
    private static final int m = 0;
    private static final int n = 1;
    private static final int o = 2;
    private static final int p = 3;
    private static final int q = 4;
    private static final int r = 5;
    private static final int s = 7;
    private final BitSet t = new BitSet(cti_0.values().length);
    private boolean u;
    private int v;

    ctg_0(emr_2 emr_22) {
        this.a = emr_22;
    }

    @Override
    public void a(Object object) {
        boolean bl;
        super.a(object);
        blx_1 blx_12 = (blx_1)this.l;
        if (blx_12.ab_()) {
            this.a(cti_0.h);
            return;
        }
        if (blx_12.ak()) {
            this.a(cti_0.d);
            return;
        }
        biI biI2 = blx_12.bv();
        if (blx_12.f(erl_2.bc) && biI2.ba()) {
            this.a(cti_0.e);
            return;
        }
        if (azu_0.j().n().f()) {
            this.a(cti_0.q);
            return;
        }
        fjv_0 fjv_02 = ((fjw_0)fjw_0.e()).c(blx_12.T_());
        boolean bl2 = bl = fjv_02 != null && fjv_02.a();
        if (!bl && this.a == emr_2.a) {
            this.a = emr_2.v;
        }
        bmr_1 bmr_12 = ans_0.F().k();
        aff_1 aff_12 = bmr_12.P_();
        boolean bl3 = yz_0.h(aff_12.d(), aff_12.e(), aff_12.f());
        cct_1 cct_12 = ccs_1.a().a(bmr_12.T_());
        if (!cct_12.d() || blx_12.a(erl_2.i) || bl3 || this.a(blx_12)) {
            this.a(cti_0.h);
            return;
        }
        if (blx_12 instanceof bmv_1) {
            this.a(bmr_12, (bmv_1)blx_12);
        } else if (blx_12 instanceof bnh_1) {
            this.a(blx_12, bmr_12);
        }
    }

    private boolean a(blx_1 blx_12) {
        aff_1 aff_12 = blx_12.P_();
        boolean bl = yz_0.h(aff_12.d(), aff_12.e(), aff_12.f());
        bl &= ctg_0.a(aff_12, aff_12.d() + 1, aff_12.e());
        bl &= ctg_0.a(aff_12, aff_12.d() - 1, aff_12.e());
        bl &= ctg_0.a(aff_12, aff_12.d(), aff_12.e() + 1);
        return bl &= ctg_0.a(aff_12, aff_12.d(), aff_12.e() - 1);
    }

    private void a(bmr_1 bmr_12, bmv_1 bmv_12) {
        Object object;
        Optional<fhe_0> optional;
        cct_1 cct_12 = ccs_1.a().a(bmv_12.T_());
        if (cct_12 != null && (!cct_12.k || cct_12.b())) {
            this.a(cti_0.h);
            return;
        }
        if (bmv_12.f(erl_2.be)) {
            if (bmr_12.f(erl_2.bf)) {
                this.a(cti_0.o);
                return;
            }
            optional = cxj_2.a.b();
            if (optional.isPresent()) {
                object = (fhe_0)optional.get();
                int n = bmr_12.bM();
                TIntArrayList tIntArrayList = ((fhe_0)object).i();
                if (bmv_12.f(erl_2.bi) && tIntArrayList.contains(n)) {
                    this.a(cti_0.p);
                    return;
                }
                TIntArrayList tIntArrayList2 = ((fhe_0)object).j();
                if (bmv_12.f(erl_2.bj) && tIntArrayList2.contains(n)) {
                    this.a(cti_0.p);
                    return;
                }
            }
            this.u = true;
        }
        if ((optional = boq_1.a().a(bmv_12.cL())) != null && ((bon_1)((Object)optional)).a()) {
            this.a(cti_0.i);
            return;
        }
        if (bmv_12.a(erl_2.x)) {
            return;
        }
        object = bmr_12.bv();
        apl_1 apl_12 = ((biE)object).a(bmv_12.P_(), true, true);
        if (apl_12 == uq_0.f) {
            this.a(cti_0.b);
            return;
        }
        if (apl_12.a() > 25) {
            this.a(cti_0.a);
        }
    }

    private void a(blx_1 blx_12, bmr_1 bmr_12) {
        if (this.a == emr_2.n) {
            this.a(bmr_12, blx_12);
        } else {
            this.b(bmr_12, blx_12);
        }
    }

    private void a(bmr_1 bmr_12, blx_1 blx_12) {
        cct_1 cct_12 = ccs_1.a().a(blx_12.T_());
        if (cct_12 != null && !cct_12.l) {
            this.a(cti_0.g);
            return;
        }
        boolean bl = bmr_12.a(erl_2.Q);
        boolean bl2 = blx_12.a(erl_2.Q);
        if (bl || bl2) {
            this.a(cti_0.m);
            return;
        }
        boolean bl3 = blx_12.fE().t();
        if (bl3) {
            this.a(cti_0.m);
        }
    }

    private void b(bmr_1 bmr_12, blx_1 blx_12) {
        boolean bl;
        boolean bl2;
        this.u = true;
        boolean bl3 = bmr_12.a(erl_2.R);
        if (bl3) {
            this.a(cti_0.o);
            return;
        }
        if (blx_12.a(erl_2.M)) {
            this.a(cti_0.n);
            return;
        }
        Optional<fhe_0> optional = cxj_2.a.b();
        if (optional.isPresent()) {
            fhe_0 fhe_02 = optional.get();
            int n = bmr_12.bM();
            TIntArrayList tIntArrayList = fhe_02.i();
            if (blx_12.f(erl_2.bi) && tIntArrayList.contains(n)) {
                this.a(cti_0.p);
                return;
            }
            TIntArrayList tIntArrayList2 = fhe_02.j();
            if (blx_12.f(erl_2.bj) && tIntArrayList2.contains(n)) {
                this.a(cti_0.p);
                return;
            }
            return;
        }
        if (bmr_12.dt() < blx_12.dt() - 50) {
            this.a(cti_0.l);
            return;
        }
        cct_1 cct_12 = ccs_1.a().a(blx_12.T_());
        ccu_1 ccu_12 = bRA.e().h();
        boolean bl4 = cct_12 != null && cct_12.e();
        boolean bl5 = bl2 = ccu_12 != null && ccu_12.d();
        if (!bl4 || !bl2) {
            this.a(cti_0.f);
            return;
        }
        faV faV2 = blx_12.fE();
        if (bmr_12.ba() != fhD.a && faV2.k() != fhD.a) {
            return;
        }
        boolean bl6 = bl = blx_12.fI() != bmr_12.bM() || !faV2.e(bmr_12.bM());
        if (bl) {
            this.a(cti_0.f);
            return;
        }
    }

    @Override
    public boolean d() {
        if (!super.d()) {
            return false;
        }
        if (this.b(cti_0.values())) {
            return false;
        }
        return this.v == 0;
    }

    @Override
    public boolean c() {
        bMn bMn2;
        int n;
        Object object;
        Object object2;
        this.v = 0;
        if (!(this.l instanceof blx_1)) {
            return false;
        }
        if (!this.a()) {
            return false;
        }
        if (this.b(cti_0.d, cti_0.m, cti_0.p)) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.be() && this.a != emr_2.n) {
            return false;
        }
        if (this.b(cti_0.o) && ((object2 = ccs_1.a().a(bmr_12.T_())) == null || !object2.a())) {
            return false;
        }
        object2 = (epq_2)this.l;
        if (((epq_2)object2).ab_()) {
            return false;
        }
        if (bmr_12.di() != null) {
            return false;
        }
        if (bmr_12.ak()) {
            return false;
        }
        if (bmr_12.cW()) {
            return false;
        }
        if (bvz_2.a.a()) {
            return false;
        }
        if (bmr_12.b(erl_2.g) > 0) {
            return false;
        }
        boolean bl = object2 instanceof bmv_1;
        if (bl && bmr_12.a(erl_2.X)) {
            return false;
        }
        if (((epq_2)object2).a(erl_2.i)) {
            return false;
        }
        if (((epq_2)object2).a(erl_2.v)) {
            this.v = 1;
        }
        if (this.u && !bmr_12.a(enw_0.b)) {
            this.v = 4;
        }
        if (this.b(cti_0.o)) {
            this.v = 7;
        }
        boolean bl2 = emj_0.a.a(new emh_0[]{bmr_12});
        boolean bl3 = emj_0.b.a(new emh_0[]{bmr_12});
        if (!(this.a == emr_2.n && bmr_12.a(enw_0.j) || (bl2 || this.a.x() != emd_2.c) && bl3)) {
            this.v = 2;
        }
        if (object2 instanceof bnh_1) {
            object = (bnh_1)object2;
            if (this.a != emr_2.n || !((bnh_1)object).a(enw_0.j)) {
                if (this.u && !((bnh_1)object).a(enw_0.b)) {
                    this.v = 5;
                }
                n = emj_0.a.a(new emh_0[]{object}) ? 1 : 0;
                boolean bl4 = emj_0.b.a(new emh_0[]{object});
                if (!bl4 || n == 0 && this.a != emr_2.n) {
                    this.v = 3;
                }
            }
        }
        if (((epq_2)object2).a(erl_2.o)) {
            return false;
        }
        object = bmr_12.fE();
        n = object.n();
        bMn bMn3 = bMn2 = bl ? (bMn)((epq_2)object2).aa_() : null;
        if (bMn2 != null && bMn2.F() == n) {
            return false;
        }
        return this.a == null || this.a != emr_2.n || object2 instanceof bnh_1;
    }

    @Override
    public void o() {
        blx_1 blx_12;
        biI biI2;
        if (!this.c()) {
            return;
        }
        biI biI3 = azu_0.j().k().bv();
        if (aob_2.c((aoc_2)biI3, biI2 = (blx_12 = (blx_1)this.l).bv()) > 25) {
            return;
        }
        switch (this.a) {
            case n: {
                if (aUh.a(blx_12.dp(), eAO.a)) {
                    return;
                }
                cmu_0 cmu_02 = new cmu_0();
                cmu_02.a(blx_12.a_());
                cmu_02.a(biI2.be(), biI2.bf(), (short)biI2.L());
                cmu_02.a(((bvx_0)ans_0.D().h()).a(bWe.G));
                azu_0.j().K().c(cmu_02);
                aUh.c("fight.invitation", blx_12.dp());
                break;
            }
            case c: {
                fgy_0 fgy_02 = blx_12.aa_();
                if (fgy_02 == null) {
                    return;
                }
                azu_0.j().k().e(fgy_02.B());
                break;
            }
            default: {
                azu_0.j().k().m(blx_12);
            }
        }
    }

    @Override
    public cSS v() {
        return new ctg_0(this.a);
    }

    @Override
    public cSY n() {
        switch (this.a) {
            case n: {
                return cSY.h;
            }
        }
        return cSY.a;
    }

    @Override
    protected int t() {
        switch (this.a) {
            case n: {
                return cUL.al.aH;
            }
        }
        return cUL.c.aH;
    }

    @Override
    public String r() {
        switch (this.a) {
            case n: {
                return "duelStart";
            }
        }
        return "fightStart";
    }

    @Override
    public String q() {
        if (!(this.l instanceof blx_1)) {
            return this.r();
        }
        String string = ((blx_1)this.l).dp();
        ani_2 ani_22 = new ani_2().a().a(this.b().w());
        if (this.b(cti_0.b)) {
            ani_22.a((CharSequence)bae.h().a("fight.error.nopathtomonster", string));
        } else if (this.b(cti_0.a)) {
            ani_22.a((CharSequence)bae.h().a("fight.error.monstertoofar", string));
        } else if (this.b(cti_0.c)) {
            ani_22.a((CharSequence)bae.h().a("fight.error.insideGroup", new Object[0]));
        } else if (this.b(cti_0.d)) {
            ani_22.a((CharSequence)bae.h().a("fight.error.character.inFight", string));
        } else if (this.b(cti_0.f)) {
            ani_22.a((CharSequence)bae.h().a("fight.error.pvpForbidden", string));
        } else if (this.b(cti_0.g)) {
            ani_22.a((CharSequence)bae.h().a("fight.error.duelForbidden", string));
        } else if (this.b(cti_0.h)) {
            ani_22.a((CharSequence)bae.h().a("systemNotification.instanceConfig.cannotFight", new Object[0]));
        } else if (this.b(cti_0.j)) {
            ani_22.a((CharSequence)bae.h().a("fight.error.not.enemy.protector", new Object[0]));
        } else if (this.b(cti_0.k)) {
            ani_22.a((CharSequence)bae.h().a("fight.error.target.level.too.low", new Object[0]));
        } else if (this.b(cti_0.l)) {
            ani_22.a((CharSequence)bae.h().a("fight.error.target.level.too.high", new Object[0]));
        } else if (this.b(cti_0.n)) {
            ani_22.a((CharSequence)bae.h().a("fight.error.cant.be.aggro", new Object[0]));
        } else if (this.b(cti_0.o)) {
            ani_22.a((CharSequence)bae.h().a("fight.error.cant.aggro", new Object[0]));
        } else if (this.b(cti_0.p)) {
            ani_22.a((CharSequence)bae.h().a("fight.error.cant.aggro", new Object[0]));
        } else if (this.b(cti_0.i)) {
            ani_22.a((CharSequence)bae.h().a("fight.error.memberBusy", new Object[0]));
        } else if (this.b(cti_0.e)) {
            ani_22.a((CharSequence)bae.h().a("fight.error.character.unstoppable", new Object[0]));
        } else if (this.b(cti_0.q)) {
            ani_22.a((CharSequence)bae.h().a("security.impossible.action.account.locked", new Object[0]));
        } else {
            switch (this.a) {
                case n: {
                    ani_22.a((CharSequence)bae.h().a("fight.duel.with", string));
                    break;
                }
                case a: {
                    ani_22.a((CharSequence)bae.h().a("fight.pvp.with", string));
                    break;
                }
                default: {
                    ani_22.a((CharSequence)bae.h().a("fight.with", string));
                }
            }
        }
        ani_22.b();
        if (this.v != 0) {
            switch (this.v) {
                case 1: {
                    return ani_22.m().a(h).a((CharSequence)bae.h().a("fight.error.protector.attacked.too.recenlty", string)).r();
                }
                case 2: {
                    return ani_22.m().a(h).a((CharSequence)bae.h().a("error.playerNotSubscribed", new Object[0])).r();
                }
                case 4: {
                    return ani_22.m().a(h).a((CharSequence)bae.h().a("error.playerNotSubscriptionRight", new Object[0])).r();
                }
                case 5: {
                    return ani_22.m().a(h).a((CharSequence)bae.h().a("error.targetNotSubscriptionRight", new Object[0])).r();
                }
                case 3: {
                    return ani_22.m().a(h).a((CharSequence)bae.h().a("error.targetNotSubscribed", new Object[0])).r();
                }
            }
        }
        return ani_22.r();
    }

    @Override
    @Nullable
    public String h() {
        String string;
        String string2;
        ani_2 ani_22 = new ani_2();
        if (this.d()) {
            switch (this.a) {
                case a: {
                    ani_22.i().a(azf_2.h).a((CharSequence)bae.h().a("pvp.canGainPointsWithFight", new Object[0])).j();
                }
            }
        }
        if ((string2 = super.h()) != null) {
            if (!ani_22.toString().isEmpty()) {
                ani_22.m();
            }
            ani_22.a((CharSequence)string2);
        }
        return (string = ani_22.r()).isEmpty() ? null : string;
    }

    @Override
    public List<fde> k() {
        Object object;
        Sg sg;
        bmr_1 bmr_12 = azu_0.j().k();
        ArrayList<epq_2> arrayList = new ArrayList<epq_2>();
        epq_2 epq_22 = (epq_2)this.l;
        if (this.l instanceof bmv_1) {
            sg = (bmv_1)this.l;
            object = boq_1.a().a(((bmv_1)sg).cL());
            if (object == null) {
                return Collections.emptyList();
            }
            for (bop_1 object2 : ((bon_1)object).b()) {
                blx_1 blx_12 = bmf_2.a().c(object2.a());
                if (blx_12 == null) continue;
                arrayList.add(blx_12);
            }
        } else {
            arrayList.add(epq_22);
        }
        sg = bwy_2.h().j();
        object = new fex_0(bmr_12, this.a, bmr_12, epq_22, sg == null ? null : ((bMn)sg).y(), arrayList);
        List<fde> list = ((fdg)object).b();
        if (this.a == emr_2.n) {
            feb_0 feb_02 = new feb_0(bmr_12);
            list.addAll(feb_02.b());
        }
        return list;
    }

    @Override
    public List<fde> l() {
        Object object2;
        Object object3;
        bmr_1 bmr_12 = azu_0.j().k();
        ArrayList<epq_2> arrayList = new ArrayList<epq_2>();
        epq_2 epq_22 = (epq_2)this.l;
        fec_0 fec_02 = new fec_0(bmr_12);
        if (this.l instanceof bmv_1) {
            object3 = (bmv_1)this.l;
            if (ctg_0.j() == fbl_0.b) {
                object2 = boq_1.a().a(((bmv_1)object3).cL());
                if (object2 == null) {
                    return Collections.emptyList();
                }
                for (bop_1 object4 : ((bon_1)object2).b()) {
                    int n;
                    bRz bRz2;
                    blx_1 blx_12 = bmf_2.a().c(object4.a());
                    if (blx_12 == null) continue;
                    arrayList.add(blx_12);
                    if (fec_02.e() == fed_0.b || (bRz2 = bRC.c().a(((bmv_1)object3).cW().t())) == null || !bRz2.c() || bRz2.e() || (n = bRz2.f()) == 0) continue;
                    fec_02.a(n > 0 ? fed_0.b : fed_0.a);
                }
            }
        } else {
            arrayList.add(epq_22);
        }
        object3 = new feA(bmr_12, this.a, bmr_12);
        object2 = new feI(bmr_12, this.a);
        fez_0 fez_02 = new fez_0(bmr_12, epq_22, 0, 1, this.a);
        ArrayList<fde> arrayList2 = new ArrayList<fde>();
        arrayList2.addAll(((fdg)object3).b());
        arrayList2.addAll(((fdg)object2).b());
        arrayList2.addAll(fez_02.b());
        arrayList2.addAll(fec_02.b());
        return arrayList2;
    }

    private void a(cti_0 ... cti_0Array) {
        for (cti_0 cti_02 : cti_0Array) {
            this.t.set(cti_02.ordinal(), true);
        }
    }

    private boolean b(cti_0 ... cti_0Array) {
        for (cti_0 cti_02 : cti_0Array) {
            if (!this.t.get(cti_02.ordinal())) continue;
            return true;
        }
        return false;
    }

    private boolean a() {
        emr_2 emr_22 = bwk_1.a(azu_0.j().k(), (epq_2)this.l);
        return emr_22 == this.a;
    }

    private azj_2 b() {
        if (this.b(cti_0.b, cti_0.a, cti_0.c, cti_0.d, cti_0.f, cti_0.g, cti_0.i, cti_0.h, cti_0.j, cti_0.n, cti_0.o, cti_0.p, cti_0.e, cti_0.k, cti_0.l)) {
            return azf_2.h;
        }
        return azf_2.e;
    }

    private static boolean a(aff_1 aff_12, int n, int n2) {
        short s2 = yz_0.b(n, n2, aff_12.f());
        if (s2 == Short.MIN_VALUE) {
            return true;
        }
        return yz_0.h(n, n2, s2);
    }
}

