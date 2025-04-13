/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bVn
implements ajh_1 {
    private static final Logger a = Logger.getLogger(bVn.class);
    public static final String l = "nationId";
    public static final String m = "name";
    public static final String n = "flagIconUrl";
    public static final String o = "description";
    public static final String p = "passportStampIconUrl";
    public static final String q = "nationColor";
    public static final String r = "isLocalNation";
    public static final String[] s = new String[]{"nationId", "isLocalNation", "name", "flagIconUrl", "description", "passportStampIconUrl", "nationColor"};
    protected final int t;

    public bVn(int n) {
        this.t = n;
    }

    @Override
    public String[] d() {
        return s;
    }

    @Override
    public Object b(String string) {
        if (string.equals(m)) {
            return this.f();
        }
        if (string.equals(l)) {
            return this.t;
        }
        if (string.equals(r)) {
            return this.c();
        }
        if (string.equals(n)) {
            return azs_0.a().m(this.t != 0 ? this.t : -1);
        }
        if (string.equals(o)) {
            return this.e();
        }
        if (string.equals(p)) {
            if (this.t != 0) {
                return azs_0.a().a("passportStampIconsPath", "defaultIconPath", this.t);
            }
            return null;
        }
        if (string.equals(q)) {
            return this.a() == null ? azf_2.e : this.a();
        }
        return null;
    }

    public boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        return bmr_12 != null && this.t == bmr_12.fE().n();
    }

    private azj_2 a() {
        String string = bUW.a().a(this.t);
        return string == null || string.length() == 0 ? null : azf_2.a(string);
    }

    public String e() {
        return bae.h().a(56, (long)this.t, new Object[0]);
    }

    public String f() {
        return bae.h().a(39, (long)this.t, new Object[0]);
    }

    public int g() {
        return this.t;
    }
}

