/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bcj
 */
public final class bcj_0
extends alc_1 {
    private final bvx_2 e;
    private final ctj_1 f;

    public bcj_0(int n, int n2, int n3, bvx_2 bvx_22, ctj_1 ctj_12, bwp_1 bwp_12) {
        super(n, n2, n3);
        this.e = bvx_22;
        this.f = ctj_12;
    }

    @Override
    protected long o() {
        a.info((Object)"CREATION DU COMBAT");
        bwa_1 bwa_12 = new bwa_1();
        bwa_12.a(this.f, this.e);
        this.a(this.f);
        bmr_1 bmr_12 = azu_0.j().k();
        bmr_12.bj();
        blx_1 blx_12 = (blx_1)this.e.n(this.f.o());
        byte by = this.e.x(blx_12);
        byte by2 = this.e.x(bmr_12);
        if (emr_2.a(this.f.i()).w() && by != by2) {
            aUh.c("pvp.aggroChatMessage", blx_12.dp());
        }
        aPc.f().i();
        bxr_2.a.a();
        apw_0.a().b();
        return 0L;
    }

    private void a(ctj_1 ctj_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        this.e.c(ctj_12.g());
        this.e.b();
        this.e.Z();
        fis_1.a().a("fight", this.e);
        fis_1.a().a("fight.timeline", this.e.A());
        fis_1.a().a("isInFightCreationOrPlacement", true);
        bmr_12.a(false, false);
        azu_0.j().b(dcw.n());
        azu_0.j().b(cXC.a());
        azu_0.j().b(cVS.b);
        azu_0.j().b(dao.d());
        azu_0.j().b(cWw.e());
        azu_0.j().b(cYF.a());
        azu_0.j().b(ddi_0.d());
        azu_0.j().b(dei.a());
        if (bmr_12.be()) {
            azu_0.j().b(bgp_1.c());
            azu_0.j().b(czh_0.a());
        }
        azu_0.j().b(cfu_1.a());
        try {
            cdw_0.n().a(this.e);
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
        }
        if (this.e.c(bmr_12.Y())) {
            aUh.c("fight.locked.at.creation", new Object[0]);
        }
    }

    @Override
    protected void l() {
    }
}

