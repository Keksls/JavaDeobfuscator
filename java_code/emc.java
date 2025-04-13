/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;

public enum emc {
    a(new emc[0]),
    b(a),
    c(a, b);

    private final List<emc> d;

    private emc(emc ... emcArray) {
        this.d = Arrays.asList(emcArray);
    }

    public List<emc> a() {
        return this.d;
    }

    public static emc a(String string) {
        String string2 = string.toUpperCase();
        for (emc emc2 : emc.values()) {
            if (!emc2.name().equals(string2)) continue;
            return emc2;
        }
        return null;
    }
}

