/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fpR
 */
class fpr_0
implements ans_1 {
    final /* synthetic */ fvE a;
    final /* synthetic */ ftv_0 b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ fpm_0 e;

    fpr_0(fpm_0 fpm_02, fvE fvE2, ftv_0 ftv_02, String string, String string2) {
        this.e = fpm_02;
        this.a = fvE2;
        this.b = ftv_02;
        this.c = string;
        this.d = string2;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (this.a.getElementMap() != null && string.equals(this.a.getElementMap().c())) {
            this.b.getWindowManager().b(this.a, this.c);
            if (this.d != null) {
                this.b.getWindowManager().d(this.a, this.c);
            }
            this.e.b(this);
        }
    }
}

