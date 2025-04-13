/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from aHb
 */
class ahb_2
extends ahc_2 {
    private final ahc_2[] a;

    public ahb_2(ahc_2 ... ahc_2Array) {
        this.a = ahc_2Array;
    }

    @Override
    boolean a(HashMap<String, Object> hashMap) {
        for (ahc_2 ahc_22 : this.a) {
            if (ahc_22.a(hashMap)) continue;
            return false;
        }
        return true;
    }
}

