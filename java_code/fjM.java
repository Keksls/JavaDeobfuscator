/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import org.apache.log4j.Logger;

public final class fjM
extends Enum<fjM> {
    public static final /* enum */ fjM a;
    public static final /* enum */ fjM b;
    public static final /* enum */ fjM c;
    public static final /* enum */ fjM d;
    public static final /* enum */ fjM e;
    protected static Logger f;
    private static final TByteObjectHashMap<fjM> g;
    private byte h;
    private long i;
    private static final /* synthetic */ fjM[] j;

    public static fjM[] values() {
        return (fjM[])j.clone();
    }

    public static fjM valueOf(String string) {
        return Enum.valueOf(fjM.class, string);
    }

    private fjM(byte by, long l) {
        this.h = by;
        this.i = l;
    }

    public byte a() {
        return this.h;
    }

    public static fjM a(int n, int n2, int n3, float f2) {
        if ((float)(n = Math.min(n, n3)) >= (float)n2 - (float)n2 * f2 && (float)n <= (float)n2 + (float)n2 * f2) {
            return c;
        }
        if (n < n2) {
            if (1.0f - ((float)n2 - (float)n) / (float)n2 <= 0.5f) {
                return a;
            }
            return b;
        }
        if ((float)(n - n2) / (float)(n3 - n2) <= 0.5f) {
            return d;
        }
        return e;
    }

    public long b() {
        return this.i;
    }

    public static fjM a(byte by) {
        return (fjM)((Object)g.get(by));
    }

    static {
        fjM[] fjMArray;
        a = new fjM(1, -2L);
        b = new fjM(2, -1L);
        c = new fjM(3, 0L);
        d = new fjM(4, 1L);
        e = new fjM(5, 2L);
        j = new fjM[]{a, b, c, d, e};
        f = Logger.getLogger(fjM.class);
        g = new TByteObjectHashMap();
        for (fjM fjM2 : fjMArray = fjM.values()) {
            g.put(fjM2.a(), (Object)fjM2);
        }
    }
}

