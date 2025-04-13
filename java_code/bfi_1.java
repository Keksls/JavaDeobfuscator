/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bfi
 */
class bfi_1
implements asb_2<asp_0> {
    final /* synthetic */ bfh_2 a;

    bfi_1(bfh_2 bfh_22) {
        this.a = bfh_22;
    }

    public void a(asp_0 asp_02) {
        int n = asp_02.d();
        int n2 = asp_02.e();
        epw_1 epw_12 = epx_1.b().a(n);
        if (epw_12 == null) {
            bfh_2.a.error((Object)("On ajoute un nuisible \u00e0 une famille de monstre inconnue : familyId=" + n));
            return;
        }
        epw_12.b(n2);
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((asp_0)asu_22);
    }
}

