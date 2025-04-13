/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Ww
 */
public class ww_0
implements wx_0 {
    private int h;
    private int i;
    private int j;
    private int k;
    private long l;

    public ww_0(long l) {
        this.l = l;
        this.i();
    }

    public ww_0(wx_0 wx_02) {
        this.h = wx_02.a();
        this.i = wx_02.b();
        this.j = wx_02.c();
        this.k = wx_02.d();
        this.j();
        this.i();
    }

    public ww_0(int n, int n2, int n3, int n4) {
        this.h = n;
        this.i = n2;
        this.j = n3;
        this.k = n4;
        this.j();
        this.i();
    }

    public void a(wx_0 wx_02) {
        if (wx_02 == null) {
            this.a(g);
            return;
        }
        this.h = wx_02.a();
        this.i = wx_02.b();
        this.j = wx_02.c();
        this.k = wx_02.d();
        this.l = wx_02.g();
    }

    public void a(int n, int n2, int n3, int n4) {
        this.h = n;
        this.i = n2;
        this.j = n3;
        this.k = n4;
        this.j();
        this.i();
    }

    private void i() {
        long l = this.l;
        this.k = (int)(l / 86400L);
        this.j = (int)((l -= (long)(this.k * 3600 * 24)) / 3600L);
        this.i = (int)((l -= (long)(this.j * 3600)) / 60L);
        this.h = (int)(l -= (long)(this.i * 60));
    }

    private void j() {
        this.l = this.h + this.i * 60 + this.j * 3600 + this.k * 3600 * 24;
    }

    @Override
    public int a() {
        return this.h;
    }

    @Override
    public int b() {
        return this.i;
    }

    @Override
    public int c() {
        return this.j;
    }

    @Override
    public int d() {
        return this.k;
    }

    @Override
    public boolean e() {
        return this.l > 0L;
    }

    @Override
    public boolean f() {
        return this.l == 0L;
    }

    public boolean equals(Object object) {
        if (object == this || object instanceof wx_0) {
            wx_0 wx_02 = (wx_0)object;
            return this.g() == wx_02.g();
        }
        return false;
    }

    @Override
    public boolean b(@NotNull wx_0 wx_02) {
        return this.l > wx_02.g();
    }

    @Override
    public boolean c(@NotNull wx_0 wx_02) {
        return this.l < wx_02.g();
    }

    public String toString() {
        return "{Interval: " + this.k + "d " + this.j + ":" + this.i + ";" + this.h + "}";
    }

    @Override
    public long g() {
        return this.l;
    }

    @Override
    public long h() {
        return this.l * 1000L;
    }

    public static ww_0 a(long l) {
        return new ww_0(l);
    }

    public static ww_0 b(long l) {
        return new ww_0(l / 1000L);
    }

    @Override
    public int d(wx_0 wx_02) {
        if (this.f()) {
            return 0;
        }
        if (wx_02.f()) {
            throw new ArithmeticException("/ by zero");
        }
        long l = this.l;
        long l2 = wx_02.g();
        if (l2 == 0L) {
            throw new ArithmeticException("/ by zero");
        }
        return (int)(l / l2);
    }

    public void e(wx_0 wx_02) {
        if (wx_02 == null) {
            return;
        }
        this.l += wx_02.g();
        this.i();
    }

    public void f(wx_0 wx_02) {
        if (wx_02 == null) {
            return;
        }
        this.l -= wx_02.g();
        this.i();
    }

    public void a(int n) {
        this.l *= (long)n;
        this.i();
    }

    public void a(float f2) {
        this.l = (long)((float)this.l * f2);
        this.i();
    }
}

