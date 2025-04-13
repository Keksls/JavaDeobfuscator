/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Renamed from aJg
 */
public class ajg_2 {
    private ais_2 d;
    private HashMap<Integer, Boolean> e;
    private long[] f;
    private RandomAccessFile[] g;
    private String[] h;
    private File i;
    private final ajh_2 j;
    private final ain_2 k;
    private int l;
    int a;
    int b;
    private static final int m = 131072;
    private static final long n = 51200L;
    private long o;
    protected static final Logger c = Logger.getLogger("com.ankamagames.framework.net.torrent.Storage");

    public ajg_2(ais_2 ais_22, File file, ajh_2 ajh_22) {
        this.d = ais_22;
        this.j = ajh_22;
        this.i = file;
        this.l = ais_22.h();
        this.k = new ain_2(this.l);
        this.e = new HashMap();
        for (int k = 0; k < this.l; ++k) {
            this.e.put(k, false);
        }
    }

    public ajg_2(File file, String string, ajh_2 ajh_22) {
        this.j = ajh_22;
        this.a(file);
        long l = 0L;
        ArrayList<Long> arrayList = new ArrayList<Long>();
        for (long l2 : this.f) {
            l += l2;
            arrayList.add(l2);
        }
        this.a = 131072;
        this.b = (int)((l - 1L) / (long)this.a) + 1;
        while ((long)this.b > 51200L) {
            this.a *= 2;
            this.b = (int)((l - 1L) / (long)this.a) + 1;
        }
        byte[] byArray = new byte[20 * this.b];
        this.k = new ain_2(this.b);
        this.l = 0;
        ArrayList<List<String>> arrayList2 = new ArrayList<List<String>>();
        for (String string2 : this.h) {
            ArrayList<String> arrayList3 = new ArrayList<String>();
            StringTokenizer stringTokenizer = new StringTokenizer(string2, File.separator);
            while (stringTokenizer.hasMoreTokens()) {
                String string3 = stringTokenizer.nextToken();
                arrayList3.add(string3);
            }
            arrayList2.add(arrayList3);
        }
        if (arrayList2.size() == 1) {
            arrayList2 = null;
            arrayList = null;
        }
        this.d = new ais_2(string, file.getName(), arrayList2, arrayList, this.a, byArray, l);
    }

