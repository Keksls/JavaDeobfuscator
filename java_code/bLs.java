/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class bLs {
    private static final Logger r = Logger.getLogger(bLs.class);
    public static final bLs a = new bLs();
    private final TIntObjectHashMap<fjh_1> s = new TIntObjectHashMap();
    public static final fjh_1 b;
    public static final fjh_1 c;
    public static final fjh_1 d;
    public static final fjh_1 e;
    public static final fjh_1 f;
    public static final fjh_1 g;
    public static final fjh_1 h;
    public static final fjh_1 i;
    public static final fjh_1 j;
    public static final fjh_1 k;
    public static final fjh_1 l;
    public static final fjh_1 m;
    public static final fjh_1 n;
    public static final fjh_1 o;
    public static final fjh_1 p;
    public static final short q = 46;

    @Nullable
    public fjh_1 a(int n) {
        fjh_1 fjh_12 = (fjh_1)this.s.get(n);
        if (fjh_12 != null || this.s.containsKey(n)) {
            return fjh_12;
        }
        float f2 = bLs.b(n);
        try {
            String string = azs_0.a().a("pointsOfInterestIconPath");
            String string2 = gg_0.a(string, new Object[]{n});
            if (!cd_0.b(string2)) {
                r.warn((Object)("Impossible de trouver la texture " + string2));
            } else {
                fjh_12 = new fjh_1(string2, 0.5f, f2);
            }
        }
        catch (gm_0 gm_02) {
            r.warn((Object)gm_02.getMessage());
        }
        this.s.put(n, (Object)fjh_12);
        return fjh_12;
    }

    private static float b(int n) {
        if (n == 36) {
            return 1.0f;
        }
        return 0.66f;
    }

    private static fjh_1 a(String string) {
        return bLs.a(string, 0.5f, 0.66f);
    }

    private static fjh_1 a(String string, float f2, float f3) {
        try {
            String string2 = azs_0.z(string);
            if (!cd_0.b(string2)) {
                r.warn((Object)("Impossible de trouver la texture " + string2 + " key=" + string));
                return null;
            }
            return new fjh_1(string2, f2, f3);
        }
        catch (gm_0 gm_02) {
            r.error((Object)("Probl\u00e8me de chargement de l'icone pathKey=" + string), (Throwable)gm_02);
            return null;
        }
    }

    static {
        p = bLs.a("newPoiPath");
        b = bLs.a("zaapPoiPath");
        c = bLs.a("dragoPoiPath");
        e = bLs.a("boatPoiPath");
        d = bLs.a("cannonPoiPath");
        f = bLs.a("pointsOfInterestDefaultSmallIconPath", 0.5f, 0.5f);
        g = bLs.a("compassPointFile");
        j = bLs.a("miniMapPointFile", 0.5f, 0.5f);
        k = bLs.a("miniMapPointBigFile", 0.5f, 1.0f);
        o = bLs.a("partyMemberPoiPath", 0.5f, 1.0f);
        h = bLs.a("pointsOfInterestProtectorIconPath");
        i = bLs.a("pointsOfInterestProtectorinChaosIconPath");
        l = bLs.a("hwBuidingIconRedPath");
        m = bLs.a("hwBuidingIconOrangePath");
        n = bLs.a("hwBuidingIconGreenPath");
    }
}

