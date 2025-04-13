/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from brD
 */
class brd_1
implements Comparator<brt_1> {
    static final brd_1 a = new brd_1();

    private brd_1() {
    }

    public int a(brt_1 brt_12, brt_1 brt_13) {
        if (brt_13.i()) {
            return brt_12.i() ? 0 : -1;
        }
        if (brt_12.i()) {
            return 1;
        }
        if (brt_12.k() == brt_13.k()) {
            return brt_12.b().compareTo(brt_13.b());
        }
        return brt_13.k() ? -1 : 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((brt_1)object, (brt_1)object2);
    }
}

