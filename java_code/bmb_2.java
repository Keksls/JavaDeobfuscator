/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmB
 */
final class bmb_2
extends eqk_2 {
    private final qu_1 b;
    final /* synthetic */ bmr_1 a;

    bmb_2(bmr_1 bmr_12, qu_1 qu_12) {
        this.a = bmr_12;
        this.b = qu_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmr_1.dX().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void b() {
        ((bot_2)this.a.eV()).a(bmr_1.a(this.a), this.b.c);
        ((bot_2)this.a.eV()).a(this.b.d);
        this.a.bI();
    }
}

