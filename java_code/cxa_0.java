/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cXA
 */
public class cxa_0
implements ahr_1,
ebv_0 {
    protected static final Logger a = Logger.getLogger(cxa_0.class);
    private static final cxa_0 c = new cxa_0();
    public static final int b = 25;
    private final ans_1 d = string -> {
        if (string.equals("craftDialog")) {
            azu_0.j().b(cxa_0.a());
        }
    };
    private final ans_1 e = string -> {
        if (string.equals("craftLinkedRecipeDialog")) {
            if (!(azu_0.j().c(cVS.b) || azu_0.j().c(cxa_0.a()) || azu_0.j().c(cXC.a()) || fpm_0.b().q("recipeViewDialog"))) {
                fpm_0.b().e("wakfu.crafts");
            }
            fis_1.a().a("linkedRecipes");
            fis_1.a().a("linkedRecipesItemName");
            fpm_0.b().b(this.e);
        }
    };
    private final Map<Integer, Boolean> f = new HashMap<Integer, Boolean>();
    private final Map<Integer, Integer> g = new HashMap<Integer, Integer>();
    private final Map<Integer, Integer> h = new HashMap<Integer, Integer>();

    public static cxa_0 a() {
        return c;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.dO().g()) {
            azu_0.j().b(this);
            return;
        }
        if (fis_1.a().f("isArtisanRegistered") == null) {
            ece_0 ece_02 = bmr_12.eX();
            fis_1.a().a("isArtisanRegistered", ece_02.a());
        }
        fpm_0.b().a(this.d);
        bmr_12.eX().a(this);
        this.d();
        fpm_0.b().a("craftDialog", cfi_0.a("craftDialog"), 32769L, (short)10000);
        this.c();
        cdw_0.n().c(600057L);
        if (!fpm_0.b().d("wakfu.crafts")) {
            fpm_0.b().a("wakfu.crafts", cgu_0.class);
        }
    }

    public void c() {
        int n = ((bvx_0)ans_0.D().h()).d(bWe.ab);
        this.b(n);
    }

    public void b(int n) {
        bmr_1 bmr_12 = azu_0.j().k();
        ece_0 ece_02 = bmr_12.eX();
        brg_1 brg_12 = n == -1 || !ece_02.e(n) ? bmr_12.dO().f() : bmr_12.dO().c(n);
        brf_1 brf_12 = brg_12.k() ? brf_1.b : brf_1.a;
        brg_12.a(brf_12);
        fis_1.a().a("craftDisplayType", brf_12.a());
        fis_1.a().a("craft", (Object)brg_12, "craftDialog");
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        bmr_12.eX().b(this);
        brg_1 brg_12 = (brg_1)fis_1.a().d("craft", "craftDialog");
        if (brg_12 != null) {
            brg_12.H();
        }
        fis_1.a().a("isArtisanRegistered");
        fpm_0.b().o("craftDialog");
        fpm_0.b().b(this.d);
        if (!(azu_0.j().c(cVS.b) || azu_0.j().c(cXC.a()) || fpm_0.b().q("recipeViewDialog") || fpm_0.b().q("craftLinkedRecipeDialog"))) {
            fpm_0.b().e("wakfu.crafts");
        }
        cdw_0.n().c(600013L);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19554: {
                anw_1 anw_12 = (anw_1)adt_12;
                int n = anw_12.c();
                this.b(n);
                return false;
            }
            case 16765: {
                brg_1 brg_12 = ((dfH)adt_12).k();
                brf_1 brf_12 = brf_1.a((byte)fis_1.a().d("craftDisplayType"));
                switch (brf_12) {
                    case b: {
                        if (brg_12.k()) break;
                        brf_12 = brf_1.a;
                        break;
                    }
                    case a: {
                        if (brg_12.j()) break;
                        brf_12 = brf_1.b;
                    }
                }
                fis_1.a().a("craftDisplayType", brf_12.a());
                brg_1 brg_13 = (brg_1)fis_1.a().d("craft", "craftDialog");
                brg_12.a(brg_13);
                brg_12.z();
                fis_1.a().a("craft", (Object)brg_12, "craftDialog");
                brg_12.a(brf_12);
                ((bvx_0)ans_0.D().h()).a((agp_0)bWe.ab, brg_12.e());
                return false;
            }
            case 19731: {
                anw_1 anw_13 = (anw_1)adt_12;
                int n = anw_13.c();
                this.c(n);
                return false;
            }
            case 16216: {
                brx_0 brx_02 = azu_0.j().k().dO();
                bWe bWe2 = bWe.as;
                boolean bl = ((bvx_0)ans_0.D().h()).a(bWe2);
                ((bvx_0)ans_0.D().h()).a((agp_0)bWe2, !bl);
                fis_1.a().a((ajf_1)brx_02, "allByPreferences", "isCraftSorted");
                return false;
            }
            case 16700: {
                anw_1 anw_14 = (anw_1)adt_12;
                ArrayList<brl_1> arrayList = new ArrayList<brl_1>();
                int n = anw_14.c();
                ecn_0.a.b((ect_0 ect_02) -> {
                    brl_1 brl_12 = new brl_1(ect_02.a(), n);
                    if (brl_12.j()) {
                        brl_12.c(n);
                        brl_12.a(true);
                    }
                    if (brl_12.m()) {
                        arrayList.add(brl_12);
                    }
                });
                this.a(n, arrayList);
                return false;
            }
            case 17449: {
                brg_1 brg_14 = (brg_1)((anw_1)adt_12).j();
                if (brg_14 == null) {
                    return false;
                }
                if (this.f.remove(brg_14.e()) == null) {
                    this.f.put(brg_14.e(), !brg_14.f());
                }
                this.d();
                return false;
            }
            case 16846: {
                brg_1 brg_15 = (brg_1)((anw_1)adt_12).j();
                int n = ((anw_1)adt_12).c();
                if (brg_15 == null) {
                    return false;
                }
                ece_0 ece_02 = brg_15.a();
                short s2 = ece_02.f(brg_15.e());
                if (n > s2) {
                    n = s2;
                }
                if (!this.h.containsKey(brg_15.e())) {
                    this.h.put(brg_15.e(), brg_15.g());
                }
                this.g.put(brg_15.e(), n);
                this.d();
                return false;
            }
            case 17650: {
                bmr_1 bmr_12 = azu_0.j().k();
                cmu cmu2 = new cmu(bmr_12.a_());
                this.f.forEach(cmu2::a);
                this.g.forEach(cmu2::a);
                this.a(bmr_12);
                azu_0.j().K().c(cmu2);
                this.d();
                return false;
            }
            case 17458: {
                this.g.clear();
                this.f.clear();
                this.d();
                return false;
            }
            case 17758: {
                bmr_1 bmr_13 = azu_0.j().k();
                this.a(bmr_13, ((anw_1)adt_12).i());
                this.d();
                return false;
            }
        }
        return true;
    }

    private void a(bmr_1 bmr_12, boolean bl) {
        cmt cmt2 = new cmt(bmr_12.a_(), bl);
        azu_0.j().K().c(cmt2);
        this.g.clear();
        this.f.clear();
        ece_0 ece_02 = bmr_12.eX();
        ece_02.a(bl);
        fis_1.a().a("isArtisanRegistered", bl);
    }

    private void a(bmr_1 bmr_12) {
        ece_0 ece_02 = bmr_12.eX();
        this.f.forEach(ece_02::b);
        this.g.forEach(ece_02::c);
        this.g.clear();
        this.f.clear();
        fis_1.a().a((ajf_1)bmr_12.dO(), "allByPreferences");
    }

    private void d() {
        boolean bl = this.f.isEmpty() && this.g.isEmpty();
        fis_1.a().a("artisansBookHasChanges", !bl);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void c(int n) {
        ArrayList<brl_1> arrayList = new ArrayList<brl_1>();
        int[] nArray = new int[]{0};
        ecn_0.a.b((ect_0 ect_02) -> {
            brl_1 brl_12 = new brl_1(ect_02.a(), n);
            if (brl_12.j()) {
                brl_12.b(n);
                brl_12.a(true);
            }
            if (brl_12.m()) {
                arrayList.add(brl_12);
                nArray[0] = nArray[0] + brl_12.p().size();
            }
        });
        if (nArray[0] > 25) {
            for (brl_1 brl_12 : arrayList) {
                brl_12.a(false);
            }
        }
        this.a(n, arrayList);
    }

    private void a(int n, Collection<brl_1> collection) {
        fis_1.a().a("linkedRecipes", collection);
        fis_1.a().a("linkedRecipesItemName", (Object)bae.h().a(15, (long)n, new Object[0]));
        if (!fpm_0.b().q("craftLinkedRecipeDialog")) {
            fpm_0.b().a(this.e);
            fpm_0.b().a("craftLinkedRecipeDialog", cfi_0.a("craftLinkedRecipeDialog"), "craftDialog", "craftDialog", "craftLinkedRecipeDialog", 0L, (short)10000);
        }
    }

    public void a(int n, brs_1 brs_12) {
        HashMap<Long, brn_1> hashMap = new HashMap<Long, brn_1>();
        ArrayList<Integer> arrayList = brs_12 == brs_1.a ? ccw_1.a.a(n) : ccw_1.a.b(n);
        for (Integer object2 : arrayList) {
            brn_1 brn_12;
            String string;
            fgv_0 fgv_02 = fgT.a.a(object2);
            if (fgv_02 == null) continue;
            long l = fgv_02.f();
            if (!hashMap.containsKey(l)) {
                string = bae.h().a(77, l, new Object[0]);
                brn_12 = new brn_1(string);
                hashMap.put(l, brn_12);
            } else {
                brn_12 = (brn_1)hashMap.get(l);
            }
            string = bae.h().a(66, (long)object2.intValue(), new Object[0]);
            brn_12.a(new brm_1(object2, fgv_02.f(), string));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(hashMap.values());
        this.a(arrayList2);
        fis_1.a().a("linkedZones", arrayList2);
        String string = bae.h().a(brs_12 == brs_1.a ? 12 : 38, (long)n, new Object[0]);
        fis_1.a().a("linkedZonesItemName", (Object)string);
        if (!fpm_0.b().q("harvestZoneLinkedDialog")) {
            fpm_0.b().a("harvestZoneLinkedDialog", cfi_0.a("harvestZoneLinkedDialog"), "craftDialog", "craftDialog", "harvestZoneLinkedDialog", 0L, (short)10000);
        }
    }

    private void a(Collection<brn_1> collection) {
        ((List)collection).sort((brn_12, brn_13) -> {
            String string = brn_12.e();
            String string2 = brn_13.e();
            return Cz.d(string, string2);
        });
        for (brn_1 brn_14 : collection) {
            brn_14.f();
        }
    }

    @Override
    public void a(@NotNull ect_0 ect_02) {
        fis_1.a().a((ajf_1)azu_0.j().k().dO(), "craftsByLevel");
    }

    @Override
    public void a(int n, long l) {
        fis_1.a().a((ajf_1)azu_0.j().k().dO(), "craftsByLevel");
    }

    @Override
    public void a(int n) {
        brt_1 brt_12 = (brt_1)fis_1.a().d("craft", "craftDialog");
        if (brt_12 != null && n == brt_12.e()) {
            fis_1.a().a((ajf_1)brt_12, "grossResourceCount", "endResourceCount", "seedCount", "recipeCount", "currentXpPercentage", "level", "levelText");
        }
    }

    @Override
    public void a(int n, int n2) {
    }

    public void a(fck_2 fck_22) {
        boolean bl;
        Optional<fit_1> optional = Optional.ofNullable(fis_1.a().f("craftDisplayType"));
        boolean bl2 = bl = !optional.isPresent() || ((Byte)optional.get().f()).byteValue() == brf_1.c.a();
        if (bl) {
            return;
        }
        int n = fck_22.z();
        boolean bl3 = n < 0;
        brx_0 brx_02 = azu_0.j().k().dO();
        List<brt_1> list = brx_02.j();
        if (list.isEmpty()) {
            return;
        }
        brt_1 brt_12 = (brt_1)fis_1.a().d("craft", "craftDialog");
        if (brt_12 == null) {
            return;
        }
        int n2 = -1;
        for (int k = 0; k < list.size(); ++k) {
            brt_1 brt_13 = list.get(k);
            if (brt_13.e() != brt_12.e()) continue;
            n2 = k;
            break;
        }
        if (n2 == -1) {
            return;
        }
        if (bl3 && n2 == 0) {
            return;
        }
        if (!bl3 && n2 >= list.size() - 1) {
            return;
        }
        brt_1 brt_14 = list.get(n2 + (bl3 ? -1 : 1));
        if (brt_14 == null || brt_14.i()) {
            return;
        }
        this.b(brt_14.e());
    }

    public void b(fck_2 fck_22) {
        boolean bl;
        int n = fis_1.a().d("craftDisplayType");
        boolean bl2 = bl = (byte)n == brf_1.c.a();
        if (bl) {
            return;
        }
        int n2 = fck_22.z();
        if (n2 == 0) {
            return;
        }
        boolean bl3 = n2 < 0;
        brg_1 brg_12 = (brg_1)fis_1.a().d("craft", "craftDialog");
        if (brg_12 == null) {
            return;
        }
        int n3 = brg_12.B();
        int n4 = brg_12.D();
        if (bl3) {
            if (n4 > 0) {
                brg_12.b(n4 - 1);
            }
            return;
        }
        if (n4 >= n3 - 1) {
            return;
        }
        brg_12.b(n4 + 1);
    }
}

