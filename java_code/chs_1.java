/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from chS
 */
final class chs_1
extends chd_1<ctf_2, bvx_2> {
    private static final Logger b = Logger.getLogger(chs_1.class);

    chs_1() {
    }

    @Override
    public boolean a(ctf_2 ctf_22) {
        if (!chv_1.d.b) {
            b.warn((Object)"On re\u00e7oit une fin de creation de combat mais nous ne sommes pas en phase de creation");
            return true;
        }
        chv_1.d.c.a();
        chv_1.d.c.c();
        chv_1.d.b = false;
        return false;
    }
}

