/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortObjectIterator
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from XT
 */
public class xt_0 {
    public static final String a = "(([^\\p{L}]|\\A)(";
    public static final String b = ")([^\\p{L}]|\\z))";
    public static final String c = "((";
    public static final String d = "))";
    public static final String e = "([\\p{L}]*((";
    public static final String f = ")+)[\\p{L}]*)";
    public static final int g = 10000;
    private static final char[] h = new char[]{'&', '~', '#', '@', '\u00a3', '\u00a4', '\u00b5', '%', '!'};

    private xt_0() {
    }

    private static ArrayList<Pattern> a(List<String> list, String string, String string2, int n) {
        ArrayList<Pattern> arrayList = new ArrayList<Pattern>();
        int n2 = 0;
        while (n2 < list.size()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            boolean bl = true;
            while (n2 < list.size()) {
                if (bl) {
                    bl = false;
                } else {
                    stringBuilder.append('|');
                }
                stringBuilder.append(Pattern.quote(list.get(n2)));
                if (stringBuilder.length() > 10000) break;
                ++n2;
            }
            stringBuilder.append(string2);
            arrayList.add(Pattern.compile(stringBuilder.toString(), n));
        }
        return arrayList;
    }

    public static ArrayList<Pattern> a(TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap) {
        ArrayList<Pattern> arrayList = new ArrayList<Pattern>();
        TShortObjectIterator tShortObjectIterator = tShortObjectHashMap.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            if (xr_0.a(tShortObjectIterator.key()).b()) {
                arrayList.addAll(xt_0.a((List)tShortObjectIterator.value(), a, b, 2));
                continue;
            }
            arrayList.addAll(xt_0.a((List)tShortObjectIterator.value(), a, b, 2));
        }
        return arrayList;
    }

    public static ArrayList<Pattern> b(TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap) {
        ArrayList<Pattern> arrayList = new ArrayList<Pattern>();
        TShortObjectIterator tShortObjectIterator = tShortObjectHashMap.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            if (xr_0.a(tShortObjectIterator.key()).b()) {
                arrayList.addAll(xt_0.a((List)tShortObjectIterator.value(), c, d, 2));
                continue;
            }
            arrayList.addAll(xt_0.a((List)tShortObjectIterator.value(), e, f, 2));
        }
        return arrayList;
    }

    public static String a(String string, ArrayList<Pattern> arrayList) {
        for (int k = 0; k < arrayList.size(); ++k) {
            Pattern pattern = arrayList.get(k);
            string = xt_0.a(string, pattern);
        }
        return string;
    }

    public static String b(String string, ArrayList<Pattern> arrayList) {
        for (int k = 0; k < arrayList.size(); ++k) {
            Pattern pattern = arrayList.get(k);
            string = xt_0.b(string, pattern);
        }
        return string;
    }

    private static String a(String string, Pattern pattern) {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = string.trim();
        String string3 = Cz.e(string2);
        Matcher matcher = pattern.matcher(string3);
        int n = 0;
        while (matcher.find()) {
            stringBuilder.append(string2, n, matcher.start());
            n = matcher.end();
            int n2 = matcher.end() - matcher.start();
            xt_0.a(stringBuilder, n2);
        }
        stringBuilder.append(string2, n, string2.length());
        return stringBuilder.toString();
    }

    private static String b(String string, Pattern pattern) {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = string.trim();
        String string3 = Cz.e(string2);
        Matcher matcher = pattern.matcher(string3);
        int n = 0;
        while (matcher.find()) {
            stringBuilder.append(string2, n, matcher.start(2));
            n = matcher.end(2);
            int n2 = matcher.end(2) - matcher.start(2);
            xt_0.a(stringBuilder, n2);
        }
        stringBuilder.append(string2, n, string2.length());
        return stringBuilder.toString();
    }

    public static void a(StringBuilder stringBuilder, int n) {
        for (int k = 0; k < n; ++k) {
            stringBuilder.append(h[Hw.a(h.length)]);
        }
    }
}

