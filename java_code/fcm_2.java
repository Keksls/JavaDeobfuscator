/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fCm
 */
public class fcm_2
extends fzs {
    private static Logger i = Logger.getLogger(fcm_2.class);

    public fcm_2(fqg_0 fqg_02) {
        this.e = fqg_02;
    }

    public fqg_0 j() {
        return (fqg_0)this.e;
    }

    public void a(fqg_0 fqg_02) {
        this.e = fqg_02;
    }

    @Override
    public frd_0 f() {
        return frd_0.b;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
    }
}

