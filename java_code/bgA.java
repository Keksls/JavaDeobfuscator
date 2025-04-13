/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public class bgA {
    private static final bgA a = new bgA();
    private static final HashMap<Long, HashMap<String, Integer>> b = new HashMap();

    private bgA() {
    }

    public static bgA a() {
        return a;
    }

    public void a(ejh_0 ejh_02, String string, int n) {
        HashMap<String, Integer> hashMap = b.get(ejh_02.c());
        if (hashMap == null) {
            hashMap = new HashMap();
            b.put(ejh_02.c(), hashMap);
        }
        hashMap.put(string, n);
    }

    public int a(ejh_0 ejh_02, String string) {
        HashMap<String, Integer> hashMap = b.get(ejh_02.c());
        if (hashMap != null) {
            int n = hashMap.remove(string);
            if (hashMap.isEmpty()) {
                b.remove(ejh_02.c());
            }
            aik_0.a().b(n);
            return n;
        }
        return -1;
    }

    public void a(ejh_0 ejh_02) {
        HashMap<String, Integer> hashMap = b.get(ejh_02.c());
        if (hashMap != null) {
            for (int n : hashMap.values()) {
                aik_0.a().b(n);
            }
            b.remove(ejh_02.c());
        }
    }
}

