/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from brA
 */
class bra_2
implements Comparator<brt_1> {
    static final bra_2 a = new bra_2();

    private bra_2() {
    }

    public int a(brt_1 brt_12, brt_1 brt_13) {
        return brt_13.h() - brt_12.h();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((brt_1)object, (brt_1)object2);
    }
}

