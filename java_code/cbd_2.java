/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from cbd
 */
public enum cbd_2 {
    a(2, Ow.a),
    b(3, Ow.b),
    c(4, Ow.c),
    d(5, Ow.d),
    e(6, Ow.f),
    f(7, Ow.e);

    public final int g;
    private final Ow[] h;

    private cbd_2(int n2, Ow ... owArray) {
        this.g = n2;
        this.h = (Ow[])owArray.clone();
    }

    public static cbd_2 a(Ow ow) {
        cbd_2[] cbd_2Array = cbd_2.values();
        for (int k = 0; k < cbd_2Array.length; ++k) {
            cbd_2 cbd_22 = cbd_2Array[k];
            if (!ArrayUtils.contains((Object[])cbd_22.h, (Object)((Object)ow))) continue;
            return cbd_22;
        }
        return b;
    }
}

