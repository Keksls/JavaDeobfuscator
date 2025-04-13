/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from dcq
 */
public class dcq_0
implements ahr_1 {
    private static final dcq_0 d = new dcq_0();
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private static final Logger e = Logger.getLogger(dcq_0.class);
    private bMn f;
    private ans_1 g;
    private afb_0 h;

    public static dcq_0 a() {
        return d;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        adt_12.a();
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bmr_1 bmr_12 = azu_0.j().k();
            this.h = new dcr_0(this);
            bmr_12.bv().a(this.h);
            this.g = new dcs(this);
            fpm_0.b().a(this.g);
            fis_1.a().a("protectorViewMode", 0);
            fyb_0 fyb_02 = fpm_0.b().a("protectorViewDialog", cfi_0.a("protectorViewDialog"), 32768L, (short)10000);
            fpm_0.b().a("wakfu.protectorView", cJo.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            azu_0.j().k().bv().b(this.h);
            this.h = null;
            fis_1.a().a("protectorViewMode");
            fpm_0.b().e("wakfu.protectorView");
            fpm_0.b().b(this.g);
            fpm_0.b().o("protectorViewDialog");
        }
    }
}

