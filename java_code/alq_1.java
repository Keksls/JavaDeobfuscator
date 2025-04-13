/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from aLQ
 */
public class alq_1 {
    public static final alq_1 a = new alq_1(0.5f, 0.5f);
    public static final String b = "gain";
    public static final String c = "gainHF";
    private float d = 0.5f;
    private float e = 0.5f;

    private alq_1() {
    }

    public alq_1(float f2, float f3) {
        this.d = f2;
        this.e = f3;
    }

    public static alq_1 a(aqx_2 aqx_22) {
        alq_1 alq_12 = new alq_1();
        for (aqx_2 aqx_23 : aqx_22.k()) {
            if (aqx_23.b().equals(b)) {
                alq_12.d = aqx_23.f("value").i();
                continue;
            }
            if (!aqx_23.b().equals(c)) continue;
            alq_12.e = aqx_23.f("value").i();
        }
        return alq_12;
    }

    public static TIntObjectHashMap<alq_1> b(aqx_2 aqx_22) {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        for (aqx_2 aqx_23 : aqx_22.k()) {
            if (!aqx_23.b().equals("lowpass")) continue;
            tIntObjectHashMap.put(aqx_23.f("id").g(), (Object)alq_1.a(aqx_23));
        }
        return tIntObjectHashMap;
    }

    public float a() {
        return this.d;
    }

    public float b() {
        return this.e;
    }
}

