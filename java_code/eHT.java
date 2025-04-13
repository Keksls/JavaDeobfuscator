/*
 * Decompiled with CFR 0.152.
 */
public class eHT
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Pas de params", new eFu[0]));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eHT aD() {
        eHT eHT2 = new eHT();
        return eHT2;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.e != null && this.e instanceof epq_2 && this.f != null && this.f instanceof epq_2) {
            epq_2 epq_22 = (epq_2)this.e;
            epq_2 epq_23 = (epq_2)this.f;
            if (epq_23.a(eoz_1.f) && epq_22.ck() != null) {
                ((elm_0)epq_22.ck()).b(epq_23);
            }
        }
        this.j(true);
    }

    @Override
    public void j(sd_0 sd_02) {
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

