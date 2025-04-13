/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public enum fjG {
    a(0, "Instance"),
    b(1, "Zone"),
    c(2, "Coordonn\u00e9es");

    private static final Logger d;
    private final byte e;
    private final String f;

    private fjG(byte by, String string2) {
        this.e = by;
        this.f = string2;
    }

    public byte a() {
        return this.e;
    }

    public static fjG a(byte by) {
        for (fjG fjG2 : fjG.values()) {
            if (fjG2.e != by) continue;
            return fjG2;
        }
        d.warn((Object)("type inconnu " + by));
        return a;
    }

    public String b() {
        return this.f;
    }

    static {
        d = Logger.getLogger(fjG.class);
    }
}

