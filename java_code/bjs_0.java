/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bjs
 */
public class bjs_0
extends bjf_0<bju> {
    static final Logger d = Logger.getLogger(bjs_0.class);
    String e;

    @Override
    protected void a(biI biI2, bju bju2) {
        if (this.b()) {
            assert (this.e == null);
            this.e = biI2.ab();
        }
    }

    @Override
    public void a(bju bju2, bju bju3, biI biI2) {
        if (biI2.an() == null) {
            d.error((Object)"Impossible de desappliquer le changement d'anim statique ");
            return;
        }
        biI2.a(new bjt_0(this, biI2, bju2));
    }
}

