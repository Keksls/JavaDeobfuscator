/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fCz
 */
public class fcz_1
extends fzs {
    private static Logger i = Logger.getLogger(fcz_1.class);
    private boolean j;
    private fyb_0 k;

    public fcz_1(fvE fvE2, boolean bl) {
        this.e = fvE2;
        this.j = bl;
    }

    public void c(boolean bl) {
        this.j = bl;
    }

    public boolean j() {
        return this.j;
    }

    public fyb_0 k() {
        return this.k;
    }

    @Override
    public frd_0 f() {
        return frd_0.i;
    }
}

