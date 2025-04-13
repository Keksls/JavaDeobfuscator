/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cja
 */
final class cja_2
extends chd_1<ctn_2, bvx_2> {
    private static final Logger b = Logger.getLogger(cja_2.class);

    cja_2() {
    }

    @Override
    public boolean a(ctn_2 ctn_22) {
        int n = ctn_22.d();
        if (this.a != null && ((bvx_2)this.a).c() == n) {
            bbg bbg2 = new bbg(ctn_22.e(), ctn_22.c().a(), ctn_22.b(), ((bvx_2)this.a).c(), false);
            bbg2.b(true);
            ((bvx_2)this.a).b(ctn_22.g());
            ((bvx_2)this.a).a(ctn_22.h());
            baa_0.a().a((bvx_2)this.a, (aku_1)bbg2);
            baa_0.a().a(this.a);
            return false;
        }
        b.error((Object)"Pas de combat associ\u00e9 a la frame pour sortir du mode spectateur");
        return true;
    }
}

