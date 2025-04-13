/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSj
 */
public enum bsj_2 {
    a(""),
    b("PARTNER_MISSING"),
    c("PARTNER_NOORDER"),
    d("PARTNER_ERROR"),
    e("QUICKBUY_PAIDFAILED"),
    f("QUICKBUY_CANCELFAILED");

    private final String g;

    private bsj_2(String string2) {
        this.g = string2;
    }

    @Nullable
    public static bsj_2 a(String string) {
        for (bsj_2 bsj_22 : bsj_2.values()) {
            if (!bsj_22.g.equals(string)) continue;
            return bsj_22;
        }
        return null;
    }
}

