/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bdF
 */
public final class bdf_2
implements agw_0 {
    private static final Logger a = Logger.getLogger(bdf_2.class);
    private static final bdf_2 b = new bdf_2();

    public static bdf_2 a() {
        return b;
    }

    private bdf_2() {
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.bonusPointDistributionTable", new Object[0]);
    }

    public void a(YK yK) {
        yK.b(this);
    }
}

