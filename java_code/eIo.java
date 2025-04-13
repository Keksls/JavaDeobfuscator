/*
 * Decompiled with CFR 0.152.
 */
public final class eIo
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Transmet 100% de la valeur", new eFu[0]), new eFv("% Param\u00e9tr\u00e9", new eFu("% transmis (defaut = 100)", eFx.c)), new eFv("Valeur min pour le second effet", new eFu("% transmis (defaut = 100)", eFx.c), new eFu("valeur min du second effet (defaut = 0)", eFx.c)), new eFv("Caster ou target pour le second effet", new eFu("% transmis (defaut = 100)", eFx.c), new eFu("valeur min du second effet (defaut = 0)", eFx.c), new eFu("Cible du second effet, 0=caster (defaut) 1=target", eFx.c)), new eFv("Type d'arrondi", new eFu("% transmis (defaut = 100)", eFx.c), new eFu("valeur min du second effet (defaut = 0)", eFx.c), new eFu("Cible du second effet, 0=caster (defaut) 1=target", eFx.c), new eFu("Arrondi du second effet (-1=inferieur, 0=random (default), 1=(sup\u00e9rieur)", eFx.c)));
    private int w;
    private int x;
    final int[] y = new int[1];
    private int z;
    private boolean A;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eIo() {
        this.M();
    }

    public eIo aD() {
        return new eIo();
    }

    @Override
    public void j(sd_0 sd_02) {
        this.w = 100;
        this.x = 0;
        this.z = 0;
        this.A = true;
        if (this.c == null) {
            return;
        }
        if (((efh_0)this.c).F() >= 1) {
            this.w = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        }
        if (((efh_0)this.c).F() >= 2) {
            this.z = ((efh_0)this.c).a(1, this.aZ(), eFb.a);
        }
        if (((efh_0)this.c).F() >= 3) {
            boolean bl = this.A = ((efh_0)this.c).a(2, this.aZ(), eFb.a) == 0;
        }
        if (((efh_0)this.c).F() >= 4) {
            this.x = ((efh_0)this.c).a(3, this.aZ(), eFb.a);
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        int n;
        if (!this.D()) {
            return;
        }
        if (this.c == null) {
            this.ba();
            return;
        }
        fil_0 fil_02 = fim_0.a().a(((efh_0)this.c).i());
        if (fil_02 == null) {
            a.error((Object)("Groupe d'effet inconnu" + ((efh_0)this.c).i()));
            this.ba();
            return;
        }
        if (fil_02.i() != 2) {
            a.error((Object)("On ne peut pas avoir plus ou moins de deux effets dans un groupe d'effet de ce type " + ((efh_0)this.c).i()));
            this.ba();
            return;
        }
        this.y[0] = 0;
        efn_0 efn_02 = this.a((ejh_0)sd_02, true);
        if (this.a(eff_0.o) && efn_02.g() == -1) {
            efn_02.a(this.aZ());
        }
        efh_0 efh_02 = fil_02.b(0);
        efh_02.a((Sm)this.k(), this.h(), this.m(), efc_0.a(), this.f.G(), this.f.H(), this.f.I(), this.f, efn_02, false);
        int n2 = this.y[0];
        if (n2 == 0) {
            return;
        }
        efh_0 efh_03 = fil_02.b(1);
        if (this.f instanceof ekd_0 && efh_03.i() == 101395) {
            return;
        }
        switch (this.x) {
            case -1: {
                n = Hw.c((float)(n2 * this.w) / 100.0f);
                break;
            }
            case 0: {
                n = xh_0.a((float)(n2 * this.w) / 100.0f);
                break;
            }
            case 1: {
                n = Hw.d((float)(n2 * this.w) / 100.0f);
                break;
            }
            default: {
                n = xh_0.a((float)(n2 * this.w) / 100.0f);
            }
        }
        int n3 = Math.max(n, this.z);
        efn_02.b(n3);
        Su su = this.A ? this.h() : this.i();
        efh_03.a((Sm)this.k(), this.h(), this.m(), efc_0.a(), this.f.G(), this.f.H(), this.f.I(), su, efn_02, false);
        efn_02.a();
    }

    private efn_0 a(ejh_0 ejh_02, boolean bl) {
        efn_0 efn_02 = efn_0.a(bl, false, ejh_02);
        efn_02.a(false);
        efn_02.a(new eIp(this, efn_02));
        return efn_02;
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
    public void z() {
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

