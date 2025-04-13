/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmE
 */
final class bme_2
extends eqk_2 {
    private final qr_2 b;
    final /* synthetic */ bmr_1 a;

    bme_2(bmr_1 bmr_12, qr_2 qr_22) {
        this.a = bmr_12;
        this.b = qr_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmr_1.dY().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void b() {
        this.a.dk.b(this.b);
    }
}

