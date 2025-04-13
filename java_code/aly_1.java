/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aLY
 */
public class aly_1 {
    public static final aly_1 a = new aly_1(1.0f, 10.0f, 18.0f);
    private float e;
    private float f;
    private float g;
    public static final String b = "rollOffFactor";
    public static final String c = "refDistance";
    public static final String d = "maxDistance";

    public aly_1() {
    }

    public aly_1(float f2, float f3, float f4) {
        this.e = f2;
        this.f = f3;
        this.g = f4;
    }

    public float a() {
        return this.e;
    }

    public float b() {
        return this.f;
    }

    public float c() {
        return this.g;
    }

    public static aly_1 a(aqx_2 aqx_22) {
        aly_1 aly_12 = new aly_1();
        for (aqx_2 aqx_23 : aqx_22.k()) {
            if (aqx_23.b().equals(b)) {
                aly_12.e = aqx_23.f("value").i();
                continue;
            }
            if (aqx_23.b().equals(c)) {
                aly_12.f = aqx_23.f("value").i();
                continue;
            }
            if (!aqx_23.b().equals(d)) continue;
            aly_12.g = aqx_23.f("value").i();
        }
        return aly_12;
    }

    public static acy_2<aly_1> b(aqx_2 aqx_22) {
        acy_2<aly_1> acy_22 = new acy_2<aly_1>();
        for (aqx_2 aqx_23 : aqx_22.k()) {
            if (!aqx_23.b().equals("rollOff")) continue;
            acy_22.a(aqx_23.f("id").g(), aly_1.a(aqx_23));
        }
        return acy_22;
    }
}

