/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bdT
 */
public final class bdt_2
implements agw_0 {
    private static final Logger a = Logger.getLogger(bdt_2.class);

    public void a(YK yK) {
        try {
            asw_2.a().a(new fmO(), new bdu_1(this));
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
        }
        finally {
            yK.b(this);
        }
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.companyRank", new Object[0]);
    }
}

