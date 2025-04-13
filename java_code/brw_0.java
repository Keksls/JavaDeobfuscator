/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from brW
 */
public class brw_0
implements ajh_1,
bhx_1 {
    public static final String a = "name";
    public static final String b = "level";
    public static final String d = "nameAndLevel";
    public static final String e = "quantityText";
    public static final String f = "levelShort";
    public static final String g = "ingredients";
    public static final String h = "productionPercentage";
    public static final String i = "productionPercentageShort";
    public static final String j = "isSecretRecipe";
    public static final String k = "hasCriterion";
    public static final String l = "criterionDescription";
    public static final String m = "obsolete";
    public static final String n = "canAfford";
    public static final String o = "canUseAsIngredient";
    public static final String p = "machines";
    public static final String q = "craftFee";
    public static final String r = "totalCraftFee";
    public static final String s = "canPay";
    public static final String t = "isUpgrade";
    public static final String u = "craftXp";
    public static final String v = "productionPercentageValue";
    public static final String w = "baseCraftXp";
    public static final String[] x = new String[]{"name", "level", "nameAndLevel", "quantityText", "ingredients", "productionPercentage", "hasCriterion", "isSecretRecipe", "obsolete", "canAfford", "craftFee", "totalCraftFee", "craftXp", "productionPercentageValue"};
    private final eco_0 y;
    private final brt_1 z;
    private static final azf_2 A = new azf_2(0.8f, 0.0f, 0.0f, 1.0f);
    private static final azf_2 B = new azf_2(0.8f, 0.4f, 0.0f, 1.0f);
    private static final azf_2 C = new azf_2(0.8f, 0.8f, 0.0f, 1.0f);
    private static final azf_2 D = new azf_2(0.06f, 0.9f, 0.06f, 1.0f);
    private boolean E = false;
    private final boolean F;

    public brw_0(eco_0 eco_02, brt_1 brt_12) {
        this.y = eco_02;
        this.z = brt_12;
        this.F = this.n();
    }

    private boolean n() {
        return ecn_0.a.a(new int[]{this.y.k().a()});
    }

    public void b() {
        fis_1.a().a((ajf_1)this, n, s, q, r);
    }

    public void a(boolean bl) {
        this.E = bl;
        fis_1.a().a((ajf_1)this, n);
    }

    @Override
    public String[] d() {
        return x;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e();
        }
        if (string.equals(b)) {
            String string2 = new ani_2().a().a(this.c()).b().r();
            return bae.h().a("craft.recipeLevel", string2);
        }
        if (string.equals(f)) {
            return bae.h().a("levelShort.custom", this.c());
        }
        if (string.equals(d)) {
            Optional optional = Optional.ofNullable(eyo_1.g().d(this.y.k().a()));
            return this.a(optional.map(ezr_0::M).orElse(exw_1.a));
        }
        if (string.equals(e)) {
            short s2 = this.i();
            return s2 == 1 ? "" : "x" + s2;
        }
        if (string.equals(g)) {
            return this.f();
        }
        if (string.equals(h)) {
            long l = Math.round(this.y.a(this.z.h()) * 100.0);
            ani_2 ani_22 = new ani_2();
            azf_2 azf_22 = D;
            if (l < 100L) {
                azf_22 = l > 50L ? C : (l > 25L ? B : A);
            }
            String string3 = ani_22.a().a(azf_22.w()).a(l).b().r();
            return bae.h().a("craft.recipeChance", string3);
        }
        if (string.equals(i)) {
            long l = Math.round(this.y.a(this.z.h()) * 100.0);
            ani_2 ani_23 = new ani_2();
            azf_2 azf_23 = D;
            if (l < 100L) {
                azf_23 = l >= 50L ? B : A;
            }
            ani_23.i().a(azf_23.w()).a((CharSequence)(l + "%")).j();
            return ani_23.r();
        }
        if (string.equals(j)) {
            return this.y.c(ecp_0.a);
        }
        if (string.equals(k)) {
            return this.y.m() != null;
        }
        if (string.equals(l)) {
            apc_2 apc_22 = this.y.m();
            if (apc_22 == null) {
                return null;
            }
            ani_2 ani_24 = new ani_2();
            boolean bl = this.y.a(azu_0.j().k());
            ani_24.i().a((bl ? azf_2.j : azf_2.h).w());
            ani_24.a((CharSequence)eDm.a((aot_2)apc_22));
            ani_24.j();
            return ani_24.r();
        }
        if (string.equals(n)) {
            return this.E;
        }
        if (string.equals(o)) {
            return this.F;
        }
        if (string.equals(m)) {
            ect_0 ect_02 = ecn_0.a.a(this.z.e());
            bmr_1 bmr_12 = azu_0.j().k();
            ece_0 ece_02 = bmr_12.eX();
            short s3 = ece_02.f(this.z.e());
            return ecu_0.a(s3, this.c(), ect_02, bmr_12) == 0L;
        }
        if (string.equals(p)) {
            return this.j();
        }
        if (string.equals(q)) {
            return bae.h().a("kama.shortGain", this.k());
        }
        if (string.equals(r)) {
            int n = fis_1.a().d("currentCraftNb");
            return bae.h().a("kama.shortGain", this.k() * (long)n);
        }
        if (string.equals(s)) {
            long l = azu_0.j().k().cq();
            return l >= this.k();
        }
        if (string.equals(t)) {
            return this.m();
        }
        if (string.equals(u)) {
            bmr_1 bmr_13 = azu_0.j().k();
            ece_0 ece_03 = bmr_13.eX();
            int n = this.y.p();
            long l = this.y.a(ece_03.f(n), bmr_13);
            int n2 = bmr_13.cv().a(eAE.a, n, 8);
            float f2 = (float)(100 + n2) / 100.0f;
            l = (long)((float)l * f2);
            l = (long)((double)l * (2.0 - this.y.a(this.z.h())));
            l = (long)((float)l * bmr_13.N_().g());
            return l;
        }
        if (string.equals(w)) {
            bmr_1 bmr_14 = azu_0.j().k();
            return this.y.a(bmr_14);
        }
        if (string.equals(v)) {
            return Math.round(this.y.a(this.z.h()) * 100.0);
        }
        bjw_1 bjw_12 = this.h();
        return bjw_12 != null ? bjw_12.b().b(string) : null;
    }

    private String a(exw_1 exw_12) {
        return new ani_2().a().a(bhc_0.b(exw_12)).a((CharSequence)this.e()).a((CharSequence)" (").a((CharSequence)bae.h().a("levelShort.custom", this.c())).a((CharSequence)")").b().r();
    }

    public short c() {
        return this.y.f();
    }

    public String e() {
        return bae.h().a(15, (long)this.y.k().a(), new Object[0]);
    }

    public ArrayList<brk_1> f() {
        ArrayList<brk_1> arrayList = new ArrayList<brk_1>();
        Iterator<Map.Entry<Integer, Cm<Short, Short>>> iterator = this.y.l();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Cm<Short, Short>> entry = iterator.next();
            int n = entry.getKey();
            arrayList.add(new brk_1(entry.getValue().a(), entry.getValue().b(), (bjw_1)eyo_1.g().d(n)));
        }
        arrayList.sort(new brx_1(this));
        return arrayList;
    }

    public eco_0 g() {
        return this.y;
    }

    @Nullable
    public bjw_1 h() {
        ecs_0 ecs_02 = this.y.k();
        if (ecs_02 == ecs_0.a) {
            return null;
        }
        return (bjw_1)eyo_1.g().d(ecs_02.a());
    }

    public short i() {
        return this.y.k().b();
    }

    public String j() {
        ani_2 ani_22 = new ani_2();
        int[] nArray = this.y.d();
        int n = nArray.length;
        for (int k = 0; k < n; ++k) {
            if (k != 0) {
                ani_22.a((CharSequence)", ");
            }
            ani_22.a((CharSequence)bae.h().a(59, (long)nArray[k], new Object[0]));
        }
        return ani_22.r();
    }

    public long k() {
        if (!this.z.l()) {
            return 0L;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        bsx_2 bsx_22 = bmr_12.di();
        if (bsx_22 == null) {
            return 0L;
        }
        bnh_1 bnh_12 = bsx_22.r();
        if (this.h() == null) {
            return 0L;
        }
        boolean bl = bnh_12.fc() > 0L && bnh_12.fc() == bmr_12.fc();
        return bnh_12.eX().a(this.y, bl);
    }

    exw_1 l() {
        bjw_1 bjw_12 = this.h();
        return bjw_12 != null ? bjw_12.b().j() : null;
    }

    public boolean m() {
        return this.y.n();
    }

    @Override
    public bjw_1 a() {
        return this.h();
    }
}

