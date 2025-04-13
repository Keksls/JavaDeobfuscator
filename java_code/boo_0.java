/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bOO
 */
public final class boo_0
implements err_2 {
    private static final Logger a = Logger.getLogger(boo_0.class);
    private erp_2 b;

    public void a(erp_2 erp_22) {
        this.b = erp_22;
    }

    @Override
    public void a(int n) {
        try {
            bop_0 bop_02 = (bop_0)this.b.a(n);
            if (bop_02 != null) {
                bop_02.a();
            }
        }
        catch (Exception exception) {
            a.error((Object)"[SYMBIOT] on demande de modifier un index non valide", (Throwable)exception);
        }
        bOQ.a().e();
        boo_0.k();
    }

    @Override
    public void a() {
        boo_0.i();
        bOQ.a().f();
    }

    @Override
    public void b() {
        boo_0.i();
    }

    @Override
    public void c() {
        boo_0.j();
    }

    @Override
    public void d() {
        boo_0.i();
        boo_0.j();
    }

    @Override
    public void e() {
        bOQ.a().e();
        this.h();
        boo_0.i();
    }

    @Override
    public void f() {
        bOQ.a().e();
    }

    @Override
    public void g() {
        this.h();
        boo_0.k();
    }

    @Override
    public void a(byte by) {
        dfc dfc2 = new dfc();
        dfc2.a_(17347);
        dfc2.a(by);
        add_2.b().a(dfc2);
        boo_0.j();
    }

    private void h() {
        try {
            for (int n = 0; n < 10; n = (int)((byte)(n + 1))) {
                eqy_1 eqy_12 = this.b.a(n);
                if (eqy_12 == null) continue;
                fis_1.a().a((ajf_1)((Object)eqy_12), bop_0.m);
            }
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    private static void i() {
        bOQ.a().b();
    }

    private static void j() {
        bOQ.a().c();
    }

    private static void k() {
        fis_1.a().a((ajf_1)bOQ.a(), bOQ.g);
    }
}

