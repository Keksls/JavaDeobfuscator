/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class dhg {
    private final YP a;
    private final int b;
    private final List<dhh> c = new ArrayList<dhh>();
    private String d = null;
    private azj_2 e = azf_2.e;
    private String f;
    private final int g;
    private final List<dhh> h = new ArrayList<dhh>();
    private final List<dhh> i = new ArrayList<dhh>();
    private String j;
    private String k;
    private boolean l;
    private boolean m;
    private String n;
    private String o;

    public dhg(YP yP, int n) {
        this(yP, n, -1);
    }

    public dhg(YP yP, int n, int n2) {
        this.a = yP;
        this.b = n;
        this.g = n2;
    }

    public YP a() {
        return this.a;
    }

    public List<dhh> b() {
        return this.c;
    }

    public List<dhh> c() {
        return this.h;
    }

    public List<dhh> d() {
        return this.i;
    }

    public void a(boolean bl) {
        this.l = bl;
    }

    public void b(boolean bl) {
        this.m = bl;
    }

    public boolean e() {
        return this.l;
    }

    public boolean f() {
        return this.m;
    }

    public int g() {
        return this.b;
    }

    public String h() {
        return this.d;
    }

    public void a(String string) {
        this.d = string;
    }

    public azj_2 i() {
        return this.e;
    }

    public void a(azj_2 azj_22) {
        this.e = azj_22;
    }

    public String j() {
        return this.f;
    }

    public void b(String string) {
        this.f = string;
    }

    public void c(String string) {
        this.a(string, null, null, null);
    }

    public void a(String string, String string2) {
        this.a(string, string2, null, null);
    }

    public void a(String string, String string2, String string3) {
        this.a(string, string2, string3, null);
    }

    public void a(String string, String string2, List<String> list) {
        this.a(string, null, string2, list);
    }

    public void a(String string, String string2, String string3, List<String> list) {
        if (string != null && !string.isEmpty()) {
            this.c.add(new dhh(string, string2, null, string3, list, null, false));
        }
    }

    public void a(String string, String string2, String string3, bxj_1 bxj_12, boolean bl) {
        if (string != null && !string.isEmpty()) {
            this.h.add(new dhh(string, null, string2, string3, null, bxj_12, bl));
        }
    }

    public void b(String string, String string2, String string3, bxj_1 bxj_12, boolean bl) {
        if (string != null && !string.isEmpty()) {
            this.i.add(new dhh(string, null, string2, string3, null, bxj_12, bl));
        }
    }

    public boolean k() {
        return this.g >= 0;
    }

    public int l() {
        return this.g;
    }

    public void d(String string) {
        this.j = string;
    }

    public void e(String string) {
        this.k = string;
    }

    public String m() {
        return this.j;
    }

    public String n() {
        return this.k;
    }

    public void f(String string) {
        this.n = string;
    }

    public void g(String string) {
        this.o = string;
    }

    public String o() {
        return this.n;
    }

    public String p() {
        return this.o;
    }
}

