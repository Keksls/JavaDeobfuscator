/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bgW
 */
public class bgw_2
extends ss_0 {
    public bgw_2(su_0 su_02, So so) {
        this.a(su_02);
        this.a(so);
    }

    @Override
    public void a(int n, int n2, short s2, int n3, int n4, short s3, Su su) {
    }

    @Override
    public sr_0 d(long l) {
        ekk_0 ekk_02 = elg_0.a().i(l);
        if (ekk_02 == null) {
            a.error((Object)("pas de modele de zone d'effet d'id " + l));
            return null;
        }
        return ekk_02.a(null);
    }
}

