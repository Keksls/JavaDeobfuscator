/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from baS
 */
class bas_0
implements afy_0 {
    final /* synthetic */ blx_1 a;
    final /* synthetic */ baR b;

    bas_0(baR baR2, blx_1 blx_12) {
        this.b = baR2;
        this.a = blx_12;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        aej_2 aej_22 = this.a.F();
        if (aej_22.c()) {
            afe_02.a(aej_22);
        } else {
            baR.n().error((Object)"LE MOBILE SE TROUVE DANS UNE DIRECTION 8 A LA FIN D'UN MOUVEMENT");
            afe_02.a(aej_22.c(0));
        }
        this.b.b(this.a);
        bmr_1 bmr_12 = azu_0.j().k();
        if (this.b.f.contains(bmr_12.a_())) {
            bmr_12.n(true);
        }
        afe_02.c(this);
    }
}

