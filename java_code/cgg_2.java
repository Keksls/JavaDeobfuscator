/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cgG
 */
public final class cgg_2
implements adx_1<cvy_1> {
    private static final Logger a = Logger.getLogger(cgg_2.class);

    @Override
    public boolean a(cvy_1 cvy_12) {
        cVg.b.a(false);
        if (cvy_12.c() != eAW.a) {
            a.error((Object)("[Account chest] Error when requesting account chest compartment=" + cvy_12.c()));
            cVg.a(cvy_12.c());
            return false;
        }
        cVg.b.a(cvy_12.b());
        return false;
    }

    @Override
    public int a() {
        return 12743;
    }
}

