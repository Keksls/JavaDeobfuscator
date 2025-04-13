/*
 * Decompiled with CFR 0.152.
 */
abstract class eJC
extends ejh_0 {
    private int v;
    private int w;
    private int x;

    eJC() {
    }

    protected int aF() {
        return this.v;
    }

    protected int aG() {
        return this.w;
    }

    protected int aM() {
        return this.x;
    }

    protected abstract boolean aE();

    @Override
    protected void a(ejh_0 ejh_02) {
        this.v = 0;
        this.w = 0;
        this.x = 0;
        fil_0 fil_02 = fim_0.a().a(((efh_0)this.c).i());
        if (fil_02 == null) {
            a.error((Object)("Groupe d'effet inconnu" + ((efh_0)this.c).i()));
            this.ba();
            return;
        }
        efn_0 efn_02 = this.a(ejh_02, this.aE());
        if (this.a(eff_0.o) && efn_02.g() == -1) {
            efn_02.a(this.aZ());
        }
        for (efh_0 efh_02 : fil_02) {
            Ss ss = null;
            if (this.R()) {
                ss = efh_02.a((Sm)this.k(), this.h(), this.m(), efc_0.a(), this.f.G(), this.f.H(), this.f.I(), this.f, efn_02, true);
            } else if (this.S()) {
                ss = efh_02.a((Sm)this.k(), this.h(), this.m(), efc_0.a(), this.g.d(), this.g.e(), this.g.f(), null, efn_02, true);
            } else {
                a.error((Object)("Pas de type de cible d\u00e9fini, on n'execute pas le groupe d'effet " + this.o()));
            }
            if (ss != null) {
                ++this.v;
                this.x += ss.e();
                if (ss.e() == 0) {
                    ++this.w;
                }
            }
            if (ss == null) continue;
            ss.f();
        }
        efn_02.a();
    }

    protected void a(ejh_0 ejh_02, Su su) {
        this.v = 0;
        this.w = 0;
        this.x = 0;
        fil_0 fil_02 = fim_0.a().a(((efh_0)this.c).i());
        if (fil_02 == null) {
            a.error((Object)("Groupe d'effet inconnu" + ((efh_0)this.c).i()));
            this.ba();
            return;
        }
        efn_0 efn_02 = this.a(ejh_02, true);
        if (this.a(eff_0.o) && efn_02.g() == -1) {
            efn_02.a(this.aZ());
        }
        for (efh_0 efh_02 : fil_02) {
            Ss ss = efh_02.a((Sm)this.k(), this.h(), this.m(), efc_0.a(), su.G(), su.H(), su.I(), su, efn_02, false);
            if (ss == null) continue;
            ++this.v;
            this.x += ss.e();
            if (ss.e() != 0) continue;
            ++this.w;
        }
        efn_02.a();
    }

    public efn_0 a(ejh_0 ejh_02, boolean bl) {
        efn_0 efn_02 = efn_0.a(bl, false, ejh_02);
        efn_02.a(false);
        return efn_02;
    }
}

