/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bVJ
 */
class bvj_0
implements Comparator<bvm_0> {
    final /* synthetic */ bvh_0 a;

    bvj_0(bvh_0 bvh_02) {
        this.a = bvh_02;
    }

    public int a(bvm_0 bvm_02, bvm_0 bvm_03) {
        return bvm_03.a() - bvm_02.a();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bvm_0)object, (bvm_0)object2);
    }
}

