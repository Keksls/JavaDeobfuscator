/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class bdf
implements adx_1<csp_0> {
    private static final Logger a = Logger.getLogger(bdf.class);

    bdf() {
    }

    @Override
    public boolean a(csp_0 csp_02) {
        boolean bl;
        bai_0 bai_02 = azu_0.j().n();
        long l = csp_02.b();
        eBt eBt2 = eBo.a.a(bai_02.u(), l);
        if (eBt2 == null) {
            a.error((Object)("Impossible de modifier l'inventaire du compagnon " + l));
            return false;
        }
        long l2 = csp_02.c();
        exk_2 exk_22 = (exk_2)eBt2.h().c(l2);
        if (exk_22 == null) {
            a.error((Object)("Aucun item n'a \u00e9t\u00e9 retir\u00e9 " + l2));
        }
        boolean bl2 = bl = !cxo_0.b(eBt2.a());
        if (bl) {
            bmv_1 bmv_12 = cxo_0.a(eBt2);
            bqU bqU2 = new bqU(bmv_12, new bqY(eBt2));
            cxo_0.b(bqU2);
            cyt_0.a().t();
        } else {
            cyt_0.a().i();
        }
        cxo_0.a(eBt2, exk_22);
        return false;
    }

    @Override
    public int a() {
        return 13230;
    }
}

