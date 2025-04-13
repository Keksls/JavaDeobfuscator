/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from SX
 */
public class sx_0
extends aqq_2 {
    public sx_0(String string, aqo_2 ... aqo_2Array) {
        super(string, aqo_2Array);
    }

    public sx_0(aqo_2 ... aqo_2Array) {
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

