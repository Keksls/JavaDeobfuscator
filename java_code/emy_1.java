/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eMy
 */
final class emy_1 {
    private static final Logger a = Logger.getLogger(emy_1.class);
    private final elm_0 b;
    private final emb_1 c;
    private final emz_1 d;

    emy_1(elm_0 elm_02) {
        this.b = elm_02;
        this.c = new emb_1(elm_02);
        this.d = new emz_1(elm_02);
    }

    public fir_0 a(epq_2 epq_22, exk_2 exk_22, fio_0 fio_02, aff_1 aff_12) {
        Object object;
        Object object2;
        if (exk_22 == null || !exk_22.X()) {
            a.error((Object)this.b.a("utilisation d'un objet null, inutilisable ou cass\u00e9"));
            return fir_0.c;
        }
        ezr_0<?> ezr_02 = exk_22.T();
        if (fio_02 == null) {
            a.error((Object)this.b.a("cast d'un spell null"));
            return fir_0.c;
        }
        Object Spell = fio_02.r();
        List<Long> list = enp_2.a.h(ens_2.aI);
        if (list.contains(((fin_0)Spell).i())) {
            return fir_0.y;
        }
        if (((fin_0)Spell).w()) {
            return fir_0.t;
        }
        fiy fiy2 = ((fin_0)Spell).g(fio_02, epq_22, (Object)aff_12, epq_22.ge());
        if (ezr_02.t() + fiy2.a(eps_0.c) > epq_22.a_(eps_0.c).a()) {
            return fir_0.g;
        }
        if (ezr_02.v() + fiy2.a(eps_0.e) > epq_22.a_(eps_0.e).a()) {
            return fir_0.h;
        }
        if (ezr_02.w() + fiy2.a(eps_0.d) > epq_22.a_(eps_0.d).a()) {
            return fir_0.i;
        }
        if (aff_12 == null) {
            object2 = epq_22.gh().b(epq_22, fio_02, (int)this.b.O().u());
            if (!((fir_0)((Object)object2)).a()) {
                return object2;
            }
        } else {
            object2 = this.b.a(aff_12.d(), aff_12.e());
            object = this.b.g();
            if (!emb_1.a(epq_22, aff_12, fio_02, (epq_2)object2, this.b)) {
                return fir_0.r;
            }
            fir_0 fir_02 = epq_22.gh().a(epq_22, fio_02, (int)this.b.O().u(), (apq_2)object2);
            if (!fir_02.a()) {
                return fir_02;
            }
        }
        boolean bl = ((fin_0)Spell).l(fio_02, epq_22, aff_12, epq_22.Q_());
        object = this.c.a(epq_22, fio_02, aff_12, true, ezr_02.I(), ezr_02.H(), ezr_02.z(), ezr_02.y(), ezr_02.A(), bl, ((fin_0)Spell).p());
        if (!((fir_0)((Object)object)).a()) {
            return object;
        }
        return this.d.a(epq_22, exk_22, aff_12, false);
    }
}

