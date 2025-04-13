/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from aLR
 */
public class alr_1 {
    private static final Logger g = Logger.getLogger(alr_1.class);
    public static final String a = "reverbdensity";
    public static final String b = "reverbgain";
    public static final String c = "decaytime";
    public static final String d = "decayLPF";
    public static final String e = "earlygain";
    public static final String f = "predelay";
    private float h = 1.0f;
    private float i = 0.32f;
    private float j = 1.49f;
    private float k = 0.83f;
    private float l = 1.26f;
    private float m = 0.011f;

    private alr_1() {
    }

    public alr_1(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.h = f2;
        this.i = f3;
        this.j = f4;
        this.k = f5;
        this.l = f6;
        this.m = f7;
    }

    public static alr_1 a(aqx_2 aqx_22) {
        alr_1 alr_12 = new alr_1();
        for (aqx_2 aqx_23 : aqx_22.k()) {
            if (aqx_23.b().equals(a)) {
                alr_12.h = Hw.b(aqx_23.f("value").i(), 0.0f, 1.0f);
                continue;
            }
            if (aqx_23.b().equals(b)) {
                alr_12.i = Hw.b(aqx_23.f("value").i(), 0.0f, 1.0f);
                continue;
            }
            if (aqx_23.b().equals(c)) {
                alr_12.j = Hw.b(aqx_23.f("value").i(), 0.1f, 20.0f);
                continue;
            }
            if (aqx_23.b().equals(d)) {
                alr_12.k = Hw.b(aqx_23.f("value").i(), 0.1f, 2.0f);
                continue;
            }
            if (aqx_23.b().equals(e)) {
                alr_12.l = Hw.b(aqx_23.f("value").i(), 0.0f, 10.0f);
                continue;
            }
            if (!aqx_23.b().equals(f)) continue;
            alr_12.m = Hw.b(aqx_23.f("value").i(), 0.0f, 0.1f);
        }
        return alr_12;
    }

    public static TIntObjectHashMap<alr_1> b(aqx_2 aqx_22) {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        for (aqx_2 aqx_23 : aqx_22.k()) {
            if (!aqx_23.b().equals("reverb")) continue;
            tIntObjectHashMap.put(aqx_23.f("id").g(), (Object)alr_1.a(aqx_23));
        }
        return tIntObjectHashMap;
    }

    public float a() {
        return this.h;
    }

    public float b() {
        return this.i;
    }

    public float c() {
        return this.j;
    }

    public float d() {
        return this.k;
    }

    public float e() {
        return this.l;
    }

    public float f() {
        return this.m;
    }
}

