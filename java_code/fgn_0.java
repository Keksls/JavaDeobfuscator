/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from fgN
 */
public abstract class fgn_0<P extends fgy_0> {
    protected static final Logger d = Logger.getLogger(fgn_0.class);
    protected final xr_1 e = new xr_1();
    private fgd_0<P> a;

    protected fgn_0() {
    }

    public xr_1 a() {
        return this.e;
    }

    public void a(fgd_0<P> fgd_02) {
        this.a = fgd_02;
    }

    private void i(P p2) {
        this.e.c();
        this.e.a = ((fgy_0)p2).B();
    }

    private void j(P p2) {
        xc_1 xc_12;
        faX faX2 = ((fgy_0)p2).C();
        this.e.b = xc_12 = new xc_1();
        xc_12.a = faX2 != null ? faX2.c() : -1;
        faX faX3 = ((fgy_0)p2).D();
        xc_12.b = faX3 != null ? faX3.c() : -1;
        fgv_0 fgv_02 = ((fgy_0)p2).E();
        xc_12.c = fgv_02 != null ? fgv_02.e() : -1;
        this.b(p2, xc_12);
    }

    private byte[] b() {
        return this.a(this.e);
    }

    public byte[] a(xr_1 xr_12) {
        int n = xr_12.b();
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        xr_12.a(byteBuffer);
        return byteBuffer.array();
    }

    public byte[] b(P p2) {
        this.i(p2);
        this.j(p2);
        this.e.c = new xs_2();
        this.b(p2, this.e.c);
        this.e.i = new xk_2();
        this.b(p2, this.e.i);
        this.e.k = new xi_2();
        this.a(p2, this.e.k);
        this.e.l = new xy_1();
        this.b(p2, this.e.l);
        this.e.m = new xg_1();
        this.b(p2, this.e.m);
        this.e.e = new xe_1();
        this.b(p2, this.e.e);
        this.e.n = new xv_2();
        this.a(p2, this.e.n);
        return this.b();
    }

    public byte[] c(P p2) {
        this.i(p2);
        this.j(p2);
        this.e.c = new xs_2();
        this.b(p2, this.e.c);
        this.e.i = new xk_2();
        this.b(p2, this.e.i);
        this.e.k = new xi_2();
        this.a(p2, this.e.k);
        this.e.l = new xy_1();
        this.b(p2, this.e.l);
        this.e.m = new xg_1();
        this.b(p2, this.e.m);
        this.e.e = new xe_1();
        this.b(p2, this.e.e);
        this.e.n = new xv_2();
        this.a(p2, this.e.n);
        return this.b();
    }

    public byte[] d(P p2) {
        this.i(p2);
        this.e.i = new xk_2();
        this.b(p2, this.e.i);
        return this.b();
    }

    public byte[] e(P p2) {
        this.i(p2);
        this.e.d = new xt_1();
        this.b(p2, this.e.d);
        this.e.c = new xs_2();
        this.b(p2, this.e.c);
        this.e.f = new xa_2();
        this.b(p2, this.e.f);
        this.e.g = new xo_1();
        this.b(p2, this.e.g);
        this.e.i = new xk_2();
        this.b(p2, this.e.i);
        this.e.e = new xe_1();
        this.b(p2, this.e.e);
        this.e.j = new xq_1();
        this.b(p2, this.e.j);
        this.e.l = new xy_1();
        this.b(p2, this.e.l);
        this.e.m = new xg_1();
        this.b(p2, this.e.m);
        this.e.n = new xv_2();
        this.a(p2, this.e.n);
        return this.b();
    }

    public byte[] f(P p2) {
        this.i(p2);
        this.j(p2);
        this.e.d = new xt_1();
        this.b(p2, this.e.d);
        this.e.c = new xs_2();
        this.b(p2, this.e.c);
        this.e.e = new xe_1();
        this.b(p2, this.e.e);
        this.e.g = new xo_1();
        this.b(p2, this.e.g);
        this.e.i = new xk_2();
        this.b(p2, this.e.i);
        this.e.j = new xq_1();
        this.b(p2, this.e.j);
        this.e.l = new xy_1();
        this.b(p2, this.e.l);
        this.e.m = new xg_1();
        this.b(p2, this.e.m);
        this.e.n = new xv_2();
        this.a(p2, this.e.n);
        return this.b();
    }

    public byte[] g(P p2) {
        this.i(p2);
        this.j(p2);
        this.e.d = new xt_1();
        this.b(p2, this.e.d);
        this.e.c = new xs_2();
        this.b(p2, this.e.c);
        this.e.e = new xe_1();
        this.b(p2, this.e.e);
        this.e.g = new xo_1();
        this.b(p2, this.e.g);
        this.e.i = new xk_2();
        this.b(p2, this.e.i);
        this.e.j = new xq_1();
        this.b(p2, this.e.j);
        this.e.l = new xy_1();
        this.b(p2, this.e.l);
        this.e.m = new xg_1();
        this.b(p2, this.e.m);
        this.e.h = new xj_2();
        this.b(p2, this.e.h);
        this.e.n = new xv_2();
        this.a(p2, this.e.n);
        return this.b();
    }

    public byte[] h(P p2) {
        this.i(p2);
        this.j(p2);
        this.e.d = new xt_1();
        this.b(p2, this.e.d);
        this.e.c = new xs_2();
        this.b(p2, this.e.c);
        this.e.l = new xy_1();
        this.b(p2, this.e.l);
        this.e.m = new xg_1();
        this.b(p2, this.e.m);
        return this.b();
    }

