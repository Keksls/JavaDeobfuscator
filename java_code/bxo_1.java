/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxO
 */
public class bxo_1 {
    private long a;
    private short b = 1;
    private short c = 1;
    private azj_2 d;
    private azj_2 e;

    public bxo_1(short s2, short s3, azj_2 azj_22, azj_2 azj_23) {
        this.b = s2;
        this.c = s3;
        this.e = azj_22;
        this.d = azj_23;
        this.a = this.i();
    }

    public bxo_1(eqd_2 eqd_22) {
        this(eqd_22.a(), eqd_22.c(), bxm_1.a().a(eqd_22.d()), bxm_1.a().a(eqd_22.b()));
    }

    public short a() {
        return this.b;
    }

    public void a(short s2) {
        this.b = s2;
        this.a = this.i();
    }

    public short b() {
        return this.c;
    }

    public void b(short s2) {
        this.c = s2;
        this.a = this.i();
    }

    public azj_2 c() {
        return this.e;
    }

    public void a(azj_2 azj_22) {
        if (this.e == azj_22) {
            return;
        }
        this.e = azj_22;
        this.a = this.i();
    }

    public azj_2 d() {
        return this.d;
    }

    public void b(azj_2 azj_22) {
        if (this.d == azj_22) {
            return;
        }
        this.d = azj_22;
        this.a = this.i();
    }

    public void e() {
    }

    public String f() {
        return "generatedGuildBanner-" + this.b + "-" + this.c + "-" + this.e.i() + "-" + this.d.i();
    }

    private long i() {
        return auc_1.d(this.f());
    }

    public long g() {
        return this.a;
    }

    public eqd_2 h() {
        short s2 = bxm_1.a().a(this.d);
        short s3 = bxm_1.a().a(this.e);
        return new eqd_2(this.b, s2, this.c, s3);
    }
}

