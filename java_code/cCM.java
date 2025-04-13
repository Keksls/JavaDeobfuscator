/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class cCM
implements ajf_1 {
    public static final String a = "title";
    public static final String b = "description";
    public static final String d = "descNormal";
    public static final String e = "descRepro";
    public static final String f = "types";
    public static final String g = "selectedType";
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private aiy_0 n;
    private long o;
    private int p;
    private int q;
    private String r;
    private String s;
    private long t;
    private String u;
    private String v;
    private String w = "Graphisme";
    private String x;
    public static final String[] h = new String[]{"title", "description", "descNormal", "descRepro", "types", "selectedType"};

    public void a(String string) {
        this.i = string;
    }

    public void c(String string) {
        this.j = string;
    }

    public void e(String string) {
        this.k = string;
    }

    public void f(String string) {
        this.l = string;
    }

    public void g(String string) {
        this.m = string;
    }

    public void a(aiy_0 aiy_02) {
        this.n = aiy_02;
    }

    public void a(long l) {
        this.o = l;
    }

    public void a(int n) {
        this.p = n;
    }

    public void b(int n) {
        this.q = n;
    }

    public void h(String string) {
        this.r = string;
    }

    public void i(String string) {
        this.s = string;
    }

    public void b(long l) {
        this.t = l;
    }

    public void j(String string) {
        this.u = string;
    }

    public void k(String string) {
        this.v = string;
    }

    public void l(String string) {
        this.w = string;
    }

    public void m(String string) {
        this.x = string;
    }

    public String a() {
        return this.i;
    }

    public String b() {
        return this.j;
    }

    public String c() {
        return this.k;
    }

    public String e() {
        return this.l;
    }

    public String f() {
        return this.m;
    }

    public aiy_0 g() {
        return this.n;
    }

    public long h() {
        return this.o;
    }

    public int i() {
        return this.p;
    }

    public int j() {
        return this.q;
    }

    public String k() {
        return this.r;
    }

    public String l() {
        return this.s;
    }

    public long m() {
        return this.t;
    }

    public String n() {
        return this.u;
    }

    public String o() {
        return this.v;
    }

    public String p() {
        return this.w;
    }

    public String q() {
        return this.x;
    }

    @Override
    public String[] d() {
        return h;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.a();
        }
        if (string.equals(b)) {
            return this.b();
        }
        if (string.equals(d)) {
            return this.c();
        }
        if (string.equals(e)) {
            return this.e();
        }
        if (string.equals(f)) {
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("Graphisme");
            arrayList.add("Son");
            arrayList.add("Cin\u00e9matique");
            arrayList.add("Crash / Freeze");
            arrayList.add("Interface");
            arrayList.add("Animation");
            arrayList.add("Collision");
            arrayList.add("Logique");
            return arrayList.toArray();
        }
        if (string.equals(g)) {
            return this.p();
        }
        return null;
    }

    @Override
    public void a(String string, Object object) {
        if (string.equals(a)) {
            this.a(object.toString());
        } else if (string.equals(b)) {
            this.c(object.toString());
        } else if (string.equals(d)) {
            this.e(object.toString());
        } else if (string.equals(e)) {
            this.f(object.toString());
        } else if (string.equals(g)) {
            this.l(object.toString());
        }
    }

    @Override
    public void b(String string, Object object) {
    }

    @Override
    public void c(String string, Object object) {
    }

    @Override
    public boolean a_(String string) {
        if (string.equals(a)) {
            return true;
        }
        if (string.equals(b)) {
            return true;
        }
        if (string.equals(d)) {
            return true;
        }
        if (string.equals(e)) {
            return true;
        }
        if (string.equals(f)) {
            return true;
        }
        return string.equals(g);
    }
}

