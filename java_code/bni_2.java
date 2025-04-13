/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnI
 */
final class bni_2
extends eqk_2 {
    private final tc_1 b;
    final /* synthetic */ bnh_1 a;

    bni_2(bnh_1 bnh_12, tc_1 tc_12) {
        this.a = bnh_12;
        this.b = tc_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bnh_1.fq().error((Object)"L'xp ne devrait pas \u00e9tre s\u00e9rialis\u00e9e par le client.");
    }

    @Override
    public void b() {
        this.a.i(this.b.c);
    }
}

