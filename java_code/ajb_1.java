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
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from aJB
 */
public class ajb_1
extends ajv_1
implements aje_1 {
    protected static final Logger a = Logger.getLogger(ajb_1.class);
    public static final String b = "preferenceStorePath";
    private final Properties c;
    private final Properties d;
    private boolean e = false;
    private String f;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private final ArrayList<ajc_1> q = new ArrayList();

    public ajb_1() {
        this.d = new Properties();
        this.c = new Properties(this.d);
    }

    public ajb_1(String string) {
        this();
        String string2 = System.getProperty(b);
        File file = new File(Cz.f(string2) ? "." : string2, string);
        File file2 = file.getParentFile();
        if (file2 != null && !file2.exists()) {
            file2.mkdirs();
        }
        this.e(file.getAbsolutePath());
    }

    public String a() {
        return this.f;
    }

    public void e(String string) {
        this.f = string;
    }

    public boolean f() {
        return this.g;
    }

    public boolean g() {
        return this.i;
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public boolean h() {
        return this.h;
    }

    public void b(boolean bl) {
        this.h = bl;
    }

    public void i() {
        if (this.f == null) {
            return;
        }
        try (FileInputStream fileInputStream = new FileInputStream(this.f);){
            this.a(fileInputStream);
        }
        catch (FileNotFoundException fileNotFoundException) {
            a.info((Object)("Fichier de pr\u00e9f\u00e9rences " + this.f + " inexistant, on le cr\u00e9e"));
        }
    }

    private void a(InputStream inputStream) {
        try {
            Map<String, String> map = this.c();
            this.c.load(inputStream);
            Map<String, String> map2 = this.c();
            this.e = false;
            this.i = true;
            this.o();
            this.a(map, map2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            a.info((Object)("Fichier de pr\u00e9f\u00e9rences " + this.f + " corrompu"), (Throwable)illegalArgumentException);
        }
    }

    private void o() {
        if (!this.q.isEmpty()) {
            for (int k = 0; k < this.q.size(); ++k) {
                this.q.get(k).onPreferenceStoreLoaded(this);
            }
        }
    }

    public void j() {
        if (this.f == null) {
            throw new IOException("File name not specified");
        }
        try (FileOutputStream fileOutputStream = null;){
            fileOutputStream = new FileOutputStream(this.f);
            this.a(fileOutputStream);
        }
    }

    public void a(OutputStream outputStream) {
        this.c.store(outputStream, null);
        this.e = false;
    }

    public int k() {
        return this.c.size();
    }

    public String[] l() {
        ArrayList arrayList = new ArrayList();
        Enumeration<?> enumeration = this.d.propertyNames();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        enumeration = this.c.propertyNames();
        while (enumeration.hasMoreElements()) {
            Object obj = enumeration.nextElement();
            if (arrayList.contains(obj)) continue;
            arrayList.add(obj);
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public void m() {
        Enumeration<?> enumeration = this.c.propertyNames();
        this.c.clear();
        while (enumeration.hasMoreElements()) {
            Object obj = enumeration.nextElement();
            this.c.setProperty(String.valueOf(obj), String.valueOf(this.d.getProperty(String.valueOf(obj))));
        }
        try {
            this.j();
        }
        catch (IOException iOException) {
            a.error((Object)"IOException during resetToDefault", (Throwable)iOException);
        }
    }

    public boolean n() {
        return this.e;
    }

    public void a(ajc_1 ajc_12) {
        this.q.add(ajc_12);
    }

    public void b(ajc_1 ajc_12) {
        this.q.remove(ajc_12);
    }

    @Override
    public boolean a(String string, boolean bl) {
        return bl ? this.c.containsKey(string) : this.c.containsKey(string) || this.d.containsKey(string);
    }

    @Override
    public Set<String> b() {
        HashSet<Object> hashSet = new HashSet<Object>();
        hashSet.addAll(this.c.keySet());
        hashSet.addAll(this.d.keySet());
        return hashSet.stream().map(Object::toString).collect(Collectors.toSet());
    }

    @Override
    public Map<String, String> c() {
        Set<Map.Entry<Object, Object>> set = this.c.entrySet();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        set.forEach(entry -> hashMap.put(entry.getKey().toString(), entry.getValue().toString()));
        return hashMap;
    }

    @Override
    public void d(String string) {
        String string2 = (String)this.c.remove(string);
        if (string2 != null) {
            this.a(string, string2, null);
            if (this.g) {
                try {
                    this.j();
                }
                catch (IOException iOException) {
                    a.warn((Object)("[Preferences] Could not save preference after removing property \"" + string + "\""), (Throwable)iOException);
                }
            }
        }
    }

    @Override
    public boolean b(String string) {
        return this.d.containsKey(string);
    }

    @Override
    public String a(String string) {
        if (this.c.containsKey(string)) {
            return this.c.getProperty(string);
        }
        return this.c(string);
    }

    @Override
    public String c(String string) {
        if (this.d.containsKey(string)) {
            return this.d.getProperty(string);
        }
        return null;
    }

    @Override
    public void b(String string, String string2) {
        String string3 = this.a(string);
        if (string3 != null && string3.equals(string2) && this.l(string)) {
            return;
        }
        if (this.h && !this.d.containsKey(string)) {
            return;
        }
        this.a(this.c, string, string2);
        this.e = true;
        this.a(string, string3, string2);
        if (this.g) {
            try {
                this.j();
            }
            catch (IOException iOException) {
                a.warn((Object)("[Preferences] Could not save preference after setting property \"" + string + "\" to \"" + string2 + "\""), (Throwable)iOException);
            }
        }
    }

    @Override
    public void c(String string, String string2) {
        String string3 = this.c(string);
        if (string3 != null && string3.equals(string2) && this.l(string)) {
            return;
        }
        this.a(this.d, string, string2);
        if (this.m(string)) {
            this.a(string, string3, string2);
        }
    }

    private void a(Properties properties, String string, String string2) {
        if (properties != null) {
            properties.put(string, string2);
        }
    }
}

