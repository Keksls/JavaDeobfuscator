/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bfr
 */
public class bfr_1
implements agw_0 {
    static final Logger a = Logger.getLogger(bfr_1.class);
    private static final bfr_1 b = new bfr_1();

    public static bfr_1 a() {
        return b;
    }

    private bfr_1() {
    }

    public void a(YK yK) {
        asw_2.a().a(new asy_0(), new bfs_2(this));
        yK.b(this);
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.nation.ranks", new Object[0]);
    }
}

