/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cYo
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cYo.class);
    private static final cYo b = new cYo();
    private ans_1 c;

    public static cYo a() {
        return b;
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
        if (bl) {
            return;
        }
        fis_1.a().a("emotesInventory", bht.i);
        this.c = new cYp(this);
        fpm_0.b().a(this.c);
        fpm_0.b().a("emotesInventoryDialog", cfi_0.a("emotesInventoryDialog"), 32769L, (short)10000);
        fpm_0.b().a("wakfu.emotesInventory", cgl_0.class);
        cdw_0.n().c(600012L);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        fis_1.a().a("emotesInventory");
        fis_1.a().a("overSmiley");
        fpm_0.b().b(this.c);
        fpm_0.b().o("emotesInventoryDialog");
        fpm_0.b().e("wakfu.emotesInventory");
        cdw_0.n().c(600013L);
    }

    public void c() {
        if (azu_0.j().c(this)) {
            azu_0.j().b(this);
            cxu_0.a().b(false);
        } else {
            azu_0.j().a(this);
            cxu_0.a().b(true);
        }
    }
}

