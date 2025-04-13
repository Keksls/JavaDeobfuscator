/*
 * Decompiled with CFR 0.152.
 */
class ftS
implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ float b;
    final /* synthetic */ short c;
    final /* synthetic */ float d;
    final /* synthetic */ int e;
    final /* synthetic */ ftR f;

    ftS(ftR ftR2, boolean bl, float f2, short s2, float f3, int n) {
        this.f = ftR2;
        this.a = bl;
        this.b = f2;
        this.c = s2;
        this.d = f3;
        this.e = n;
    }

    @Override
    public void run() {
        float f2;
        if (this.f.c.isUnloading()) {
            return;
        }
        float f3 = this.f.c.getOffset();
        float f4 = f2 = this.a ? this.b : -this.b;
        if (this.f.a.i && this.a(f3, f2, this.a)) {
            return;
        }
        if (this.c != -1 && !this.f.a.i) {
            boolean bl;
            if (this.a) {
                bl = this.f.c.getOffset() - this.d + f2 >= (float)this.e;
            } else {
                boolean bl2 = bl = this.f.c.getOffset() - this.d + f2 <= (float)this.e;
            }
            if (bl) {
                this.a(f3, f2, this.a);
                return;
            }
        }
        this.f.a(f3 + f2);
        if (this.f.c.getRenderables().isEmpty()) {
            return;
        }
        ful_0 ful_02 = (ful_0)this.f.c.getRenderableByOffset((int)this.f.c.getOffset()).getInnerElementMap().a("text");
        String string = ful_02.getText();
        if (string.length() == 0) {
            return;
        }
        Byte by = Byte.valueOf(string);
        boolean bl = by != this.f.h;
        this.f.h = by;
        if (bl && this.f.d == this.f.a.m - 1) {
            this.f.a.a(this.f.a.getCurrentValue());
        }
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
            this.f.a(n);
            ado_1.a().b(this.f.b);
            this.f.b = null;
            this.f.g = this.c;
            if (this.f.a.n == this.f.d && this.f.f == this.f.g) {
                ++this.f.a.n;
                if (this.f.d == this.f.a.m - 1) {
                    this.f.a.e();
                }
                return true;
            }
            if (this.f.e != null && this.f.g == ftQ.d.length) {
                if (this.f.a.n == this.f.d) {
                    this.f.a();
                } else {
                    this.f.b();
                    if (this.f.a.n == this.f.e.e()) {
                        this.f.e.a();
                    } else {
                        this.f.e.b();
                    }
                }
            }
            return true;
        }
        return false;
    }
}

