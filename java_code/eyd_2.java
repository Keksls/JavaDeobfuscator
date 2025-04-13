/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eYd
 */
class eyd_2
implements Comparator<eyc_1> {
    eyd_2() {
    }

    public int a(eyc_1 eyc_12, eyc_1 eyc_13) {
        if (eyc_12 == eyc_13) {
            return 0;
        }
        if (eyc_12 == null) {
            return 1;
        }
        if (eyc_13 == null) {
            return -1;
        }
        return Integer.signum(eyc_13.h - eyc_12.h);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((eyc_1)object, (eyc_1)object2);
    }
}

