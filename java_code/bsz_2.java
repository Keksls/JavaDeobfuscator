/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bsz
 */
public class bsz_2
implements ajh_1,
fwo {
    public static final String a = "recipe";
    public static final String b = "recipeName";
    public static final String d = "recipeLevel";
    public static final String e = "resultItemIconUrl";
    public static final String f = "resultItemRarityIconUrl";
    public static final String g = "craftName";
    public static final String h = "fee";
    public static final String i = "stepFee";
    public static final String[] j = new String[]{"recipe", "recipeName", "recipeLevel", "resultItemIconUrl", "resultItemRarityIconUrl", "craftName", "fee", "stepFee"};
    @NotNull
    private final eco_0 k;
    @Nullable
    private Integer l;
    private int m;

    public bsz_2(@NotNull eco_0 eco_02, @Nullable Integer n, int n2) {
        this.k = eco_02;
        this.l = n;
        this.m = n2;
    }

    @Override
    public String[] d() {
        return j;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "recipe": {
                return this.k;
            }
            case "recipeName": {
                return this.c();
            }
            case "recipeLevel": {
                return this.e();
            }
            case "resultItemIconUrl": {
                return azs_0.a().a("itemsIconsPath", "defaultIconPath", this.a().C());
            }
            case "resultItemRarityIconUrl": {
                return this.b().h();
            }
            case "craftName": {
                return this.f();
            }
            case "fee": {
                return this.l;
            }
            case "stepFee": {
                return this.m;
            }
        }
        return null;
    }

    @NotNull
    public ezr_0<?> a() {
        int n = this.k.k().a();
        return eyo_1.g().d(n);
    }

    @NotNull
    public exw_1 b() {
        return this.a().M();
    }

    @NotNull
    public String c() {
        return bae.h().a(15, (long)this.a().n(), new Object[0]);
    }

    public short e() {
        return this.g().f();
    }

    @NotNull
    public String f() {
        return bae.h().a(43, (long)this.k.p(), new Object[0]);
    }

    public boolean a(@Nullable Integer n, int n2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (!Objects.equals(n, this.l)) {
            this.l = n;
            arrayList.add(h);
        }
        if (!Objects.equals(n2, this.m)) {
            this.m = n2;
            arrayList.add(i);
        }
        if (!arrayList.isEmpty()) {
            fis_1.a().a((ajf_1)this, arrayList);
            return true;
        }
        return false;
    }

    @Override
    public String getFilterableStringValue() {
        return this.c() + this.f() + this.e();
    }

    @NotNull
    public eco_0 g() {
        return this.k;
    }

    @Nullable
    public Integer h() {
        return this.l;
    }

    public int i() {
        return this.m;
    }
}

