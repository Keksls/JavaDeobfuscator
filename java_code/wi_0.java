/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from WI
 */
public class wi_0 {
    public static final wi_0 a = new wi_0(0, 0, 0, 0, 0, 0);
    public static final wi_0 b = new wi_0(0, 0, 0, 1, 0, 0);
    public static final wi_0 c = new wi_0(0, 0, 1, 0, 0, 0);
    public static final wi_0 d = new wi_0(0, 0, 7, 0, 0, 0);
    public static final wi_0 e = new wi_0(0, 1, 0, 0, 0, 0);
    public static final wi_0 f = new wi_0(1, 0, 0, 0, 0, 0);
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private long m;

    public wi_0(wi_0 wi_02) {
        this.g = wi_02.g;
        this.h = wi_02.h;
        this.i = wi_02.i;
        this.j = wi_02.j;
        this.k = wi_02.k;
        this.l = wi_02.l;
        this.h();
    }

    public wi_0(wx_0 wx_02) {
        this.g = 0;
        this.h = 0;
        this.i = wx_02.d();
        this.j = wx_02.c();
        this.k = wx_02.b();
        this.l = wx_02.a();
        this.h();
    }

    public wi_0(int n, int n2, int n3, int n4, int n5, int n6) {
        this.g = n;
        this.h = n2;
        this.i = n3;
        this.j = n4;
        this.k = n5;
        this.l = n6;
        this.h();
    }

    private void h() {
        this.m = (long)(this.l | this.k << 8 | this.j << 16 | this.i << 24) | (long)this.h << 32 | (long)this.g << 40;
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.i;
    }

    public int d() {
        return this.j;
    }

    public int e() {
        return this.k;
    }

    public int f() {
        return this.l;
    }

    public long g() {
        return this.m;
    }

    public static wi_0 a(long l) {
        long l2 = l;
        int n = (int)(l2 & 0xFFL);
        int n2 = (int)((l2 >>= 8) & 0xFFL);
        int n3 = (int)((l2 >>= 8) & 0xFFL);
        int n4 = (int)((l2 >>= 8) & 0xFFL);
        int n5 = (int)((l2 >>= 8) & 0xFFL);
        int n6 = (int)((l2 >>= 8) & 0xFFFFL);
        return new wi_0(n6, n5, n4, n3, n2, n);
    }

    public String toString() {
        return (String)(this.g != 0 ? this.g + " ans " : " ") + (String)(this.h != 0 ? this.h + " mois " : "") + (String)(this.i != 0 ? this.i + " jours " : "") + (String)(this.j != 0 ? this.j + " heures " : "") + (String)(this.k != 0 ? this.k + " minutes " : "") + (String)(this.l != 0 ? this.l + " secondes " : "");
    }
}

