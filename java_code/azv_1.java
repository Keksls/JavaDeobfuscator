/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from azv
 */
public class azv_1 {
    private static final Logger c = Logger.getLogger(azv_1.class);
    private final TIntObjectHashMap<azx_1> d = new TIntObjectHashMap();
    private final HashMap<String, Integer> e = new HashMap();
    private final ArrayList<azy_1> f = new ArrayList();
    public static final String a = ".tga";

    public void a(String string) {
        File[] fileArray;
        File file = new File(string);
        assert (file.exists() && file.isDirectory()) : "Chemin rentr\u00e9 invalide : " + string;
        try {
            fileArray = file.toURI().toURL();
        }
        catch (MalformedURLException malformedURLException) {
            c.error((Object)("url invalide : " + string));
        }
        fileArray = file.listFiles(azw_1.a);
        String[] stringArray = new String[fileArray.length];
        for (int k = 0; k < fileArray.length; ++k) {
            stringArray[k] = gi_0.k(fileArray[k].getAbsolutePath());
        }
        this.a(file, stringArray);
    }

    public void a(File file, String[] stringArray) {
        for (String string : stringArray) {
            this.a(new File(file, string + ".crd"));
            this.b(new File(file, string + ".ref"));
        }
    }

    public azx_1 a(int n) {
        return (azx_1)this.d.get(n);
    }

    public int b(String string) {
        Integer n = this.e.get(string);
        if (n != null) {
            return n;
        }
        return 0;
    }

    public ArrayList<azy_1> a() {
        return this.f;
    }

    private void a(File file) {
        arf_1 arf_12;
        try {
            arf_12 = arf_1.a(gi_0.a(file));
        }
        catch (IOException iOException) {
            c.warn((Object)("Impossible de trouver le fichier " + file));
            return;
        }
        String string = gi_0.k(file.toString());
        String string2 = string + a;
        this.f.add(new azy_1(string2, string));
        try {
            int n = arf_12.c();
            for (int k = 0; k < n; ++k) {
                int n2 = arf_12.c();
                this.d.put(n2, (Object)new azx_1(n2, arf_12.b(), arf_12.b(), arf_12.b(), arf_12.b(), string2));
            }
        }
        catch (Exception exception) {
            c.error((Object)"Exception during loadSection", (Throwable)exception);
        }
    }

    private void b(File file) {
        arf_1 arf_12;
        try {
            arf_12 = arf_1.a(gi_0.a(file));
        }
        catch (IOException iOException) {
            c.warn((Object)("Impossible de trouver le fichier " + file));
            return;
        }
        try {
            int n = arf_12.c();
            for (int k = 0; k < n; ++k) {
                String string = arf_12.e();
                int n2 = arf_12.c();
                this.e.put(new File(string).getCanonicalPath(), n2);
            }
        }
        catch (IOException iOException) {
            c.error((Object)"IOException during loadPixmapCorrelation", (Throwable)iOException);
        }
    }
}

