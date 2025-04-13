/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.apache.log4j.Logger;

/*
 * Renamed from aHK
 */
public class ahk_2 {
    private static final Logger a = Logger.getLogger(ahk_2.class);

    public static ArrayList<String> a(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string2 = string.replace('.', '/');
        URL uRL = ahk_2.class.getClassLoader().getResource(string2);
        if (uRL == null) {
            throw new RuntimeException("Unexpected problem: No resource for " + string2);
        }
        uRL.getPath();
        if (uRL.toString().startsWith("jar:")) {
            ahk_2.a(uRL, string, arrayList);
        } else {
            ahk_2.a(new File(uRL.getPath()), string, arrayList);
        }
        return arrayList;
    }

    public static ArrayList<String> a(ArrayList<String> arrayList, Class clazz) {
        ArrayList<String> arrayList2 = new ArrayList<String>();
        for (String string : arrayList) {
            if (string.startsWith("-")) continue;
            if (string.contains("*")) {
                ahk_2.a(arrayList2, string, clazz);
                continue;
            }
            if (!ahk_2.a(string, clazz)) continue;
            arrayList2.add(string);
        }
        for (String string : arrayList) {
            if (!string.startsWith("-")) continue;
            ahk_2.a(arrayList2, string.substring(1));
        }
        return arrayList2;
    }

    private static void a(ArrayList<String> arrayList, String string, Class clazz) {
        String string2 = string.substring(0, string.indexOf("*") - 1);
        for (String string3 : ahk_2.a(string2)) {
            if (!string3.matches(string) || !ahk_2.a(string3, clazz)) continue;
            arrayList.add(string3);
        }
    }

    private static boolean a(String string, Class clazz) {
        try {
            Class<?> clazz2 = Class.forName(string);
            while (clazz2.getSuperclass() != null) {
                if (clazz2 == clazz) {
                    return true;
                }
                clazz2 = clazz2.getSuperclass();
            }
            return false;
        }
        catch (ExceptionInInitializerError exceptionInInitializerError) {
            a.error((Object)"", (Throwable)exceptionInInitializerError);
            return false;
        }
    }

    private static void a(ArrayList<String> arrayList, String string) {
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            if (!arrayList.get(k).matches(string)) continue;
            arrayList.remove(k);
        }
    }

    private static void a(File file, String string, ArrayList<String> arrayList) {
        String[] stringArray = file.list();
        for (int k = 0; k < stringArray.length; ++k) {
            File file2;
            String string2 = stringArray[k];
            String string3 = null;
            if (string2.endsWith(".class")) {
                string3 = string + "." + string2.substring(0, string2.length() - 6);
            }
            if (string3 != null) {
                arrayList.add(string3);
            }
            if (!(file2 = new File(file, string2)).isDirectory()) continue;
            ahk_2.a(file2, string + "." + string2, arrayList);
        }
    }

    private static void a(URL uRL, String string, ArrayList<String> arrayList) {
        JarFile jarFile;
        String string2 = string.replace('.', '/');
        String string3 = uRL.getPath();
        String string4 = string3.replaceFirst("[.]jar[!].*", ".jar").replaceFirst("file:", "");
        try {
            jarFile = new JarFile(string4);
        }
        catch (IOException iOException) {
            throw new RuntimeException("Unexpected IOException reading JAR File '" + string4 + "'", iOException);
        }
        Enumeration<JarEntry> enumeration = jarFile.entries();
        while (enumeration.hasMoreElements()) {
            JarEntry jarEntry = enumeration.nextElement();
            String string5 = jarEntry.getName();
            String string6 = null;
            if (string5.endsWith(".class") && string5.startsWith(string2) && string5.length() > string2.length() + "/".length()) {
                string6 = string5.replace('/', '.').replace('\\', '.').replace(".class", "");
            }
            if (string6 == null) continue;
            arrayList.add(string6);
        }
    }

    public static void a(String[] stringArray) {
    }
}

