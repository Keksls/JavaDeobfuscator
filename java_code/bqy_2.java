/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bqy
 */
public final class bqy_2
extends eqk_2 {
    private final py_1 a;
    private final bnh_1 b;

    public bqy_2(py_1 py_12, bnh_1 bnh_12) {
        this.a = py_12;
        this.b = bnh_12;
        this.a.a().a(this);
    }

    @Override
    public void a() {
        throw new UnsupportedOperationException("Client can not send this part");
    }

    @Override
    public void b() {
        uc_2 uc_22 = this.a.c.a;
        if (uc_22 == null) {
            return;
        }
        this.b.aO();
        bok_1.a(this.b);
        this.b.l(uc_22.a);
        this.b.s(uc_22.b);
        this.b.m(uc_22.c);
        this.b.a(uc_22.f);
        this.b.n(uc_22.d);
        this.b.e(uc_22.e);
        bok_1.b(this.b);
        this.b.aP();
    }
}

