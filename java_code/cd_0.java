/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

/*
 * Renamed from CD
 */
public final class cd_0 {
    private static final Logger a = Logger.getLogger(cd_0.class);

    public static boolean a(String string) {
        try {
            new URL(string);
            return true;
        }
        catch (MalformedURLException malformedURLException) {
            return false;
        }
    }

    public static boolean a(URL uRL) {
        try {
            InputStream inputStream = uRL.openStream();
            inputStream.close();
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static boolean b(String string) {
        URL uRL;
        try {
            uRL = gg_0.d(string);
        }
        catch (MalformedURLException malformedURLException) {
            return false;
        }
        return cd_0.a(uRL);
    }

    public static URL a(URL uRL, String string) {
        int n = 0;
        while (string.startsWith("../")) {
            string = string.substring(3);
            ++n;
        }
        String string2 = uRL.toExternalForm();
        String[] stringArray = Cz.a(string2, '/');
        if (n > stringArray.length - 1) {
            a.error((Object)("Impossible de rajouter " + n + " ../ au chemin " + uRL.toExternalForm()));
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = cd_0.b(uRL) ? 0 : 1;
        int n3 = stringArray.length - n2 - n;
        if (n3 > 0) {
            for (int k = 0; k < n3; ++k) {
                stringBuilder.append(stringArray[k]).append('/');
            }
        } else {
            stringBuilder.append(uRL.getProtocol()).append(':');
        }
        stringBuilder.append(string);
        return gg_0.d(stringBuilder.toString());
    }

    private static boolean b(URL uRL) {
        String string = uRL.getFile();
        if (string == null) {
            return false;
        }
        if (uRL.getProtocol().equals("file")) {
            File file = new File(string);
            if (file.exists()) {
                return file.isDirectory();
            }
            return false;
        }
        int n = string.length();
        int n2 = string.lastIndexOf(47);
        if (n2 != -1 && n2 + 1 == n) {
            return true;
        }
        for (int k = n2 + 1; k < n; ++k) {
            if (string.charAt(k) != '.') continue;
            return false;
        }
        return true;
    }
}

