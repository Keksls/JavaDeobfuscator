/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aOT
 */
class aot_0
implements Comparator<blx_1> {
    private final Comparator[] a = new Comparator[]{aop_0.c, aop_0.e, aop_0.d};

    aot_0() {
    }

    public int a(blx_1 blx_12, blx_1 blx_13) {
        int n = 0;
        int n2 = 0;
        while (n2 == 0 && n < this.a.length) {
            n2 = this.a[n++].compare(blx_12, blx_13);
        }
        return n2;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((blx_1)object, (blx_1)object2);
    }
}

