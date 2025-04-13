/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmH
 */
final class bmh_2
extends eqk_2 {
    private final sb_2 b;
    final /* synthetic */ bmr_1 a;

    bmh_2(bmr_1 bmr_12, sb_2 sb_22) {
        this.a = bmr_12;
        this.b = sb_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmr_1.dV().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void b() {
        this.a.dj.a(this.b);
        this.a.dj.a(this.a.dN);
    }
}

