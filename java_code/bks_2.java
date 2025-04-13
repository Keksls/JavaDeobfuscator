/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bks
 */
class bks_2
implements Comparator<bkm_1> {
    final /* synthetic */ bkr_2 a;

    bks_2(bkr_2 bkr_22) {
        this.a = bkr_22;
    }

    public int a(bkm_1 bkm_12, bkm_1 bkm_13) {
        return Integer.compare(bkm_12.b(), bkm_13.b());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bkm_1)object, (bkm_1)object2);
    }
}

