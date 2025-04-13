/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from beU
 */
class beu_2
implements asb_2<aSj> {
    final /* synthetic */ bet_2 a;

    beu_2(bet_2 bet_22) {
        this.a = bet_22;
    }

    public void a(aSj aSj2) {
        int n = aSj2.c();
        short s2 = aSj2.d();
        int n2 = aSj2.e();
        int n3 = aSj2.f();
        byte by = aSj2.g();
        int n4 = aSj2.h();
        int n5 = aSj2.i();
        this.a.a.a(n, s2, n2, by, n3, n4, n5);
        if (bet_2.b.isTraceEnabled()) {
            bet_2.b.trace((Object)("Loaded view id=" + n + " type=" + s2 + " gfx=" + n2 + " color=" + n3 + " height=" + by));
        }
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aSj)asu_22);
    }
}

