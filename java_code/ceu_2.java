/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ceu
 */
public final class ceu_2
implements ajh_1 {
    private static final ceu_2 h = new ceu_2();
    private static final int i = 9599;
    public static final String a = "shardsItemIcon";
    public static final String b = "powderItemIcon";
    public static final String d = "adminItemIcon";
    public static final String e = "keysItemIcon";
    public static final String f = "testMonsterName";
    public static final String g = "regularMonsterName";
    private static final String[] j = new String[]{"shardsItemIcon", "powderItemIcon", "adminItemIcon", "keysItemIcon", "testMonsterName", "regularMonsterName"};

    public static ceu_2 a() {
        return h;
    }

    private ceu_2() {
    }

    @Override
    public String[] d() {
        return j;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "shardsItemIcon": {
                return ceu_2.a(cev_2.g);
            }
            case "powderItemIcon": {
                return ceu_2.a(cev_2.h);
            }
            case "keysItemIcon": {
                return ceu_2.a(9599);
            }
            case "adminItemIcon": {
                return ceu_2.a(cev_2.k);
            }
            case "testMonsterName": {
                return ceu_2.b(cev_2.r);
            }
            case "regularMonsterName": {
                return ceu_2.b(cev_2.q);
            }
        }
        return null;
    }

    private static String a(cev_2 cev_22) {
        int n;
        aXj aXj2 = cev_22.b()[0];
        if (aXj2 instanceof awd_0) {
            n = ((awd_0)aXj2).d();
        } else if (aXj2 instanceof aYr) {
            n = ((aYr)aXj2).c();
        } else {
            return "";
        }
        return ceu_2.a(n);
    }

    private static String a(int n) {
        Object r2 = eyo_1.g().d(n);
        return azs_0.a().d(((ezr_0)r2).C());
    }

    private static String b(cev_2 cev_22) {
        aXj aXj2 = cev_22.b()[0];
        if (!(aXj2 instanceof aWc)) {
            return "";
        }
        int n = ((aWc)aXj2).c();
        return bae.h().a(7, (long)n, new Object[0]);
    }

    public void a(boolean bl) {
        if (bl) {
            fis_1.a().a("adminQuickMenu", h);
            fpm_0.b().a("wakfu.adminQuickMenu", cfz_0.class);
        } else {
            fis_1.a().a("adminQuickMenu");
            fpm_0.b().e("wakfu.adminQuickMenu");
        }
    }
}

