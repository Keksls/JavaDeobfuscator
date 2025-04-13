/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fuf
 */
class fuf_0
implements fzm {
    private static final int b = 50;
    private static final long c = 500L;
    private long d;
    final /* synthetic */ fue_0 a;

    fuf_0(fue_0 fue_02) {
        this.a = fue_02;
    }

    @Override
    public void a(fzl_0 fzl_02, int n, int n2, fvE fvE2) {
        float f2;
        int n3;
        if (this.a.m_containerParent == null) {
            return;
        }
        this.a.z = false;
        if (this.a.x) {
            if (n < this.a.getDisplayX() && n > this.a.getDisplayX() - 50) {
                n3 = Math.abs(this.a.getDisplayX() - n);
                f2 = (float)n3 / (float)this.a.F.getWidth();
                this.a.B = -f2;
                this.a();
            } else if (n > this.a.getDisplayX() + this.a.getWidth() && n < this.a.getDisplayX() + this.a.getWidth() + 50) {
                n3 = Math.abs(this.a.getDisplayX() + this.a.getWidth() - n);
                this.a.B = f2 = (float)n3 / (float)this.a.F.getWidth();
                this.a();
            }
        }
        if (this.a.w) {
            if (n2 < this.a.getDisplayY() && n2 > this.a.getDisplayY() - 50) {
                n3 = Math.abs(this.a.getDisplayY() - n2);
                f2 = (float)n3 / (float)this.a.F.getHeight();
                this.a.A = -f2;
                this.a();
            } else if (n2 > this.a.getDisplayY() + this.a.getHeight() && n2 < this.a.getDisplayY() + this.a.getHeight() + 50) {
                n3 = Math.abs(this.a.getDisplayY() + this.a.getHeight() - n2);
                this.a.A = f2 = (float)n3 / (float)this.a.F.getHeight();
                this.a();
            }
        }
        if (this.a.z) {
            this.a.setNeedsToPreProcess();
        }
    }

    private void a() {
        if (this.d == 0L) {
            this.d = System.currentTimeMillis();
        }
        if (this.d + 500L < System.currentTimeMillis()) {
            this.a.z = true;
        }
    }

    @Override
    public void b(fzl_0 fzl_02, int n, int n2, fvE fvE2) {
        this.a.A = 0.0f;
        this.a.B = 0.0f;
        this.a.z = false;
        this.a.setNeedsToPreProcess();
        this.d = 0L;
    }

    @Override
    public boolean a(Object object) {
        return this.a.y == null || this.a.y.a(object);
    }
}

