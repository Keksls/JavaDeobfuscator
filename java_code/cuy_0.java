/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/*
 * Renamed from cUY
 */
public abstract class cuy_0 {
    protected final cva_0 a = new cva_0();
    protected cuz_0 b;

    protected static void a(List<abz_0> list, int n) {
        int n2 = list.size();
        for (int k = 0; k < n2; ++k) {
            if (!(list.get(k) instanceof biI)) continue;
            biI biI2 = (biI)list.get(k);
            blx_1 blx_12 = biI2.bI();
            if (blx_12.a(eoz_1.ag)) {
                blx_12 = blx_12.aq();
            }
            if (blx_12 == null || blx_12.bA() != n) continue;
            ddy_0.a().a(blx_12);
            break;
        }
    }

    protected void a(ace_0 ace_02, aff_1 aff_12, bvx_2 bvx_22) {
        Object object;
        Object object2;
        boolean bl = false;
        ss_0 ss_02 = bvx_22.i();
        boolean bl2 = bvx_22.g().a(aff_12.d(), aff_12.e());
        if (ss_02 != null && (object2 = ss_02.f()) != null && !object2.isEmpty()) {
            object = azu_0.j().k();
            Iterator<sr_0> iterator = object2.iterator();
            while (iterator.hasNext()) {
                bhf_2 bhf_22;
                boolean bl3;
                boolean bl4;
                sr_0 sr_02 = iterator.next();
                if (!(sr_02 instanceof YO) || sr_02.w() == ele_0.k.a() && object != sr_02.v() || sr_02.a(eld_0.e) && ((blx_1)object).Y() != sr_02.Y() || sr_02.a(eld_0.i)) continue;
                boolean bl5 = bl4 = bl2 && sr_02 instanceof bgn_2 && !((bgn_2)sr_02).au();
                if (sr_02 instanceof bhf_2 && (bl3 = bvx_22.a(bhf_22 = (bhf_2)sr_02)) || !bl4 && (sr_02.G() != aff_12.d() || sr_02.H() != aff_12.e())) continue;
                this.a.a((YO)((Object)sr_02));
                bl = true;
                break;
            }
        }
        if (bl) {
            object2 = aht_0.b(ace_02, aff_12.d(), aff_12.e(), aff_12.f());
            this.a.d(Hw.b(((afd_1)object2).a));
            this.a.e(Hw.b(((afd_1)object2).b));
            object = new dhg(this.a, 0);
            ((dhg)object).a(this.a.g(), null);
            dbm_0.a().a((dhg)object);
            this.a.a(StringUtils.isNotBlank((CharSequence)this.a.g()));
        } else if (this.a.a()) {
            dbm_0.a().a(this.a);
            this.a.a(StringUtils.isNotBlank((CharSequence)this.a.g()));
        }
    }

    protected aff_1 a(int n, int n2, boolean bl, boolean bl2, bvx_2 bvx_22) {
        ArrayList<aff_1> arrayList;
        if (this.b == null && bvx_22 != null) {
            this.b = new cuz_0(bvx_22.c());
        }
        if ((arrayList = agz.a(ans_0.D().c(), n, n2, bl, bl2, this.b)) == null || arrayList.isEmpty()) {
            return null;
        }
        Object object = arrayList.iterator();
        while (object.hasNext()) {
            aff_1 aff_12 = object.next();
            if (!aii_0.a().a(aff_12)) continue;
            return aff_12;
        }
        if (bvx_22 != null && (object = bvx_22.g()) != null) {
            for (aff_1 aff_13 : arrayList) {
                if (!((tg_0)object).d(aff_13.d(), aff_13.e(), aff_13.f())) continue;
                return aff_13;
            }
        }
        return arrayList.get(0);
    }

