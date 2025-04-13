/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bTY
 */
class bty_2
implements Comparator<btv_2> {
    final /* synthetic */ btx_2 a;

    bty_2(btx_2 btx_22) {
        this.a = btx_22;
    }

    public int a(btv_2 btv_22, btv_2 btv_23) {
        wu_0 wu_02 = btv_22.a();
        wu_0 wu_03 = btv_23.a();
        if (wu_02 == null || wu_03 == null) {
            return 0;
        }
        if (wu_02.b(wu_03)) {
            return -1;
        }
        return 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((btv_2)object, (btv_2)object2);
    }
}

