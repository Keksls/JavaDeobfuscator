/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.EnumMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bUs
 */
public final class bus_2
implements ajh_1 {
    private static final bus_2 a = new bus_2();
    private static final String b = "total";
    private static final String d = "heroes";
    private static final String e = "admins";
    private static final String f = "accountInventories";
    private static final String g = "characterInventories";
    private static final String h = "gamesAccountData";
    private static final String i = "subscriptions";
    private static final String j = "worldname";
    private int k;
    private int l;
    private int m;
    private EnumMap<enu_0, Integer[]> n;
    private int o;
    private int p;
    private int q;

    public static bus_2 a() {
        return a;
    }

    public void a(int n) {
        this.k = n;
        fis_1.a().a("statistics", b);
    }

    public void b(int n) {
        this.l = n;
        fis_1.a().a("statistics", d);
    }

    public void c(int n) {
        this.m = n;
        fis_1.a().a("statistics", e);
    }

    public void a(EnumMap<enu_0, Integer[]> enumMap) {
        this.n = new EnumMap<enu_0, Integer[]>(enumMap);
        fis_1.a().a("statistics", i);
    }

    public void d(int n) {
        this.o = n;
        fis_1.a().a("statistics", f);
    }

    public void e(int n) {
        this.p = n;
        fis_1.a().a("statistics", g);
    }

    public void f(int n) {
        this.q = n;
        fis_1.a().a("statistics", h);
    }

    public void b() {
        this.k = -1;
        this.m = -1;
        if (this.n != null) {
            this.n.clear();
            this.n = null;
        }
        this.o = -1;
        this.p = -1;
    }

    @Override
    public String[] d() {
        return new String[]{b, d, e, i, f, g, h};
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "worldname": {
                return azr_0.a().n();
            }
            case "total": {
                return this.k;
            }
            case "heroes": {
                return this.l;
            }
            case "admins": {
                return this.m;
            }
            case "subscriptions": {
                return this.c();
            }
            case "accountInventories": {
                return this.o;
            }
            case "characterInventories": {
                return this.p;
            }
            case "gamesAccountData": {
                return this.q;
            }
        }
        return null;
    }

    private String c() {
        if (this.n == null) {
            return "";
        }
        ani_2 ani_22 = new ani_2();
        for (Map.Entry<enu_0, Integer[]> entry : this.n.entrySet()) {
            Integer[] integerArray = entry.getValue();
            ani_22.a((CharSequence)" - ").a((CharSequence)entry.getKey().name()).a((CharSequence)" : ").a(integerArray[0]).a((CharSequence)" (").a(integerArray[1]).a(')').m();
        }
        return ani_22.r();
    }
}

