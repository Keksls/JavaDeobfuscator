/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public abstract class bMd<T extends ajf_1>
implements ajh_1 {
    private static final Logger J = Logger.getLogger(bMd.class);
    public static final String a = "name";
    public static final String b = "levelTextShort";
    public static final String d = "currentLevelPercentage";
    public static final String e = "xpText";
    public static final String f = "xpValue";
    public static final String g = "smallIconUrl";
    public static final String h = "breedName";
    public static final String i = "lastMealDateText";
    public static final String j = "dietDescription";
    public static final String k = "weakDescription";
    public static final String l = "animatedElement";
    public static final String m = "petAnimationEquipment";
    public static final String n = "hpMax";
    public static final String o = "hp";
    public static final String p = "hpDescription";
    public static final String q = "bonusDescription";
    public static final String r = "color";
    public static final String s = "colorName";
    public static final String t = "accessory";
    public static final String u = "accessoryName";
    public static final String v = "equipment";
    public static final String w = "hasPet";
    public static final String x = "isActive";
    public static final String y = "canChangeEquipment";
    public static final String z = "isMount";
    public static final String A = "canMount";
    public static final String B = "hasColorationItems";
    public static final String C = "colorationItems";
    public static final String D = "hasAccessoryItems";
    public static final String E = "accessoryItems";
    public static final String[] F = new String[]{"name", "levelTextShort", "currentLevelPercentage", "xpText", "xpValue", "smallIconUrl", "breedName", "lastMealDateText", "animatedElement", "petAnimationEquipment", "dietDescription", "weakDescription", "hpMax", "hp", "hpDescription", "bonusDescription", "color", "colorName", "equipment", "hasPet", "isActive", "isMount", "canMount", "hasColorationItems", "colorationItems", "hasAccessoryItems", "accessoryItems", "accessory", "accessoryName"};
    protected bMg G;
    protected ffu_0 H;
    protected T I;

    public void a() {
        this.G = new bMg(this.H);
        fge fge2 = Optional.ofNullable(this.b()).orElse(this.H.a());
        bmr_1 bmr_12 = azu_0.j().k();
        Optional<exk_2> optional = this.b(bmr_12);
        this.G.m(bMj.a(fge2, optional.map(exk_2::aT_).orElse(0)));
        this.G.a(aej_2.c);
        this.G.e("AnimStatique");
        this.G.a(agm.a());
        this.G.g(ahi_0.j.a());
        this.G.b((byte)8);
        this.G.c(true);
        this.G.E();
        this.G.a(fge2.h(this.a(fge2, bmr_12)));
        optional.ifPresent(exk_22 -> this.G.c(exk_22.I()));
        bMj.a(this.G, bmr_12);
        this.G.E();
    }

    @Override
    public String[] d() {
        return F;
    }

    @Override
    public Object b(String string) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (string.equals(a)) {
            return this.e();
        }
        if (string.equals(b)) {
            return bae.h().a("levelShort.custom", this.H.i());
        }
        if (string.equals(d)) {
            return this.H.h() / 100;
        }
        if (string.equals(e)) {
            fge fge2 = this.H.a();
            ani_2 ani_22 = new ani_2();
            ani_22.a();
            ani_22.a((CharSequence)bae.h().a("xpRatio", this.H.h(), fge2.a((short)(this.H.i() + 1))));
            ani_22.b().m();
            ani_22.a((CharSequence)bae.h().a("pet.xpDesc", new Object[0]));
            return ani_22.r();
        }
        if (string.equals(f)) {
            ffu_0 ffu_02 = this.H;
            short s2 = ffu_02.i();
            short s3 = ffu_02.a().h();
            int n = s2 * s3;
            float f2 = ffu_02.h() - n;
            return Float.valueOf(f2 / (float)s3);
        }
        if (string.equals(i)) {
            return this.j();
        }
        if (string.equals(l)) {
            return this.G;
        }
        if (string.equals(m)) {
            return this.G.an();
        }
        if (string.equals(k)) {
            Object object = "";
            int[] nArray = this.H.a().a();
            int n = nArray.length;
            for (int k = 0; k < n; ++k) {
                if (k > 0) {
                    object = (String)object + ", ";
                }
                object = (String)object + ((ezr_0)eyo_1.g().d(nArray[k])).e();
            }
            return bae.h().a("pet.weakDesc", object);
        }
        if (string.equals(j)) {
            ani_2 ani_23 = new ani_2();
            this.H.a().a(new bMe(this, ani_23));
            wx_0 wx_02 = this.H.a().f();
            wx_0 wx_03 = this.H.a().e();
            int n = wx_03.d();
            int n2 = wx_02.d();
            return bae.h().a("pet.dietDesc", ani_23.r(), n, n2, this.j());
        }
        if (string.equals(n)) {
            ffu_0 ffu_03 = this.H;
            return ffu_03.a().d();
        }
        if (string.equals(o)) {
            return this.k();
        }
        if (string.equals(r)) {
            bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(this.a(this.b(), bmr_12));
            if (bjw_12 != null) {
                return bjw_12.b("iconUrl");
            }
            return null;
        }
        if (string.equals(s)) {
            bjw_1 bjw_13 = (bjw_1)eyo_1.g().d(this.a(this.b(), bmr_12));
            if (bjw_13 != null) {
                return bjw_13.e();
            }
            return null;
        }
        if (string.equals(v)) {
            ft_1 ft_12 = this.H.a().k() ? ft_1.a : ft_1.b;
            fk_2 fk_22 = bol_1.a(bmr_12.R(), bmr_12.a_(), ft_12);
            if (fk_22.c() != 0) {
                return eyo_1.g().g(fk_22.c());
            }
            return eyo_1.g().g(fgh.a.c(this.H.a().b()));
        }
        if (string.equals(t)) {
            return this.b(bmr_12).map(exk_22 -> exk_22.b("iconUrl")).orElse(null);
        }
        if (string.equals(u)) {
            ft_1 ft_13 = this.H.a().k() ? ft_1.a : ft_1.b;
            fk_2 fk_23 = bol_1.a(bmr_12.R(), bmr_12.a_(), ft_13);
            if (bol_1.a((ffa_0)this.H, fk_23)) {
                return eyo_1.g().g(fk_23.g()).N();
            }
            return null;
        }
        if (string.equals(w)) {
            return true;
        }
        if (string.equals(x)) {
            return !this.H.o();
        }
        if (string.equals(p)) {
            ani_2 ani_24 = new ani_2();
            ffu_0 ffu_04 = this.H;
            try {
                ani_24.a(bac.a(4), 16, 16, null).a((CharSequence)" ");
            }
            catch (gm_0 gm_02) {
                J.warn((Object)gm_02.getMessage());
                ani_24.a((CharSequence)bae.h().a("HPShort", new Object[0])).a((CharSequence)" : ");
            }
            ani_24.d(this.k()).a((CharSequence)"/").d(ffu_04.a().d());
            ani_24.m();
            wx_0 wx_04 = this.H.a().f();
            wx_0 wx_05 = this.H.a().e();
            int n = wx_05.d() * 24 + wx_05.c();
            int n3 = wx_04.d() * 24 + wx_04.c();
            ani_24.a((CharSequence)bae.h().a("pet.hpDesc", n, n3));
            return ani_24.r();
        }
        if (string.equals(y)) {
            return this.c();
        }
        if (string.equals(z)) {
            return this.H.a().k();
        }
        if (string.equals(A)) {
            bmr_1 bmr_13 = cyt_0.s();
            if (!this.a(bmr_13)) {
                return false;
            }
            bqi_2 bqi_22 = new bqi_2(bmr_13);
            return bqi_22.g();
        }
        if (string.equals(B)) {
            if (this.H.a().k()) {
                return false;
            }
            fge fge3 = this.c(bmr_12);
            if (fge3 == null) {
                return false;
            }
            return fge3.m().length > 1;
        }
        if (string.equals(C)) {
            if (this.H.a().k()) {
                return null;
            }
            fge fge4 = this.c(bmr_12);
            if (fge4 == null) {
                return null;
            }
            return eyo_1.a(fge4.m());
        }
        if (string.equals(D)) {
            if (this.H.a().k()) {
                return false;
            }
            fge fge5 = this.c(bmr_12);
            if (fge5 == null) {
                return false;
            }
            return fge5.l().length > 0;
        }
        if (string.equals(E)) {
            if (this.H.a().k()) {
                return null;
            }
            fge fge6 = this.c(bmr_12);
            if (fge6 == null) {
                return null;
            }
            return eyo_1.a(fge6.l());
        }
        return this.I.b(string);
    }

    private int a(fge fge2, bmr_1 bmr_12) {
        if (this.H == null) {
            return azf_2.e.a();
        }
        fge fge3 = fge2 != null ? fge2 : this.H.a();
        ft_1 ft_12 = this.H.a().k() ? ft_1.a : ft_1.b;
        fk_2 fk_22 = bol_1.a(bmr_12.R(), bmr_12.a_(), ft_12);
        if (fk_22.d()) {
            if (!fge3.e(fk_22.e())) {
                return fge3.n();
            }
            return fk_22.e();
        }
        return fge3.n();
    }

    private Optional<exk_2> b(bmr_1 bmr_12) {
        if (this.H == null || this.H.a() == null) {
            return Optional.empty();
        }
        ft_1 ft_12 = this.H.a().k() ? ft_1.a : ft_1.b;
        fk_2 fk_22 = bol_1.a(bmr_12.R(), bmr_12.a_(), ft_12);
        if (bol_1.a((ffa_0)this.H, fk_22)) {
            return Optional.ofNullable(eyo_1.g().g(fk_22.g()));
        }
        return Optional.empty();
    }

    @Nullable
    private fge c(bmr_1 bmr_12) {
        fgj fgj2;
        if (this.H == null) {
            return null;
        }
        ft_1 ft_12 = this.H.a().k() ? ft_1.a : ft_1.b;
        fk_2 fk_22 = bol_1.a(bmr_12.R(), bmr_12.a_(), ft_12);
        if (fk_22.c() != 0 && (fgj2 = fgl.a.b((Integer)fk_22.c())) != null) {
            return fgh.a.b(fgj2.d());
        }
        return this.H.a();
    }

    @Nullable
    public fge b() {
        if (this.H == null) {
            return null;
        }
        return this.c(azu_0.j().k());
    }

    public boolean a(bmr_1 bmr_12) {
        return false;
    }

    protected abstract boolean c();

    private String j() {
        wu_0 wu_02 = this.H.k();
        if (wu_02.c()) {
            return null;
        }
        return bae.h().c(wu_02);
    }

    private int k() {
        ffu_0 ffu_02 = this.H;
        return ffu_02.f();
    }

    public String e() {
        String string = this.H.b();
        return string == null || string.length() == 0 ? (String)this.I.b(a) : string;
    }

    public ffu_0 f() {
        return this.H;
    }

    public abstract int g();

    public abstract long h();

    public void i() {
        if (this.G != null) {
            this.G.R();
        }
    }
}

