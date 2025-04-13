/*
 * Decompiled with CFR 0.152.
 */
public class cWc
implements ahr_1 {
    private static final cWc a = new cWc();
    private ans_1 b;
    private bkn_2 c;

    public void a(bkn_2 bkn_22) {
        this.c = bkn_22;
    }

    public static cWc a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17030: {
                dfc dfc2 = (dfc)adt_12;
                bmr_1 bmr_12 = azu_0.j().k();
                long l = this.c.l();
                if (!euw_2.a.d(bmr_12.U_(), l)) {
                    return false;
                }
                String string = dfc2.h();
                cqx cqx2 = new cqx(string, "", l);
                azu_0.j().K().c(cqx2);
                azu_0.j().b(a);
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.b = new cWd(this);
            fpm_0.b().a(this.b);
            fpm_0.b().a("battlegroundEndDialog", cfi_0.a("battlegroundEndDialog"), 256L, (short)10000);
            fpm_0.b().a("wakfu.battlegroundEnd", cfe_0.class);
            fis_1.a().a("battlegroundView", (Object)this.c, "battlegroundEndDialog");
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.b);
            fpm_0.b().o("battlegroundEndDialog");
            fpm_0.b().e("wakfu.battlegroundEnd");
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

