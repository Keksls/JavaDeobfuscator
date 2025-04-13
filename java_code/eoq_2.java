/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.Objects;

/*
 * Renamed from eOq
 */
final class eoq_2
implements Comparator<epq_2> {
    private final int a;
    private final eoo_2 b;

    eoq_2(int n, eoo_2 eoo_22) {
        this.a = n;
        this.b = eoo_22;
    }

    public int a(epq_2 epq_22, epq_2 epq_23) {
        int n;
        if (Objects.equals(epq_22, epq_23)) {
            return 0;
        }
        if (this.b.a(epq_22.a_()) > this.b.a(epq_23.a_())) {
            return -1;
        }
        if (this.b.a(epq_22.a_()) < this.b.a(epq_23.a_())) {
            return 1;
        }
        int n2 = this.a(epq_22);
        if (n2 > (n = this.a(epq_23))) {
            return -1;
        }
        if (n2 < n) {
            return 1;
        }
        int n3 = Integer.compare(this.a(epq_22.a_()), this.a(epq_23.a_()));
        if (n3 != 0) {
            return n3;
        }
        return Long.compare(epq_22.a_(), epq_23.a_());
    }

    private int a(epq_2 epq_22) {
        short s2 = epq_22.fd();
        return s2 > 0 ? s2 : epq_22.dt();
    }

    private int a(long l) {
        int n = (int)(l + (long)this.a + (long)this.b.a(l) & 0xFFFFL);
        int n2 = n * n;
        return n2 & 0xFF ^ n2 >> 16 & 0xFF00;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((epq_2)object, (epq_2)object2);
    }
}

