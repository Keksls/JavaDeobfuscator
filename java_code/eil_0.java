/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eIL
 */
public final class eil_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Id de team", new eFu("Id de team", eFx.b)));
    private byte w;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eil_0() {
        this.M();
    }

    public eil_0 aD() {
        eil_0 eil_02 = new eil_0();
        return eil_02;
    }

    @Override
    public void j(sd_0 sd_02) {
        this.m = -1;
        this.w = (byte)-1;
        if (this.c == null) {
            return;
        }
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null) {
            this.ba();
            return;
        }
        if (this.m == -1) {
            this.ba();
            return;
        }
        if (!(this.f instanceof app_2)) {
            this.ba();
            return;
        }
        this.w = ((app_2)((Object)this.f)).Y();
        ((app_2)((Object)this.f)).b((byte)this.m);
    }

    @Override
    public void al() {
        if (this.w < 0 && !(this.f instanceof app_2)) {
            return;
        }
        ((app_2)((Object)this.f)).b(this.w);
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
        this.w = (byte)-1;
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

