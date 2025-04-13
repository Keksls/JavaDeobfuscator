/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGg
 */
public final class egg_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Id du sort \u00e0 ajouter, et niveau", new eFu("Id du sort", eFx.b), new eFu("Niveau : -1 = niveau de la cible, -2 = niveau du caster, -3 = niveau du sort courant", eFx.b)));
    private short w;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public egg_0() {
        this.M();
    }

    public egg_0 aC() {
        egg_0 egg_02 = new egg_0();
        egg_02.w = 0;
        return egg_02;
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        short s2 = (short)((efh_0)this.c).a(1, this.aZ(), eFb.a);
        switch (s2) {
            case -1: {
                if (this.i() != null && this.i() instanceof elw_0) {
                    this.w = ((elw_0)this.i()).dr();
                    break;
                }
                this.w = 0;
                break;
            }
            case -2: {
                if (this.h() != null && this.h() instanceof elw_0) {
                    this.w = ((elw_0)this.h()).dr();
                    break;
                }
                this.w = 0;
                break;
            }
            case -3: {
                this.w = this.aZ();
                break;
            }
            default: {
                this.w = s2;
            }
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        boolean bl2;
        if (this.f == null) {
            this.ba();
            return;
        }
        if (!(this.f instanceof epq_2)) {
            this.ba();
            return;
        }
        epq_2 epq_22 = (epq_2)this.f;
        if (!epq_22.bl()) {
            epq_22.bi();
        }
        if (!(bl2 = epq_22.a(this.m, this.w))) {
            a.info((Object)("Unable to add spell " + this.m + " to temporary inventory of " + this.f));
            this.ba();
        }
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
        this.m = 0;
        this.w = 0;
        super.z();
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().d(this.w));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            this.w = Hw.c((long)iO2.r().m());
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aC();
    }
}

