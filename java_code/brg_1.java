/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from brG
 */
public class brg_1
extends brt_1 {
    public static final String m = "level";
    public static final String n = "levelText";
    public static final String o = "nameAndlevelText";
    public static final String p = "levelTextColor";
    public static final String q = "currentXpPercentage";
    public static final String r = "nextXpPercentage";
    public static final String s = "nextXpPercentageInit";
    public static final String t = "xpRatio";
    public static final String u = "recipes";
    public static final String v = "harvests";
    public static final String w = "currentRecipesPage";
    public static final String x = "currentHarvestsPage";
    public static final String y = "hasHarvest";
    public static final String z = "hasSeed";
    public static final String A = "hasGrossResource";
    public static final String B = "hasEndResource";
    public static final String C = "hasRecipe";
    public static final String D = "seedIconTitle";
    public static final String E = "grossResourceIconTitle";
    public static final String F = "endResourceIconTitle";
    public static final String G = "seedCount";
    public static final String H = "grossResourceCount";
    public static final String I = "endResourceCount";
    public static final String J = "harvestBonusValue";
    public static final String K = "recipeCount";
    public static final String L = "currentPageText";
    public static final String M = "currentPage";
    public static final String N = "maxNumPages";
    public static final String O = "numPerPage";
    public static final String P = "isOkFiltered";
    public static final String Q = "isUpgradeFiltered";
    public static final String R = "isXpFiltered";
    public static final String S = "isAbcSorted";
    public static final String T = "isLevelSorted";
    public static final String U = "isAbcSortActivated";
    public static final String V = "isLevelSortActivated";
    public static final String W = "craftBigIcon";
    public static final String X = "craftIcon";
    public static final String Y = "isCraft";
    public static final String Z = "freeMode";
    public static final String aa = "isSecureCraft";
    public static final String ab = "artisan";
    public static final String ac = "isArtisanRegistered";
    public static final String ad = "isCurrentTypeCraft";
    public static final String[] ae = new String[]{"level", "levelText", "currentXpPercentage", "nextXpPercentage", "recipes", "isOkFiltered", "isAbcSorted", "isLevelSorted", "isAbcSortActivated", "isLevelSortActivated", "isSecureCraft", "isArtisanRegistered", "nameAndlevelText", "craftIcon", "craftBigIcon"};
    private static final String ag = "CraftIcon%d";
    private static final String ah = "CraftBigIcon%d";
    private final bgq_1 ai;
    private ArrayList<brw_0> aj;
    private ArrayList<brr_0> ak;
    private final List<brr_0> al;
    private boolean am = false;
    private boolean an = false;
    private boolean ao = false;
    private String ap = "";
    private long aq = -1L;
    private boolean ar = false;
    private int as;
    private brf_1 at;
    private brv_0 au;
    public static final int af = 7;
    private static final int av = 100;
    private short aw = (short)-1;
    private short ax = Short.MAX_VALUE;
    private final long ay;

    public brg_1(int n, long l, ece_0 ece_02, bgq_1 bgq_12) {
        super(n, ece_02);
        this.al = brP.a.a(this.l, 200);
        this.ay = l;
        this.ai = bgq_12;
        this.p();
        this.o();
    }

    public brg_1(int n, long l, ece_0 ece_02) {
        this(n, l, ece_02, null);
    }

    public void a(brv_0 brv_02) {
        this.au = brv_02;
    }

    @Override
    public boolean j() {
        return this.aj != null && !this.aj.isEmpty();
    }

    @Override
    public boolean k() {
        return this.ak != null && !this.ak.isEmpty();
    }

    @Override
    public boolean l() {
        return azu_0.j().n().u() != this.ay;
    }

    public void a(boolean bl) {
        this.ar = bl;
        fis_1.a().a((ajf_1)this, Z);
    }

    @Override
    public int e() {
        return this.l;
    }

    @Override
    public short h() {
        return this.a().f(this.l);
    }

    @Override
    public String[] d() {
        return ae;
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "level": {
                return this.h();
            }
            case "levelText": {
                return bae.h().a("levelShort.custom", this.h());
            }
            case "levelTextColor": {
                String string2 = new ani_2().i().a(brg_1.P().w()).a(this.h()).j().r();
                return bae.h().a("levelShort.custom", string2);
            }
            case "xpRatio": {
                ece_0 ece_02 = this.a();
                long l = ece_02.i(this.l);
                long l2 = ecu_0.a(ece_02.f(this.l));
                long l3 = ecu_0.a((short)(ece_02.f(this.l) + 1));
                String string3 = bae.h().a(l - l2);
                String string4 = bae.h().a(l3 - l2);
                return new ani_2().a((CharSequence)string3).a((CharSequence)"/").a((CharSequence)string4).r();
            }
            case "currentXpPercentage": {
                return Math.min(1.0, this.a().g(this.l));
            }
            case "nextXpPercentage": 
            case "nextXpPercentageInit": {
                if (this.aq == -1L) {
                    return this.a().g(this.l);
                }
                if (ecu_0.c(this.aq) > this.h()) {
                    return Float.valueOf(1.0f);
                }
                return this.a().c(this.l, this.aq);
            }
            case "craftBigIcon": {
                return this.N();
            }
            case "craftIcon": {
                return this.M();
            }
            case "hasRecipe": {
                return this.Q();
            }
            case "hasHarvest": {
                return this.m();
            }
            case "hasSeed": {
                Optional<brr_0> optional = this.n();
                if (optional.isEmpty()) {
                    return false;
                }
                switch (optional.get().h()) {
                    case e: 
                    case d: 
                    case c: 
                    case a: {
                        return true;
                    }
                }
                return false;
            }
            case "hasGrossResource": {
                Optional<brr_0> optional = this.n();
                if (optional.isEmpty()) {
                    return false;
                }
                switch (optional.get().h()) {
                    case b: 
                    case f: {
                        return false;
                    }
                }
                return true;
            }
            case "hasEndResource": {
                Optional<brr_0> optional = this.n();
                if (optional.isEmpty()) {
                    return false;
                }
                switch (optional.get().h()) {
                    case e: 
                    case d: 
                    case c: 
                    case a: 
                    case b: 
                    case f: {
                        return true;
                    }
                }
                return false;
            }
            case "endResourceIconTitle": {
                return this.K();
            }
            case "seedIconTitle": {
                return this.J();
            }
            case "grossResourceIconTitle": {
                return this.L();
            }
            case "harvests": {
                return this.o();
            }
            case "recipes": {
                return this.p();
            }
            case "isOkFiltered": {
                return this.am;
            }
            case "isUpgradeFiltered": {
                return this.an;
            }
            case "isXpFiltered": {
                return this.ao;
            }
            case "isCraft": {
                return this.O();
            }
            case "seedCount": {
                int n = this.a().j(this.l);
                return new ani_2().a((CharSequence)": ").d(n).r();
            }
            case "endResourceCount": {
                int n = this.a().l(this.l);
                return new ani_2().a((CharSequence)": ").d(n).r();
            }
            case "harvestBonusValue": {
                int n = this.C().cv().a(eAE.e, this.l, 3);
                return new ani_2().a((CharSequence)": ").d(n).a((CharSequence)" %").r();
            }
            case "grossResourceCount": {
                int n = this.a().k(this.l);
                return new ani_2().a((CharSequence)": ").d(n).r();
            }
            case "recipeCount": {
                int n = this.a().m(this.l);
                return new ani_2().a((CharSequence)": ").d(n).r();
            }
            case "freeMode": {
                return this.ar;
            }
            case "currentPage": {
                if (this.au != null) {
                    return this.au.e();
                }
                return 0;
            }
            case "currentPageText": {
                if (this.at != brf_1.b && this.au != null) {
                    return this.au.a();
                }
                return this.as + 1 + "/" + this.B();
            }
            case "numPerPage": {
                if (this.au == null) break;
                return this.au.c();
            }
            case "maxNumPages": {
                return this.B() - 1;
            }
            case "currentRecipesPage": {
                if (this.au != null) {
                    return this.au.d();
                }
                return null;
            }
            case "currentHarvestsPage": {
                int n = this.as * 7;
                int n2 = Math.min(this.ak.size(), n + 7);
                ArrayList<brr_0> arrayList = new ArrayList<brr_0>();
                for (int k = n; k < n2; ++k) {
                    arrayList.add(this.ak.get(k));
                }
                return arrayList;
            }
            case "isSecureCraft": {
                return this.l();
            }
            case "artisan": {
                return this.C();
            }
            case "nameAndlevelText": {
                return this.b() + " - " + bae.h().a("levelShort.custom", this.h());
            }
            case "isCurrentTypeCraft": {
                return this.at == brf_1.a;
            }
            case "isArtisanRegistered": {
                return this.I();
            }
        }
        return super.b(string);
    }

    private boolean I() {
        if (fis_1.a().f(ac) == null) {
            return false;
        }
        return fis_1.a().c(ac);
    }

    private String J() {
        Optional<brr_0> optional = this.n();
        if (optional.isEmpty()) {
            return null;
        }
        return bae.h().a(100, (long)optional.get().h().b(), new Object[0]);
    }

    private String K() {
        Optional<brr_0> optional = this.n();
        if (optional.isEmpty()) {
            return null;
        }
        return bae.h().a(109, (long)optional.get().h().b(), new Object[0]);
    }

    private String L() {
        Optional<brr_0> optional = this.n();
        if (optional.isEmpty()) {
            return null;
        }
        return bae.h().a(108, (long)optional.get().h().b(), new Object[0]);
    }

    @NotNull
    private String M() {
        return String.format(ag, this.l);
    }

    @NotNull
    private String N() {
        return String.format(ah, this.l);
    }

    private boolean O() {
        ece_0 ece_02 = this.a();
        if (ece_02.j(this.l) > 0) {
            return false;
        }
        if (ece_02.k(this.l) > 0) {
            return false;
        }
        return ece_02.l(this.l) <= 0;
    }

    private static azj_2 P() {
        return anr_0.aa;
    }

    public boolean m() {
        return !this.al.isEmpty();
    }

    public Optional<brr_0> n() {
        if (this.al.isEmpty()) {
            return Optional.empty();
        }
        return Optional.ofNullable(this.al.get(0));
    }

    public ArrayList<brr_0> o() {
        if (this.ak != null) {
            return this.ak;
        }
        this.ak = new ArrayList();
        ece_0 ece_02 = this.a();
        short s2 = ece_02.f(this.l);
        this.al.stream().filter(brr_02 -> !this.am || brr_02.e() <= s2).filter(brr_02 -> brr_02.e() >= this.aw).filter(brr_02 -> brr_02.e() <= this.ax).filter(brr_02 -> !this.ao || this.b((brr_0)brr_02) && ece_02.f(brr_02.m()) >= brr_02.e()).filter(brr_02 -> this.ap.isEmpty() || Cz.a(brr_02.c(), this.ap)).sorted(Comparator.comparingInt(brr_0::e).thenComparing((brr_02, brr_03) -> exw_1.o().compare(brr_02.n(), brr_03.n())).thenComparingInt(brr_0::g)).forEach(brr_02 -> this.ak.add((brr_0)brr_02));
        return this.ak;
    }

    private boolean Q() {
        return ecn_0.a.a(this.l).i() > 0;
    }

    public ArrayList<brw_0> p() {
        if (this.aj != null) {
            return this.aj;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        ect_0 ect_02 = ecn_0.a.a(this.l);
        this.aj = new ArrayList(ect_02.i());
        List<eco_0> list = brs_0.a.a(this.l);
        ece_0 ece_02 = this.a();
        bnh_1 bnh_12 = this.C();
        for (eco_0 eco_02 : list) {
            boolean bl;
            String string = bae.h().a(15, (long)eco_02.k().a(), new Object[0]);
            if (eco_02.f() > 200 || eco_02.a(ece_02) || !eco_02.c(bnh_12)) continue;
            boolean bl2 = bl = bmr_12.a(eco_02) && this.b(eco_02);
            if (this.am && !bl || this.an && eco_02.n()) continue;
            long l = eco_02.a(ece_02.f(this.l), bmr_12);
            double d2 = eco_02.a(ece_02.f(this.l));
            if (this.ao && (l <= 0L || d2 <= 0.0) || eco_02.f() < this.aw || eco_02.f() > this.ax || !this.ap.isEmpty() && !Cz.a(string, this.ap) || this.ai != null && !this.ai.a(eco_02.e(), eco_02.b())) continue;
            brw_0 brw_02 = new brw_0(eco_02, this);
            brw_02.a(bl);
            this.aj.add(brw_02);
        }
        return this.aj;
    }

    public long a(brr_0 brr_02, int n) {
        int n2 = brr_02.m();
        bmr_1 bmr_12 = azu_0.j().k();
        ect_0 ect_02 = ecn_0.a.a(n2);
        short s2 = this.a().f(n2);
        short s3 = (short)brr_02.e();
        long l = ecu_0.a(s2, s3, ect_02, bmr_12);
        long l2 = (long)((float)l * brr_02.f());
        int n3 = bmr_12.cv().a(eAE.a, n2, n);
        float f2 = (float)(100 + n3) / 100.0f;
        float f3 = f2 * (float)l2;
        return Hw.d((double)(f3 *= bmr_12.N_().g()));
    }

    public long a(brr_0 brr_02) {
        int n = brr_02.m();
        bnh_1 bnh_12 = this.C();
        ect_0 ect_02 = ecn_0.a.a(n);
        float f2 = brr_02.f() * 0.6666667f;
        long l = ecu_0.a((short)brr_02.e(), (short)brr_02.e(), ect_02, bnh_12);
        return (long)((float)l * f2);
    }

    private boolean b(brr_0 brr_02) {
        int n = brr_02.m();
        bnh_1 bnh_12 = this.C();
        ect_0 ect_02 = ecn_0.a.a(n);
        return ecu_0.a(this.a().f(n), (short)brr_02.e(), ect_02, bnh_12) != 0L;
    }

    public int a(eco_0 eco_02) {
        if (!this.l()) {
            return 0;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        bsx_2 bsx_22 = bmr_12.di();
        if (bsx_22 == null) {
            return 0;
        }
        bnh_1 bnh_12 = bsx_22.r();
        if (bnh_12 == null) {
            return 0;
        }
        ecs_0 ecs_02 = eco_02.k();
        if (ecs_02 == ecs_0.a) {
            return 0;
        }
        bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(ecs_02.a());
        if (bjw_12 == null) {
            return 0;
        }
        boolean bl = ((epq_2)bnh_12).fc() > 0L && ((epq_2)bnh_12).fc() == bmr_12.fc();
        ece_0 ece_02 = this.a();
        return ece_02.a(eco_02, bl);
    }

    public boolean b(eco_0 eco_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        int n = this.a(eco_02);
        return (long)n <= bmr_12.cq();
    }

    private void R() {
        this.aj.sort((brw_02, brw_03) -> {
            if (brw_02.c() != brw_03.c()) {
                return brw_02.c() - brw_03.c();
            }
            if (brw_02.l() != brw_03.l()) {
                byte by = brw_02.l() != null ? brw_02.l().b() : exw_1.a.b();
                byte by2 = brw_03.l() != null ? brw_03.l().b() : exw_1.a.b();
                return by < by2 ? -1 : 1;
            }
            if (brw_02.m() != brw_03.m()) {
                return brw_02.m() ? 1 : -1;
            }
            String string = brw_02.e();
            String string2 = brw_03.e();
            return Cz.d(string, string2);
        });
    }

    public bgq_1 q() {
        return this.ai;
    }

    public void a(String string) {
        this.ap = string;
        this.z();
    }

    public String r() {
        return this.ap;
    }

    public void a(long l) {
        this.aq = l;
        fis_1.a().a((ajf_1)this, r);
    }

    public void s() {
        this.am = !this.am;
        this.z();
        fis_1.a().a((ajf_1)this, P);
    }

    public void t() {
        this.an = !this.an;
        this.z();
        fis_1.a().a((ajf_1)this, Q);
    }

    public void u() {
        this.ao = !this.ao;
        this.z();
        fis_1.a().a((ajf_1)this, R);
    }

    public void v() {
        if (this.aj == null) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        boolean bl = false;
        for (int k = this.aj.size() - 1; k >= 0; --k) {
            boolean bl2;
            brw_0 brw_02 = this.aj.get(k);
            boolean bl3 = bl2 = bmr_12.a(brw_02.g()) && this.b(brw_02.g());
            if (!this.am || bl2) continue;
            this.aj.remove(k);
            bl = true;
        }
        if (bl) {
            fis_1.a().a((ajf_1)this, u);
        }
    }

    public void w() {
        this.z();
    }

    public void x() {
        fis_1.a().a((ajf_1)this, q);
    }

    public void y() {
        this.z();
        fis_1.a().a((ajf_1)this, m, p, n, s, q);
    }

    public void z() {
        this.aj = null;
        this.ak = null;
        this.p();
        this.o();
        this.S();
        String string = this.at == brf_1.b ? x : w;
        fis_1.a().a((ajf_1)this, u, v, N, M, L, O, string);
    }

    private void S() {
        int n = this.B();
        if (this.as >= n) {
            this.b(n);
        } else if (this.as < 0) {
            this.b(1);
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    public void a(brf_1 brf_12) {
        this.at = brf_12;
        this.as = 0;
        if (this.au != null) {
            this.au.a(this.as);
        }
        fis_1.a().a((ajf_1)this, N, M, L, O, x, w, ad);
    }

    public brf_1 A() {
        return this.at;
    }

    public int B() {
        if (this.at == brf_1.b) {
            return (int)Math.ceil((float)this.ak.size() / 7.0f);
        }
        if (this.au != null) {
            return this.au.b();
        }
        return 0;
    }

    public void b(int n) {
        int n2 = this.B();
        if (n >= n2) {
            n = n2 - 1;
        }
        if (n < 0) {
            n = 0;
        }
        this.as = n;
        if (this.au != null) {
            this.au.a(n);
        }
        fis_1.a().a((ajf_1)this, M, L, O, x, w);
    }

    public bnh_1 C() {
        return (bnh_1)bmf_2.a().d(this.ay);
    }

    public int D() {
        return this.au == null ? 0 : this.au.e();
    }

    public short E() {
        return this.aw;
    }

    public void a(short s2) {
        this.aw = s2;
        this.z();
    }

    public short F() {
        return this.ax;
    }

    public void b(short s2) {
        this.ax = s2;
        this.z();
    }

    public void G() {
        fis_1.a().a((ajf_1)this, w);
        if (this.au != null) {
            for (brw_0 brw_02 : this.au.d()) {
                brw_02.b();
            }
        }
    }

    public void H() {
        this.aw = 0;
        this.ax = (short)200;
        this.ap = "";
        this.am = false;
        this.an = false;
        this.ao = false;
        this.z();
        fis_1.a().a((ajf_1)this, P, Q, R);
    }

    public void a(brg_1 brg_12) {
        this.aw = brg_12.aw;
        this.ax = brg_12.ax;
        this.ap = brg_12.ap;
        this.am = brg_12.am;
        this.an = brg_12.an;
        this.ao = brg_12.ao;
    }
}

