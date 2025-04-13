/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmz
 */
final class bmz_1
extends eqk_2 {
    private final pq_1 a;

    bmz_1(pq_1 pq_12) {
        this.a = pq_12;
        this.a.a().a(this);
    }

    @Override
    public void a() {
        bmr_1.eg().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void b() {
        blc_2.a().a(this.a.c);
    }
}

