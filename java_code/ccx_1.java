/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ccx
 */
abstract class ccx_1
extends ccg_1 {
    private aoe_0 b;

    ccx_1() {
    }

    @Override
    public void a(ahm ahm2) {
        this.b = aoe_0.a((abu)ahm2, this.a(), "blason", "blason_bg");
    }

    @Override
    public void b(ahm ahm2) {
        if (this.b != null) {
            this.b.a();
            this.b = null;
        }
    }

    protected abstract long a();
}

