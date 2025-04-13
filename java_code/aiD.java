/*
 * Decompiled with CFR 0.152.
 */
public abstract class aiD {
    private final azj_2 d;
    private final azj_2 e;
    private final long f;
    protected final float[] a;
    protected boolean b;
    protected long c;

    protected aiD(azj_2 azj_22, azj_2 azj_23, long l) {
        this.d = azj_22;
        this.e = azj_23;
        this.f = l;
        this.b = true;
        this.c = 0L;
        this.a = new float[3];
        this.a[0] = this.d.q();
        this.a[1] = this.d.r();
        this.a[2] = this.d.s();
    }

    public boolean a() {
        azj_2 azj_22 = this.b ? this.e : this.d;
        return this.a[0] != azj_22.q() || this.a[1] != azj_22.r() || this.a[2] != azj_22.s();
    }

    public void b(int n) {
        if (!this.a()) {
            return;
        }
        this.c += (long)n;
        float f2 = (float)this.c / (float)this.f;
        if (f2 >= 1.0f) {
            if (this.b) {
                this.a[0] = this.e.q();
                this.a[1] = this.e.r();
                this.a[2] = this.e.s();
            } else {
                this.a[0] = this.d.q();
                this.a[1] = this.d.r();
                this.a[2] = this.d.s();
            }
            return;
        }
        if (this.b) {
            this.a[0] = Hw.a(this.d.q(), this.e.q(), f2);
            this.a[1] = Hw.a(this.d.r(), this.e.r(), f2);
            this.a[2] = Hw.a(this.d.s(), this.e.s(), f2);
        } else {
            this.a[0] = Hw.a(this.e.q(), this.d.q(), f2);
            this.a[1] = Hw.a(this.e.r(), this.d.r(), f2);
            this.a[2] = Hw.a(this.e.s(), this.d.s(), f2);
        }
    }

    public void b() {
        this.b = true;
        this.c = 0L;
    }

    public void c() {
        this.b = false;
        this.c = 0L;
    }
}

