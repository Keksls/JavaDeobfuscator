/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cUO
 */
public class cuo_0
extends anu_1 {
    private static final Logger b = Logger.getLogger(cuo_0.class);
    private static final cuo_0 c = new cuo_0();
    private boolean d = false;

    public static cuo_0 e() {
        return c;
    }

    @Override
    protected anv_1 c() {
        return new cun_0();
    }

    @Override
    protected void a(anv_1 anv_12, boolean bl) {
        if (!this.d) {
            this.d = true;
            fpm_0.b().a("progressDialog", cfi_0.a("progressDialog"), 8448L, (short)19500);
            cdw_0.n().g(bl);
        }
    }

    @Override
    protected void a(anv_1 anv_12) {
        if (this.d) {
            this.d = false;
            fpm_0.b().o("progressDialog");
            cdw_0.n().x();
        }
    }

    public boolean f() {
        return this.d;
    }
}

