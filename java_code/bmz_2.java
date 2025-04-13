/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmZ
 */
final class bmz_2
extends eqk_2 {
    private final tl_1 b;
    final /* synthetic */ bmv_1 a;

    bmz_2(bmv_1 bmv_12, tl_1 tl_12) {
        this.a = bmv_12;
        this.b = tl_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmv_1.dh().error((Object)"Le client ne devrait pas s\u00e9rialiser les caract\u00e9ristiques");
    }

    @Override
    public void b() {
        this.a.aq = this.b.c;
    }
}

