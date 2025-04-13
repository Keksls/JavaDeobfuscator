/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public class cTR
extends cSR {
    private cti_0 a;
    private bwh_0 m;
    private blx_1 n;
    private static final int o = 0;
    private static final int p = 1;
    private static final int q = 2;
    private static final int r = 3;
    private int s;
    private static final EnumMap<ema_1, cti_0> t = new EnumMap(ema_1.class);

    @Override
    public cSS v() {
        return new cTR();
    }

    @Override
    public cSY n() {
        return cSY.b;
    }

    @Override
    public void o() {
        bwq_0 bwq_02 = bwo_1.a(this.m, this.n);
        ema_1 ema_12 = bwq_02.ag_();
        if (bwq_02.d()) {
            this.a(this.m);
        }
        if (ema_12 != ema_1.a) {
            bQG.a();
            bQG.a(ema_12.a(), new Object[0]);
        }
    }

    private void a(bwh_0 bwh_02) {
        Collection collection = bwh_02.j();
        for (blx_1 blx_12 : collection) {
            bmv_1 bmv_12;
            bMn bMn2;
            if (blx_12.gY() != 1 || !(blx_12 instanceof bmv_1) || (bMn2 = (bmv_12 = (bmv_1)blx_12).cB()) == null) continue;
            cqk_0 cqk_02 = new cqk_0(bMn2.B());
            azu_0.j().K().c(cqk_02);
            return;
        }
    }

    @Override
    public String q() {
        String string;
        if (!(this.l instanceof blx_1)) {
            return this.r();
        }
        switch (this.a) {
            case b: {
                string = h;
            }
            case a: {
                string = h;
            }
        }
        string = f;
        ani_2 ani_22 = new ani_2().a().a(string);
        String string2 = ((epq_2)this.l).dp();
        switch (this.a) {
            case b: {
                ani_22.a((CharSequence)bae.h().a("fight.error.nopathtomonster", string2));
            }
            case a: {
                ani_22.a((CharSequence)bae.h().a("fight.error.monstertoofar", string2));
            }
        }
        ani_22.a((CharSequence)bae.h().a("fight.join", string2));
        if (this.m.af_().w()) {
            ani_22.a((CharSequence)bae.h().a("mru.joinFight.pvp", new Object[0]));
        }
        ani_22.b();
        if (this.s != 0) {
            switch (this.s) {
                case 1: {
                    return ani_22.m().a(h).a((CharSequence)bae.h().a("error.playerNotSubscribed", new Object[0])).r();
                }
                case 2: {
                    return ani_22.m().a(h).a((CharSequence)bae.h().a("error.targetNotSubscribed", new Object[0])).r();
                }
                case 3: {
                    return ani_22.m().a(h).a((CharSequence)bae.h().a("security.impossible.action.account.locked", new Object[0])).r();
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
        if (this.d() && this.m.af_() == emr_2.a) {
            boolean bl;
            byte by = this.m.d(this.n.a_());
            byte by2 = this.m.f();
            boolean bl2 = bl = by2 == by;
            if (bl && this.m.af_() == emr_2.a) {
                ani_22.i().a(azf_2.h).a((CharSequence)bae.h().a("pvp.cantGainPointsWithFight", new Object[0])).j();
            } else {
                ani_22.i().a(azf_2.j).a((CharSequence)bae.h().a("pvp.canGainPointsWithFight", new Object[0])).j();
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
    public boolean d() {
        return this.s == 0 && super.d() && this.a == cti_0.r;
    }

    @Override
    public boolean c() {
        if (this.a == null || this.a == cti_0.d) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        blx_1 blx_12 = (blx_1)this.l;
        boolean bl = emj_0.a.a(new emh_0[]{bmr_12});
        boolean bl2 = emj_0.b.a(new emh_0[]{bmr_12});
        if (!bl && this.m.af_().w() || !bl2) {
            this.s = 1;
        }
        if (bmr_12.a(erl_2.ak)) {
            return false;
        }
        if (azu_0.j().n().f()) {
            this.s = 3;
        }
        if (blx_12 instanceof bnh_1) {
            bnh_1 bnh_12 = (bnh_1)blx_12;
            boolean bl3 = emj_0.b.a(new emh_0[]{bnh_12});
            if (!bl3) {
                this.s = 2;
            }
            if (blx_12.a(erl_2.ak)) {
                return false;
            }
            cct_1 cct_12 = ccs_1.a().a(bmr_12.T_());
            if (!cct_12.a()) {
                return true;
            }
            Optional<fhe_0> optional = cxj_2.a.b();
            if (optional.isEmpty()) {
                return true;
            }
            fhe_0 fhe_02 = optional.get();
            int n = bmr_12.bM();
            int n2 = blx_12.bM();
            TIntArrayList tIntArrayList = fhe_02.i();
            TIntArrayList tIntArrayList2 = fhe_02.j();
            if (tIntArrayList.contains(n2) && tIntArrayList2.contains(n)) {
                return false;
            }
            return !tIntArrayList2.contains(n2) || !tIntArrayList.contains(n);
        }
        return true;
    }

    @Override
    public String r() {
        return "fightJoin";
    }

    @Override
    public void a(Object object) {
        super.a(object);
        if (!(this.l instanceof blx_1)) {
            return;
        }
        this.n = (blx_1)this.l;
        this.m = this.n.bw();
        if (this.m == null) {
            return;
        }
        ema_1 ema_12 = bwo_1.a(this.m, this.n).ah_();
        this.a = t.get((Object)ema_12);
    }

    @Override
    public List<fde> k() {
        Object object2;
        bmr_1 bmr_12 = azu_0.j().k();
        ArrayList<blx_1> arrayList = new ArrayList<blx_1>();
        ArrayList<blx_1> arrayList2 = new ArrayList<blx_1>();
        blx_1 blx_12 = (blx_1)this.l;
        ArrayList<fde> arrayList3 = new ArrayList<fde>();
        bwh_0 bwh_02 = bwj_1.a().a(blx_12.bA());
        emr_2 emr_22 = bwh_02.af_();
        for (Object object2 : bwh_02.j()) {
            if (((blx_1)object2).Y() == blx_12.Y()) {
                arrayList2.add((blx_1)object2);
                continue;
            }
            arrayList.add((blx_1)object2);
        }
        bMn bMn2 = bwy_2.h().j();
        object2 = new fex_0(bmr_12, emr_22, bmr_12, (epq_2)arrayList.get(0), bMn2 == null ? null : bMn2.y(), arrayList);
        fey_0 fey_02 = new fey_0(blx_12, emr_22, ((bvw_2)bwh_02).x(), ((bvw_2)bwh_02).y(), arrayList2);
        arrayList3.addAll(((fdg)object2).b());
        arrayList3.addAll(fey_02.b());
        return arrayList3;
    }

    @Override
    public List<fde> l() {
        Object object;
        Object object2;
        bmr_1 bmr_12 = azu_0.j().k();
        blx_1 blx_12 = (blx_1)this.l;
        fec_0 fec_02 = new fec_0(bmr_12);
        ArrayList<fde> arrayList = new ArrayList<fde>();
        bwh_0 bwh_02 = bwj_1.a().a(blx_12.bA());
        emr_2 emr_22 = bwh_02.af_();
        if (cTR.j() == fbl_0.b) {
            object2 = bwh_02.j().iterator();
            while (object2.hasNext()) {
                int n;
                bRz bRz2;
                fez_0 fez_02 = new fez_0(bmr_12, (epq_2)object, 0, (byte)(((blx_1)(object = (blx_1)object2.next())).Y() != blx_12.Y() ? 1 : 0), emr_22);
                arrayList.addAll(fez_02.b());
                if (!(object instanceof bmv_1)) continue;
                bmv_1 bmv_12 = (bmv_1)object;
                if (fec_02.e() == fed_0.b || (bRz2 = bRC.c().a(bmv_12.cW().t())) == null || !bRz2.c() || bRz2.e() || (n = bRz2.f()) == 0) continue;
                fec_02.a(n > 0 ? fed_0.b : fed_0.a);
            }
        }
        object2 = new feA(bmr_12, emr_22, ((bvw_2)bwh_02).x());
        object = new feI(bmr_12, emr_22);
        arrayList.addAll(((fdg)object2).b());
        arrayList.addAll(((fdg)object).b());
        arrayList.addAll(fec_02.b());
        return arrayList;
    }

    @Override
    protected int t() {
        return cUL.am.aH;
    }

    static {
        t.put(ema_1.C, cti_0.a);
        t.put(ema_1.p, cti_0.d);
        t.put(ema_1.q, cti_0.d);
        t.put(ema_1.a, cti_0.r);
    }
}

