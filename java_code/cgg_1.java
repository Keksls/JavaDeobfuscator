/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from cgg
 */
class cgg_1
implements adx_1<cxv_1> {
    cgg_1() {
    }

    @Override
    public boolean a(cxv_1 cxv_12) {
        long l = cxv_12.c();
        bmr_1 bmr_12 = (bmr_1)euw_2.a.d(cxv_12.b());
        if (bmr_12 == null) {
            cgf_1.b.error((Object)("On a re\u00e7u un message d'update de pet pour un personnage qui n'existe pas dans le manager : " + cxv_12.b()));
            return false;
        }
        Object t = euu_2.f(bmr_12.U_(), l);
        if (t == null || ((epq_2)t).a_() != bmr_12.a_()) {
            return false;
        }
        exk_2 exk_22 = bmr_12.g(l);
        long l2 = azu_0.j().n().u();
        eBt eBt2 = eBo.a.c(l2, l);
        if (eBt2 != null) {
            exk_22 = (exk_2)eBt2.h().e(l);
        }
        ffv ffv2 = new ffv(exk_22, bmr_12);
        Iterator<ffc_0> iterator = cxv_12.d();
        while (iterator.hasNext()) {
            iterator.next().a(ffv2);
        }
        if (cxv_12.e() == ffe_0.b) {
            dbU.a().f(exk_22);
        }
        return false;
    }

    @Override
    public int a() {
        return 13656;
    }
}

