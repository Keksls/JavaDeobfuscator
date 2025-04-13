/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from aog
 */
public final class aog_1 {
    private static final Logger a = Logger.getLogger(aog_1.class);
    private static final String b = "";

    private aog_1() {
    }

    public static String a() {
        return b;
    }

    @Deprecated
    public static aoi_1 a(aod_2 aod_22, String string) {
        List<apy_1> list = aog_1.b(aod_22, string);
        if (list == null) {
            return null;
        }
        return aog_1.a(list);
    }

    private static aoi_1 a(List<apy_1> list) {
        return new aop_1(aoj_2.a(list));
    }

    private static List<apy_1> b(aod_2 aod_22, String string) {
        Pattern pattern = Pattern.compile(aod_22.a());
        Matcher matcher = pattern.matcher(string);
        ArrayList<apy_1> arrayList = new ArrayList<apy_1>();
        while (matcher.find()) {
            apy_1 apy_12 = aod_22.a(matcher.group());
            if (apy_12 != null) {
                arrayList.add(apy_12);
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder("Erreur de syntaxe : '").append(matcher.group()).append("' (");
            if (matcher.start() > 0) {
                stringBuilder.append(string.substring(0, matcher.start()));
            }
            stringBuilder.append(" # ").append(matcher.group()).append(" # ");
            if (matcher.end() < string.length()) {
                stringBuilder.append(string.substring(matcher.end(), string.length()));
            }
            stringBuilder.append(')');
            throw new aoh_1(stringBuilder.toString());
        }
        return arrayList;
    }
}

