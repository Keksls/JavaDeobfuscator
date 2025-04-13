/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Renamed from aHp
 */
public class ahp_1 {
    final ArrayList<HashMap<String, Object>> a = new ArrayList(1024);
    final ArrayList<String> b = new ArrayList(20);

    public void a(String string) {
        this.b.add(string);
    }

    public ahe_2 a() {
        return new ahe_2(this);
    }

    public int b() {
        return this.a.size();
    }

    public int a(HashMap<String, Object> hashMap) {
        HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
        for (String string : this.b) {
            hashMap2.put(string, hashMap.get(string));
        }
        this.a.add(hashMap2);
        return this.b() - 1;
    }

    public ahp_1 a(boolean bl) {
        ahp_1 ahp_12 = new ahp_1();
        ahp_12.b.addAll(this.b);
        if (bl) {
            for (HashMap<String, Object> hashMap : this.a) {
                ahp_12.a(hashMap);
            }
        }
        return ahp_12;
    }

    public void a(int n, HashMap<String, Object> hashMap) {
        HashMap<String, Object> hashMap2 = this.a.get(n);
        if (hashMap2 != null) {
            for (String string : this.b) {
                hashMap2.put(string, hashMap.get(string));
            }
        } else {
            throw new RuntimeException("Index out of bounds : " + n);
        }
    }

    void a(ahc_2[] ahc_2Array) {
        ahe_2 ahe_22 = new ahe_2(this);
        while (ahe_22.hasNext()) {
            HashMap<String, Object> hashMap = ahe_22.a();
            boolean bl = true;
            for (ahc_2 ahc_22 : ahc_2Array) {
                bl &= ahc_22.a(hashMap);
            }
            if (!bl) continue;
            ahe_22.remove();
        }
    }

    ahp_1 a(String[] stringArray, ahc_2[] ahc_2Array, int n, boolean bl) {
        ahp_1 ahp_12 = new ahp_1();
        for (String object : stringArray) {
            ahp_12.a(object);
            if (!bl) continue;
            ahp_12.a("__index");
        }
        Iterator<HashMap<String, Object>> iterator = this.a.iterator();
        int n2 = 0;
        int n3 = 0;
        while (iterator.hasNext() && n2 != n) {
            HashMap hashMap = (HashMap)iterator.next();
            boolean bl2 = true;
            for (ahc_2 ahc_22 : ahc_2Array) {
                if (ahc_22.a(hashMap)) continue;
                bl2 = false;
                break;
            }
            if (bl2) {
                HashMap hashMap2 = new HashMap();
                for (String string : stringArray) {
                    hashMap2.put(string, hashMap.get(string));
                }
                if (bl) {
                    hashMap2.put("__index", n3);
                }
                ahp_12.a(hashMap2);
                ++n2;
            }
            ++n3;
        }
        return ahp_12;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n = this.b();
        if (n > 0) {
            for (HashMap<String, Object> hashMap : this.a) {
                for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                    stringBuilder.append("{");
                    Object object = entry.getValue();
                    if (object != null) {
                        stringBuilder.append(object);
                    } else {
                        stringBuilder.append(entry.getKey()).append("=").append(object);
                    }
                    stringBuilder.append("}");
                }
            }
        }
        return stringBuilder.toString();
    }
}

