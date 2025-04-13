/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from aHf
 */
class ahf_2
extends ahc_2 {
    private final String a;
    private final Object b;

    public ahf_2(String string, Object object) {
        this.a = string;
        this.b = object;
    }

    @Override
    boolean a(HashMap<String, Object> hashMap) {
        if (hashMap.containsKey(this.a)) {
            return hashMap.get(this.a).equals(this.b);
        }
        return false;
    }
}

