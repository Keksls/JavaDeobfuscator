/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bne
 */
final class bne_1
extends eqk_2 {
    private final tt_1 b;
    final /* synthetic */ bmv_1 a;

    bne_1(bmv_1 bmv_12, tt_1 tt_12) {
        this.a = bmv_12;
        this.b = tt_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmv_1.dm().error((Object)"Le client ne devrait pas s\u00e9rialiser les donn\u00e9es sp\u00e9cifiques templates NPC");
    }

    @Override
    public void b() {
        this.a.ay = this.b.c;
        this.a.ax = this.b.d;
    }
}

