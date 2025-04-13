/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.LinkedList;

/*
 * Renamed from cbu
 */
public class cbu_2 {
    public static final cbu_2 a = new cbu_2();
    private static final int b = 4;
    private static final long c = 5000L;
    private static final int d = 4;
    private static final long e = 5000L;
    private static final int f = 10;
    private final LinkedList<abo_2<Integer, Long>> g = new LinkedList();

    public static cbu_2 a() {
        return a;
    }

    public cbu_2() {
        for (int k = 0; k < 10; ++k) {
            this.g.add(new abo_2<Integer, Long>(0, 0L));
        }
    }

    private boolean a(int n, long l) {
        abo_2 abo_22;
        if (this.g.get(3).b() + 5000L > l) {
            return true;
        }
        int n2 = 0;
        Iterator iterator = this.g.iterator();
        while (iterator.hasNext() && (Long)(abo_22 = (abo_2)iterator.next()).b() + 5000L >= l) {
            if ((Integer)abo_22.a() != n) continue;
            ++n2;
        }
        return n2 + 1 >= 4;
    }

    public boolean a(int n) {
        return this.b(n, System.currentTimeMillis());
    }

    private boolean b(int n, long l) {
        this.c(n, l);
        return this.a(n, l);
    }

    private void c(int n, long l) {
        abo_2<Integer, Long> abo_22 = this.g.removeLast();
        abo_22.a(n);
        abo_22.b(l);
        this.g.addFirst(abo_22);
    }
}

