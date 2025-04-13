/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eOJ
 */
class eoj_1
implements Comparator<efh_0> {
    final /* synthetic */ eoi_1 a;

    eoj_1(eoi_1 eoi_12) {
        this.a = eoi_12;
    }

    public int a(efh_0 efh_02, efh_0 efh_03) {
        if (efh_02 == efh_03) {
            return 0;
        }
        return efh_02.i() - efh_03.i();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((efh_0)object, (efh_0)object2);
    }
}

