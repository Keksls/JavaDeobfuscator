/*
 * Decompiled with CFR 0.152.
 */
public class eJs
extends ejr_0 {
    private static final aqr_2 y = new eFw(new eFv("Pas de param, on tp uniquement le caster", new eFu[0]), new eFv("On peut tp le propri\u00e9taire de la zone", new eFu("Tp owner : 0 = non (defaut), 1 = oui", eFx.c)), new eFv("Permet de tp un perso port\u00e9", new eFu("Tp owner : 0 = non (defaut), 1 = oui", eFx.c), new eFu("Tp carried : 0 = non (defaut), 1 = ou", eFx.c)), new eFv("Permet de tp un perso stabilis\u00e9", new eFu("Tp owner : 0 = non (defaut), 1 = oui", eFx.c), new eFu("Tp carried : 0 = non (defaut), 1 = oui", eFx.c), new eFu("Tp Forc\u00e9e (by pass stabilis\u00e9 et autres propri\u00e9t\u00e9) 0 = non (defaut), 1 = oui", eFx.c)), new eFv("Permet de tp sur une cellule bloquante", new eFu("Tp owner : 0 = non (defaut), 1 = oui", eFx.c), new eFu("Tp carried : 0 = non (defaut), 1 = oui", eFx.c), new eFu("Tp Forc\u00e9e (by pass stabilis\u00e9 et autres propri\u00e9t\u00e9) 0 = non (defaut), 1 = oui", eFx.c), new eFu("Verifie les cellules bloquantes 0 = non, 1 = oui (defaut)", eFx.c)));

    @Override
    public aqr_2 c_() {
        return y;
    }

    public eJs aM() {
        return eJs.a(null, null, null, null, null);
    }

    public static eJs a(So<efh_0> so, efh_0 efh_02, Su su, efi_0 efi_02, aff_1 aff_12) {
        eJs eJs2 = new eJs();
        eJs2.v = true;
        eJs2.h = so;
        eJs2.c = efh_02;
        eJs2.e = su;
        eJs2.d = efi_02;
        if (aff_12 != null) {
            eJs2.a(aff_12.d(), aff_12.e(), aff_12.f());
        }
        return eJs2;
    }

    @Override
    public void M() {
        super.M();
        this.c(197);
    }

    @Override
    protected Su aE() {
        boolean bl;
        if (this.c == null || ((efh_0)this.c).F() == 0) {
            return this.e;
        }
        boolean bl2 = bl = ((efh_0)this.c).a(0, this.aZ(), eFb.a) == 1;
        if (bl && this.e instanceof sr_0) {
            sr_0 sr_02 = (sr_0)this.e;
            Su su = sr_02.v();
            if (su != null) {
                return su;
            }
            a.error((Object)("On cherche a t\u00e9l\u00e9porter le propri\u00e9taire d'une zone d'effet mais celui-ci est inconnu " + sr_02.A()));
        }
        return this.e;
    }

    @Override
    public void j(sd_0 sd_02) {
        if (((efh_0)this.c).F() >= 3) {
            boolean bl = this.w = ((efh_0)this.c).a(2, this.aZ(), eFb.a) == 1;
        }
        if (((efh_0)this.c).F() >= 4) {
            this.x = ((efh_0)this.c).a(3, this.aZ(), eFb.a) == 1;
        }
        super.j(sd_02);
    }

    @Override
    protected boolean aG() {
        if (this.c == null) {
            return false;
        }
        if (((efh_0)this.c).F() < 2) {
            return false;
        }
        return ((efh_0)this.c).a(1, this.aZ(), eFb.a) == 1;
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    public /* synthetic */ ejr_0 aD() {
        return this.aM();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aM();
    }
}

