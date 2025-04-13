/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from aHi
 */
class ahi_1
extends ahc_2 {
    private final String a;
    private final Integer b;

    public ahi_1(String string, Integer n) {
        this.a = string;
        this.b = n;
    }

    @Override
    boolean a(HashMap<String, Object> hashMap) {
        if (hashMap.containsKey(this.a) && hashMap.get(this.a) instanceof Integer) {
            int n = (Integer)hashMap.get(this.a);
            return this.b < n;
        }
        return false;
    }
}

