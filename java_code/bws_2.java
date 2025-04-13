/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bWs
 */
public class bws_2
implements ajh_1 {
    private static final Logger f = Logger.getLogger(bws_2.class);
    public static final String a = "iconUrl";
    public static final String b = "enabled";
    public static final String d = "items";
    public static final String e = "idString";
    private final blr_2 g;
    private final ArrayList<bnf_0> h = new ArrayList();

    public bws_2(blr_2 blr_22) {
        this.g = blr_22;
    }

    public void a() {
        this.h.clear();
    }

    public void a(bnf_0 bnf_02) {
        this.h.add(bnf_02);
    }

    @Override
    public String[] d() {
        return null;
    }

    public boolean b() {
        return this.h.size() != 0;
    }

    public void c() {
        int n = this.h.size();
        for (int k = 0; k < n; ++k) {
            this.h.get(k).f();
        }
    }

    public blr_2 e() {
        return this.g;
    }

    void f() {
        int n = this.h.size();
        for (int k = 0; k < n; ++k) {
            bnf_0 bnf_02 = this.h.get(k);
            bnf_02.e();
        }
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            try {
                return String.format(azs_0.a().a("challengeCategoryIconsPath"), this.g.a());
            }
            catch (gm_0 gm_02) {
                f.error((Object)"PropertyException during getFieldValue for ICON_URL", (Throwable)gm_02);
                return null;
            }
        }
        if (string.equals(b)) {
            return this.h.size() > 0;
        }
        if (string.equals(d)) {
            return this.h;
        }
        if (string.equals(e)) {
            return String.valueOf(this.g.a());
        }
        return null;
    }
}

