/*
 * Decompiled with CFR 0.152.
 */
public final class eGk
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("D\u00e9faut", new eFu("Id de la propri\u00e9t\u00e9", eFx.b)));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eGk() {
        this.M();
    }

    @Override
    public sd_0<efh_0, efi_0> x() {
        eGk eGk2 = new eGk();
        eGk2.m = this.m;
        return eGk2;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null) {
            this.j(true);
            return;
        }
        if (!(this.f instanceof sr_0)) {
            a.error((Object)("Can not ApplyEffectAreaProperty " + this.m + " on something else than BasicEffectArea (target=" + this.f + " ; caster=" + this.e + ")"));
            this.j(true);
            return;
        }
        eld_0 eld_02 = eld_0.a(this.m);
        if (eld_02 == null) {
            this.j(true);
            return;
        }
        this.f.c(eld_02);
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
    public void j(sd_0 sd_02) {
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
    }

    @Override
    public void al() {
        if (this.f == null) {
            return;
        }
        eld_0 eld_02 = eld_0.a(this.m);
        if (eld_02 == null) {
            return;
        }
        this.f.e(eld_02);
    }
}

