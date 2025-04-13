/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.HashMultimap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkS
 */
public class bks_1
implements ajh_1,
Comparable {
    protected static final Logger a = Logger.getLogger(bks_1.class);
    public static final String b = "id";
    public static final String d = "name";
    public static final String e = "longName";
    public static final String f = "godName";
    public static final String g = "description";
    public static final String h = "backgroundDescription";
    public static final String i = "buttonStyle";
    public static final String j = "iconUrl";
    public static final String k = "smallIconUrl";
    public static final String l = "bigIconUrl";
    public static final String m = "smallBackgroundUrl";
    public static final String n = "bigBackgroundUrl";
    public static final String o = "supportSpellsText";
    public static final String p = "femaleIllustration";
    public static final String q = "maleIllustration";
    public static final String r = "malePortraitIllustration";
    public static final String s = "femalePortraitIllustration";
    public static final String t = "maleFemalePortraitIllustration";
    public static final String u = "difficulty_url";
    public static final String v = "role1";
    public static final String w = "role2";
    public static final String x = "role3";
    public static final String[] y = new String[]{"id", "name", "longName", "godName", "description", "backgroundDescription", "buttonStyle", "iconUrl", "smallIconUrl", "bigIconUrl", "smallBackgroundUrl", "bigBackgroundUrl", "supportSpellsText", "femaleIllustration", "maleIllustration", "malePortraitIllustration", "femalePortraitIllustration", "maleFemalePortraitIllustration", "difficulty_url", "role1", "role2", "role3"};
    private epn_2 z = epn_2.b;
    private final bkz_1 A;
    private final bkz_1 B;
    private final bkz_1 C;
    private final HashMultimap<efa_0, bph_0> D;

    public bks_1(epn_2 epn_22) {
        this.z = epn_22;
        this.D = HashMultimap.create();
        this.A = epn_22 == null ? null : new bkz_1(epn_22.a(), this.z);
        this.B = epn_22 == null ? null : new bkz_1(epn_22.b(), this.z);
        this.C = epn_22 == null ? null : new bkz_1(epn_22.c(), this.z);
    }

    public short a() {
        return this.z.s();
    }

    public String b() {
        return bae.h().a("breed." + this.a(), new Object[0]);
    }

    public String c() {
        return bae.h().a("breedLongDesc." + this.a(), new Object[0]);
    }

    public String e() {
        String string = bae.h().c("breedLongName." + this.a());
        return Cr.a(string, new Object[]{new ani_2().a((CharSequence)this.b()).toString()});
    }

    public epn_2 f() {
        return this.z;
    }

    public void a(bph_0 bph_02) {
        if (this.D.containsValue((Object)bph_02)) {
            a.warn((Object)"On ajoute plusieurs fois le m\u00eame spell, cet appel est sans doute useless : ", (Throwable)new Exception());
        }
        this.D.put((Object)efa_0.a(bph_02.q()), (Object)bph_02);
    }

    public List<bph_0> a(efa_0 efa_02) {
        bph_0[] bph_0Array = this.b(efa_02);
        if (bph_0Array == null) {
            return null;
        }
        ArrayList<bph_0> arrayList = new ArrayList<bph_0>(bph_0Array.length);
        for (bph_0 bph_02 : bph_0Array) {
            arrayList.add(bph_02);
        }
        return arrayList;
    }

    private bph_0[] b(efa_0 efa_02) {
        Set set = this.D.get((Object)efa_02);
        if (set == null) {
            return null;
        }
        bph_0[] bph_0Array = new bph_0[set.size()];
        set.toArray(bph_0Array);
        Arrays.sort(bph_0Array, new bps_0());
        return bph_0Array;
    }

    public boolean a(int n) {
        Collection<bph_0> collection = this.g();
        for (bph_0 bph_02 : collection) {
            if (bph_02.i() != n) continue;
            return true;
        }
        return false;
    }

    public Collection<bph_0> g() {
        return this.D.values();
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "id": {
                return this.a();
            }
            case "name": {
                return this.b();
            }
            case "longName": {
                return this.e();
            }
            case "description": {
                return this.c();
            }
            case "iconUrl": {
                try {
                    return String.format(azs_0.a().a("breedIconPath"), this.a());
                }
                catch (gm_0 gm_02) {
                    a.error((Object)gm_02.getMessage(), (Throwable)gm_02);
                    break;
                }
            }
            case "smallIconUrl": {
                try {
                    return String.format(azs_0.a().a("breedSmallIconPath"), this.a());
                }
                catch (gm_0 gm_03) {
                    a.error((Object)gm_03.getMessage(), (Throwable)gm_03);
                    break;
                }
            }
            case "bigIconUrl": {
                return this.h();
            }
            case "smallBackgroundUrl": {
                try {
                    return String.format(azs_0.a().a("breedSmallBackgroundsPath"), this.a());
                }
                catch (gm_0 gm_04) {
                    a.error((Object)gm_04.getMessage(), (Throwable)gm_04);
                    break;
                }
            }
            case "bigBackgroundUrl": {
                try {
                    return String.format(azs_0.a().a("breedBigBackgroundsPath"), this.a());
                }
                catch (gm_0 gm_05) {
                    a.error((Object)gm_05.getMessage(), (Throwable)gm_05);
                    break;
                }
            }
            case "buttonStyle": {
                return "characterCreationBreed" + this.a();
            }
            case "supportSpellsText": {
                return bae.h().a("breedSupportSpells", this.b());
            }
            case "maleIllustration": {
                try {
                    return String.format(azs_0.a().a("breedIllustrationPath"), this.f().s(), (byte)0);
                }
                catch (gm_0 gm_06) {
                    a.error((Object)"PropertyException during getFieldValue for MALE_ILLUSTRATION_FIELD", (Throwable)gm_06);
                    break;
                }
            }
            case "femaleIllustration": {
                try {
                    return String.format(azs_0.a().a("breedIllustrationPath"), this.f().s(), (byte)1);
                }
                catch (gm_0 gm_07) {
                    a.error((Object)"PropertyException during getFieldValue for FEMALE_ILLUSTRATION_FIELD", (Throwable)gm_07);
                    break;
                }
            }
            case "malePortraitIllustration": {
                try {
                    return String.format(azs_0.a().a("breedPortraitIllustrationPath"), String.valueOf(this.f().s()) + String.valueOf(0));
                }
                catch (gm_0 gm_08) {
                    a.error((Object)"PropertyException during getFieldValue for MALE_PORTRAIT_ILLUSTRATION_FIELD", (Throwable)gm_08);
                    break;
                }
            }
            case "femalePortraitIllustration": {
                try {
                    return String.format(azs_0.a().a("breedPortraitIllustrationPath"), String.valueOf(this.f().s()) + String.valueOf(1));
                }
                catch (gm_0 gm_09) {
                    a.error((Object)"PropertyException during getFieldValue for FEMALE_PORTRAIT_ILLUSTRATION_FIELD", (Throwable)gm_09);
                    break;
                }
            }
            case "maleFemalePortraitIllustration": {
                try {
                    String[] stringArray = new String[2];
                    byte by = cwk_0.c().gX();
                    stringArray[by] = String.format(azs_0.a().a("breedPortraitIllustrationPath"), String.valueOf(this.f().s()) + String.valueOf(0));
                    stringArray[(by + 1) % 2] = String.format(azs_0.a().a("breedPortraitIllustrationPath"), String.valueOf(this.f().s()) + String.valueOf(1));
                    return stringArray;
                }
                catch (gm_0 gm_010) {
                    a.error((Object)"PropertyException during getFieldValue for MALE_FEMALE_PORTRAIT_ILLUSTRATION_FIELD", (Throwable)gm_010);
                    break;
                }
            }
            case "difficulty_url": {
                return String.format(azs_0.a().u(String.valueOf(this.z.e())), new Object[0]);
            }
            case "role1": {
                return this.A;
            }
            case "role2": {
                return this.B;
            }
            case "role3": {
                return this.C;
            }
        }
        return null;
    }

    @Nullable
    public String h() {
        try {
            return String.format(azs_0.a().a("breedBigIconPath"), this.a());
        }
        catch (gm_0 gm_02) {
            a.error((Object)gm_02.getMessage(), (Throwable)gm_02);
            return null;
        }
    }

    @Override
    public String[] d() {
        return y;
    }

    public int compareTo(@NotNull Object object) {
        bks_1 bks_12 = (bks_1)object;
        return this.a() - bks_12.a();
    }
}

