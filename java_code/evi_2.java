/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVI
 */
public class evi_2
extends exn_1<exq_2, TK<exk_2, vf_2>> {
    protected static final evi_2 a = new evi_2();

    protected evi_2() {
    }

    @Override
    public int a(exq_2 exq_22, short s2, TK<exk_2, vf_2> tK, short s3, exk_2 exk_22, Su su, So so) {
        return -1;
    }

    @Override
    public int a(exq_2 exq_22, TK<exk_2, vf_2> tK, exk_2 exk_22, Su su, So so) {
        int n = exq_22.e().b(exq_22, exk_22);
        int n2 = tK.e().a(tK, exk_22);
        short s2 = exq_22.g(exk_22);
        if (n >= 0 && n2 >= 0) {
            if (!this.a(exk_22, exq_22)) {
                // empty if block
            }
            if (exq_22.e().a(exq_22, su, so)) {
                if (!tK.a(exk_22)) {
                    return 1;
                }
                return 0;
            }
            try {
                this.a(exk_22, exq_22, s2);
            }
            catch (uc_0 uc_02) {
                return 1;
            }
            return 1;
        }
        return 1;
    }

    public int a(exq_2 exq_22, TK<exk_2, vf_2> tK, short s2, exk_2 exk_22, Su su, So so) {
        exk_2 exk_23 = tK.e(s2);
        if (s2 >= 0 && exk_23 != null && !exk_22.a(exk_23)) {
            return 1;
        }
        int n = exq_22.e().b(exq_22, exk_22);
        int n2 = tK.e().a(tK, exk_22);
        short s3 = exq_22.g(exk_22);
        if (n < 0 || n2 < 0) {
            return 1;
        }
        if (!this.a(exk_22, exq_22)) {
            return 1;
        }
        boolean bl = false;
        try {
            bl = s2 >= 0 ? (exk_23 != null ? tK.a(exk_23.a(), exk_22.e()) : tK.a(exk_22, s2)) : tK.a(exk_22);
        }
        catch (Exception exception) {
            f.trace((Object)"Impossible d'ajouter l'objet a la position donn\u00e9", (Throwable)exception);
        }
        if (bl) {
            return 0;
        }
        try {
            this.a(exk_22, exq_22, s3);
        }
        catch (uc_0 uc_02) {
            f.error((Object)"Impossible de remettre l'objet a sa position d'origine", (Throwable)uc_02);
        }
        return 1;
    }

    public static evi_2 a() {
        return a;
    }
}

