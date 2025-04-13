/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bjL
extends bjf_0<bjM> {
    private static final Logger a = Logger.getLogger(bjL.class);

    @Override
    protected void a(biI biI2, bjM bjM2) {
    }

    @Override
    public void a(bjM bjM2, bjM bjM3, biI biI2) {
        if (this.b()) {
            biI2.v(false);
        } else {
            bjM bjM4 = (bjM)this.c();
            if (!bjM4.equals(bjM2)) {
                bjM4.a(biI2);
            }
        }
    }
}

