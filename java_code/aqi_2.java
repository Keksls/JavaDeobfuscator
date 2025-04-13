/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aqI
 */
public final class aqi_2
extends aqq_2 {
    public aqi_2(String string, aqo_2 ... aqo_2Array) {
        super(string, aqo_2Array);
    }

    public aqi_2(aqo_2 ... aqo_2Array) {
        super(aqo_2Array);
    }

    @Override
    public final aqo_2[] a() {
        aqo_2[] aqo_2Array = new aqo_2[this.b()];
        for (int k = 0; k < this.b(); ++k) {
            aqo_2Array[k] = this.a(k);
        }
        return aqo_2Array;
    }
}

