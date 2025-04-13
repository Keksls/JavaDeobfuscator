/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eFU
 */
abstract class efu_0
extends ejh_0 {
    protected int v;
    protected boolean w;
    private efv_0 x;

    efu_0() {
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        eps_0 eps_02 = eps_0.a((byte)this.m);
        if (eps_02 == null) {
            this.ba();
            a.error((Object)("Erreur de saisie, charac inexistante " + this.m));
            return;
        }
        eps_0 eps_03 = eps_0.a((byte)this.v);
        if (eps_02 == null) {
            this.ba();
            a.error((Object)("Erreur de saisie, charac inexistante " + this.m));
            return;
        }
        epa_1 epa_12 = (epa_1)(this.w ? this.e.b(eps_02) : this.f.b(eps_02));
        epa_1 epa_13 = (epa_1)(this.w ? this.f.b(eps_03) : this.e.b(eps_03));
        if (epa_13 == null || epa_12 == null) {
            this.ba();
            return;
        }
        this.x = this.a(epa_13, epa_12);
        epa_12.a(this.x);
        this.x.a(epa_12);
    }

    protected abstract efv_0 a(epa_1 var1, epa_1 var2);

    @Override
    public void al() {
        if (!this.as()) {
            return;
        }
        eps_0 eps_02 = eps_0.a((byte)this.m);
        if (eps_02 == null) {
            return;
        }
        if (this.x != null) {
            this.x.a();
            this.x.b();
        }
        super.al();
    }

    @Override
    public void z() {
        if (this.x != null) {
            this.x.b();
        }
        this.x = null;
        super.z();
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
}

