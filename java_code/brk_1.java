/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from brK
 */
public class brk_1
implements ajh_1,
bhx_1 {
    public static final String a = "quantity";
    public static final String b = "isPossessed";
    public static final String d = "nameAndQuantity";
    public static final String e = "nameAndQuantityWithRarity";
    public static final String f = "rewardContainer";
    public static final String g = "reward";
    public static final String h = "quantityReward";
    public static final String i = "categoryName";
    public static final String j = "isNotItemReward";
    public static final String k = "linkToCharacter";
    public static final String l = "ownerName";
    private final short m;
    private final short n;
    private final bjw_1 o;
    private final bl_0 p;
    private final AY q;

    public brk_1(short s2, bjw_1 bjw_12) {
        this.m = s2;
        this.n = (short)-1;
        this.o = bjw_12;
        this.p = null;
        this.q = null;
    }

    public brk_1(short s2, short s3, bjw_1 bjw_12) {
        this.m = s2;
        this.n = s3;
        this.o = bjw_12;
        this.p = null;
        this.q = null;
    }

    public brk_1(int n, ezr_0 ezr_02, bl_0 bl_02, AY aY) {
        this.m = (short)n;
        this.n = (short)-1;
        this.o = (bjw_1)ezr_02;
        this.p = bl_02;
        this.q = aY;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.m;
        }
        if (string.equals(b)) {
            return this.e();
        }
        if (string.equals(d)) {
            ani_2 ani_22 = new ani_2();
            return ani_22.a(this.m).a((CharSequence)"x ").a((CharSequence)this.o.e()).r();
        }
        if (string.equals(e)) {
            ani_2 ani_23 = new ani_2();
            ani_23.a(this.m).a((CharSequence)"x ").a((CharSequence)this.o.e());
            return new ani_2().i().a(bhc_0.b(this.o.M())).a(ani_23).j().r();
        }
        if (string.equals(f)) {
            return this.p;
        }
        if (string.equals(g)) {
            return this.q;
        }
        if (string.equals(h)) {
            if (this.q == null) {
                return null;
            }
            ani_2 ani_24 = new ani_2();
            ani_24.a((CharSequence)bae.h().a(a, new Object[0])).a((CharSequence)" : ").a(this.q.g());
            return ani_24.r();
        }
        if (string.equals(i)) {
            if (this.p == null) {
                return null;
            }
            ani_2 ani_25 = new ani_2();
            bj_0 bj_02 = this.p.e().c();
            bof_0 bof_02 = bof_0.a(bj_02.getNumber());
            ani_25.a((CharSequence)bae.h().a("rewards.category.name." + bof_02.a(), new Object[0]));
            return new ani_2().i().a(bof_02.b()).a(ani_25).j().r();
        }
        if (string.equals(j)) {
            if (this.q == null) {
                return false;
            }
            return this.q.e() != bq_0.a;
        }
        if (string.equals(k)) {
            if (this.p == null) {
                return false;
            }
            return this.p.k() == azu_0.j().k().a_();
        }
        if (string.equals(l)) {
            if (this.p == null) {
                return null;
            }
            if (this.p.k() != azu_0.j().k().a_()) {
                return null;
            }
            return bae.h().a("rewards.owner", azu_0.j().k().dp());
        }
        return this.o.b(string);
    }

    @Override
    public bjw_1 a() {
        return this.o;
    }

    public short b() {
        return this.m;
    }

    public short c() {
        return this.n;
    }

    public boolean e() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.b(this.o.n(), this.m)) {
            return true;
        }
        ewx_2 ewx_22 = (ewx_2)bmr_12.a(ewl_1.a);
        ewz_2 ewz_22 = ewx_22.a(this.o.n());
        return ewz_22 != null && ewz_22.b() >= this.m;
    }

    public bl_0 f() {
        return this.p;
    }

    public AY g() {
        return this.q;
    }
}

