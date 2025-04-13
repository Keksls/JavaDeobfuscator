/*
 * Decompiled with CFR 0.152.
 */
class fsz
implements fzu {
    final /* synthetic */ fsy_0 a;

    fsz(fsy_0 fsy_02) {
        this.a = fsy_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        fck_2 fck_22 = (fck_2)fzs2;
        if (this.a.f) {
            if (this.a.m_appearance == null) {
                return true;
            }
            if (this.a.m_appearance.a(fck_22.a(this.a), fck_22.b(this.a))) {
                return true;
            }
            fqj fqj2 = this.a.k.getAppearance();
            if (fqj2 == null) {
                return true;
            }
            if (!fqj2.a(fck_22.a(this.a.k), fck_22.b(this.a.k))) {
                this.a.b();
                return true;
            }
        }
        return false;
    }
}

