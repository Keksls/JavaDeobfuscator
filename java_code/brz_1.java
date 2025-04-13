/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from brz
 */
class brz_1
implements Comparator<brt_1> {
    static final brz_1 a = new brz_1();

    private brz_1() {
    }

    public int a(brt_1 brt_12, brt_1 brt_13) {
        if (brt_13.i() == brt_12.i()) {
            return 0;
        }
        return brt_13.i() ? -1 : 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((brt_1)object, (brt_1)object2);
    }
}

