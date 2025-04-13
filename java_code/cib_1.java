/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ciB
 */
final class cib_1
extends chd_1<ctn_2, bvw_2> {
    private static final Logger b = Logger.getLogger(cib_1.class);

    cib_1() {
    }

    @Override
    public boolean a(ctn_2 ctn_22) {
        byte by = ctn_22.c().a();
        bwh_0 bwh_02 = bwj_1.a().a(ctn_22.d());
        if (bwh_02 == null) {
            b.warn((Object)"On re\u00e7oit une fin de combat exterieur sur un combat qu'on ne connait pas");
            return false;
        }
        bwh_02.g().a(false, false);
        baz_0 baz_02 = new baz_0(ctn_22.e(), by, ctn_22.b(), ctn_22.d());
        baz_02.a(ctn_22.h());
        baz_02.b(ctn_22.g());
        baz_02.c(ctn_22.i());
        baa_0.a().a(ctn_22.d(), (aku_1)baz_02);
        baa_0.a().a(bwh_02);
        return false;
    }
}

