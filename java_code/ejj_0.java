/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eJJ
 */
public class ejj_0
implements sh_0 {
    protected static final Logger a = Logger.getLogger(ejj_0.class);
    public static final long b = 0x1000000L;
    private static long c = 0x1000000L;

    @Override
    public long a(sd_0 sd_02) {
        if (sd_02 == null) {
            return -1L;
        }
        return this.a();
    }

    private long a() {
        if (c < Long.MAX_VALUE) {
            return c++;
        }
        c = 0x1000000L;
        return c;
    }
}

