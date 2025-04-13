/*
 * Decompiled with CFR 0.152.
 */
public class eIx
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Normal", new eFu("ia (1) ou pas d'ia (0)", eFx.c)));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eIx aD() {
        eIx eIx2 = new eIx();
        return eIx2;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f != null && this.f instanceof epq_2) {
            ((epq_2)this.f).y(this.m == 1);
        }
    }

    @Override
    public void al() {
        if (this.f != null && this.f instanceof epq_2) {
            epq_2 epq_22 = (epq_2)this.f;
            epq_22.y(epq_22.cp());
        }
        super.al();
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        if (this.c != null) {
            int n = ((efh_0)this.c).a(0, s2, eFb.a);
            this.m = n > 0 ? 1 : 0;
        }
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
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

