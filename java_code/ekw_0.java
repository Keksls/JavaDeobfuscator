/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eKW
 */
final class ekw_0 {
    private final eki_0 a;
    private erb_2 b;

    ekw_0(eki_0 eki_02) {
        this.a = eki_02;
    }

    public boolean a() {
        return false;
    }

    public boolean a(erb_2 erb_22) {
        return erb_22.cl() == this.a.v();
    }

    public boolean b() {
        return this.b != null;
    }

    public void b(erb_2 erb_22) {
        this.b = erb_22;
        tg_0 tg_02 = this.a.O().e();
        if (tg_02 != null && this.a.aa()) {
            tg_02.a(this.a, false);
        }
    }

    public void c() {
        this.b = null;
        this.a.hE();
    }

    public erb_2 d() {
        return this.b;
    }
}

