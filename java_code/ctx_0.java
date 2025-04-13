/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from cTx
 */
public class ctx_0
extends cUz {
    public ctx_0 e() {
        return new ctx_0();
    }

    @Override
    public boolean d() {
        boolean bl = super.d();
        bmr_1 bmr_12 = azu_0.j().k();
        byn_1 byn_12 = bmr_12.dE();
        if (!byn_12.d()) {
            return bl && this.p.isEmpty();
        }
        if (byn_12.c()) {
            return bl && this.p.isEmpty();
        }
        Optional<eet_0> optional = byu_1.a.a(this.t.n());
        if (optional.isEmpty()) {
            this.p.add(4);
        }
        return bl && this.p.isEmpty();
    }

    @Override
    protected void a(Tv tv, TF tF, pj_0 pj_02) {
        if (azu_0.j().c(dde_0.a())) {
            return;
        }
        if (azu_0.j().n().f()) {
            cbx_2.a();
            return;
        }
        short s2 = this.t.n();
        Optional<ezb_2> optional = ezd_2.a.a((long)s2);
        if (optional.isEmpty()) {
            b.error((Object)("[DUNGEON] No dungeon information found for worldId " + s2));
            return;
        }
        ezb_2 ezb_22 = optional.get();
        int n = ezb_22.a();
        if (eEF.b(n)) {
            evt_1 evt_12 = new evt_1(this.t);
            ((bfc_0)pj_02).a((TF)bzf_1.a(), evt_12);
            return;
        }
        if (ezb_22.g()) {
            dde_0.a().a(pj_02, this.t);
            return;
        }
        evt_1 evt_13 = new evt_1(this.t);
        ((bfc_0)pj_02).a((TF)bzf_1.a(), evt_13);
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

