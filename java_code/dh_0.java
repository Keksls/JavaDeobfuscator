/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Dh
 */
public final class dh_0 {
    private dh_0() {
    }

    static boolean a(String string) {
        if (string == null || string.trim().isEmpty() || "null".equals(string)) {
            return false;
        }
        if (!string.startsWith("_Anim", 1)) {
            return false;
        }
        char c2 = string.charAt(0);
        return c2 == '3' || c2 == '4' || c2 == '7';
    }
}

