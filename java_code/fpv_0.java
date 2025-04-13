/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fpV
 */
class fpv_0
implements adv_1 {
    private fil_1 a;
    private fvE b;

    fpv_0() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (this.a != null && this.b != null) {
            this.a.b(this.b);
        }
        return false;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    public fil_1 a() {
        return this.a;
    }

    public void a(fil_1 fil_12) {
        this.a = fil_12;
    }

    public fvE c() {
        return this.b;
    }

    public void a(fvE fvE2) {
        this.b = fvE2;
    }
}

