/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmG
 */
final class bmg_1
extends eqk_2 {
    private final rp_1 b;
    final /* synthetic */ bmr_1 a;

    bmg_1(bmr_1 bmr_12, rp_1 rp_12) {
        this.a = bmr_12;
        this.b = rp_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmr_1.dZ().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void b() {
        this.a.dl.b(this.b.c);
    }
}

