/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.log4j.Logger;

/*
 * Renamed from aAP
 */
public class aap_2
implements aar_2 {
    protected static final Logger a = Logger.getLogger(aap_2.class);
    private static final int f = 2048;
    static final byte[] g = new byte[2048];
    static final byte[] h = new byte[2048];
    static boolean i;

    public static void a(String string, String string2, OutputStream outputStream, boolean bl) {
        aaq_2 aaq_22 = new aaq_2(string);
        aaq_2 aaq_23 = new aaq_2(string2);
        try {
            String string3;
            Object object;
            Cloneable cloneable;
            HashMap<Object, String> hashMap = new HashMap<Object, String>();
            HashSet<Object> hashSet = new HashSet<Object>();
            HashSet<String> hashSet2 = new HashSet<String>();
            HashSet<Object> hashSet3 = new HashSet<Object>();
            Iterator<Object> iterator = aaq_23.b();
            if (iterator != null) {
                while (iterator.hasNext()) {
                    cloneable = (JarEntry)iterator.next();
                    object = ((ZipEntry)cloneable).getName();
                    string3 = aaq_22.a(aaq_23, (JarEntry)cloneable);
                    if (string3 == null) {
                        if (i) {
                            a.info((Object)("NEW: " + (String)object));
                        }
                        hashSet3.add(object);
                        continue;
                    }
                    if (string3.equals(object) && !hashSet2.contains(string3)) {
                        if (i) {
                            a.info((Object)((String)object + " added to implicit set!"));
                        }
                        hashSet.add(object);
                        continue;
                    }
                    if (!bl && (hashSet.contains(string3) || hashSet2.contains(string3))) {
                        if (i) {
                            a.info((Object)("NEW: " + (String)object));
                        }
                        hashSet3.add(object);
                    } else {
                        if (i) {
                            a.error((Object)("moved.put " + (String)object + " " + string3));
                        }
                        hashMap.put(object, string3);
                        hashSet2.add(string3);
                    }
                    if (!hashSet.contains(string3) || !bl) continue;
                    if (i) {
                        a.error((Object)("implicit.remove " + string3 + " / moved.put " + string3 + " " + string3));
                    }
                    hashSet.remove(string3);
                    hashMap.put(string3, string3);
                    hashSet2.add(string3);
                }
            }
            cloneable = new ArrayList();
            iterator = aaq_22.b();
            if (iterator != null) {
                while (iterator.hasNext()) {
                    object = (JarEntry)iterator.next();
                    string3 = ((ZipEntry)object).getName();
                    if (hashSet.contains(string3) || hashSet2.contains(string3) || hashSet3.contains(string3)) continue;
                    if (i) {
                        a.error((Object)("deleted.add " + string3));
                    }
                    ((ArrayList)cloneable).add(string3);
                }
            }
            if (i) {
                iterator = hashMap.keySet().iterator();
                if (iterator != null) {
                    a.info((Object)"MOVED MAP!!!");
                    while (iterator.hasNext()) {
                        object = (String)iterator.next();
                        string3 = (String)hashMap.get(object);
                        a.info((Object)("key is " + (String)object + " value is " + string3));
                    }
                }
                if ((iterator = hashSet.iterator()) != null) {
                    a.info((Object)"IMOVE MAP!!!");
                    while (iterator.hasNext()) {
                        object = (String)iterator.next();
                        a.info((Object)("key is " + (String)object));
                    }
                }
            }
            object = new JarOutputStream(outputStream);
            iterator = hashSet3.iterator();
            if (iterator != null) {
                while (iterator.hasNext()) {
                    string3 = (String)iterator.next();
                    if (i) {
                        a.info((Object)("New File: " + string3 + " - " + iterator.hasNext()));
                    }
                    JarEntry jarEntry = new JarEntry(string3);
                    aap_2.a((JarOutputStream)object, jarEntry, aaq_23);
                }
            }
            aap_2.a((JarOutputStream)object, (List)((Object)cloneable), hashMap);
            ((ZipOutputStream)object).finish();
            ((ZipOutputStream)object).close();
        }
        catch (IOException iOException) {
            throw iOException;
        }
        finally {
            try {
                aaq_22.a().close();
            }
            catch (IOException iOException) {}
            try {
                aaq_23.a().close();
            }
            catch (IOException iOException) {}
        }
    }

    private static void a(JarOutputStream jarOutputStream, List list, Map map) {
        Object object;
        Object object2;
        StringWriter stringWriter = new StringWriter();
        stringWriter.write("version 1.0");
        stringWriter.write("\r\n");
        for (int k = 0; k < list.size(); ++k) {
            object2 = (String)list.get(k);
            stringWriter.write("remove");
            stringWriter.write(" ");
            aap_2.a(stringWriter, (String)object2);
            stringWriter.write("\r\n");
        }
        Iterator iterator = map.keySet().iterator();
        if (iterator != null) {
            while (iterator.hasNext()) {
                object2 = (String)iterator.next();
                object = (String)map.get(object2);
                stringWriter.write("move");
                stringWriter.write(" ");
                aap_2.a(stringWriter, (String)object);
                stringWriter.write(" ");
                aap_2.a(stringWriter, (String)object2);
                stringWriter.write("\r\n");
            }
        }
        object2 = new JarEntry("META-INF/INDEX.JD");
        object = stringWriter.toString().getBytes("UTF-8");
        stringWriter.close();
        jarOutputStream.putNextEntry((ZipEntry)object2);
        jarOutputStream.write((byte[])object, 0, ((byte[])object).length);
    }

    private static void a(Writer writer, String string) {
        int n = 0;
        int n2 = 0;
        char[] cArray = null;
        while ((n = string.indexOf(32, n)) != -1) {
            if (n2 != n) {
                if (cArray == null) {
                    cArray = string.toCharArray();
                }
                writer.write(cArray, n2, n - n2);
            }
            n2 = n++;
            writer.write(92);
        }
        if (n2 != 0) {
            writer.write(cArray, n2, cArray.length - n2);
        } else {
            writer.write(string);
        }
    }

    private static void a(JarOutputStream jarOutputStream, JarEntry jarEntry, aaq_2 aaq_22) {
        aap_2.a(jarOutputStream, jarEntry, aaq_22.a().getInputStream(jarEntry));
    }

    private static void a(JarOutputStream jarOutputStream, JarEntry jarEntry, InputStream inputStream) {
        try {
            jarOutputStream.putNextEntry(jarEntry);
            try {
                int n = inputStream.read(g);
                while (n != -1) {
                    jarOutputStream.write(g, 0, n);
                    n = inputStream.read(g);
                }
            }
            catch (IOException iOException) {
                throw iOException;
            }
            finally {
                try {
                    inputStream.close();
                }
                catch (IOException iOException) {
                    a.error((Object)"IOException during writeEntry", (Throwable)iOException);
                }
            }
        }
        catch (IOException iOException) {
            a.error((Object)("Available datas : " + inputStream.available() + " byte(s)"));
            a.error((Object)("Entry : " + jarEntry + ", size=" + jarEntry.getSize() + ", c.size=" + jarEntry.getCompressedSize()));
            byte[] byArray = jarEntry.getExtra();
            a.error((Object)("Entry extra bytes length : " + (byArray != null ? byArray.length : 0)));
            a.error((Object)("Entry method : " + (jarEntry.getMethod() == 8 ? "DEFLATED" : "STORED")));
            a.error((Object)"IOException during writeEntry", (Throwable)iOException);
            throw iOException;
        }
    }

    private static void a() {
        a.info((Object)"JarDiff: [-nonminimal (for backward compatibility with 1.0.1/1.0] [-creatediff | -applydiff] [-output file] old.jar new.jar");
    }

    public static void a(String[] stringArray) {
        boolean bl = true;
        boolean bl2 = true;
        String string = "out.jardiff.jar";
        for (int k = 0; k < stringArray.length; ++k) {
            FileOutputStream fileOutputStream;
            if (stringArray[k].equals("-nonminimal") || stringArray[k].equals("-n")) {
                bl2 = false;
                continue;
            }
            if (stringArray[k].equals("-creatediff") || stringArray[k].equals("-c")) {
                bl = true;
                continue;
            }
            if (stringArray[k].equals("-applydiff") || stringArray[k].equals("-a")) {
                bl = false;
                continue;
            }
            if (stringArray[k].equals("-debug") || stringArray[k].equals("-d")) {
                i = true;
                continue;
            }
            if (stringArray[k].equals("-output") || stringArray[k].equals("-o")) {
                if (++k >= stringArray.length) continue;
                string = stringArray[k];
                continue;
            }
            if (stringArray[k].equals("-applydiff") || stringArray[k].equals("-a")) {
                bl = false;
                continue;
            }
            if (k + 2 != stringArray.length) {
                aap_2.a();
                System.exit(0);
            }
            if (bl) {
                try {
                    fileOutputStream = new FileOutputStream(string);
                    aap_2.a(stringArray[k], stringArray[k + 1], fileOutputStream, bl2);
                    ((OutputStream)fileOutputStream).close();
                }
                catch (IOException iOException) {
                    a.info((Object)("Jardiff Error : " + iOException));
                }
            } else {
                try {
                    fileOutputStream = new FileOutputStream(string);
                    new aas_2().a(null, stringArray[k], stringArray[k + 1], fileOutputStream);
                    ((OutputStream)fileOutputStream).close();
                }
                catch (IOException iOException) {
                    try {
                        a.info((Object)("Kardiff error : " + iOException));
                    }
                    catch (MissingResourceException missingResourceException) {
                        a.error((Object)"MissingResourceException during JarDiff main", (Throwable)missingResourceException);
                    }
                }
            }
            System.exit(0);
        }
        aap_2.a();
    }
}

