/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import org.apache.log4j.Logger;

public class eCZ {
    protected static final Logger a = Logger.getLogger(eCZ.class);
    private static final int c = 10;
    private static final int d = 30;
    private static final int e = 50;
    private static final int f = 100;
    private static final int g = 50;
    private static final int h = 100;
    public static final int b = 3;
    private static final int i = 5;
    private static final int j = 25;
    private static final TByteObjectHashMap<eDb> k = new TByteObjectHashMap();
    private static final eDb l = new eDa();
    private static final eDb m = new eDd(10);
    private static final eDb n = new eDd(30);
    private static final eDb o = new eDd(50);
    private static final eDb p = new eDd(100);
    private static final eDb q = new eDc(5);
    private static final eDb r = new eDd(50, 3);
    private static final eDb s = new eDd(100, 3);
    private static final eDb t = new eDc(25);

    public static int a(eCD eCD2) {
        int n = 0;
        for (byte by = 0; by < 9; by = (byte)(by + 1)) {
            n += eCZ.a(by, eCD2) ? 1 : 0;
        }
        return n;
    }

    public static boolean a(byte by, eCD eCD2) {
        eDb eDb2 = (eDb)k.get(by);
        if (eDb2 == null) {
            a.error((Object)("Slot inconnu au bataillon d'index=" + by + " demand\u00e9"));
            return false;
        }
        return eDb2.a(eCD2);
    }

    static {
        k.put((byte)0, (Object)l);
        k.put((byte)1, (Object)m);
        k.put((byte)2, (Object)n);
        k.put((byte)3, (Object)o);
        k.put((byte)4, (Object)p);
        k.put((byte)5, (Object)q);
        k.put((byte)6, (Object)r);
        k.put((byte)7, (Object)s);
        k.put((byte)8, (Object)t);
    }
}

