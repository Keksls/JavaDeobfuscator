/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cig
 */
final class cig_2
extends chd_1<cta_2, bvx_2> {
    private static final Logger b = Logger.getLogger(cig_2.class);

    cig_2() {
    }

    @Override
    public boolean a(cta_2 cta_22) {
        if (this.a == null) {
            b.error((Object)("The fight with the id " + cta_22.d() + " was not loaded when the LockFightMessage has been received."));
            return false;
        }
        ((bvx_2)this.a).a(cta_22.b());
        return false;
    }
}

