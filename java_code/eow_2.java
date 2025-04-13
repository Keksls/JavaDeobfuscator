/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Renamed from eOw
 */
public class eow_2<E extends efh_0>
implements eou_2<E> {
    private final List<E> a = new ArrayList();

    public static eou_2 b() {
        return new eow_2();
    }

    @Override
    public void a(E e2) {
        if (e2 == null) {
            return;
        }
        this.a.add(e2);
    }

    @Override
    public List<E> a() {
        return Collections.unmodifiableList(this.a);
    }

    @Override
    public E a(int n) {
        for (int k = 0; k < this.a.size(); ++k) {
            efh_0 efh_02 = (efh_0)this.a.get(k);
            if (efh_02.i() != n) continue;
            return (E)efh_02;
        }
        return null;
    }

    @Override
    public int a(E e2, boolean bl) {
        return this.a.indexOf(e2);
    }

    @Override
    public void a(Comparator<efh_0> comparator) {
        this.a.sort(comparator);
    }
}

