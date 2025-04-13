/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from boI
 */
public enum boi_2 {
    a(Integer.MIN_VALUE, "808080", -1),
    b(Integer.MIN_VALUE, "808080", 3),
    c(Integer.MIN_VALUE, "808080", 4),
    d(Integer.MIN_VALUE, "808080", 0),
    e(-20, "6561ff", 0),
    f(-12, "61ff65", 0),
    g(-4, "ffffff", 1),
    h(4, "ffb761", 2),
    i(12, "ff0000", 2),
    j(20, "d200ff", 2),
    k(Integer.MAX_VALUE, "d200ff", 5);

    private final int l;
    private final String m;
    private final byte n;
    private static final Logger o;

    private boi_2(int n2, String string2, byte by) {
        this.l = n2;
        this.m = string2;
        this.n = by;
    }

    public static boi_2 a(int n, int n2) {
        int n3 = n2 - n;
        boi_2 boi_22 = null;
        for (boi_2 boi_23 : boi_2.values()) {
            if (boi_23.l <= n3) {
                boi_22 = boi_23;
                continue;
            }
            if (boi_23.l > n3) break;
        }
        return boi_22;
    }

    public static boi_2 b(int n, int n2) {
        if (n <= n2 / 2) {
            return f;
        }
        if (n <= n2 * 3 / 4) {
            return g;
        }
        if (n <= n2) {
            return h;
        }
        return null;
    }

    public String a() {
        return this.m;
    }

    public String a(int n) {
        switch (this) {
            case a: {
                try {
                    return azs_0.z("groupDifficultyChallengeIconPath");
                }
                catch (gm_0 gm_02) {
                    o.warn((Object)gm_02.getMessage());
                    break;
                }
            }
            default: {
                try {
                    return gg_0.a(azs_0.a().a("groupDifficultyIconsPath"), n, this.n);
                }
                catch (gm_0 gm_03) {
                    o.warn((Object)gm_03.getMessage());
                    return null;
                }
            }
        }
        return null;
    }

    static {
        o = Logger.getLogger(boi_2.class);
    }
}

