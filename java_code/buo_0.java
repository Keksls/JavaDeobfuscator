/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bUo
 */
public class buo_0 {
    private static final byte a = 2;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private String g;
    private boolean h;

    buo_0() {
    }

    public buo_0(int n, int n2, int n3, String string, int n4) {
        this(n, n2, n3, 0, string, n4, false);
    }

    public buo_0(int n, int n2, int n3, int n4, String string, int n5, boolean bl) {
        this.b = n;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = n5;
        this.g = string;
        this.h = bl;
    }

    public buo_0(int n, int n2, int n3, int n4, String string, int n5) {
        this(n, n2, n3, n4, string, n5, false);
    }

    public int a() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
    }

    public int b() {
        return this.c;
    }

    public void b(int n) {
        this.c = n;
    }

    public int c() {
        return this.d;
    }

    public void c(int n) {
        this.d = n;
    }

    public int d() {
        return this.e;
    }

    public void d(int n) {
        this.e = n;
    }

    public String e() {
        return this.g;
    }

    public void a(String string) {
        this.g = string;
    }

    public void e(int n) {
        this.f = n;
    }

    public int f() {
        return this.f;
    }

    public boolean g() {
        return this.h;
    }

    public void a(arf_1 arf_12, int n) {
        this.c = arf_12.c();
        this.d = arf_12.c();
        this.g = arf_12.e();
        if (n > -1) {
            this.f = arf_12.c();
        }
    }

    public void a(gk_0 gk_02, int n) {
        gk_02.a(this.c);
        gk_02.a(this.d);
        gk_02.a(this.g);
        if (n > -1) {
            gk_02.a(this.f);
        }
    }

    public String toString() {
        return this.g;
    }
}

