/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bkn
 */
class bkn_1
implements Comparator<bko_2> {
    bkn_1() {
    }

    public int a(bko_2 bko_22, bko_2 bko_23) {
        return Integer.compare(bko_22.a(), bko_23.a());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bko_2)object, (bko_2)object2);
    }
}

