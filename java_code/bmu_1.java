/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmu
 */
final class bmu_1
extends eqk_2 {
    private final or_0 b;
    final /* synthetic */ bmr_1 a;

    bmu_1(bmr_1 bmr_12, or_0 or_02) {
        this.a = bmr_12;
        this.b = or_02;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmr_1.el().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void b() {
        emg_0 emg_02 = this.a.N_();
        emw_0.a.a(bmr_1.f(this.a), emg_02);
        emg_02.b(this.b);
        fis_1.a().a("subscribedAccount", emj_0.a.a(new emh_0[]{this.a}));
        fis_1.a().a("subscribedZoneAccount", emj_0.b.a(new emh_0[]{this.a}));
        fis_1.a().a("politicInteractionRight", this.a.a(enw_0.m));
        fis_1.a().a((ajf_1)this.a, "isInSubscriberZone");
        enu_0 enu_02 = emg_02.c();
        enu_0 enu_03 = enu_0.a(enu_02.d());
        fis_1.a().a("freeSubscriptionLevel", enu_03 == enu_02);
        this.a.N_().b(this.b.m);
    }
}

