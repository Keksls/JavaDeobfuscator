/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/*
 * Renamed from aAQ
 */
class aaq_2 {
    private JarFile a;
    private List b;
    private HashMap c;
    private HashMap d;

    public aaq_2(String string) {
        this.a = new JarFile(new File(string));
        this.c();
    }

    public JarFile a() {
        return this.a;
    }

    public Iterator b() {
        return this.b.iterator();
    }

    public JarEntry a(String string) {
        return (JarEntry)this.c.get(string);
    }

    private static boolean a(InputStream inputStream, InputStream inputStream2) {
        int n = 0;
        int n2 = 0;
        boolean bl = false;
        try {
            block13: while (n != -1) {
                int n3;
                n = inputStream2.read(aap_2.g);
                if (n != (n3 = inputStream.read(aap_2.h))) {
                    if (aap_2.i) {
                        aap_2.a.info((Object)("\tread sizes differ: " + n + " " + n3 + " total " + n2));
                    }
                    bl = true;
                    break;
                }
                if (n <= 0) continue;
                while (--n >= 0) {
                    ++n2;
                    if (aap_2.g[n] != aap_2.h[n]) {
                        if (aap_2.i) {
                            aap_2.a.info((Object)("\tbytes differ at " + n2));
                        }
                        bl = true;
                        continue block13;
                    }
                    if (bl) continue block13;
                    n = 0;
                }
            }
        }
        catch (IOException iOException) {
            throw iOException;
        }
        finally {
            try {
                inputStream.close();
            }
            catch (IOException iOException) {}
            try {
                inputStream2.close();
            }
            catch (IOException iOException) {}
        }
        return bl;
    }

    public String a(aaq_2 aaq_22, JarEntry jarEntry) {
        if (this.b(aaq_22, jarEntry)) {
            return jarEntry.getName();
        }
        return this.c(aaq_22, jarEntry);
    }

    public boolean b(aaq_2 aaq_22, JarEntry jarEntry) {
        InputStream inputStream;
        JarEntry jarEntry2 = this.a(jarEntry.getName());
        if (jarEntry2 == null) {
            return false;
        }
        if (jarEntry2.getCrc() != jarEntry.getCrc()) {
            return false;
        }
        InputStream inputStream2 = this.a().getInputStream(jarEntry2);
        boolean bl = aaq_2.a(inputStream2, inputStream = aaq_22.a().getInputStream(jarEntry));
        return !bl;
    }

    public String c(aaq_2 aaq_22, JarEntry jarEntry) {
        LinkedList linkedList;
        ListIterator listIterator;
        if (jarEntry.isDirectory()) {
            return null;
        }
        String string = null;
        Long l = jarEntry.getCrc();
        if (this.d.containsKey(l) && (listIterator = (linkedList = (LinkedList)this.d.get(l)).listIterator(0)) != null) {
            while (listIterator.hasNext()) {
                InputStream inputStream;
                JarEntry jarEntry2 = (JarEntry)listIterator.next();
                InputStream inputStream2 = this.a().getInputStream(jarEntry2);
                if (aaq_2.a(inputStream2, inputStream = aaq_22.a().getInputStream(jarEntry))) continue;
                string = jarEntry2.getName();
                return string;
            }
        }
        return string;
    }

    private void c() {
        Enumeration<JarEntry> enumeration = this.a.entries();
        this.c = new HashMap();
        this.d = new HashMap();
        this.b = new ArrayList();
        if (aap_2.i) {
            aap_2.a.info((Object)("indexing: " + this.a.getName()));
        }
        if (enumeration != null) {
            while (enumeration.hasMoreElements()) {
                LinkedList linkedList;
                JarEntry jarEntry = enumeration.nextElement();
                long l = jarEntry.getCrc();
                Long l2 = l;
                if (aap_2.i) {
                    aap_2.a.info((Object)("\t" + jarEntry.getName() + " CRC " + l));
                }
                this.c.put(jarEntry.getName(), jarEntry);
                this.b.add(jarEntry);
                if (this.d.containsKey(l2)) {
                    linkedList = (LinkedList)this.d.get(l2);
                    linkedList.add(jarEntry);
                    this.d.put(l2, linkedList);
                    continue;
                }
                linkedList = new LinkedList();
                linkedList.add(jarEntry);
                this.d.put(l2, linkedList);
            }
        }
    }
}

