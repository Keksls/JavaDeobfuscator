/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class bcY
implements adx_1<csl> {
    private static final Logger a = Logger.getLogger(bcY.class);

    bcY() {
    }

    @Override
    public boolean a(csl csl2) {
        bai_0 bai_02 = azu_0.j().n();
        eBt eBt2 = eBo.a.a(bai_02.u(), csl2.c());
        if (eBt2 == null) {
            a.error((Object)("Impossible de modifier le nom du compagnon " + csl2.c()));
            return false;
        }
        eBk eBk2 = new eBk(eBt2);
        try {
            eBk2.a(csl2.b());
        }
        catch (eBn eBn2) {
            a.error((Object)"Exception levee", (Throwable)eBn2);
        }
        return false;
    }

    @Override
    public int a() {
        return 12231;
    }
}

