/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cCi
 */
public class cci_0
implements adx_1<crY> {
    @Override
    public boolean a(crY crY2) {
        exk_2 exk_22;
        bmr_1 bmr_12 = (bmr_1)euw_2.a.d(crY2.b());
        if (bmr_12 == null) {
            return false;
        }
        if (crY2.d() != null) {
            eZe.a.a(bmr_12.U_(), bmr_12.a_(), crY2.d());
        }
        if (cZI.A()) {
            cZI.a().g(bmr_12.a_());
        }
        if ((exk_22 = eyf_1.a(bmr_12.R(), crY2.c())) != null) {
            exk_22.P();
        }
        aUh.b("build.remove.item.from.all.success", crY2.e());
        return false;
    }

    @Override
    public int a() {
        return 12286;
    }
}

