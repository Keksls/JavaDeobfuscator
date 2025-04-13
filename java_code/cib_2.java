/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cib
 */
final class cib_2
extends chd_1<ctw_1, bvx_2> {
    private static final Logger b = Logger.getLogger(cib_2.class);

    cib_2() {
    }

    @Override
    public boolean a(ctw_1 ctw_12) {
        blx_1 blx_12 = (blx_1)((bvx_2)this.a).n(ctw_12.c());
        if (blx_12 == null) {
            b.error((Object)(ctw_12.getClass().getSimpleName() + " pour le fighter " + ctw_12.c() + " qui n'est pas dans le combat"));
            return false;
        }
        blx_12.a_(eps_0.B).b(ctw_12.e());
        blx_12.a_(eps_0.b).b(ctw_12.b());
        blx_12.a_(eps_0.b).g(ctw_12.f());
        ((bvx_2)this.a).A().t();
        return false;
    }
}

