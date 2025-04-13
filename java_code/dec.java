/*
 * Decompiled with CFR 0.152.
 */
class dec
implements fzp_0 {
    final /* synthetic */ cLm a;
    final /* synthetic */ ddZ b;

    dec(ddZ ddZ2, cLm cLm2) {
        this.b = ddZ2;
        this.a = cLm2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            bmr_1 bmr_12 = azu_0.j().k();
            esk_2 esk_22 = new esk_2(this.a.e().d(), (short)this.a.f().a(), (short)this.a.f().b());
            cnc_0 cnc_02 = new cnc_0(bmr_12.a_());
            cnc_02.a(esk_22);
            azu_0.j().K().c(cnc_02);
        } else {
            this.a.e(this.b.e);
        }
    }
}

