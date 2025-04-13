/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from epw
 */
final class epw_2
extends eqk_2 {
    private final rx_2 b;
    final /* synthetic */ epq_2 a;

    epw_2(epq_2 epq_22, rx_2 rx_22) {
        this.a = epq_22;
        this.b = rx_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        if (this.a.g != null) {
            this.b.c = new sa_1();
            this.a.g.a(this.b.c.a);
        } else {
            this.b.c = null;
        }
    }

    @Override
    public void b() {
        if (this.b.c != null) {
            if (this.a.g == null) {
                this.a.g = eri_2.a((byte)1, this.a);
            }
            this.a.g.b(this.b.c.a);
        } else if (this.a.g != null) {
            this.a.g = null;
        }
    }
}

