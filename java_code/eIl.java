/*
 * Decompiled with CFR 0.152.
 */
public final class eIl
extends eHV {
    private static final aqr_2 v = new eFw(new eFv("Calcul le niveau des effets du groupe en fonction du cout du sort d\u00e9clenchant", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c), new eFu("Niveau par PA", eFx.c), new eFu("Niveau par PM", eFx.c), new eFu("Niveau par PW", eFx.c)));
    private float C = 0.0f;
    private float D = 0.0f;
    private float E = 0.0f;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eIl() {
        this.M();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        super.b(sd_02, bl);
    }

    public eIl aD() {
        return new eIl();
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        super.j(sd_02);
        this.C = ((efh_0)this.c).a(6, this.aZ());
        this.D = ((efh_0)this.c).a(7, this.aZ());
        this.E = ((efh_0)this.c).a(8, this.aZ());
    }

    @Override
    public efn_0 a(ejh_0 ejh_02, boolean bl) {
        efn_0 efn_02 = super.a(ejh_02, bl);
        if (ejh_02 == null) {
            a.error((Object)"Unable to execute a RunningEffectGroupLevelFunctionTriggeringSpell without triggering effect");
            efn_02.a(0);
            return efn_02;
        }
        if (ejh_02.e(500)) {
            this.a(efn_02, (fio_0)this.h.i().e(), this.h.i().d());
            return efn_02;
        }
        efi_0 efi_02 = (efi_0)ejh_02.k();
        if (efi_02 == null) {
            a.error((Object)("Unable to execute a RunningEffectGroupLevelFunctionTriggeringSpell when the triggering effect has no container. Effect id : " + ((efh_0)ejh_02.f()).i()));
            efn_02.a(0);
            return efn_02;
        }
        if (efi_02.G_() != 11) {
            a.error((Object)("Unable to execute a RunningEffectGroupLevelFunctionTriggeringSpell when the triggering effect container is not a spell. Effect id : " + ((efh_0)ejh_02.f()).i() + " ContainerType : " + efi_02.G_() + " Container ID : " + efi_02.aS_() + " Concerned effect group : " + this.o()));
            efn_02.a(0);
            return efn_02;
        }
        short s2 = ejh_02.aZ();
        this.a(efn_02, (fio_0)efi_02, s2);
        return efn_02;
    }

    private void a(efn_0 efn_02, fio_0 fio_02, short s2) {
        Object Spell = fio_02.r();
        int n = ((fin_0)Spell).a((int)s2);
        int n2 = ((fin_0)Spell).d(s2);
        int n3 = ((fin_0)Spell).b((int)s2);
        float f2 = (float)n * this.C + (float)n2 * this.D + (float)n3 * this.E;
        efn_02.a(Math.round(f2));
    }

    @Override
    public void z() {
        super.z();
    }

    @Override
    public /* synthetic */ eHV aE() {
        return this.aD();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

