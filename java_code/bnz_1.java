/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnz
 */
final class bnz_1
extends eqk_2 {
    private final ro_1 b;
    final /* synthetic */ bnh_1 a;

    bnz_1(bnh_1 bnh_12, ro_1 ro_12) {
        this.a = bnh_12;
        this.b = ro_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bnh_1.fz().error((Object)"[NATION] Pas de s\u00e9rialization de la nation PUBLIC dans le client pour l'instant", (Throwable)new UnsupportedOperationException());
    }

    @Override
    public void b() {
        bUH bUH2 = (bUH)this.a.fE();
        bUH2.a(fgY.a(this.b.c));
        bUH2.a(this.b.d);
        bUH2.h();
    }
}

