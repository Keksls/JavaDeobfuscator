/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cgI
 */
public class cgi_2
implements adx_1<cva_1> {
    private static final Logger a = Logger.getLogger(cgi_2.class);

    @Override
    public boolean a(cva_1 cva_12) {
        cVg.b.a(false);
        if (cva_12.b() != eAW.a) {
            a.error((Object)("[Account chest] Error when swapping compartments=" + cva_12.b()));
            cVg.a(cva_12.b());
            return false;
        }
        bqC bqC2 = cVg.b.d();
        if (bqC2 == null) {
            return false;
        }
        bqC2.a(cva_12.c(), cva_12.d());
        return false;
    }

    @Override
    public int a() {
        return 12211;
    }
}

