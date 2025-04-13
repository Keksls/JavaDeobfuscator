/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;
import org.apache.log4j.Logger;

/*
 * Renamed from aAS
 */
public class aas_2
implements aar_2,
aat_2 {
    protected static final Logger a = Logger.getLogger(aas_2.class);
    private static final int i = 2048;
    private static final byte[] j = new byte[2048];
    private static byte[] k = new byte[2048];
    double f = 0.0;
    double g = 0.0;
    boolean h = false;

    @Override
    public void a(aau_2 aau_22, String string, String string2, OutputStream outputStream) {
        Object object;
        File file = new File(string);
        File file2 = new File(string2);
        JarOutputStream jarOutputStream = new JarOutputStream(outputStream);
        JarFile jarFile = new JarFile(file2);
        JarFile jarFile2 = new JarFile(file);
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        this.a(jarFile, hashSet, hashMap);
        Object[] objectArray = hashMap.keySet().toArray();
        HashSet<String> hashSet2 = new HashSet<String>();
        Enumeration<JarEntry> enumeration = jarFile2.entries();
        if (enumeration != null) {
            while (enumeration.hasMoreElements()) {
                hashSet2.add(enumeration.nextElement().getName());
            }
        }
        this.f = hashSet2.size() + objectArray.length + jarFile.size();
        this.g = 0.0;
        hashSet2.removeAll(hashSet);
        this.f -= (double)hashSet.size();
        Enumeration<JarEntry> enumeration2 = jarFile.entries();
        if (enumeration2 != null) {
            while (enumeration2.hasMoreElements()) {
                JarEntry jarEntry = enumeration2.nextElement();
                if (!"META-INF/INDEX.JD".equals(jarEntry.getName())) {
                    this.a(aau_22, this.g, this.f);
                    this.g += 1.0;
                    this.a(jarOutputStream, jarEntry, jarFile);
                    boolean bl = hashSet2.remove(jarEntry.getName());
                    if (!bl) continue;
                    this.f -= 1.0;
                    continue;
                }
                this.f -= 1.0;
            }
        }
        for (int k = 0; k < objectArray.length; ++k) {
            Object object2;
            String string3 = (String)objectArray[k];
            object = (String)hashMap.get(string3);
            JarEntry jarEntry = jarFile2.getJarEntry((String)object);
            if (jarEntry == null) {
                jarFile.close();
                jarFile2.close();
                object2 = "move" + (String)object + " " + string3;
                this.a("jardiff.error.badmove", (String)object2);
                continue;
            }
            object2 = new JarEntry(string3);
            ((ZipEntry)object2).setTime(jarEntry.getTime());
            ((ZipEntry)object2).setSize(jarEntry.getSize());
            ((ZipEntry)object2).setCompressedSize(jarEntry.getCompressedSize());
            ((ZipEntry)object2).setCrc(jarEntry.getCrc());
            ((ZipEntry)object2).setMethod(jarEntry.getMethod());
            ((ZipEntry)object2).setExtra(jarEntry.getExtra());
            ((ZipEntry)object2).setComment(jarEntry.getComment());
            this.a(aau_22, this.g, this.f);
            this.g += 1.0;
            this.a(jarOutputStream, (JarEntry)object2, jarFile2.getInputStream(jarEntry));
            boolean bl = hashSet2.remove(object);
            if (!bl) continue;
            this.f -= 1.0;
        }
        Iterator iterator = hashSet2.iterator();
        if (iterator != null) {
            while (iterator.hasNext()) {
                String string4 = (String)iterator.next();
                object = jarFile2.getJarEntry(string4);
                this.a(aau_22, this.g, this.f);
                this.g += 1.0;
                this.a(jarOutputStream, (JarEntry)object, jarFile2);
            }
        }
        this.a(aau_22, this.g, this.f);
        jarOutputStream.finish();
        jarFile.close();
        jarFile2.close();
        this.h = true;
    }

    private void a(aau_2 aau_22, double d2, double d3) {
        if (aau_22 != null) {
            aau_22.a((int)(d2 / d3));
        }
    }

    private void a(JarFile jarFile, Set set, Map map) {
        LineNumberReader lineNumberReader;
        String string;
        InputStream inputStream = jarFile.getInputStream(jarFile.getEntry("META-INF/INDEX.JD"));
        if (inputStream == null) {
            this.a("jardiff.error.noindex", null);
        }
        if ((string = (lineNumberReader = new LineNumberReader(new InputStreamReader(inputStream, "UTF-8"))).readLine()) == null || !string.equals("version 1.0")) {
            this.a("jardiff.error.badheader", string);
        }
        while ((string = lineNumberReader.readLine()) != null) {
            List list;
            if (string.startsWith("remove")) {
                list = this.a(string.substring("remove".length()));
                if (list.size() != 1) {
                    this.a("jardiff.error.badremove", string);
                }
                set.add(list.get(0));
                continue;
            }
            if (string.startsWith("move")) {
                list = this.a(string.substring("move".length()));
                if (list.size() != 2) {
                    this.a("jardiff.error.badmove", string);
                }
                if (map.put(list.get(1), list.get(0)) == null) continue;
                this.a("jardiff.error.badmove", string);
                continue;
            }
            if (string.length() <= 0) continue;
            this.a("jardiff.error.badcommand", string);
        }
        lineNumberReader.close();
    }

    private void a(String string, String string2) {
        try {
            throw new IOException(string + " " + string2);
        }
        catch (MissingResourceException missingResourceException) {
            a.error((Object)("Fatal error: " + string), (Throwable)missingResourceException);
            System.exit(-1);
            return;
        }
    }

    private List a(String string) {
        int n = 0;
        int n2 = string.length();
        ArrayList<String> arrayList = new ArrayList<String>();
        while (n < n2) {
            int n3;
            while (n < n2 && Character.isWhitespace(string.charAt(n))) {
                ++n;
            }
            if (n >= n2) continue;
            int n4 = n3 = n;
            StringBuffer stringBuffer = null;
            while (n < n2) {
                char c2 = string.charAt(n);
                if (c2 == '\\' && n + 1 < n2 && string.charAt(n + 1) == ' ') {
                    if (stringBuffer == null) {
                        stringBuffer = new StringBuffer();
                        stringBuffer.append(string.substring(n4, n));
                    } else {
                        stringBuffer.append(string.substring(n4, n));
                    }
                    n4 = ++n;
                } else if (Character.isWhitespace(c2)) break;
                ++n;
            }
            if (n4 != n) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                    stringBuffer.append(string.substring(n4, n));
                } else {
                    stringBuffer.append(string.substring(n4, n));
                }
            }
            if (stringBuffer == null) continue;
            arrayList.add(stringBuffer.toString());
        }
        return arrayList;
    }

    private void a(JarOutputStream jarOutputStream, JarEntry jarEntry, JarFile jarFile) {
        this.a(jarOutputStream, jarEntry, jarFile.getInputStream(jarEntry));
    }

    private void a(JarOutputStream jarOutputStream, JarEntry jarEntry, InputStream inputStream) {
        jarOutputStream.putNextEntry(new ZipEntry(jarEntry.getName()));
        int n = inputStream.read(j);
        while (n != -1) {
            jarOutputStream.write(j, 0, n);
            n = inputStream.read(j);
        }
        inputStream.close();
    }

    public double a() {
        return this.f;
    }

    public double b() {
        return this.g;
    }

    public boolean c() {
        return this.h;
    }
}

