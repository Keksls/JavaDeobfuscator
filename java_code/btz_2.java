/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bTZ
 */
public class btz_2 {
    private static final Logger a = Logger.getLogger(btz_2.class);

    public static String a(etl_2 etl_22) {
        bae bae2 = bae.h();
        short s2 = etl_22.i();
        if (etl_22 instanceof etk_2) {
            return bae2.a(122, (long)s2, new Object[0]);
        }
        if (etl_22 instanceof etn_2) {
            return bae2.a(124, (long)s2, new Object[0]);
        }
        if (etl_22 instanceof etm_2) {
            return bae2.a("haven.world.partition", new Object[0]);
        }
        a.error((Object)("Type de catalog entry inconnu " + etl_22.getClass()));
        return "<unknow>";
    }

    public static String a(fkt_0 fkt_02) {
        return btz_2.a(fkt_02.f());
    }
}

