/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cWG
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cWG.class);
    private static final cWG b = new cWG();
    private blp_1 c;
    private ans_1 d;

    public static cWG a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void a(bls_2 bls_22) {
        this.c = new blp_1(bls_22.a());
        this.c.a();
        this.c();
    }

    private void c() {
        fis_1.a().a("displayedAchievement", (Object)this.c, "challengeResultDialog");
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.d = new cWH(this);
            fpm_0.b().a(this.d);
            fpm_0.b().a("challengeResultDialog", cfi_0.a("challengeResultDialog"), 1L, (short)10000);
            this.c();
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.d);
            fpm_0.b().o("challengeResultDialog");
            this.c = null;
        }
    }
}

