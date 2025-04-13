/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class eFv
extends aqq_2 {
    public eFv(String string, eFu ... eFuArray) {
        super(string, (aqo_2[])eFuArray);
    }

    public eFv(eFu ... eFuArray) {
        super(eFuArray);
    }

    @Override
    public final aqo_2[] a() {
        ArrayList<aqo_2> arrayList = new ArrayList<aqo_2>();
        for (int k = 0; k < this.b(); ++k) {
            aqo_2 aqo_22 = this.a(k);
            arrayList.add(new aqo_2(aqo_22.a() + " (base)"));
            arrayList.add(new aqo_2(aqo_22.a() + " (incr)"));
        }
        aqo_2[] aqo_2Array = new aqo_2[arrayList.size()];
        return arrayList.toArray(aqo_2Array);
    }
}

