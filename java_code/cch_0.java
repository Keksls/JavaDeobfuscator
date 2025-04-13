/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cCh
 */
public class cch_0
implements adx_1<crX> {
    @Override
    public boolean a(crX crX2) {
        bmr_1 bmr_12 = (bmr_1)euw_2.a.d(crX2.b());
        if (bmr_12 == null) {
            return false;
        }
        byte by = crX2.c();
        short s2 = crX2.d();
        ezj_1 ezj_12 = new ezj_1(cZI.d(s2), s2, by, crX2.e(), true);
        bmr_12.dx().a(by, ezj_12);
        eyz_0 eyz_02 = bmr_12.dB().a((int)by, s2);
        fiO fiO2 = bmr_12.dw().a((int)by, s2);
        ezx_2 ezx_22 = bmr_12.dA().a((int)by, s2);
        if (crX2.f()) {
            eyz_02.a(crX2.g());
            fiO2.a(crX2.h());
            ezx_22.d(crX2.i());
        }
        if (cZI.A()) {
            cZI.a().e(bmr_12.a_());
        }
        return false;
    }

    @Override
    public int a() {
        return 13266;
    }
}

