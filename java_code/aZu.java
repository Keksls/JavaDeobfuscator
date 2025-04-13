/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class aZu
implements ajh_1 {
    private static final aZu e = new aZu();
    public static final String a = "linkages";
    public static final String b = "selectedLinkage";
    public static final String d = "type";
    final ArrayList<String> f = new ArrayList();
    private String g;
    private String h = "players";

    private aZu() {
    }

    public static aZu a() {
        return e;
    }

    public void b() {
        this.f.clear();
        ArrayList arrayList = new ArrayList();
        biI biI2 = azu_0.j().k().bv();
        biI2.a(new aZv(this, biI2, arrayList));
    }

    public void a(String string) {
        this.h = string;
        fis_1.a().a((ajf_1)this, d);
    }

    public void c(String string) {
        this.a(this.h, string);
    }

    public void a(String string, String string2) {
        biI biI2 = azu_0.j().k().bv();
        try {
            String string3 = cas_1.a(string, string2);
            biI2.a(string3, true);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.b();
        if (this.f.size() > 0) {
            this.e(this.f.get(0));
        }
    }

    public void e(String string) {
        this.g = string;
        fis_1.a().a((ajf_1)this, b);
        azu_0.j().k().bv().e(string);
        this.c();
    }

    public void c() {
        if (this.g == null) {
            return;
        }
        azu_0.j().k().bv().e(this.g);
        if (!azu_0.j().c(ddn.a())) {
            return;
        }
        dfc dfc2 = new dfc(16612);
        dfc2.a(this.g);
        add_2.b().a(dfc2);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.f;
        }
        if (string.equals(b)) {
            return this.g;
        }
        if (string.equals(d)) {
            return this.h;
        }
        return null;
    }
}

