/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import org.apache.log4j.Logger;

public class aND
extends aeH {
    private static final Logger d = Logger.getLogger(aND.class);
    public static final String b = "animatedElementViewer";
    public static final String c = "WorldLoading";
    private static final aND e = new aND();
    private String f;
    private String g;
    private int h;

    public static aND f() {
        return e;
    }

    private aND() {
    }

    public final void a(int n, int n2, int n3, String string, String string2, int n4) {
        this.a(n, n2);
        this.a(n3);
        this.f = string;
        this.g = string2;
        this.h = n4;
        this.a(string != null || string2 != null);
    }

    public void g() {
        this.a(1000, 1000, 0, null, null, 0);
    }

    @Override
    protected YK b() {
        return ans_0.D();
    }

    private void h() {
        fyb_0 fyb_02 = fpm_0.b().a("progressDialog", cfi_0.a("progressDialog"), 8448L, (short)19500);
        frO frO2 = (frO)fyb_02.getElementMap().a(b);
        frO2.setStyle(c);
        frO2.setAnimName(this.f);
    }

    private void i() {
        try {
            ddE.a().a(aVk.a.a(this.g));
            ddE.a().a(this.a);
            azu_0.j().a(ddE.a());
            auy_2 auy_22 = auy_2.a();
            d.info((Object)"darkscreen- Condition startVideoTransition");
            auy_22.a(new aNE(this, auy_22));
        }
        catch (gm_0 gm_02) {
            d.error((Object)"Unable to find video file path property", (Throwable)gm_02);
        }
        catch (IOException iOException) {
            d.error((Object)"Unable to find video file", (Throwable)iOException);
        }
    }

    @Override
    protected final void d() {
        try {
            if (this.f != null) {
                this.h();
            } else if (this.g != null) {
                this.i();
            }
            if (this.h != 0) {
                cdw_0.n().l(this.h);
            }
        }
        catch (Exception exception) {
            d.error((Object)"", (Throwable)exception);
        }
    }

    private void j() {
        fpm_0.b().o("progressDialog");
    }

    private void k() {
    }

    @Override
    protected final void c() {
        try {
            this.j();
            this.k();
            cdw_0.n().x();
        }
        catch (Exception exception) {
            d.error((Object)"", (Throwable)exception);
        }
    }

    public void a(long l) {
        aeM aeM2 = aeM.a();
        if (l == -32768L) {
            int n = 1000;
            int n2 = 1000;
            boolean bl = false;
            Object var6_9 = null;
            Object var7_11 = null;
            boolean bl2 = false;
        } else {
            int n = aeM2.b();
            int n3 = aeM2.c();
            int n4 = aeM2.d();
            String string = aeM2.e();
            String string2 = aeM2.g();
            int n5 = aeM2.f();
        }
        this.g();
        aeM2.h();
    }
}

