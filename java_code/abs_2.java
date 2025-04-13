/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aBS
 */
class abs_2
implements Comparator<Integer> {
    abs_2() {
    }

    public int a(Integer n, Integer n2) {
        return n.compareTo(n2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }
}

