/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGy
 */
public final class egy_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Id du mob, niveaux = niveau moyen du mob", new eFu("Id du mob", eFx.b)), new eFv("Id du mob, niveaux = niveau moyen du mob ou du joueur", new eFu("Id du mob", eFx.b), new eFu("Niveaux : 0 : niveau du mob, 1 = niveau du joueur", eFx.b)));
    private static final int w = -1;
    private epd_2 x;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public egy_0() {
        this.M();
    }

    public egy_0 aD() {
        egy_0 egy_02 = new egy_0();
        egy_02.x = epd_2.a;
        return egy_02;
    }

    @Override
    public void j(sd_0 sd_02) {
        int n;
        if (this.c == null) {
            return;
        }
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        this.x = ((efh_0)this.c).F() >= 2 ? ((n = ((efh_0)this.c).a(1, this.aZ(), eFb.a)) == 1 ? epd_2.b : epd_2.a) : epd_2.a;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null) {
            this.ba();
            return;
        }
        if (!(this.f instanceof epq_2)) {
            this.ba();
            return;
        }
        if (((epq_2)this.f).bl()) {
            ((epq_2)this.f).bk();
        }
        ((epq_2)this.f).b(this.m, this.x);
    }

    @Override
    public boolean ab() {
        if (!(this.f instanceof epq_2)) {
            return false;
        }
        return super.ab();
    }

    @Override
    public void al() {
        if (!this.P) {
            return;
        }
        if (!(this.f instanceof epq_2)) {
            return;
        }
        ((epq_2)this.f).y(this.m);
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
        this.m = -1;
        this.x = epd_2.a;
        super.z();
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().d(this.x.ordinal()));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            int n = iO2.r().m();
            for (epd_2 epd_22 : epd_2.values()) {
                if (epd_22.ordinal() != n) continue;
                this.x = epd_22;
                return;
            }
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

