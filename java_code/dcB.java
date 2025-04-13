/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class dcB
implements ahr_1 {
    private static final dcB b = new dcB();
    protected static final Logger a = Logger.getLogger(dcB.class);
    private ans_1 c;

    public static dcB a() {
        return b;
    }

    private dcB() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = new dcc_0(this);
            fpm_0.b().a(this.c);
            fpm_0.b().a("selectItemElementsDialog", cfi_0.a("selectItemElementsDialog"), 256L, (short)10000);
            fpm_0.b().a("wakfu.selectItemElements", cjv_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.c);
            fpm_0.b().o("selectItemElementsDialog");
            fpm_0.b().e("wakfu.selectItemElements");
            fis_1.a().a("selectItemElements");
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void a(exk_2 exk_22) {
        bhz_0.l.a(exk_22);
        fis_1.a().a("selectItemElements", bhz_0.l);
    }
}

