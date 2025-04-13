/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bkd
 */
public class bkd_0
extends bjf_0<bke_0> {
    private static final Logger a = Logger.getLogger(bkd_0.class);

    @Override
    protected void a(biI biI2, bke_0 bke_02) {
    }

    @Override
    public void a(bke_0 bke_02, bke_0 bke_03, biI biI2) {
        if (bke_03 != null) {
            biI2.a(bke_03.b, !bke_03.a);
            biI2.bJ();
        }
        if (!this.b()) {
            bke_0 bke_04 = (bke_0)this.c();
            bke_04.a(biI2);
        }
    }
}

