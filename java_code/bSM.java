/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.net.MalformedURLException;
import org.apache.log4j.Logger;

public class bSM {
    private static final Logger a = Logger.getLogger(bSM.class);

    private bSM() {
    }

    public static String a(File file) {
        try {
            return file.toURI().toURL().toString();
        }
        catch (MalformedURLException malformedURLException) {
            a.warn((Object)malformedURLException.getMessage());
            return null;
        }
    }

    public static File a(String string) {
        String string2 = gi_0.m(string);
        String string3 = gi_0.m(string2);
        String string4 = gi_0.n(string3);
        String string5 = gi_0.n(string2);
        String string6 = gi_0.k(string);
        String string7 = gi_0.j(string);
        String string8 = string4 + string5 + string6 + "." + string7;
        String string9 = azs_0.a().y("webShop");
        return new File(string9 + File.separator + string8);
    }
}

