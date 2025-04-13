/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aOS
 */
class aos_0
implements Comparator<blx_1> {
    aos_0() {
    }

    public int a(blx_1 blx_12, blx_1 blx_13) {
        int n = blx_12.fE().n();
        int n2 = blx_13.fE().n();
        int n3 = n2 - n;
        return Integer.compare(n3, 0);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((blx_1)object, (blx_1)object2);
    }
}

