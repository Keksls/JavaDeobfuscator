/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bry
 */
class bry_1
implements Comparator<brt_1> {
    static final bry_1 a = new bry_1();

    private bry_1() {
    }

    public int a(brt_1 brt_12, brt_1 brt_13) {
        return brt_12.e() - brt_13.e();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((brt_1)object, (brt_1)object2);
    }
}

