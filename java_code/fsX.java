/*
 * Decompiled with CFR 0.152.
 */
public enum fsX {
    a,
    b,
    c,
    d;


    public static fsX a(String string) {
        fsX[] fsXArray;
        for (fsX fsX2 : fsXArray = fsX.values()) {
            if (!fsX2.name().equals(string.toUpperCase())) continue;
            return fsX2;
        }
        return fsXArray[0];
    }
}

