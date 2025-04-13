/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUB
 */
public class cub_0
extends cUz {
    public cub_0 e() {
        return new cub_0();
    }

    @Override
    public boolean d() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (!this.b(bmr_12)) {
            this.p.add(1);
            return false;
        }
        return super.d() && this.p.isEmpty();
    }

    @Override
    protected void a(Tv tv, TF tF, pj_0 pj_02) {
        ((bfc_0)pj_02).a(tF, this.t);
    }

    @Override
    public /* synthetic */ cSX b() {
        return this.e();
    }

    @Override
    public /* synthetic */ cSS v() {
        return this.e();
    }
}

