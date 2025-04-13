/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bfX
 */
public class bfx_2
implements agw_0 {
    private static final Logger a = Logger.getLogger(bfx_2.class);

    public void a(YK yK) {
        asw_2.a().a(new atu_0(), new bfy_2(this));
        yK.b(this);
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.treasure", new Object[0]);
    }

    public static brc_1 a(int n) {
        brc_1 brc_12 = new brc_1(n);
        try {
            asw_2.a().a(n, new atu_0(), new bfz_2(brc_12));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return brc_12;
    }
}

