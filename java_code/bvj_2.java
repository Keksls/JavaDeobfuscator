/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bvj
 */
public class bvj_2
extends aqq_2 {
    public bvj_2(String string, aqo_2 ... aqo_2Array) {
        super(string, aqo_2Array);
    }

    public bvj_2(aqo_2 ... aqo_2Array) {
        super(aqo_2Array);
    }

    @Override
    public final aqo_2[] a() {
        ArrayList<aqo_2> arrayList = new ArrayList<aqo_2>();
        for (int k = 0; k < this.b(); ++k) {
            aqo_2 aqo_22 = this.a(k);
            arrayList.add(new aqo_2(aqo_22.a()));
        }
        return arrayList.toArray(new aqo_2[arrayList.size()]);
    }
}

