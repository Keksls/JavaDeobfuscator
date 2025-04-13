/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class brf
implements Comparator<bvk_1> {
    brf() {
    }

    public int a(bvk_1 bvk_12, bvk_1 bvk_13) {
        return bvk_13.i() > bvk_12.i() ? -1 : 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bvk_1)object, (bvk_1)object2);
    }
}

