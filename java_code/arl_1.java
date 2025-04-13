/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

/*
 * Renamed from arL
 */
public class arl_1 {
    private static final Logger a = Logger.getLogger(arl_1.class);
    private static final TIntObjectHashMap<String> b = new TIntObjectHashMap(20, 1.0f);

    public static boolean a(String string) {
        try {
            String string2;
            InputStream inputStream = gi_0.c(string);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while ((string2 = bufferedReader.readLine()) != null) {
                if (string2.length() == 0) continue;
                String[] stringArray = StringUtils.split((String)string2, (char)'=');
                if (stringArray.length != 2) {
                    a.warn((Object)("Erreur avec la ligne " + string2 + " (" + string + ")"));
                    continue;
                }
                b.put(Co.c(stringArray[0]), (Object)stringArray[1].intern());
            }
            bufferedReader.close();
            inputStream.close();
        }
        catch (IOException iOException) {
            a.error((Object)"", (Throwable)iOException);
            return false;
        }
        b.setAutoCompactionFactor(0.0f);
        b.compact();
        return true;
    }

    public static byte[] b(String string) {
        return gi_0.b(arl_1.e(string));
    }

    public static URL c(String string) {
        return new URL(arl_1.e(string));
    }

    public static String d(String string) {
        return arl_1.e(string);
    }

    private static String e(String string) {
        try {
            String string2 = gg_0.e(string);
            String string3 = StringUtils.splitByWholeSeparator((String)string2, (String)"!/", (int)0)[0];
            String string4 = gi_0.k(string3);
            int n = Co.c(string4);
            String string5 = (String)b.get(n);
            if (string5 == null) {
                return string2;
            }
            String string6 = gi_0.j(string3);
            Object object = string6.isEmpty() ? "" : "." + string6;
            return string2.replace((CharSequence)object, string5 + (String)object);
        }
        catch (Exception exception) {
            a.error((Object)"", (Throwable)exception);
            return string;
        }
    }
}

