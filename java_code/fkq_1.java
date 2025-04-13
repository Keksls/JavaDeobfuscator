/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKq
 */
public class fkq_1 {
    public static String a(String string) {
        return "id=\"" + string + "\"";
    }

    public static String b(String string) {
        return "color=\"" + string + "\"";
    }

    public static String a(int n) {
        return "size=\"" + n + "\"";
    }

    public static String c(String string) {
        return "align=\"" + string + "\"";
    }

    public static String a(String string, String ... stringArray) {
        return fkq_1.a(string, "b", stringArray);
    }

    public static String b(String string, String ... stringArray) {
        return fkq_1.a(string, "i", stringArray);
    }

    public static String c(String string, String ... stringArray) {
        return fkq_1.a(string, "u", stringArray);
    }

    public static String a(String string, int n, int n2, String string2) {
        return fkq_1.a(string, n, n2, string2, null);
    }

    public static String a(String string, int n, int n2, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder("<image pixmap=\"");
        stringBuilder.append(string).append("\"");
        if (n > 0) {
            stringBuilder.append(" width=\"").append(n).append("\"");
        }
        if (n2 > 0) {
            stringBuilder.append(" height=\"").append(n2).append("\"");
        }
        if (string2 != null) {
            stringBuilder.append(" align=\"").append(string2).append("\"");
        }
        if (string3 != null) {
            stringBuilder.append(" popupTranslatorKey=\"").append(string3).append("\"");
        }
        stringBuilder.append("></image>");
        return stringBuilder.toString();
    }

    public static String d(String string, String ... stringArray) {
        return fkq_1.a(string, "text", stringArray);
    }

    private static String a(String string, String string2, String ... stringArray) {
        StringBuilder stringBuilder = new StringBuilder("<").append(string2);
        if (stringArray != null) {
            for (String string3 : stringArray) {
                stringBuilder.append(" ").append(string3);
            }
        }
        return stringBuilder.append(">").append(string).append("</").append(string2).append(">").toString();
    }
}