    public void a() {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new InternalError(noSuchAlgorithmException.toString());
        }
        byte[] byArray = this.d.d();
        byte[] byArray2 = new byte[this.a];
        for (int k = 0; k < this.b; ++k) {
            int n = this.a(k, byArray2, 0);
            messageDigest.update(byArray2, 0, n);
            byte[] byArray3 = messageDigest.digest();
            for (int i2 = 0; i2 < 20; ++i2) {
                byArray[20 * k + i2] = byArray3[i2];
            }
            this.k.a(k);
            if (this.j == null) continue;
            this.j.a(this, k, true);
        }
        if (this.j != null) {
            this.j.a(this);
        }
        this.d = this.d.a(this.d.a());
    }

    private void a(File file) {
        ArrayList<File> arrayList = new ArrayList<File>();
        ajg_2.a(arrayList, file);
        int n = arrayList.size();
        this.h = new String[n];
        this.f = new long[n];
        this.g = new RandomAccessFile[n];
        int n2 = 0;
        for (File file2 : arrayList) {
            this.h[n2] = file2.getPath();
            this.f[n2] = file2.length();
            this.g[n2] = new RandomAccessFile(file2, "r");
            ++n2;
        }
    }

    private static void a(List<File> list, File file) {
        if (!file.isDirectory()) {
            list.add(file);
        } else {
            File[] fileArray = file.listFiles();
            if (fileArray == null) {
                c.log(Level.WARNING, "Skipping '" + file + "' not a normal file.");
                return;
            }
            for (File file2 : fileArray) {
                ajg_2.a(list, file2);
            }
        }
    }

    public ais_2 b() {
        return this.d;
    }

    public int c() {
        return this.l;
    }

    public boolean d() {
        return this.l == 0;
    }

    public ain_2 e() {
        return this.k;
    }

    public boolean a(Properties properties, HashMap<Integer, Integer> hashMap, int n) {
        File file;
        String string = properties != null && properties.containsKey("outputFile") ? properties.get("outputFile").toString() : this.a(this.d.e());
        if (this.i == null) {
            file = new File(string);
        } else {
            if (!this.i.exists() || !this.i.isDirectory()) {
                throw new aie_2("R\u00e9pertoire de destination non valide : " + this.i);
            }
            file = new File(this.i.getCanonicalPath() + File.separator + string);
        }
        List list = this.d.f();
        if (list == null) {
            if (n == -1) {
                c.log(Level.INFO, "V\u00e9rification du fichier : " + file);
            }
            if (!file.createNewFile() && !file.exists()) {
                throw new IOException("Impossible de cr\u00e9er le fichier " + file);
            }
            this.f = new long[1];
            this.g = new RandomAccessFile[1];
            this.h = new String[1];
            this.f[0] = this.d.i();
            this.g[0] = new RandomAccessFile(file, "rw");
            this.h[0] = file.getName();
        } else {
            c.log(Level.INFO, "V\u00e9rification du r\u00e9pertoire : " + file);
            if (!file.mkdir() && !file.isDirectory()) {
                throw new IOException("Impossible de cr\u00e9er le r\u00e9pertoire : " + file);
            }
            List list2 = this.d.g();
            int n2 = list.size();
            long l = 0L;
            this.f = new long[n2];
            this.g = new RandomAccessFile[n2];
            this.h = new String[n2];
            for (int k = 0; k < n2; ++k) {
                File file2 = this.a(file, (List)list.get(k));
                this.f[k] = (Long)list2.get(k);
                l += this.f[k];
                this.g[k] = new RandomAccessFile(file2, "rw");
                this.h[k] = file2.getName();
            }
            long l2 = this.d.i();
            if (l != l2) {
                throw new IOException("File lengths do not add up " + l + " != " + l2);
            }
        }
        return this.a(hashMap, n);
    }

    private String a(String string) {
        return string.replace(File.separatorChar, '_');
    }

    private File a(File file, List list) {
        File file2 = null;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String string = this.a((String)iterator.next());
            if (iterator.hasNext()) {
                file2 = new File(file, string);
                if (!file2.mkdir() && !file2.isDirectory()) {
                    throw new IOException("Could not create directory " + file2);
                }
                file = file2;
                continue;
            }
            file2 = new File(file, string);
            if (file2.createNewFile() || file2.exists()) continue;
            throw new IOException("Could not create file " + file2);
        }
        return file2;
    }

    private boolean a(HashMap<Integer, Integer> hashMap, int n) {
        boolean bl = false;
        boolean bl2 = true;
        for (int k = 0; k < this.g.length; ++k) {
            long l = this.g[k].length();
            if (l == this.f[k]) {
                if (this.j != null) {
                    this.j.a(this, l);
                }
                bl = true;
                continue;
            }
            if (l == 0L) {
                this.b(k);
                continue;
            }
            this.g[k].setLength(this.f[k]);
            this.b(k);
        }
        if (bl) {
            this.b = this.d.h();
            byte[] byArray = new byte[this.d.a(0)];
            for (int k = 0; k < this.b; ++k) {
                int n2 = this.a(k, byArray, 0);
                boolean bl3 = this.d.a(k, byArray, 0, n2);
                if (bl3) {
                    if (this.e.get(k) != null && !this.e.get(k).booleanValue()) {
                        this.k.a(k);
                        --this.l;
                        this.e.remove(k);
                        this.e.put(k, true);
                    }
                } else {
                    if (k == n) {
                        bl2 = false;
                    }
                    if (hashMap != null) {
                        hashMap.put(k, n2);
                    }
                }
                if (this.j == null) continue;
                this.j.a(this, k, bl3);
            }
        }
        if (this.j != null) {
            this.j.a(this);
        }
        return bl2;
    }

    private void b(int n) {
        this.j.a(this, this.h[n], this.f[n]);
        int n2 = this.d.a(0);
        byte[] byArray = new byte[n2];
        int n3 = 0;
        while ((long)n3 < this.f[n] / (long)n2) {
            this.g[n].write(byArray);
            this.j.a(this, n2);
            ++n3;
        }
        int n4 = (int)(this.f[n] - (long)(n3 * n2));
        this.g[n].write(byArray, 0, n4);
        this.j.a(this, n4);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f() {
        RandomAccessFile[] randomAccessFileArray = this.g;
        int n = randomAccessFileArray.length;
        for (int k = 0; k < n; ++k) {
            RandomAccessFile randomAccessFile;
            RandomAccessFile randomAccessFile2 = randomAccessFile = randomAccessFileArray[k];
            synchronized (randomAccessFile2) {
                randomAccessFile.close();
                continue;
            }
        }
    }

    public byte[] a(int n) {
        if (!this.k.b(n)) {
            return null;
        }
        byte[] byArray = new byte[this.d.a(n)];
        this.a(n, byArray, 0);
        return byArray;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(int n, byte[] byArray) {
        int n2;
        long l;
        int n3 = byArray.length;
        boolean bl = this.d.a(n, byArray, 0, n3);
        if (this.j != null) {
            this.j.a(this, n, bl);
        }
        if (!bl) {
            return false;
        }
        ain_2 ain_22 = this.k;
        synchronized (ain_22) {
            if (this.k.b(n)) {
                return true;
            }
            if (this.e.get(n) != null && !this.e.get(n).booleanValue()) {
                this.k.a(n);
                this.o += (long)byArray.length;
                --this.l;
                this.e.put(n, true);
            }
        }
        int n4 = 0;
        long l2 = this.f[n4];
        for (l = (long)(n * this.d.a(0)); l > l2; l -= l2) {
            l2 = this.f[++n4];
        }
        boolean bl2 = false;
        for (int k = 0; k < n3; k += n2) {
            int n5 = n3 - k;
            n2 = l + (long)n5 < l2 ? n5 : (int)(l2 - l);
            RandomAccessFile randomAccessFile = this.g[n4];
            synchronized (randomAccessFile) {
                this.g[n4].seek(l);
                this.g[n4].write(byArray, 0 + k, n2);
                continue;
            }
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int a(int n, byte[] byArray, int n2) {
        int n3;
        long l;
        int n4 = this.d.a(n);
        int n5 = 0;
        long l2 = this.f[n5];
        for (l = (long)(n * this.d.a(0)); l > l2; l -= l2) {
            l2 = this.f[++n5];
        }
        for (int k = 0; k < n4; k += n3) {
            int n6 = n4 - k;
            n3 = l + (long)n6 < l2 ? n6 : (int)(l2 - l);
            RandomAccessFile randomAccessFile = this.g[n5];
            synchronized (randomAccessFile) {
                this.g[n5].seek(l);
                this.g[n5].readFully(byArray, n2 + k, n3);
                continue;
            }
        }
        return n4;
    }

    public long g() {
        return this.a;
    }

    public long h() {
        return this.o;
    }

    public void i() {
        this.o = 0L;
    }

    public void a(long l) {
        this.o += l;
    }
}

