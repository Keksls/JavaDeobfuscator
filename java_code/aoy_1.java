/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aoY
 */
class aoy_1
implements Comparator<aow_1> {
    aoy_1() {
    }

    public int a(aow_1 aow_12, aow_1 aow_13) {
        long l = aow_12.a();
        long l2 = aow_13.a();
        return Long.compare(l2, l);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((aow_1)object, (aow_1)object2);
    }
}

