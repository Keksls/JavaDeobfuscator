/*
 * Decompiled with CFR 0.152.
 */
class fva
implements fzu {
    final /* synthetic */ ftj_0 a;
    final /* synthetic */ fuz_0 b;

    fva(fuz_0 fuz_02, ftj_0 ftj_02) {
        this.b = fuz_02;
        this.a = ftj_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        int n = this.b.a.v.indexOf(this.a);
        fxx_0 fxx_02 = this.b.a.u.get(n + this.b.a.z);
        boolean bl = true;
        if (fxx_02.a()) {
            boolean bl2 = bl = !fxx_02.e();
            if (bl || !this.b.a.L) {
                fxx_02.a(bl);
                if (this.b.a.H) {
                    fxx_0 fxx_03;
                    if (bl) {
                        fxx_0 fxx_04 = fxx_03 = !this.b.a.J.isEmpty() ? this.b.a.J.get(this.b.a.J.size() - 1) : null;
                        if (fxx_03 != fxx_02.c()) {
                            do {
                                fxx_0 fxx_05 = fxx_03 = !this.b.a.J.isEmpty() ? this.b.a.J.remove(this.b.a.J.size() - 1) : null;
                                if (fxx_03 == null) continue;
                                fxx_03.a(false);
                            } while (fxx_03 != null && fxx_03.c() != fxx_02.c());
                        }
                        this.b.a.J.add(fxx_02);
                    } else {
                        do {
                            fxx_0 fxx_06 = fxx_03 = !this.b.a.J.isEmpty() ? this.b.a.J.remove(this.b.a.J.size() - 1) : null;
                            if (fxx_03 == null) continue;
                            fxx_03.a(false);
                        } while (fxx_03 != null && fxx_03 != fxx_02);
                    }
                }
            }
        }
        boolean bl3 = !fxx_02.f() && (bl || this.b.a.L) || this.b.a.M;
        fxx_02.b(bl3);
        if (this.b.a.G && (!this.b.a.M || fxx_02 != this.b.a.I)) {
            if (bl3) {
                if (this.b.a.I != null) {
                    this.b.a.I.b(false);
                }
                this.b.a.I = fxx_02;
            } else {
                if (this.b.a.I != null) {
                    this.b.a.I.b(false);
                }
                this.b.a.I = null;
            }
            this.b.a.dispatchEvent(new fct_1(this.b.a));
        }
        this.b.a.setContentDirty();
        return false;
    }
}

