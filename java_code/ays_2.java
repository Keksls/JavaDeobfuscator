/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;

/*
 * Renamed from ayS
 */
public abstract class ays_2
extends azk_2 {
    private static final abc_1 a = abc_1.a;
    protected long c;
    protected String d;
    protected boolean e;
    protected boolean f;
    protected axw_2 g;
    protected boolean h;
    protected boolean i;
    protected final boolean j;
    protected boolean k;
    protected int l;
    private static final short b = 500;
    private short v;
    protected ayt_2 m = ayt_2.a;

    protected ays_2(long l, String string, boolean bl) {
        this.a(l, string, bl);
        this.j = false;
    }

    protected ays_2(long l, azk_2 azk_22, boolean bl) {
        super(azk_22);
        this.a(l, null, bl);
        this.j = false;
    }

    protected ays_2(long l, int n, int n2, boolean bl) {
        super(a, new azr_2(n, n2, 32, null, Cn.b));
        this.a(0).u();
        this.a(l, null, false);
        this.j = true;
        this.k = bl;
    }

    public void a(boolean bl) {
        this.i = bl;
    }

    public final long f() {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        return this.c;
    }

    public final String g() {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        return this.d;
    }

    public final boolean a(String string) {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        return this.b(string.concat(this.d));
    }

    public final boolean b(boolean bl) {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        if (bl) {
            return this.b(this.d);
        }
        return this.c(this.d);
    }

    public final boolean h() {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        return this.e;
    }

    public final void c(boolean bl) {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        this.e = bl;
    }

    @Override
    public void a(int n, azr_2 azr_22) {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        super.a(n, azr_22);
        this.f = false;
    }

    public final boolean j() {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        return this.f && !this.s;
    }

    public final void k() {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        for (int k = 0; k < this.t(); ++k) {
            azr_2 azr_22 = this.a(k);
            if (azr_22 == t) continue;
            azr_22.k();
        }
    }

    public final axw_2 l() {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        return this.g;
    }

    public final void a(axw_2 axw_22) {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        this.g = axw_22;
    }

    public final boolean m() {
        return this.j;
    }

    public abstract boolean a(GL var1);

    public abstract void a(GL2 var1);

    public abstract void d(GL var1);

    public abstract void a(aui_2 var1);

    public abstract void b(aui_2 var1);

    public abstract boolean e();

    public abstract boolean b(GL var1);

    public float n() {
        float f2 = (float)(Hw.e(this.b(0).a()) * Hw.e(this.b(0).b()) * 4) / 1024.0f;
        if (this.k) {
            f2 *= 2.0f;
        }
        if (this.e()) {
            f2 /= 4.0f;
        }
        return f2;
    }

    public int o() {
        int n = 0;
        if (this.l == 0) {
            n = 32;
        } else if (this.l < 256) {
            n = (int)((double)n + (32.0 - 4.0 * Math.log(this.l)));
        }
        n = this.p() < -1000 ? (n += 34) : (n += -this.p() * 34 / 1000);
        float f2 = this.n();
        n = f2 >= 1024.0f ? (n += 34) : (int)((float)n + f2 * 34.0f / 1024.0f);
        return n;
    }

    @Override
    public final void k_() {
        super.k_();
        this.v = (short)500;
    }

    public final short p() {
        return this.v;
    }

    public final void q() {
        if (this.aw() == 0 && this.v > Short.MIN_VALUE) {
            this.v = (short)(this.v - 1);
        }
    }

    @Override
    protected void l_() {
        super.l_();
    }

    private void a(long l, String string, boolean bl) {
        this.c = l;
        this.d = string;
        this.e = false;
        this.g = axw_2.e;
        this.h = bl;
        this.v = (short)500;
    }
}