    public P a(ByteBuffer byteBuffer) {
        if (this.a == null) {
            throw new UnsupportedOperationException("La factory de protecteur doit \u00eatre d\u00e9finie");
        }
        P p2 = this.a.b(-1);
        if (p2 != null) {
            this.a(byteBuffer, p2);
        }
        return p2;
    }

    public int b(ByteBuffer byteBuffer) {
        this.e.c();
        this.e.b(byteBuffer);
        return this.e.a;
    }

    public void a(ByteBuffer byteBuffer, P p2) {
        xv_2 xv_22;
        xg_1 xg_12;
        xy_1 xy_12;
        xi_2 xi_22;
        xq_1 xq_12;
        xk_2 xk_22;
        xj_2 xj_22;
        xo_1 xo_12;
        xa_2 xa_22;
        Object object;
        Object object2;
        Object object3;
        this.e.c();
        this.e.b(byteBuffer);
        ((fgy_0)p2).a(this.e.a);
        xc_1 xc_12 = this.e.b;
        if (xc_12 != null) {
            object3 = fbc_0.a.a(xc_12.a);
            object2 = fbc_0.a.a(xc_12.b);
            object = fgT.a.a(xc_12.c);
            ((fgy_0)p2).a((faX)object3);
            ((fgy_0)p2).b((faX)object2);
            ((fgy_0)p2).a((fgv_0)object);
            this.a(p2, xc_12);
        }
        if ((object3 = this.e.c) != null) {
            try {
                this.a(p2, (xs_2)object3);
            }
            catch (Exception exception) {
                d.error((Object)"Exception during unserialize appearance", (Throwable)exception);
            }
        }
        if ((object2 = this.e.d) != null) {
            try {
                this.a(p2, (xt_1)object2);
            }
            catch (Exception exception) {
                d.error((Object)"Exception during unserialize challenges", (Throwable)exception);
            }
        }
        if ((object = this.e.e) != null) {
            try {
                this.a(p2, (xe_1)object);
            }
            catch (Exception exception) {
                d.error((Object)"Exception during unserialize referenceMerchantInventories", (Throwable)exception);
            }
        }
        if ((xa_22 = this.e.f) != null) {
            try {
                this.a(p2, xa_22);
            }
            catch (Exception exception) {
                d.error((Object)"Exception during unserialize inventories", (Throwable)exception);
            }
        }
        if ((xo_12 = this.e.g) != null) {
            try {
                this.a(p2, xo_12);
            }
            catch (Exception exception) {
                d.error((Object)"Exception during unserialize wallet", (Throwable)exception);
            }
        }
        if ((xj_22 = this.e.h) != null) {
            try {
                this.a(p2, xj_22);
            }
            catch (Exception exception) {
                d.error((Object)"Exception during unserialize stake", (Throwable)exception);
            }
        }
        if ((xk_22 = this.e.i) != null) {
            try {
                this.a(p2, xk_22);
            }
            catch (Exception exception) {
                d.error((Object)"Exception during unserialize taxes", (Throwable)exception);
            }
        }
        if ((xq_12 = this.e.j) != null) {
            try {
                this.a(p2, xq_12);
            }
            catch (Exception exception) {
                d.error((Object)"Exception during unserialize modifiers", (Throwable)exception);
            }
        }
        if ((xi_22 = this.e.k) != null) {
            try {
                this.b(p2, xi_22);
            }
            catch (Exception exception) {
                d.error((Object)"Exception during unserialize satisfaction", (Throwable)exception);
            }
        }
        if ((xy_12 = this.e.l) != null) {
            try {
                this.a(p2, xy_12);
            }
            catch (Exception exception) {
                d.error((Object)"Exception during unserialize monsterTargets", (Throwable)exception);
            }
        }
        if ((xg_12 = this.e.m) != null) {
            try {
                this.a(p2, xg_12);
            }
            catch (Exception exception) {
                d.error((Object)"Exception during unserialize resourceTargets", (Throwable)exception);
            }
        }
        if ((xv_22 = this.e.n) != null) {
            try {
                this.b(p2, xv_22);
            }
            catch (Exception exception) {
                d.error((Object)"Exception during unserialize ecosystem", (Throwable)exception);
            }
        }
        this.a(p2);
    }

    public abstract void b(P var1, xj_2 var2);

    public abstract void a(P var1, xj_2 var2);

    public abstract void b(P var1, xc_1 var2);

    public abstract void a(P var1, xc_1 var2);

    public abstract void b(P var1, xt_1 var2);

    public abstract void a(P var1, xt_1 var2);

    public abstract void b(P var1, xs_2 var2);

    public abstract void a(P var1, xs_2 var2);

    public abstract void b(P var1, xe_1 var2);

    public abstract void a(P var1, xe_1 var2);

    public abstract void b(P var1, xa_2 var2);

    public abstract void a(P var1, xa_2 var2);

    public abstract void b(P var1, xo_1 var2);

    public abstract void a(P var1, xo_1 var2);

    public abstract void b(P var1, xk_2 var2);

    public abstract void a(P var1, xk_2 var2);

    public abstract void b(P var1, xq_1 var2);

    public abstract void a(P var1, xq_1 var2);

    protected abstract void b(P var1, xg_1 var2);

    protected abstract void a(P var1, xg_1 var2);

    protected abstract void b(P var1, xy_1 var2);

    protected abstract void a(P var1, xy_1 var2);

    protected abstract void b(P var1, xi_2 var2);

    protected abstract void a(P var1, xi_2 var2);

    protected abstract void b(P var1, xv_2 var2);

    protected abstract void a(P var1, xv_2 var2);

    protected abstract void a(P var1);
}

