/*
 * Decompiled with CFR 0.152.
 */
public class cSZ
extends cSS {
    @Override
    public cSY n() {
        return cSY.I;
    }

    @Override
    public void o() {
        bnh_1 bnh_12 = (bnh_1)this.l;
        aUG.a(bnh_12.dp());
    }

    @Override
    public boolean d() {
        if (!super.d()) {
            return false;
        }
        if (!(this.l instanceof bnh_1)) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        return bmr_12 != null;
    }

    @Override
    public boolean c() {
        if (!(this.l instanceof bnh_1)) {
            return false;
        }
        bnh_1 bnh_12 = (bnh_1)this.l;
        return aUL.a().e().a(bnh_12.U_()) == null;
    }

    @Override
    public String r() {
        return "addToFriendList";
    }

    @Override
    public String q() {
        if (!(this.l instanceof bnh_1)) {
            return null;
        }
        return bae.h().a("desc.mru." + this.r(), ((bnh_1)this.l).dp());
    }

    @Override
    public cSS v() {
        return new cSZ();
    }

    @Override
    protected int t() {
        return cUL.q.aH;
    }
}

