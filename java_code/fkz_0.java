/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from fkZ
 */
public final class fkz_0 {
    private static final Logger a = Logger.getLogger(fkz_0.class);

    private fkz_0() {
    }

    public static float a(short s2, Collection<Short> collection, boolean bl) {
        if (collection == null) {
            return 1.0f;
        }
        try {
            int n = 0;
            for (short s3 : collection) {
                if (s2 >= s3) continue;
                ++n;
            }
            if (bl) {
                int n2 = Math.min(n, oi_0.f.length - 1);
                return oi_0.f[n2];
            }
            int n3 = Math.min(n, oi_0.g.length - 1);
            return oi_0.g[n3];
        }
        catch (Exception exception) {
            a.error((Object)"Exception during reroll xp factor compute", (Throwable)exception);
            return 1.0f;
        }
    }
}

