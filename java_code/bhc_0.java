/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.EnumMap;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bHC
 */
public final class bhc_0 {
    private static final azj_2 a = new fyr_0(elw_1.ae);
    private static final EnumMap<exw_1, azj_2> b = new EnumMap(exw_1.class);

    private bhc_0() {
    }

    @NotNull
    public static azj_2 a(exw_1 exw_12) {
        return b.getOrDefault(exw_12, a);
    }

    @NotNull
    public static String b(exw_1 exw_12) {
        return bhc_0.a(exw_12).w();
    }

    static {
        for (exw_1 exw_12 : exw_1.values()) {
            b.put(exw_12, new fyr_0(exw_12.m()));
        }
    }
}

