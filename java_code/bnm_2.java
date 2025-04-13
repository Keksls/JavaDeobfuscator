/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnm
 */
final class bnm_2
extends eqk_2 {
    private final rm_2 b;
    final /* synthetic */ bnh_1 a;

    bnm_2(bnh_1 bnh_12, rm_2 rm_22) {
        this.a = bnh_12;
        this.b = rm_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bnh_1.fx().error((Object)"[NATION] Pas de s\u00e9rialization de la nation ID dans le client (SERVER => CLIENT)", (Throwable)new UnsupportedOperationException());
    }

    @Override
    public void b() {
        bmp_1.a().a((blx_1)this.a, this.b.c);
    }
}

