/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bLT
 */
public class blt_0 {
    private final String a;
    private int b = 10000;
    private int c = 200;
    private int d = 11000;
    private int e = 7;
    private boolean f = false;
    private Runnable g;
    private boolean h = false;
    private Runnable i;
    private String j = "desc.accept";
    private String k = "desc.refuse";
    private Runnable l;

    private blt_0(String string) {
        this.a = string;
    }

    public static blt_0 a(String string) {
        return new blt_0(string);
    }

    public static blt_0 b(String string) {
        return new blt_0(string).a(5000).c(5500);
    }

    public blv_0 a() {
        return new blv_0(this);
    }

    public blv_0 b() {
        blv_0 blv_02 = this.a();
        dbo_0.a.b(blv_02);
        return blv_02;
    }

    public String c() {
        return this.a;
    }

    public blt_0 a(int n) {
        this.b = n;
        return this;
    }

    public int d() {
        return this.b;
    }

    public blt_0 b(int n) {
        this.c = n;
        return this;
    }

    public int e() {
        return this.c;
    }

    public blt_0 c(int n) {
        this.d = n;
        return this;
    }

    public int f() {
        return this.d;
    }

    public blt_0 d(int n) {
        this.e = n;
        return this;
    }

    public int g() {
        return this.e;
    }

    public blt_0 a(boolean bl) {
        this.f = bl;
        return this;
    }

    public blt_0 a(Runnable runnable) {
        this.g = runnable;
        return this;
    }

    public Runnable h() {
        return this.g;
    }

    public blt_0 b(boolean bl) {
        this.h = bl;
        return this;
    }

    public blt_0 b(Runnable runnable) {
        this.i = runnable;
        return this;
    }

    public Runnable i() {
        return this.i;
    }

    public blt_0 c(String string) {
        this.j = string;
        return this;
    }

    public String j() {
        if (!this.f) {
            return null;
        }
        return this.j;
    }

    public blt_0 d(String string) {
        this.k = string;
        return this;
    }

    public String k() {
        if (!this.h) {
            return null;
        }
        return this.k;
    }

    public blt_0 c(Runnable runnable) {
        this.l = runnable;
        return this;
    }

    public Runnable l() {
        return this.l;
    }
}

