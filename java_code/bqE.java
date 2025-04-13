/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bqE
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "color";
    public static final String d = "index";
    public static final String e = "selected";
    public static final String f = "isMarket";
    public static final String g = "isReadOnly";
    public static final String h = "hovered";
    public static final String i = "remainingCapacity";
    public static final String j = "textColor";
    public static final String[] k = new String[]{"name", "color", "index", "selected", "isMarket", "isReadOnly", "hovered", "remainingCapacity", "textColor"};
    private final String l;
    private String m;
    private azj_2 n;
    private azj_2 o;
    private short p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;

    public bqE(String string, String string2, azj_2 azj_22, short s2) {
        this(string, string2, azj_22, s2, false);
    }

    public bqE(String string, String string2, azj_2 azj_22, short s2, boolean bl) {
        this.l = string;
        this.m = string2;
        this.a(azj_22);
        this.p = s2;
        this.s = bl;
    }

    @Override
    public String[] d() {
        return k;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.m;
        }
        if (b.equals(string)) {
            return this.n;
        }
        if (d.equals(string)) {
            return this.p;
        }
        if (f.equals(string)) {
            return false;
        }
        if (g.equals(string)) {
            return this.s;
        }
        if (e.equals(string)) {
            return this.q;
        }
        if (h.equals(string)) {
            return this.r;
        }
        if (i.equals(string)) {
            return this.t > 0 ? String.format("%d/%d", this.u, this.t) : null;
        }
        if (j.equals(string)) {
            return this.o;
        }
        return null;
    }

    public void a(boolean bl) {
        this.q = bl;
    }

    public void b(boolean bl) {
        this.r = bl;
    }

    public void a(String string) {
        this.m = string;
    }

    public final void a(azj_2 azj_22) {
        this.n = azj_22;
        this.o = bqg_0.b(azj_22) ? azf_2.e : azf_2.z;
    }

    public void a(short s2) {
        this.p = s2;
    }

    public void a(int n) {
        this.t = n;
    }

    public void b(int n) {
        this.u = n;
    }

    public String a() {
        return this.m;
    }

    public azj_2 b() {
        return this.n;
    }

    public short c() {
        return this.p;
    }

    public boolean e() {
        return this.q;
    }

    public boolean f() {
        return this.s;
    }

    public int g() {
        return this.t;
    }

    public int h() {
        return this.u;
    }

    public boolean i() {
        return this.u >= this.t;
    }

    public String j() {
        return this.l;
    }

    public boolean k() {
        return false;
    }

    public String toString() {
        return "AccountChestListEntryView{m_id='" + this.l + "', m_name='" + this.m + "', m_color=" + this.n + ", m_index=" + this.p + ", m_selected=" + this.q + "}";
    }
}

