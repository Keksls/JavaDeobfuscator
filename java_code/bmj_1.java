/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmJ
 */
final class bmj_1
extends eqk_2 {
    private final sl_1 b;
    final /* synthetic */ bmr_1 a;

    bmj_1(bmr_1 bmr_12, sl_1 sl_12) {
        this.a = bmr_12;
        this.b = sl_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmr_1.ec().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void b() {
        this.a.cF = new bpk_0(this.a);
        this.a.cF.i().b(this.b.c);
    }
}

