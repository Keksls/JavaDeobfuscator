/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eMz
 */
final class emz_1 {
    private static final Logger a = Logger.getLogger(emg_2.class);
    private final elm_0 b;
    private final emb_1 c;

    emz_1(elm_0 elm_02) {
        this.b = elm_02;
        this.c = new emb_1(elm_02);
    }

    public fir_0 a(epq_2 epq_22, exk_2 exk_22, aff_1 aff_12, boolean bl) {
        if (exk_22 == null || !exk_22.X()) {
            a.error((Object)this.b.a("cast d'un item null ou non utilisable ou cass\u00e9"));
            return fir_0.c;
        }
        if (epq_22.hg()) {
            return fir_0.w;
        }
        if (epq_22.a(eoz_1.O)) {
            return fir_0.x;
        }
        ezr_0<?> ezr_02 = exk_22.T();
        if (bl) {
            byte by = ezr_02.t();
            if (by > 0 && epq_22.a(eoz_1.X)) {
                return fir_0.g;
            }
            if (by > epq_22.a_(eps_0.c).a()) {
                return fir_0.g;
            }
            if (ezr_02.v() > epq_22.a_(eps_0.e).a()) {
                return fir_0.h;
            }
            if (ezr_02.w() > epq_22.a_(eps_0.d).a()) {
                return fir_0.i;
            }
        }
        if (!exf_1.a().a(exk_22, (Su)epq_22, this.b.h())) {
            return fir_0.s;
        }
        if (ezr_02.L() && aff_12 != null && aff_12.d() != epq_22.P_().d() && aff_12.e() != epq_22.P_().e()) {
            return fir_0.r;
        }
        if (ezr_02.n() != 2145 && ezr_02.U() && epq_22.cG().a(exk_22.a()) == null) {
            return fir_0.x;
        }
        apc_2 apc_22 = ezr_02.a(exz_1.b);
        return this.c.a(epq_22, exk_22, aff_12, false, ezr_02.I(), ezr_02.H(), ezr_02.z(), ezr_02.y(), ezr_02.A(), false, apc_22);
    }
}

