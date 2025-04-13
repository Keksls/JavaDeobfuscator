/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fCP
 */
public class fcp_2
extends fzs {
    private static Logger i = Logger.getLogger(fcp_2.class);
    private boolean j = false;

    public fcp_2(fyb_0 fyb_02, boolean bl) {
        this.j = bl;
        this.e = fyb_02;
    }

    public boolean j() {
        return this.j;
    }

    public void c(boolean bl) {
        this.j = bl;
    }

    @Override
    public frd_0 f() {
        return frd_0.H;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.j = false;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
    }
}

