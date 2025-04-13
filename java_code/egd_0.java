/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGd
 */
public final class egd_0
extends efu_0 {
    private static final aqr_2 x = new eFw(new eFv("Copie de Charac entre cible et caster", new eFu("Id de la charac source", eFx.c), new eFu("Id de la charac destination", eFx.c)), new eFv("La cible copie le max de la charac du caster", new eFu("Id de la charac \u00e0 copier", eFx.c), new eFu("Id de la charac destination", eFx.c), new eFu("1 pour cible copie caster, 0 sinon (defaut)", eFx.c)), new eFv("Ratio de la valeur a copier", new eFu("Id de la charac \u00e0 copier", eFx.c), new eFu("Id de la charac destination", eFx.c), new eFu("1 pour cible copie caster, 0 sinon (defaut)", eFx.c), new eFu("Palier pour 1 point dans la charac destination (defaut = 1)", eFx.c)), new eFv("Ratio de la valeur a copier", new eFu("Id de la charac \u00e0 copier", eFx.c), new eFu("Id de la charac destination", eFx.c), new eFu("1 pour cible copie caster, 0 sinon (defaut)", eFx.c), new eFu("Palier pour 1 point dans la charac destination (defaut = 1)", eFx.c), new eFu("Modification max de la charac destination (defaut = pas de max = 0)", eFx.c)), new eFv("Ratio de la valeur a copier", new eFu("Id de la charac \u00e0 copier", eFx.c), new eFu("Id de la charac destination", eFx.c), new eFu("1 pour cible copie caster, 0 sinon (defaut)", eFx.c), new eFu("Palier pour 1 point dans la charac destination (defaut = 1)", eFx.c), new eFu("Modification max de la charac destination (defaut = pas de max = 0)", eFx.c), new eFu("Modification min de la charac destination (defaut = pas de min =  -2 147 483 648)", eFx.c)));
    int y;
    int z;
    int A;

    @Override
    public aqr_2 c_() {
        return x;
    }

    public egd_0() {
        this.M();
    }

    public egd_0 aC() {
        return new egd_0();
    }

    @Override
    public void j(sd_0 sd_02) {
        this.m = -1;
        this.w = false;
        this.y = 1;
        this.z = 0;
        this.z = Integer.MIN_VALUE;
        if (this.c == null) {
            return;
        }
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        this.v = ((efh_0)this.c).a(1, this.aZ(), eFb.a);
        if (((efh_0)this.c).F() > 2) {
            boolean bl = this.w = ((efh_0)this.c).a(2, this.aZ(), eFb.a) == 1;
        }
        if (((efh_0)this.c).F() > 3) {
            this.y = ((efh_0)this.c).a(3, this.aZ(), eFb.a);
        }
        if (((efh_0)this.c).F() > 4) {
            this.z = ((efh_0)this.c).a(4, this.aZ(), eFb.a);
        }
        if (((efh_0)this.c).F() > 5) {
            this.A = ((efh_0)this.c).a(5, this.aZ(), eFb.a);
        }
    }

    @Override
    protected efv_0 a(epa_1 epa_12, epa_1 epa_13) {
        return new eGe(this, epa_12, epa_13);
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().a(this.w).f(this.y).c(this.v).a(this.z).g(this.A));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.w = iq_02.t();
            this.y = iq_02.x();
            this.v = iq_02.i();
            this.z = iq_02.e();
            this.A = iq_02.z();
        }
    }

    @Override
    public void z() {
        this.w = false;
        this.y = 1;
        this.v = -1;
        this.z = 0;
        this.z = 0;
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aC();
    }
}

