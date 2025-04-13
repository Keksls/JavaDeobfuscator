/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Renamed from aDe
 */
public class ade_1
implements abo_1 {
    protected static final Comparator<acz_1> a = new adf_1();
    protected final Queue<acz_1> b = new PriorityQueue<acz_1>(11, a);

    @Override
    public void onCheckOut() {
    }

    @Override
    public void onCheckIn() {
        this.b.clear();
    }

    boolean a(acz_1 acz_12) {
        return this.b.offer(acz_12);
    }

    acz_1 a() {
        return this.b.poll();
    }

    acz_1 b() {
        return this.b.peek();
    }

    Queue<acz_1> c() {
        return this.b;
    }

    void d() {
        this.b.clear();
    }

    public Iterator<acz_1> e() {
        return this.b.iterator();
    }

    public boolean f() {
        return this.b.isEmpty();
    }

    boolean b(acz_1 acz_12) {
        return this.b.remove(acz_12);
    }

    int g() {
        return this.b.size();
    }

    int h() {
        int n = 0;
        for (acz_1 acz_12 : this.b) {
            if (!acz_12.j()) continue;
            ++n;
        }
        return n;
    }

    long i() {
        acz_1 acz_12 = this.b.peek();
        if (acz_12 != null) {
            return acz_12.d();
        }
        return Long.MAX_VALUE;
    }

    public void j() {
        while (!this.b.isEmpty()) {
            acz_1 acz_12 = this.b.poll();
            acz_12.a(true);
            adc_1.a().a(acz_12.e(), acz_12.f(), acz_12.g(), acz_12.h(), acz_12.i());
        }
    }

    public void k() {
        for (acz_1 acz_12 : this.b) {
            acz_12.a(true);
        }
    }
}

