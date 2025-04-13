/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bLS
 */
public class bls_1
implements ajh_1 {
    public static final String a = "iconStyle";
    public static final String b = "title";
    public static final String d = "text";
    public static final String e = "index";
    public static final String f = "type";
    public final String[] g = new String[]{"iconStyle", "title", "text", "index", "type"};
    private final blr_1 h;
    private final String i;
    private final String j;
    private final int k;
    private int l;
    private final ajf_1 m;

    public bls_1(blr_1 blr_12, String string, String string2, int n, ajf_1 ajf_12) {
        this.h = blr_12;
        this.i = string;
        this.j = string2;
        this.k = n;
        this.m = ajf_12;
    }

    @Override
    public String[] d() {
        return this.g;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            String string2 = this.h.b();
            return string2 == null ? "none" : string2;
        }
        if (string.equals(b)) {
            return this.i;
        }
        if (string.equals(e)) {
            return this.l;
        }
        if (string.equals(d)) {
            return this.j;
        }
        if (string.equals(f)) {
            return this.h.d();
        }
        if (this.m != null) {
            return this.m.b(string);
        }
        return null;
    }

    public blr_1 a() {
        return this.h;
    }

    public int b() {
        return this.l;
    }

    public void a(int n) {
        this.l = n;
    }

    public int c() {
        return this.k;
    }

    public String toString() {
        return this.i + " index=" + this.l;
    }

    public boolean equals(Object object) {
        return super.equals(object);
    }
}

