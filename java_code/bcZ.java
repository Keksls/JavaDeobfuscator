/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class bcZ
implements adx_1<csm> {
    private static final Logger a = Logger.getLogger(bcZ.class);

    bcZ() {
    }

    @Override
    public boolean a(csm csm2) {
        bai_0 bai_02 = azu_0.j().n();
        eBt eBt2 = eBo.a.a(bai_02.u(), csm2.b());
        if (eBt2 == null) {
            a.error((Object)("Impossible de modifier le nom du compagnon " + csm2.b()));
            return false;
        }
        eBt2.a(csm2.c());
        return false;
    }

    @Override
    public int a() {
        return 13408;
    }
}

