/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from daK
 */
class dak_0
implements fzp_0 {
    final /* synthetic */ daJ a;

    dak_0(daJ daJ2) {
        this.a = daJ2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            exk_2 exk_22 = this.a.b.a();
            exk_2 exk_23 = this.a.b.b();
            exk_2 exk_24 = this.a.b.c();
            cpv_0 cpv_02 = new cpv_0(exk_22.a(), exk_23.a(), exk_24.a());
            azu_0.j().K().c(cpv_02);
            azu_0.j().b(daJ.a);
        }
    }
}

