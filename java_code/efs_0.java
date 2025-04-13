/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eFS
 */
public class efs_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Ordre \u00e0 une cr\u00e9ature li\u00e9 \u00e0 une cellule (cf PriorityGoalType)", new eFu("Id", eFx.a)), new eFv("Sur une cellule d\u00e9finie (le Z \u00e9tant d\u00e9fini par l'altitude valide la plus proche de la cible", new eFu("Id", eFx.a), new eFu("X", eFx.a), new eFu("Y", eFx.a)));
    private aff_1 w;

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().a(ik_0.i().a(this.w.d()).b(this.w.e()).c(this.w.f())));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            ik_0 ik_02 = iO2.r().o();
            this.w = new aff_1(ik_02.c(), ik_02.e(), Hw.c((long)ik_02.g()));
        }
    }

    @Override
    public aqr_2 c_() {
        return v;
    }

    public efs_0() {
        this.M();
    }

    public efs_0 aC() {
        efs_0 efs_02 = new efs_0();
        efs_02.w = this.w;
        return efs_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        Su su = this.f;
        if (su != null && su instanceof epq_2 && this.m >= 0) {
            ((epq_2)su).b(this.m, this.w);
        }
    }

    @Override
    public void al() {
        super.al();
        Su su = this.f;
        if (su != null && su instanceof epq_2 && this.m >= 0) {
            ((epq_2)su).c(this.m, this.w);
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        this.m = -1;
        this.w = new aff_1(this.g);
        if (this.c == null) {
            return;
        }
        if (((efh_0)this.c).F() >= 1) {
            this.m = ((efh_0)this.c).a(0, s2, eFb.a);
        }
        if (((efh_0)this.c).F() >= 3) {
            int n = ((efh_0)this.c).a(1, s2, eFb.a);
            int n2 = ((efh_0)this.c).a(2, s2, eFb.a);
            short s3 = 0;
            if (this.f instanceof epq_2) {
                epq_2 epq_22 = (epq_2)this.f;
                s3 = yz_0.a(epq_22.T_(), n, n2, epq_22.P_().f(), (short)0);
            }
            this.w = new aff_1(n, n2, s3);
        }
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void z() {
        super.z();
        this.w = null;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aC();
    }
}

