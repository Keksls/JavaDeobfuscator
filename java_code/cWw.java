/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cWw
extends cuu_0
implements ahr_1 {
    private static final cWw d = new cWw();
    protected static final Logger c = Logger.getLogger(cWw.class);
    private fac_2 e;
    private fsQ f;
    private ans_1 g;

    public static cWw e() {
        return d;
    }

    private cWw() {
        b = -2L;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.g = new cWx(this);
            fpm_0.b().a(this.g);
            this.c();
            fvE fvE2 = (fvE)fpm_0.b().a("dimensionalBagFleaDialog", cfi_0.a("dimensionalBagFleaDialog"), 32769L, (short)10000);
            this.f = (fsQ)fvE2.getElementMap().a("itemsList");
            fvk_0 fvk_02 = (fvk_0)fvE2.getElementMap().a("fleaWindow");
            this.e = new cwy_0(this, fvk_02);
            this.f.addListContentListener(this.e);
            azu_0.j().b(dei.a());
            azu_0.j().K().a(cfq_2.a());
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.g);
            this.f.removeListContentLoadListener(this.e);
            this.f = null;
            this.e = null;
            this.d();
            fpm_0.b().o("dimensionalBagFleaDialog");
            fpm_0.b().o("confirmFleaPurchaseDialog");
            azu_0.j().a(dei.a());
            azu_0.j().K().b(cfq_2.a());
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(Object object, bpc_2 bpc_22) {
        a = new cwz_0(this, object, bpc_22);
        ahs.d().b(a, b);
    }
}

