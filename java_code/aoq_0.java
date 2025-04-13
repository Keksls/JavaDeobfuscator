/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aOQ
 */
class aoq_0
implements Comparator<blx_1> {
    aoq_0() {
    }

    public int a(blx_1 blx_12, blx_1 blx_13) {
        int n = blx_13.dr() - blx_12.dr();
        return Integer.compare(n, 0);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((blx_1)object, (blx_1)object2);
    }
}

