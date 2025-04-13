/*
 * Decompiled with CFR 0.152.
 */
public class cUq
extends cto_0 {
    public static final int a = 0;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 3;
    public static final int p = 4;
    private int q;

    public cUq b() {
        return new cUq();
    }

    @Override
    public boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.be()) {
            return false;
        }
        return super.c();
    }

    @Override
    public boolean d() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (!emj_0.b.a(new emh_0[]{bmr_12})) {
            this.q = 3;
            return false;
        }
        beo_0 beo_02 = (beo_0)this.l;
        fhT fhT2 = bmr_12.cV();
        if (fhT2.a((int)beo_02.a_())) {
            this.q = 1;
            return false;
        }
        if (bmr_12.fE().s()) {
            this.q = 2;
            return false;
        }
        this.q = 0;
        return true;
    }

    @Override
    public String q() {
        String string = super.q();
        if (this.d()) {
            return string;
        }
        ani_2 ani_22 = new ani_2().a((CharSequence)string).m();
        ani_22.a(h);
        switch (this.q) {
            case 3: {
                ani_22.a((CharSequence)bae.h().a("error.playerNotSubscribed", new Object[0]));
                break;
            }
            case 1: {
                ani_22.a((CharSequence)bae.h().a("desc.mru.phoenixAlreadyBound", new Object[0]));
                break;
            }
            case 2: {
                ani_22.a((CharSequence)bae.h().a("phoenix.forbidden.on.enemy.territory", new Object[0]));
                break;
            }
            case 4: {
                ani_22.a((CharSequence)bae.h().a("havenWorldForbidden", new Object[0]));
            }
        }
        return ani_22.r();
    }

    @Override
    public /* synthetic */ cSS v() {
        return this.b();
    }
}

