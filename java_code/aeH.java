/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class aeH {
    private static final Logger b = Logger.getLogger(aeH.class);
    protected acb_0 a;
    private int c;
    private int d;
    private int e = 0;
    aue_2 f;

    protected aeH() {
        this.a();
    }

    public final void a(int n, int n2) {
        this.c = n;
        this.d = n2;
    }

    public final void a() {
        this.a(1000, 1000);
    }

    public void a(int n) {
        this.e = n;
    }

    private void f() {
        YK yK = this.b();
        this.a = yK.c();
    }

    protected abstract YK b();

    protected abstract void c();

    protected abstract void d();

    public final void a(boolean bl) {
        if (bl) {
            this.a(this.g(), this.e);
        }
        this.f();
        this.a(this.c, this.d, this.a);
    }

    private auxx_2 g() {
        return new aeI(this);
    }

    private void a(auxx_2 auxx_22, int n) {
        auy_2 auy_22 = auy_2.a();
        auy_22.a(auxx_22);
        if (n > 0) {
            long l = System.currentTimeMillis();
            auy_22.a(new aeJ(this, l, n, auy_22));
        }
    }

    public final void a(Runnable runnable) {
        this.f();
        auy_2.a().a(runnable);
        auy_2.a().f();
        this.a(this.c, this.a);
    }

    public void a(int n, acb_0 acb_02) {
        if (this.f != null) {
            b.warn((Object)"on \u00e9tait d\u00e9j\u00e0 en attente d'un monde, on clean les conditions");
            auy_2.a().b(this.f);
        }
        this.f = new aeK(this, acb_02, n);
        auy_2.a().a(this.f);
    }

    private void a(int n, int n2, acb_0 acb_02) {
        auy_2 auy_22 = auy_2.a();
        azu_2 azu_22 = this.b().e();
        azu_22.a(acb_02);
        azu_22.a(acb_02);
        acb_0 acb_03 = acb_02.p();
        auy_22.a(n, acb_03);
        acb_02.o();
        auy_22.b(n2);
        this.a(n, acb_02);
        auy_22.a(new aeL(this, auy_22, acb_03, azu_22, acb_02));
    }

    public void e() {
        auy_2.a().f();
        this.f = null;
    }
}

