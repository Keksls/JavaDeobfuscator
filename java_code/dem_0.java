/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from deM
 */
public class dem_0
implements adx_1 {
    public boolean a(adt_1 adt_12) {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            bmr_1 bmr_12 = azu_0.j().k();
            if (!bmr_12.eZ()) {
                return false;
            }
            eqp_2 eqp_22 = eqt_2.a(bmr_12.eV().g() + 1);
            if (eqp_22 == null) {
                return false;
            }
            aaw_22.c(new czy_2(eqp_22.a().a()));
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
        return false;
    }

    @Override
    public int a() {
        return 19502;
    }
}

