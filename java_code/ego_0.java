/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGo
 */
public final class ego_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("D\u00e9faut", new eFu("Id de la propri\u00e9t\u00e9", eFx.b)));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public ego_0() {
        this.M();
    }

    @Override
    public sd_0<efh_0, efi_0> x() {
        ego_0 ego_02 = new ego_0();
        ego_02.m = this.m;
        return ego_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        boolean bl2;
        if (this.f == null) {
            this.j(true);
            return;
        }
        if (!(this.f instanceof epq_2)) {
            a.error((Object)("Can not ApplyWorldProperty " + this.m + "on something else than BasicCharacterInfo"));
            this.j(true);
            return;
        }
        erl_2 erl_22 = erl_2.a(this.m);
        if (erl_22 == null) {
            this.j(true);
            return;
        }
        eoz_1 eoz_12 = erl_22.c();
        boolean bl3 = bl2 = this.m().h() == 1;
        if (bl2 && eoz_12 != null) {
            this.f.c(eoz_12);
        }
        this.f.c(erl_22);
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
        erl_2 erl_22 = erl_2.a(this.m);
        if (erl_22 == null) {
            return;
        }
        eoz_1 eoz_12 = erl_22.c();
        if (eoz_12 != null) {
            this.f.d(eoz_12);
        }
        this.f.d(erl_22);
    }
}

