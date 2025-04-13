/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aoZ
 */
class aoz_2
implements Comparator<aow_1> {
    aoz_2() {
    }

    public int a(aow_1 aow_12, aow_1 aow_13) {
        long l = aow_12.a();
        long l2 = aow_13.a();
        return Long.compare(l, l2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((aow_1)object, (aow_1)object2);
    }
}

