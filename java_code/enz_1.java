/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eNZ
 */
class enz_1
implements Comparator<Object> {
    enz_1() {
    }

    @Override
    public int compare(Object object, Object object2) {
        int n = ((emh_1)object).fT();
        int n2 = ((emh_1)object2).fT();
        return Integer.compare(n2, n);
    }
}

