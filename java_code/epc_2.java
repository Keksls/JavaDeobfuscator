/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from epC
 */
final class epc_2
extends eqk_2 {
    private final rx_2 b;
    final /* synthetic */ epq_2 a;

    epc_2(epq_2 epq_22, rx_2 rx_22) {
        this.a = epq_22;
        this.b = rx_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        if (this.a.h != null) {
            this.b.c = new sa_1();
            this.a.h.a(this.b.c.a);
        } else {
            this.b.c = null;
        }
    }

    @Override
    public void b() {
        if (this.b.c != null) {
            if (this.a.h == null) {
                this.a.h = eri_2.a((byte)0, this.a);
            }
            this.a.h.b(this.b.c.a);
        } else if (this.a.h != null) {
            this.a.h = null;
        }
    }
}

