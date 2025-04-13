/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

public class bNO {
    private static final Logger h = Logger.getLogger(bNO.class);
    private static final bNO i = new bNO();
    public static final byte a = 5;
    public static final byte b = 0;
    public static final byte c = 1;
    public static final byte d = 2;
    public static final byte e = 3;
    public static final byte f = 4;
    public final TIntObjectHashMap<String> g = new TIntObjectHashMap(45);

    private bNO() {
        this.a((byte)0);
        this.a((byte)1);
        this.a((byte)2);
        this.a((byte)4);
        this.b((byte)3);
        this.g.compact();
    }

    private void a(byte by) {
        String string = this.c(by);
        for (byte by2 = 0; by2 < 5; by2 = (byte)(by2 + 1)) {
            this.g.put(Hw.a(by, by2, (byte)0, (byte)0), (Object)(string + by2));
        }
    }

    private void b(byte by) {
        String string = this.c(by);
        for (byte by2 = 0; by2 < 5; by2 = (byte)((byte)(by2 + 1))) {
            for (byte by3 = 0; by3 < 5; by3 = (byte)(by3 + 1)) {
                this.g.put(Hw.a(by, by2, by3, (byte)0), (Object)(string + by2 + "_" + by3));
            }
        }
    }

    private String c(byte by) {
        switch (by) {
            case 0: {
                return "AnimMort";
            }
            case 1: {
                return "AnimPousse";
            }
            case 2: {
                return "AnimEtape";
            }
            case 4: {
                return "AnimHit";
            }
            case 3: {
                return "AnimRegression";
            }
        }
        h.error((Object)("type d'animation inconnue " + by));
        return "";
    }

    public String a(byte by, byte by2) {
        if (by2 >= 5) {
            return this.c(by) + by2;
        }
        return (String)this.g.get(Hw.a(by, by2, (byte)0, (byte)0));
    }

    public String a(byte by, byte by2, byte by3) {
        if (by2 >= 5 || by3 >= 5) {
            return this.c(by) + by2 + "_" + by3;
        }
        return (String)this.g.get(Hw.a(by, by2, by3, (byte)0));
    }

    public static bNO a() {
        return i;
    }
}

