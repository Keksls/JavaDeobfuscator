/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cLc
extends cLf {
    private static final Logger c = Logger.getLogger(cLc.class);
    private final fkr_0 d;
    private final int e;
    private final int f;

    public cLc(fkr_0 fkr_02) {
        super(new clg_1(false, true));
        this.d = fkr_02;
        this.e = this.d.b().a();
        this.f = this.d.b().b();
    }

    @Override
    public fks_0 a() {
        return fks_0.b;
    }

    @Override
    protected void a(int n, int n2) {
        if (this.d == null) {
            c.error((Object)"pas de batiment a d\u00e9placer");
            return;
        }
        etw_2 etw_22 = this.d.e().g();
        afe_1 afe_12 = this.a.getCellCoordFromMouse(n, n2);
        afe_1 afe_13 = this.a.getHavenWorldImages().b(etw_22.c());
        int n3 = afe_12.a() + afe_13.a();
        int n4 = afe_12.b() + afe_13.b();
        fkd_0 fkd_02 = new fkd_0(this.a.getWorkingHavenWorld(), cck_2.a);
        cdj_1 cdj_12 = new cdj_1(this.d.d(), etw_22.a(), this.d.e().e(), (short)n3, (short)n4);
        fkd_02.a(cdj_12);
        fkr_0 fkr_02 = this.a.b(cdj_12);
        this.b = new cLo(fkr_02, (short)this.e, (short)this.f);
        this.b.a(fkd_02.a());
    }

    @Override
    protected void b() {
        super.b();
    }
}

