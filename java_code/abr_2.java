/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aBR
 */
class abr_2
implements Comparator<Long> {
    abr_2() {
    }

    public int a(Long l, Long l2) {
        return l.compareTo(l2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Long)object, (Long)object2);
    }
}

