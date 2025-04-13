/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ddz
 */
public class ddz_0
implements ahr_1 {
    public static final ddz_0 a = new ddz_0();
    protected static final Logger b = Logger.getLogger(ddz_0.class);
    private brd_2 c;
    private ans_1 d;

    private ddz_0() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18877: {
                dfc dfc2 = (dfc)adt_12;
                String string = dfc2.h();
                this.c.a(string);
                return false;
            }
            case 19262: {
                dfc dfc3 = (dfc)adt_12;
                this.c.a();
                return false;
            }
            case 18867: {
                dfc dfc4 = (dfc)adt_12;
                this.c.b();
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.d = new dda_0(this);
            this.c = new brd_2();
            fis_1.a().a("tutorialBook", this.c);
            fpm_0.b().a(this.d);
            fpm_0.b().a("tutorialBookDialog", cfi_0.a("tutorialBookDialog"), 32768L, (short)10000);
            fpm_0.b().a("wakfu.tutorialBook", cJV.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = null;
            fpm_0.b().b(this.d);
            fpm_0.b().o("tutorialBookDialog");
            fpm_0.b().e("wakfu.tutorialBook");
            fis_1.a().a("tutorialBook");
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

