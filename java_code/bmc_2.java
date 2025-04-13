/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmC
 */
final class bmc_2
extends eqk_2 {
    private final qk_1 b;
    final /* synthetic */ bmr_1 a;

    bmc_2(bmr_1 bmr_12, qk_1 qk_12) {
        this.a = bmr_12;
        this.b = qk_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmr_1.em().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void b() {
        this.a.df = this.b.c;
    }
}

