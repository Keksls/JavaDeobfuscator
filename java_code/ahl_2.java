/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Renamed from aHL
 */
public final class ahl_2<T>
implements Comparator<T> {
    private final List<Comparator<T>> a = new ArrayList<Comparator<T>>();

    public ahl_2(Comparator<T> ... comparatorArray) {
        Collections.addAll(this.a, comparatorArray);
    }

    @Override
    public int compare(T t, T t2) {
        for (Comparator<T> comparator : this.a) {
            int n = comparator.compare(t, t2);
            if (n == 0) continue;
            return n;
        }
        return 0;
    }
}

