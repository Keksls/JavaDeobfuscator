/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bfM
 */
public final class bfm_2
implements agw_0 {
    static final Logger a = Logger.getLogger(bfm_2.class);

    @Override
    public String m_() {
        return bae.h().a("contentLoader.timeline.buff.list", new Object[0]);
    }

    public void a(YK yK) {
        try {
            asw_2.a().a(new aTR(), new bfn_2(this));
        }
        catch (Exception exception) {
            a.error((Object)"", (Throwable)exception);
        }
        yK.b(this);
    }
}

