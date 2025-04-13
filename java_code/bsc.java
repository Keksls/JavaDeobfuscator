/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class bsc
implements ajh_1 {
    public static final String a = "currentRecipesPage";
    public static final String b = "currentPageText";
    public static final String d = "onlyIngredientsOk";
    public static final String e = "nameFilter";
    public static final String f = "minLevelFilter";
    public static final String g = "maxLevelFilter";
    public static final String h = "currentCraft";
    public static final int i = 7;
    private final bsd k;
    private List<brw_0> l = new ArrayList<brw_0>();
    private int m;
    boolean n = false;
    String o = "";
    int p = 0;
    int q = 200;
    public static final String[] j = new String[]{"currentRecipesPage", "currentPageText", "onlyIngredientsOk", "nameFilter", "minLevelFilter", "maxLevelFilter", "currentCraft"};

    public bsc(int n) {
        this.c(n);
        this.k = new bsd(this, 7);
    }

    @Override
    public String[] d() {
        return j;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (Strings.isNullOrEmpty((String)string)) {
            return null;
        }
        switch (string) {
            case "currentRecipesPage": {
                return this.k == null ? null : this.k.e();
            }
            case "currentPageText": {
                return this.k == null ? "" : this.k.b();
            }
            case "onlyIngredientsOk": {
                return this.n;
            }
            case "nameFilter": {
                return this.o;
            }
            case "minLevelFilter": {
                return this.p;
            }
            case "maxLevelFilter": {
                return this.q;
            }
            case "currentCraft": {
                return this.e();
            }
        }
        return null;
    }

    private brt_1 e() {
        return azu_0.j().k().dO().a(this.m);
    }

    public void a(int n) {
        this.p = n;
        this.d(0);
    }

    public void b(int n) {
        this.q = n;
        this.d(0);
    }

    public void a() {
        this.n = !this.n;
        this.d(0);
    }

    public void a(String string) {
        this.o = string;
        this.d(0);
    }

    public void c(int n) {
        if (this.m == n) {
            return;
        }
        this.d(0);
        this.m = n;
        this.l.clear();
        this.f();
        fis_1.a().a((ajf_1)this, a, b, h);
    }

    private void f() {
        List<eco_0> list = brs_0.a.a(this.m);
        bmr_1 bmr_12 = azu_0.j().k();
        brg_1 brg_12 = new brg_1(this.m, bmr_12.U_(), bmr_12.eX());
        for (eco_0 eco_02 : list) {
            brw_0 brw_02 = new brw_0(eco_02, brg_12);
            brw_02.a(bmr_12.a(eco_02));
            this.l.add(brw_02);
        }
    }

    public static boolean a(bmr_1 bmr_12, brw_0 brw_02) {
        return bmr_12.a(brw_02.g());
    }

    List<brw_0> g() {
        if (this.l != null) {
            return this.l;
        }
        this.l = new ArrayList<brw_0>();
        this.f();
        return this.l;
    }

    public int b() {
        if (this.k == null) {
            return 1;
        }
        return this.k.a();
    }

    public int c() {
        if (this.k == null) {
            return 1;
        }
        return this.k.c();
    }

    public void d(int n) {
        if (this.k == null) {
            return;
        }
        this.k.a(n);
    }
}

