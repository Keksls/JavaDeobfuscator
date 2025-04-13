/*
 * Decompiled with CFR 0.152.
 */
public enum aiO {
    a,
    b,
    c,
    d,
    e,
    f,
    g,
    h;


    public static aiO a(String string) {
        aiO[] aiOArray;
        for (aiO aiO2 : aiOArray = aiO.values()) {
            if (!aiO2.name().equals(string.toUpperCase())) continue;
            return aiO2;
        }
        return aiOArray[0];
    }
}

