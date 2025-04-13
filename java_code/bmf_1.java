/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bmF
 */
final class bmf_1
extends eqk_2 {
    private final qz_2 b;
    final /* synthetic */ bmr_1 a;

    bmf_1(bmr_1 bmr_12, qz_2 qz_22) {
        this.a = bmr_12;
        this.b = qz_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmr_1.eh().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void b() {
        this.a.dA = new fam_0();
        fas.a.a(this.a.dA, !this.a.a(enw_0.i));
        ArrayList<rc_1> arrayList = this.b.c;
        for (rc_1 rc_12 : arrayList) {
            this.a.dA.a(rc_12.a, wt_0.b(rc_12.b), wt_0.b(rc_12.c));
            this.a.dA.a(rc_12.a, rc_12.d);
            this.a.dA.a(rc_12.a, (wu_0)wt_0.b(rc_12.e));
        }
    }
}

