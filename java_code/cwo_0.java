/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from cWO
 */
class cwo_0
implements Comparator<blw_1> {
    final /* synthetic */ cwk_0 a;

    cwo_0(cwk_0 cwk_02) {
        this.a = cwk_02;
    }

    public int a(blw_1 blw_12, blw_1 blw_13) {
        if (blw_12 == blw_13) {
            return 0;
        }
        if (blw_12 instanceof cWS) {
            return Integer.MAX_VALUE;
        }
        if (blw_13 instanceof cWS) {
            return Integer.MIN_VALUE;
        }
        return blw_12.b() - blw_13.b();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((blw_1)object, (blw_1)object2);
    }
}

