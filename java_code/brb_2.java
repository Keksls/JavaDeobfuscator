/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from brB
 */
class brb_2
implements Comparator<brt_1> {
    static final brb_2 a = new brb_2();

    private brb_2() {
    }

    public int a(brt_1 brt_12, brt_1 brt_13) {
        if (brt_13.i()) {
            return brt_12.i() ? 0 : -1;
        }
        if (brt_12.i()) {
            return 1;
        }
        if (brt_13.h() == brt_12.h()) {
            return brt_12.b().compareTo(brt_13.b());
        }
        return brt_13.h() - brt_12.h();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((brt_1)object, (brt_1)object2);
    }
}

