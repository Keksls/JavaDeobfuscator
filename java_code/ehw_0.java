/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eHw
 */
public class ehw_0
extends ejh_0 {
    private boolean v = false;
    private static final aqr_2 w = new eFw(new eFv("id de script", new eFu("valeur", eFx.b)), new eFv("id de script + feedback", new eFu("valeur", eFx.b), new eFu("Afficher dans le chat", eFx.c)));

    public static ehw_0 a(So<efh_0> so, efa_0 efa_02) {
        ehw_0 ehw_02 = new ehw_0();
        ehw_02.i = efc_0.eX.a();
        ehw_02.l = ((ejh_0)efc_0.eX.b()).e();
        ehw_02.h = so;
        return ehw_02;
    }

    public ehw_0 aD() {
        ehw_0 ehw_02 = new ehw_0();
        return ehw_02;
    }

    @Override
    public aqr_2 c_() {
        return w;
    }

    @Override
    public boolean Q() {
        return true;
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
    public void j(sd_0 sd_02) {
        if (this.c != null) {
            this.m = ((efh_0)this.c).a(0, (short)0, eFb.a);
            this.v = ((efh_0)this.c).F() == 2 ? ((efh_0)this.c).a(1) == 0.0f : false;
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.e != null && this.e instanceof epq_2) {
            ((epq_2)this.e).d(this.m, this.v);
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

