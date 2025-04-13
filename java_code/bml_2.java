/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmL
 */
final class bml_2
extends eqk_2 {
    private final rr_1 b;
    final /* synthetic */ bmr_1 a;

    bml_2(bmr_1 bmr_12, rr_1 rr_12) {
        this.a = bmr_12;
        this.b = rr_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmr_1.ej().error((Object)("[NATION] " + this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void b() {
        faV faV2 = this.a.fE();
        faV2.a(this.b.c);
    }
}

