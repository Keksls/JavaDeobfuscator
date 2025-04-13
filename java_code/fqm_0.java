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
 * Renamed from fqM
 */
public class fqm_0
extends fql_0 {
    public static final String TAG = "margin";
    private static final Logger c = Logger.getLogger(fqm_0.class);
    private static final ObjectPool d = new abm_1(new fqn_0(), 1000);

    @Override
    public String getTag() {
        return TAG;
    }

    public static fqm_0 checkOut() {
        fqm_0 fqm_02;
        try {
            fqm_02 = (fqm_0)d.borrowObject();
            fqm_02.m_currentPool = d;
        }
        catch (Exception exception) {
            c.error((Object)"Probl\u00e8me au borrowObject.");
            fqm_02 = new fqm_0();
            fqm_02.onCheckOut();
        }
        return fqm_02;
    }
}

