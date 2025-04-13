/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from chi
 */
final class chi_2
extends chd_1<ctq_1, bvx_2> {
    private static final Logger b = Logger.getLogger(chi_2.class);

    chi_2() {
    }

    @Override
    public boolean a(ctq_1 ctq_12) {
        if (((bvx_2)this.a).c() != ctq_12.d()) {
            b.error((Object)"Le message ne concerne pas notre combat");
            return false;
        }
        ((bvx_2)this.a).d(ctq_12.b());
        return false;
    }
}

