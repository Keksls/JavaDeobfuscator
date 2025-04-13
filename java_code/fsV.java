/*
 * Decompiled with CFR 0.152.
 */
class fsV
extends ahg_0 {
    final /* synthetic */ fsS a;

    fsV(fsS fsS2) {
        this.a = fsS2;
    }

    @Override
    public void a(int n) {
        boolean bl = this.a.aq;
        if (!this.a.ag.e()) {
            super.a(n);
            return;
        }
        this.a.f.c();
        afd_1 afd_12 = this.a.ag.a(this, bl);
        float f2 = this.D / 2.0f + (float)this.a.m_appearance.getLeftInset();
        float f3 = this.E / 2.0f + (float)this.a.m_appearance.getBottomInset();
        this.a(this.a.an, f2, f3, afd_12, false, bl);
        if (this.a.o) {
            this.a(this.a.al, f2, f3, afd_12, false, bl);
        }
        if (bl) {
            this.a.aq = false;
        }
        this.a.f.U().sort(fwc_0.a);
        if (this.a.p) {
            this.a(this.a.am, f2, f3, afd_12, true, bl);
        }
        super.a(n);
    }

    private void a(fwh_0 fwh_02, float f2, float f3, afd_1 afd_12, boolean bl, boolean bl2) {
        int n = fwh_02.a();
        for (int k = 0; k < n; ++k) {
            fjg_1 fjg_12 = fwh_02.a(k);
            if (fjg_12 == null) continue;
            this.a.a(this, fjg_12, fwh_02.b(k), fwh_02.c(k), f2, f3, afd_12, bl, bl2);
        }
    }
}

