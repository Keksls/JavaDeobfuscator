/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class bda
implements adx_1<csn_0> {
    private static final Logger a = Logger.getLogger(bda.class);

    bda() {
    }

    @Override
    public boolean a(csn_0 csn_02) {
        bai_0 bai_02 = azu_0.j().n();
        eBt eBt2 = eBo.a.a(bai_02.u(), csn_02.c());
        if (eBt2 == null) {
            a.error((Object)("Impossible de modifier le nom du compagnon " + csn_02.c()));
            return false;
        }
        eBk eBk2 = new eBk(eBt2);
        try {
            long l = csn_02.b();
            long l2 = eBt2.c();
            short s2 = Oz.c.a(l);
            long l3 = Oz.c.a(s2 + 1) - l;
            short s3 = (short)(s2 - Oz.c.a(l2));
            String string = eBt2.e().length() > 0 ? eBt2.e() : bpc_1.a().a(eBt2.a()).f();
            String string2 = bae.h().a("infoPop.xpGain", string, l - l2, l3, aug_0.g, s3);
            aul_0.a().c(string2);
            eBk2.b(l);
        }
        catch (eBn eBn2) {
            a.error((Object)"Exception levee", (Throwable)eBn2);
        }
        return false;
    }

    @Override
    public int a() {
        return 12203;
    }
}

