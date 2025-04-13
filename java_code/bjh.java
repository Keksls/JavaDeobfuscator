/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bjh
extends bjf_0<bji> {
    private static final Logger d = Logger.getLogger(bjh.class);
    private String e;

    @Override
    protected void a(biI biI2, bji bji2) {
        if (this.b()) {
            assert (this.e == null);
            this.e = biI2.N();
        }
    }

    @Override
    public void a(bji bji2, bji bji3, biI biI2) {
        if (this.b()) {
            biI2.f(this.e);
            this.e = null;
        } else {
            bji bji4 = (bji)this.c();
            if (!bji4.equals(bji2)) {
                bji4.a(biI2);
            }
        }
    }
}

