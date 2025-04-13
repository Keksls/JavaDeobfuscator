/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fCM
 */
public class fcm_1
extends fzs {
    private static final Logger i = Logger.getLogger(fcm_1.class);
    private static final ObjectPool j = new abm_1(new fcn_1());

    public static fcm_1 j() {
        fcm_1 fcm_12;
        try {
            fcm_12 = (fcm_1)j.borrowObject();
            fcm_12.a = j;
        }
        catch (Exception exception) {
            i.error((Object)"Probl\u00e8me au borrowObject.");
            fcm_12 = new fcm_1();
            fcm_12.onCheckOut();
        }
        return fcm_12;
    }
}

