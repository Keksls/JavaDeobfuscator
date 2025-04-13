/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVJ
 */
public class evj_2
extends exn_1<TK<exk_2, vf_2>, TK<exk_2, vf_2>> {
    protected static final evj_2 a = new evj_2();

    protected evj_2() {
    }

    @Override
    public int a(TK<exk_2, vf_2> tK, TK<exk_2, vf_2> tK2, exk_2 exk_22, Su su, So so) {
        return -1;
    }

    public int a(TK<exk_2, vf_2> tK, TK<exk_2, vf_2> tK2, short s2, exk_2 exk_22, short s3, exk_2 exk_23, Su su, So so) {
        if (exk_22.e() > s3 && s3 != -1) {
            if (s2 == -1) {
                f.warn((Object)("item : " + exk_22 + " can't be moved into player : " + su.a_() + " inventory, -1 is not a valid position"));
                return 1;
            }
            exk_2 exk_24 = tK2.e(s2);
            if (exk_24 == exk_22) {
                f.warn((Object)"on veut d\u00e9placer un item o\u00f9 il est d\u00e9ja ! ");
                return 1;
            }
            if (exk_24 != null) {
                if (!exk_24.a(exk_22)) {
                    return 1;
                }
                if (exk_24.e() + s3 < exk_24.aR_()) {
                    exk_24.b(s3);
                    exk_22.b(-s3);
                    return 0;
                }
                int n = exk_24.aR_() - exk_24.e();
                exk_24.b((short)n);
                if (exk_22.e() <= n) {
                    tK.c(exk_22);
                } else {
                    exk_22.b((short)(-n));
                }
                return 0;
            }
            exk_23.a(s3);
            if (tK2.e().a(tK2, exk_23) >= 0) {
                tK.a(exk_22.a(), -s3);
                try {
                    tK2.a(exk_23, s2);
                }
                catch (Exception exception) {
                    f.error((Object)"Impossible d'ajouter l'objet a la position donn\u00e9", (Throwable)exception);
                }
                return 0;
            }
            return 1;
        }
        exk_2 exk_25 = tK2.e(s2);
        if (exk_25 == exk_22) {
            f.warn((Object)"on veut d\u00e9placer un item o\u00f9 il est d\u00e9ja ! ");
            return 1;
        }
        if (exk_25 == null) {
            if (tK.e().b(tK, exk_22) >= 0 && tK2.e().a(tK2, exk_22) >= 0 && tK.b(exk_22)) {
                try {
                    tK2.a(exk_22, s2);
                }
                catch (Exception exception) {
                    f.error((Object)"Impossible d'ajouter l'objet a la position donn\u00e9", (Throwable)exception);
                }
                return 0;
            }
            return 1;
        }
        if (!exk_25.a(exk_22)) {
            if (tK2.e().a(tK2, exk_25, exk_22) >= 0 && tK.e().a(tK, exk_22, exk_25) >= 0) {
                short s4 = tK.b(exk_22.a());
                tK.b(exk_22);
                tK2.b(exk_25);
                try {
                    tK.a(exk_25, s4);
                }
                catch (Exception exception) {
                    f.error((Object)("Erreur lors de l ajout de l'objet a la position" + s4 + " dans "), (Throwable)exception);
                }
                try {
                    tK2.a(exk_22, s2);
                }
                catch (Exception exception) {
                    f.error((Object)("Erreur lors de l ajout de l'objet a la position" + s2 + " dans "), (Throwable)exception);
                }
                if (tK.e().a(tK, su, so)) {
                    return 0;
                }
                tK.b(exk_25);
                tK2.b(exk_22);
                try {
                    tK.a(exk_22, s4);
                }
                catch (Exception exception) {
                    f.error((Object)("Erreur lors de l ajout de l'objet a la position" + s4 + " dans "), (Throwable)exception);
                }
                try {
                    tK2.a(exk_25, s2);
                }
                catch (Exception exception) {
                    f.error((Object)("Erreur lors de l ajout de l'objet a la position" + s2 + " dans "), (Throwable)exception);
                }
                return 1;
            }
            return 1;
        }
        if (exk_25.e() + exk_22.e() <= exk_25.aR_()) {
            tK2.a(exk_25.a(), exk_22.e());
            tK.c(exk_22);
            return 0;
        }
        int n = exk_25.aR_() - exk_25.e();
        tK2.a(exk_25.a(), (short)n);
        tK.a(exk_22.a(), (short)(-n));
        return 0;
    }

    @Override
    public int a(TK<exk_2, vf_2> tK, short s2, TK<exk_2, vf_2> tK2, short s3, exk_2 exk_22, Su su, So so) {
        return -1;
    }

    public static evj_2 a() {
        return a;
    }
}

