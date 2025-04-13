/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anY
 */
public class any_1 {
    private String a;
    private int b;
    private String c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private final boolean h;
    private anz_1 i;
    private boolean j = true;
    private String k;
    private String l;
    private int m;
    private String n;

    public any_1(String string, int n, String string2, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, String string3) {
        this.a = string;
        this.b = n;
        this.c = string2;
        this.d = bl;
        this.e = bl2;
        this.f = bl3;
        this.h = bl4;
        this.g = bl5;
        this.n = string3;
        this.p();
    }

    private void p() {
        this.m = anx_1.a(this.f, this.e, this.d);
    }

    public String a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    public void b(boolean bl) {
        this.e = bl;
    }

    public void c(boolean bl) {
        this.f = bl;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    public void d(boolean bl) {
        this.g = bl;
    }

    public String g() {
        return this.a;
    }

    public void a(String string) {
        this.a = string;
    }

    public boolean a(int n) {
        return this.b == n;
    }

    public boolean h() {
        return this.j;
    }

    public void e(boolean bl) {
        this.j = bl;
    }

    public void a(anz_1 anz_12) {
        this.i = anz_12;
    }

    public anz_1 i() {
        return this.i;
    }

    public String j() {
        return this.k;
    }

    public void b(String string) {
        this.k = string;
    }

    public String k() {
        return this.l;
    }

    public void c(String string) {
        this.l = string;
    }

    public void b(int n) {
        this.b = n;
    }

    public int l() {
        return this.m;
    }

    public void c(int n) {
        this.m = n;
        this.f = (this.m & 0x40) == 64;
        this.e = (this.m & 0x200) == 512;
        this.d = (this.m & 0x80) == 128;
    }

    public void d(String string) {
        this.c = string;
    }

    public String m() {
        return this.n;
    }

    public void e(String string) {
        this.n = string;
    }

    public boolean n() {
        return this.h;
    }

    public any_1 o() {
        any_1 any_12 = new any_1(this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.g, this.n);
        any_12.k = this.k;
        any_12.l = this.l;
        return any_12;
    }
}

