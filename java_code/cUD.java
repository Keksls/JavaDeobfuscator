/*
 * Decompiled with CFR 0.152.
 */
public class cUD
extends cSS {
    private bsx_2 a;
    private byte m;

    public cUD(bsx_2 bsx_22, byte by) {
        this.a = bsx_22;
        this.m = by;
    }

    @Override
    public cSS v() {
        return new cUD(this.a, this.m);
    }

    public cUD() {
    }

    @Override
    public boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.cW()) {
            return false;
        }
        if (bmr_12.ak()) {
            return false;
        }
        return !bvz_2.a.a();
    }

    @Override
    public void o() {
        b.error((Object)"MRUUpgradeDimmensionalBagRoomAction.run()");
    }

    @Override
    public cSY n() {
        return cSY.l;
    }

    @Override
    public String r() {
        return "bagUpgrade";
    }

    @Override
    protected int t() {
        return cUL.C.aH;
    }
}

