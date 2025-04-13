/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmw
 */
final class bmw_1
extends eqk_2 {
    private final pa_1 b;
    final /* synthetic */ bmr_1 a;

    bmw_1(bmr_1 bmr_12, pa_1 pa_12) {
        this.a = bmr_12;
        this.b = pa_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmr_1.ei().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void b() {
        pc_2 pc_22 = this.b.c;
        if (pc_22 == null) {
            this.a.dI.b(false);
        } else {
            eza_1 eza_12 = eyz_2.a(this.a.dI.d(), this.a.dI.c(), wc_0.p().a());
            this.a.dI.b(true);
            this.a.dI.a(wt_0.b(pc_22.a));
            this.a.dI.a(ww_0.b(pc_22.b));
            eza_1 eza_13 = eyz_2.a(this.a.dI.d(), this.a.dI.c(), wc_0.p().a());
            bkk_1.a(eza_13);
        }
    }
}

