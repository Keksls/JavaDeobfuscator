/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTC
 */
public class ctc_0
extends cSS {
    protected cSS a() {
        return new ctc_0();
    }

    @Override
    public cSS v() {
        return new ctc_0();
    }

    @Override
    public boolean c() {
        if (this.l == null) {
            return false;
        }
        if (!(this.l instanceof bnh_1)) {
            return false;
        }
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
        if (!this.c()) {
            b.error((Object)("Tentative de lancement de l'action '" + this.n().e() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        bnh_1 bnh_12 = (bnh_1)this.l;
        blf_1.b(bnh_12, (blo_0)ble_1.E());
    }

    @Override
    public cSY n() {
        return cSY.t;
    }

    @Override
    public String r() {
        return "followCharacterWithCompass";
    }

    @Override
    protected int t() {
        return cUL.v.aH;
    }
}

