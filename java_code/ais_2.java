/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Renamed from aIS
 */
public class ais_2 {
    private final String a;
    private final byte[] b;
    private final String c;
    private final List<List<String>> d;
    private final List<Long> e;
    private final int f;
    private final byte[] g;
    private final long h;
    private byte[] i;

    ais_2(String string, String string2, List<List<String>> list, List<Long> list2, int n, byte[] byArray, long l) {
        this.a = string;
        this.c = string2;
        this.d = list;
        this.e = list2;
        this.f = n;
        this.g = byArray;
        this.h = l;
        this.b = this.m();
    }

    public ais_2(InputStream inputStream) {
        this(new ajn_1(inputStream));
    }

    public ais_2(ajn_1 ajn_12) {
        this(ajn_12.g().g());
    }

    public ais_2(Map map) {
        ajo_1 ajo_12 = (ajo_1)map.get("announce");
        if (ajo_12 == null) {
            throw new ajq_1("Missing announce string");
        }
        this.a = ajo_12.a();
        ajo_12 = (ajo_1)map.get("info");
        if (ajo_12 == null) {
            throw new ajq_1("Missing info map");
        }
        Map map2 = ajo_12.g();
        if ((ajo_12 = (ajo_1)map2.get("name")) == null) {
            throw new ajq_1("Missing name string");
        }
        this.c = ajo_12.a();
        ajo_12 = (ajo_1)map2.get("piece length");
        if (ajo_12 == null) {
            throw new ajq_1("Missing piece length number");
        }
        this.f = ajo_12.d();
        ajo_12 = (ajo_1)map2.get("pieces");
        if (ajo_12 == null) {
            throw new ajq_1("Missing piece bytes");
        }
        this.g = ajo_12.b();
        ajo_12 = (ajo_1)map2.get("length");
        if (ajo_12 != null) {
            this.h = ajo_12.e();
            this.d = null;
            this.e = null;
        } else {
            ajo_12 = (ajo_1)map2.get("files");
            if (ajo_12 == null) {
                throw new ajq_1("Missing length number and/or files list");
            }
            List<ajo_1> list = ajo_12.f();
            int n = list.size();
            if (n == 0) {
                throw new ajq_1("zero size files list");
            }
            this.d = new ArrayList<List<String>>(n);
            this.e = new ArrayList<Long>(n);
            long l = 0L;
            for (ajo_1 ajo_13 : list) {
                Map map3 = ajo_13.g();
                ajo_12 = (ajo_1)map3.get("length");
                if (ajo_12 == null) {
                    throw new ajq_1("Missing length number");
                }
                long l2 = ajo_12.e();
                this.e.add(l2);
                l += l2;
                ajo_12 = (ajo_1)map3.get("path");
                if (ajo_12 == null) {
                    throw new ajq_1("Missing path list");
                }
                List<ajo_1> list2 = ajo_12.f();
                int n2 = list2.size();
                if (n2 == 0) {
                    throw new ajq_1("zero size file path list");
                }
                ArrayList<String> arrayList = new ArrayList<String>(n2);
                for (ajo_1 ajo_14 : list2) {
                    arrayList.add(ajo_14.a());
                }
                this.d.add(arrayList);
            }
            this.h = l;
        }
        this.b = this.m();
    }

    public String a() {
        return this.a;
    }

    public byte[] b() {
        return this.b;
    }

    public String c() {
        return ais_2.a(this.b);
    }

    byte[] d() {
        return this.g;
    }

    public String e() {
        return this.c;
    }

    public List f() {
        return this.d;
    }

    public List g() {
        return this.e;
    }

    public int h() {
        return this.g.length / 20;
    }

    public int a(int n) {
        int n2 = this.h();
        if (n >= 0 && n < n2 - 1) {
            return this.f;
        }
        if (n == n2 - 1) {
            return (int)(this.h - (long)(n * this.f));
        }
        throw new IndexOutOfBoundsException("no piece: " + n);
    }

    public boolean a(int n, byte[] byArray, int n2, int n3) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new InternalError("No SHA digest available: " + noSuchAlgorithmException);
        }
        messageDigest.update(byArray, n2, n3);
        byte[] byArray2 = messageDigest.digest();
        for (int k = 0; k < 20; ++k) {
            if (byArray2[k] == this.g[20 * n + k]) continue;
            return false;
        }
        return true;
    }

    public long i() {
        return this.h;
    }

    public String toString() {
        return "MetaInfo[info_hash='" + ais_2.a(this.b) + "', announce='" + this.a + "', nom='" + this.c + "', fichiers=" + this.d + ", #pieces='" + this.g.length / 20 + "', taille des pieces='" + this.f + "', taille du fichier='" + this.h + "']";
    }

    private static String a(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder(byArray.length * 2);
        for (byte by : byArray) {
            int n = by & 0xFF;
            if (n < 16) {
                stringBuilder.append('0');
            }
            stringBuilder.append(Integer.toHexString(n));
        }
        return stringBuilder.toString();
    }

    public ais_2 a(String string) {
        return new ais_2(string, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public byte[] j() {
        if (this.i == null) {
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            hashMap.put("announce", this.a);
            Map<String, Object> map = this.l();
            hashMap.put("info", map);
            this.i = ajp_1.a(hashMap);
        }
        return this.i;
    }

    private Map<String, Object> l() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("name", this.c);
        hashMap.put("piece length", this.f);
        hashMap.put("pieces", this.g);
        if (this.d == null) {
            hashMap.put("length", this.h);
        } else {
            ArrayList arrayList = new ArrayList();
            for (int k = 0; k < this.d.size(); ++k) {
                HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
                hashMap2.put("path", this.d.get(k));
                hashMap2.put("length", this.e.get(k));
                arrayList.add(hashMap2);
            }
            hashMap.put("files", arrayList);
        }
        return hashMap;
    }

    public int k() {
        return this.f;
    }

    private byte[] m() {
        Map<String, Object> map = this.l();
        byte[] byArray = ajp_1.a(map);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            return messageDigest.digest(byArray);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new InternalError(noSuchAlgorithmException.toString());
        }
    }
}

