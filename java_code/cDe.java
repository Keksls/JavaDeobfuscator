/*
 * Decompiled with CFR 0.152.
 */
public enum cDe {
    a,
    b,
    c;


    static cDe a(String string) {
        for (cDe cDe2 : cDe.values()) {
            if (!cDe2.name().equals(string)) continue;
            return cDe2;
        }
        return a;
    }
}

