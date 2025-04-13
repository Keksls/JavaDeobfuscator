/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteLongHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteLongHashMap;
import org.apache.log4j.Logger;

public class Xc {
    protected static final Logger a = Logger.getLogger(Xc.class);
    private static final long b = 0xFFFFFFFFFFFFFFL;
    private static final TByteLongHashMap c = new TByteLongHashMap();

    public static long a(byte by) {
        long l = c.adjustOrPutValue(by, 1L, 1L);
        return Xc.c(by, l);
    }

    public void a(byte by, long l) {
        c.put(by, l);
    }

    public static byte a(long l) {
        return (byte)(l >> 56);
    }

    public static long b(long l) {
        return l & 0xFFFFFFFFFFFFFFL;
    }

    public static void b(byte by, long l) {
        c.put(by, l);
    }

    public static long c(byte by, long l) {
        if (l > 0xFFFFFFFFFFFFFFL) {
            a.fatal((Object)"[GROUP ID] D\u00e9passement de capacit\u00e9 pour les ID de groupe");
            return 0L;
        }
        long l2 = l & 0xFFFFFFFFFFFFFFL;
        long l3 = (long)by & 0xFFL;
        return l3 << 56 | l2;
    }
}

