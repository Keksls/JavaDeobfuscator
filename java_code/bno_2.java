/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bno
 */
final class bno_2
extends eqk_2 {
    private final pb_2 b;
    final /* synthetic */ bnh_1 a;

    bno_2(bnh_1 bnh_12, pb_2 pb_22) {
        this.a = bnh_12;
        this.b = pb_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        if (this.b.c == null) {
            this.b.c = new pe_1();
        }
    }

    @Override
    public void b() {
        if (this.b.c != null) {
            this.a.am = this.b.c.b;
            this.a.an = this.b.c.c;
        }
    }
}

