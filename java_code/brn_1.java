/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from brN
 */
public class brn_1
implements ajh_1 {
    public static final String a = "zones";
    public static final String b = "isExpanded";
    public static final String d = "isMouseOver";
    public static final String e = "name";
    private final String f;
    private final ArrayList<brm_1> g = new ArrayList();
    private boolean h = true;
    private boolean i;

    public brn_1(String string) {
        this.f = string;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.g;
        }
        if (string.equals(b)) {
            return this.h;
        }
        if (string.equals(d)) {
            return this.i;
        }
        if (string.equals(e)) {
            return this.f;
        }
        return null;
    }

    public boolean a() {
        return this.h;
    }

    public boolean b() {
        return this.i;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    public void b(boolean bl) {
        this.i = bl;
        fis_1.a().a((ajf_1)this, d);
    }

    public ArrayList<brm_1> c() {
        return this.g;
    }

    public void a(brm_1 brm_12) {
        this.g.add(brm_12);
    }

    public String e() {
        return this.f;
    }

    public void f() {
        this.g.sort(new brO(this));
    }
}

