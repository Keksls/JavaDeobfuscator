/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bRZ
 */
public enum brz_2 {
    a(""),
    b("MAX_TOTAL_PURCHASES_ACCOUNT");

    private final String c;

    private brz_2(String string2) {
        this.c = string2;
    }

    @Nullable
    public static brz_2 a(String string) {
        for (brz_2 brz_22 : brz_2.values()) {
            if (!brz_22.c.equals(string)) continue;
            return brz_22;
        }
        return null;
    }
}

