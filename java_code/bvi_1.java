/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bvI
 */
class bvi_1
implements Comparator<bvk_1> {
    bvi_1() {
    }

    public int a(bvk_1 bvk_12, bvk_1 bvk_13) {
        return bvk_12.i() - bvk_13.i();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bvk_1)object, (bvk_1)object2);
    }
}

