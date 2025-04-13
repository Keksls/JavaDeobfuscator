/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cKZ
extends cLf {
    private static final Logger c = Logger.getLogger(cKZ.class);
    private final etk_2 d;
    private static long e = -1L;

    public cKZ(etk_2 etk_22) {
        super(new clg_1(true, true));
        this.d = etk_22;
    }

    @Override
    public fks_0 a() {
        return fks_0.b;
    }

    @Override
    protected void a(int n, int n2) {
        etw_2 etw_22 = eta_2.b(this.d);
        afe_1 afe_12 = this.a.getCellCoordFromMouse(n, n2);
        afe_1 afe_13 = this.a.getHavenWorldImages().b(etw_22.c());
        int n3 = afe_12.a() + afe_13.a();
        int n4 = afe_12.b() + afe_13.b();
        fkd_0 fkd_02 = new fkd_0(this.a.getWorkingHavenWorld(), cck_2.a);
        cdj_1 cdj_12 = new cdj_1(e, etw_22.a(), 0, (short)n3, (short)n4);
        fkd_02.a(cdj_12);
        fkr_0 fkr_02 = this.a.a(cdj_12);
        this.b = new cLh(fkr_02);
        this.b.a(fkd_02.a());
    }

    @Override
    protected void b() {
        --e;
    }
}

