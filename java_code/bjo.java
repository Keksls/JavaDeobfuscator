/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bjo
extends bjf_0<bjq> {
    static final Logger d = Logger.getLogger(bjo.class);
    String e;

    @Override
    protected void a(biI biI2, bjq bjq2) {
        if (this.b()) {
            assert (this.e == null);
            this.e = biI2.ac();
        }
    }

    @Override
    public void a(bjq bjq2, bjq bjq3, biI biI2) {
        if (biI2.an() == null) {
            d.error((Object)"Impossible de desappliquer le changement d'anim statique ");
            return;
        }
        biI2.a(new bjp_0(this, biI2, bjq2));
    }

    @Override
    public void a(biI biI2) {
        bjq bjq2 = (bjq)this.c();
        super.a(biI2);
        this.a(bjq2, bjq2, biI2);
    }
}

