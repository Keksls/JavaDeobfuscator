/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bsl
 */
public class bsl_1
implements ajh_1 {
    public static final String a = "levelText";
    public static final String b = "equipmentCraftFee";
    public static final String d = "componentCraftFee";
    public static final String e = "feeHasFallThrough";
    public static final String f = "userDefined";
    private final ebx_0 h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    public static final String[] g = new String[]{"levelText", "equipmentCraftFee", "componentCraftFee", "feeHasFallThrough", "userDefined"};

    @Override
    public String[] d() {
        return g;
    }

    public bsl_1(ebx_0 ebx_02, ebz_0 ebz_02, boolean bl, boolean bl2) {
        this.h = ebx_02;
        this.i = ebz_02 != null ? ebz_02.c() : 0;
        this.j = ebz_02 != null ? ebz_02.d() : 0;
        this.k = bl;
        this.l = bl2;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "levelText": {
                return bae.h().a("craftFee.recipeLevel.level", this.h.a(), this.h.c());
            }
            case "equipmentCraftFee": {
                return this.i;
            }
            case "componentCraftFee": {
                return this.j;
            }
            case "feeHasFallThrough": {
                return this.k;
            }
            case "userDefined": {
                return this.l;
            }
        }
        return null;
    }

    public ebx_0 a() {
        return this.h;
    }

    public boolean a(@Nullable ebz_0 ebz_02, boolean bl, boolean bl2) {
        int n;
        int n2;
        ArrayList<String> arrayList = new ArrayList<String>();
        int n3 = n2 = ebz_02 != null ? ebz_02.c() : 0;
        if (n2 != this.i) {
            this.i = n2;
            arrayList.add(b);
        }
        int n4 = n = ebz_02 != null ? ebz_02.d() : 0;
        if (n != this.j) {
            this.j = n;
            arrayList.add(d);
        }
        if (bl2 != this.l) {
            this.l = bl2;
            arrayList.add(f);
        }
        if (bl != this.k) {
            this.k = bl;
            arrayList.add(e);
        }
        if (!arrayList.isEmpty()) {
            fis_1.a().a((ajf_1)this, arrayList);
            return true;
        }
        return false;
    }
}

