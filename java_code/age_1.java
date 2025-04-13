/*
 * Decompiled with CFR 0.152.
 */
import java.sql.ResultSet;

/*
 * Renamed from aGE
 */
public class age_1 {
    public static String a(String string) {
        return string.replace("'", "\\'");
    }

    public static float a(ResultSet resultSet, String string) {
        String string2 = resultSet.getString(string);
        String string3 = string2.replace(',', '.');
        return Co.e(string3);
    }

    public static float a(ResultSet resultSet, int n) {
        String string = resultSet.getString(n);
        String string2 = string.replace(',', '.');
        return Co.e(string2);
    }

    public static double b(ResultSet resultSet, String string) {
        String string2 = resultSet.getString(string);
        String string3 = string2.replace(',', '.');
        return Co.d(string3);
    }

    public static double b(ResultSet resultSet, int n) {
        String string = resultSet.getString(n);
        String string2 = string.replace(',', '.');
        return Co.d(string2);
    }
}

