/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cZJ
implements ahr_1 {
    private static final Logger b = Logger.getLogger(cZJ.class);
    public static final cZJ a = new cZJ();
    boolean c;
    boolean d;
    private boolean e = true;
    Runnable f;

    public void a() {
        azu_0 azu_02 = azu_0.j();
        fpm_0.b().q();
        ccm_1.g().b(azu_02.k());
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16705: {
                if (this.c) {
                    b.warn((Object)"On tente de changer de h\u00e9ros alors qu'un changement est en cours");
                    return false;
                }
                this.c = true;
                dfc dfc2 = (dfc)adt_12;
                long l = dfc2.d();
                bmr_1 bmr_12 = (bmr_1)euw_2.a.d(l);
                brd_0.k.a(l);
                azu_0 azu_02 = azu_0.j();
                cgu_2 cgu_22 = cgu_2.a();
                bmr_1 bmr_13 = azu_02.k();
                fjm_1.a().b();
                bmr_12.n(false);
                fta_0.getInstance().setVisible(false);
                byte by = ddp.a().d().c();
                long l2 = System.currentTimeMillis();
                cZu.a().c();
                czk_0 czk_02 = new czk_0(this, cgu_22, bmr_12, azu_02, bmr_13, l2, by);
                auy_2.a().a(czk_02);
                aND.f().g();
                bmr_13.y();
                bmr_13.n(true);
                bmr_13.bv().cg().j();
                return false;
            }
        }
        return true;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    void a(bmr_1 bmr_12) {
        cqa_0 cqa_02 = new cqa_0(bmr_12.a_());
        azu_0.j().K().c(cqa_02);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        this.f = null;
        if (!bl) {
            this.c = false;
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public boolean c() {
        return this.c;
    }

    public boolean d() {
        return this.e;
    }

    public void b(boolean bl) {
        this.e = bl;
    }

    public void a(Runnable runnable) {
        this.f = runnable;
    }
}

