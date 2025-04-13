/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnJ
 */
final class bnj_2
extends eqk_2 {
    private final te_1 b;
    final /* synthetic */ bnh_1 a;

    bnj_2(bnh_1 bnh_12, te_1 te_12) {
        this.a = bnh_12;
        this.b = te_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bnh_1.fp().error((Object)"L'xp ne devrait pas \u00e9tre s\u00e9rialis\u00e9e par le client.");
    }

    @Override
    public void b() {
        this.a.i(this.b.c);
    }
}

