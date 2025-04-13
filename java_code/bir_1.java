/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bIR
 */
class bir_1
implements bhv {
    final /* synthetic */ exk_2 b;
    final /* synthetic */ biq_1 c;

    bir_1(biq_1 biq_12, exk_2 exk_22) {
        this.c = biq_12;
        this.b = exk_22;
    }

    @Override
    public void a(bhu bhu2, long l) {
        this.c.h = l;
        this.c.a(this.b.a());
    }

    @Override
    public boolean a() {
        return false;
    }
}

