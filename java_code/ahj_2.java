/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHJ
 */
public abstract class ahj_2 {
    public static String a(byte[] byArray) {
        if (byArray == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < byArray.length; ++k) {
            if (k != 0) {
                stringBuilder.append(' ');
            }
            int n = byArray[k] & 0xFF;
            stringBuilder.append(Integer.toHexString(n));
        }
        return stringBuilder.toString();
    }

    public static String b(byte[] byArray) {
        if (byArray == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (byte by : byArray) {
            int n = by & 0xFF;
            if (n >= 32 && n <= 127) {
                stringBuilder.append((char)n);
                continue;
            }
            stringBuilder.append('.');
        }
        return stringBuilder.toString();
    }
}

