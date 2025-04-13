/*
 * Decompiled with CFR 0.152.
 */
class cWm
implements Runnable {
    private final fsQ b;
    private boolean c;
    private float d;
    private float e;
    private float f;
    private boolean g;
    final /* synthetic */ cwi_0 a;

    public cWm(cwi_0 cwi_02, fsQ fsQ2) {
        this.a = cwi_02;
        this.b = fsQ2;
        this.e = Hw.c(-((float)(Math.random() * (double)cwi_02.g.b())));
        cwi_02.a(this.b, this.e);
    }

    @Override
    public void run() {
        float f2;
        float f3 = this.b.getOffset();
        float f4 = f2 = this.c ? this.d : -this.d;
        if (this.f != 32767.0f) {
            boolean bl;
            if (this.c) {
                bl = this.b.getOffset() - this.e + f2 >= this.f;
            } else {
                boolean bl2 = bl = this.b.getOffset() - this.e + f2 <= this.f;
            }
            if (bl) {
                this.a(f3, f2, this.c);
                return;
            }
        }
        this.a.a(this.b, f3 + f2);
    }

    void a(short s2, boolean bl, float f2) {
        int n;
        this.g = false;
        this.e = s2 == Short.MAX_VALUE ? -((float)(Math.random() * (double)this.a.g.b())) : (float)Math.floor(this.b.getOffset());
        this.a.a(this.b, this.e);
        this.f = s2 == Short.MAX_VALUE ? (float)s2 : ((float)((n = this.b.size()) - s2) > Math.abs(this.e) % (float)n ? (bl ? (float)Hw.c((float)s2 - this.e % (float)n) : -((float)Hw.c((float)(n - s2) - Math.abs(this.e % (float)n)))) : (bl ? (float)Hw.c((float)n - this.e % (float)n + (float)s2) : -((float)Hw.c((float)(n + n - s2) - Math.abs(this.e) % (float)n))));
        this.c = bl;
        this.d = f2;
        ado_1.a().b(this);
        ado_1.a().a(this, 25L);
    }

    void a(short s2) {
        this.a.a(this.b, -this.b.size() + s2);
        ado_1.a().b(this);
        this.g = true;
        this.a.g();
    }

    private boolean a(float f2, float f3, boolean bl) {
        boolean bl2;
        int n;
        if (bl) {
            n = Hw.d(f2);
            bl2 = f2 + f3 >= (float)n;
        } else {
            n = Hw.c(f2);
            boolean bl3 = bl2 = f2 + f3 <= (float)n;
        }
        if (bl2) {
            this.a.a(this.b, n);
            ado_1.a().b(this);
            this.g = true;
            this.a.g();
            return true;
        }
        return false;
    }

    public boolean a() {
        return this.g;
    }

    public void a(boolean bl, float f2) {
        this.a((short)Short.MAX_VALUE, bl, f2);
    }
}