    protected static void a(bvx_2 bvx_22) {
        if (bvx_22 != null) {
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12.a(erl_2.ai)) {
                return;
            }
            boolean bl = !cuy_0.c();
            cIi.proceedFightersTransparency(bl);
            ((bvx_0)ans_0.D().h()).a((agp_0)bWe.t, bl);
        }
    }

    protected static void b(bvx_2 bvx_22) {
        if (bvx_22 != null) {
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12.a(erl_2.ai)) {
                return;
            }
            boolean bl = !cuy_0.a();
            cIi.proceedHideFightOccluders(bl);
            ((bvx_0)ans_0.D().h()).a((agp_0)bWe.s, bl);
        }
    }

    public static void a(boolean bl) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return;
        }
        int n = bmr_12.cQ();
        if (n <= 0) {
            return;
        }
        cuy_0.a(bl, n);
    }

    private static void a(boolean bl, int n) {
        ArrayList arrayList = new ArrayList(500);
        afz_0.d().a(arrayList);
        abe_0.d().a(arrayList);
        ahs.d().a(arrayList);
        bNT.f().a(arrayList);
        bwj_1.a().a(n).j().forEach(blx_12 -> {
            if (blx_12.bm() && !arrayList.contains(blx_12.bv())) {
                arrayList.add(blx_12.bv());
            }
        });
        int n2 = arrayList.size();
        for (int k = 0; k < n2; ++k) {
            abu abu2 = (abu)arrayList.get(k);
            if (abu2.az() != n) continue;
            cuy_0.a((abu)arrayList.get(k), bl);
        }
    }

    private static void a(abu abu2, boolean bl) {
        if (abu2 instanceof biI) {
            cuy_0.a(((biI)abu2).bI(), bl);
            return;
        }
        cuy_0.b(abu2, bl);
    }

    public static void a(blx_1 blx_12, boolean bl) {
        biI biI2 = blx_12.bv();
        if (blx_12.fW()) {
            if (blx_12.aD()) {
                biI2.e(bl ? 0.2f : 0.4f);
            }
        } else {
            cuy_0.b(biI2, bl);
        }
    }

    private static void b(abu abu2, boolean bl) {
        if (bl) {
            abu2.e(0.5f);
        } else {
            abu2.e(abu2.aw());
            abu2.av();
        }
    }

    public static void a(bvx_2 bvx_22, blx_1 blx_12) {
        if (bvx_22 == null || blx_12.bA() != bvx_22.c()) {
            return;
        }
        cuy_0.a(blx_12, cuy_0.c());
    }

    public static void a(bvx_2 bvx_22, abu abu2) {
        if (bvx_22 == null || abu2.az() != bvx_22.c()) {
            return;
        }
        cuy_0.a(abu2, cuy_0.c());
    }

    public static boolean a() {
        return ((bvx_0)ans_0.D().h()).a(bWe.s);
    }

    public static boolean c() {
        return ((bvx_0)ans_0.D().h()).a(bWe.t);
    }

    public static boolean d() {
        return ((bvx_0)ans_0.D().h()).a(bWe.C);
    }

    protected void e() {
        if (this.a.a()) {
            dhf dhf2 = new dhf(this.a);
            add_2.b().a(dhf2);
            this.a.a(false);
        }
    }

    public static boolean a(int n, int n2, bvx_2 bvx_22) {
        cuz_0 cuz_02 = new cuz_0(bvx_22.c());
        ArrayList<aff_1> arrayList = agz.a(ans_0.D().c(), n, n2, !cuy_0.c(), false, cuz_02);
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        tg_0 tg_02 = bvx_22.g();
        aff_1 aff_12 = arrayList.get(0);
        int n3 = aff_12.d();
        int n4 = aff_12.e();
        if (n3 < tg_02.z()) {
            return false;
        }
        if (n3 > tg_02.D()) {
            return false;
        }
        if (n4 < tg_02.A()) {
            return false;
        }
        return n4 <= tg_02.E();
    }

    protected static void f() {
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        aPw aPw2 = aPw.a((byte)bvx_02.d(bWe.H));
        if (aPw2 == null) {
            bvx_02.a((agp_0)bWe.H, aPw.d.a());
            return;
        }
        aPw aPw3 = aPw2.c();
        bvx_02.a((agp_0)bWe.H, aPw3.a());
    }
}

