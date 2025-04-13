/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import org.apache.log4j.Logger;

/*
 * Renamed from Gl
 */
public class gl_0 {
    private static final Logger a = Logger.getLogger(gl_0.class);
    private static final String b = ",";
    private static final String c = "%s_";
    private static final String d = "%s_%d";
    private final Properties e = new Properties();

    public String a(String string) {
        String string2 = this.e.getProperty(string);
        if (string2 == null) {
            throw new gm_0("Il n'existe pas de propri\u00e9t\u00e9: " + string);
        }
        return string2;
    }

    public String a(String string, String string2) {
        String string3 = this.e.getProperty(string);
        return string3 == null ? string2 : string3;
    }

    public ArrayList<String> b(String string) {
        int n = 1;
        ArrayList<String> arrayList = new ArrayList<String>();
        String string2 = String.format(d, string, n);
        while (this.e.containsKey(string2)) {
            arrayList.add(this.a(string2));
            string2 = String.format(d, string, ++n);
        }
        return arrayList;
    }

    public String[] c(String string) {
        String string2 = this.a(string);
        return this.l(string2);
    }

    public ArrayList<String[]> d(String string) {
        ArrayList<String> arrayList = this.b(string);
        ArrayList<String[]> arrayList2 = new ArrayList<String[]>();
        for (String string2 : arrayList) {
            arrayList2.add(this.l(string2));
        }
        return arrayList2;
    }

    public int e(String string) {
        String string2 = this.a(string);
        try {
            return Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            throw new gm_0("La propri\u00e9t\u00e9 " + string + " n'est pas un int.");
        }
    }

    public int a(String string, int n) {
        return Co.a((Object)this.e.getProperty(string), n);
    }

    public float f(String string) {
        String string2 = this.a(string);
        try {
            return Float.valueOf(string2).floatValue();
        }
        catch (NumberFormatException numberFormatException) {
            throw new gm_0("La propri\u00e9t\u00e9 " + string + " n'est pas un float.");
        }
    }

    public float a(String string, float f2) {
        return Co.a((Object)this.e.getProperty(string), f2);
    }

    public double g(String string) {
        String string2 = this.a(string);
        try {
            return Double.valueOf(string2);
        }
        catch (NumberFormatException numberFormatException) {
            throw new gm_0("La propri\u00e9t\u00e9 " + string + " n'est pas un double.");
        }
    }

    public double a(String string, double d2) {
        return Co.a((Object)this.e.getProperty(string), d2);
    }

    public boolean h(String string) {
        String string2 = this.a(string);
        return Boolean.valueOf(string2);
    }

    public boolean a(String string, boolean bl) {
        return Co.a(this.e.getProperty(string), bl);
    }

    public void b(String string, String string2) {
        if (this.e != null) {
            this.e.setProperty(string, string2);
        }
    }

    public void a(String string, ArrayList<String> arrayList) {
        int n = 1;
        for (String string2 : arrayList) {
            String string3 = String.format(d, string, n++);
            this.b(string3, string2);
        }
    }

    public void b(String string, ArrayList<String[]> arrayList) {
        int n = 1;
        for (String[] stringArray : arrayList) {
            String string2 = String.format(d, string, n++);
            this.a(string2, stringArray);
        }
    }

    public void a(String string, String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < stringArray.length; ++k) {
            stringBuilder.append(stringArray[k]);
            if (k >= stringArray.length - 1) continue;
            stringBuilder.append(b);
        }
        this.b(string, stringBuilder.toString());
    }

    public void b(String string, int n) {
        this.b(string, Integer.toString(n));
    }

    public void b(String string, float f2) {
        this.b(string, Float.toString(f2));
    }

    public void b(String string, double d2) {
        this.b(string, Double.toString(d2));
    }

    public void b(String string, boolean bl) {
        this.b(string, Boolean.toString(bl));
    }

    public boolean a(InputStream inputStream) {
        try {
            this.e.load(inputStream);
        }
        catch (IOException iOException) {
            return false;
        }
        return true;
    }

    public boolean a(URL uRL) {
        try {
            if (uRL != null) {
                return this.a(uRL.openStream());
            }
            a.error((Object)"url nulle au load.");
            return false;
        }
        catch (IOException iOException) {
            a.error((Object)"IOException during PropertiesReaderWriter load", (Throwable)iOException);
            return false;
        }
    }

    public boolean i(String string) {
        try {
            File file = new File(string);
            if (file.exists()) {
                return this.a(new FileInputStream(file));
            }
            URL uRL = this.getClass().getClassLoader().getResource(string);
            if (uRL != null) {
                return this.a(uRL);
            }
            a.error((Object)("Impossible de trouver le fichier de propri\u00e9t\u00e9 " + string));
            return false;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return false;
        }
    }

    public boolean j(String string) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(string);
            this.e.store(fileOutputStream, null);
            ((OutputStream)fileOutputStream).close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            return false;
        }
        catch (IOException iOException) {
            return false;
        }
        return true;
    }

    public void k(String string) {
        String string2 = String.format(c, string);
        Enumeration<Object> enumeration = this.e.keys();
        while (enumeration.hasMoreElements()) {
            String string3;
            Object object = enumeration.nextElement();
            if (!(object instanceof String) || !(string3 = (String)object).startsWith(string2)) continue;
            this.e.remove(string3);
        }
    }

    private String[] l(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, b);
        Vector<String> vector = new Vector<String>();
        while (stringTokenizer.hasMoreTokens()) {
            vector.addElement(stringTokenizer.nextToken());
        }
        Object[] objectArray = new String[vector.size()];
        vector.copyInto(objectArray);
        return objectArray;
    }
}

