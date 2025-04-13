/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class daG
implements ahr_1 {
    public static final daG a = new daG();
    protected static final Logger b = Logger.getLogger(daG.class);
    private big_2 c;
    private ans_1 d;

    private daG() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19908: {
                dfc dfc2 = (dfc)adt_12;
                this.c.a((bij_2)dfc2.j());
                return false;
            }
            case 18509: {
                dfc dfc3 = (dfc)adt_12;
                this.c.a((biw_2)dfc3.j());
                return false;
            }
            case 16713: {
                this.c.a();
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.d = new dah_0(this);
            fpm_0.b().a(this.d);
            fis_1.a().a("mercenaries", this.c);
            fpm_0.b().a("mercenaryDialog", cfi_0.a("mercenaryDialog"), 32768L, (short)10000);
            fis_1.a().a("displayedAchievement", (Object)this.c.b(), "mercenaryDialog");
            fpm_0.b().a("wakfu.mercenaries", chh_0.class);
            fpm_0.b().a("wakfu.achievements", cfp_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fis_1.a().a("mercenaries");
            fpm_0.b().b(this.d);
            fpm_0.b().o("mercenaryDialog");
            fpm_0.b().e("wakfu.mercenaries");
            fpm_0.b().e("wakfu.achievements");
        }
    }

    public void a(int n) {
        this.c = new big_2(n);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

