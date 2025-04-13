/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from byt
 */
class byt_2
implements Comparator<bxx_1> {
    final /* synthetic */ byp_2 a;

    byt_2(byp_2 byp_22) {
        this.a = byp_22;
    }

    public int a(bxx_1 bxx_12, bxx_1 bxx_13) {
        int n = bxx_12.a();
        int n2 = bxx_13.a();
        return Integer.compare(n, n2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bxx_1)object, (bxx_1)object2);
    }
}

