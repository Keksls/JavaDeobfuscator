/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

public class bSL {
    private static final Logger b = Logger.getLogger(bSL.class);
    public static final bSL a = new bSL();
    private final aiq_1 c = new aiq_1("Shop-Downloader", -1);

    public void a(String string, aiu_1 aiu_12) {
        try {
            File file = bSM.a(string);
            aib_2 aib_22 = new aib_2(aia_2.a.b(file.getName()));
            aiz_1 aiz_12 = new aiz_1(new URL(string), file, true, true);
            aiz_12.a(aib_22);
            this.c.a(aiz_12, new bsy_0(aiu_12));
        }
        catch (MalformedURLException malformedURLException) {
            b.warn((Object)malformedURLException.getMessage());
        }
    }

    public String toString() {
        return "WebShopDataDownloader}";
    }
}

