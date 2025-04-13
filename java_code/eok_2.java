/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eOk
 */
public class eok_2
implements Comparator<Long> {
    private static final int a = 20000;
    private final eoo_2 b;
    private final int c;

    public eok_2(eoo_2 eoo_22, int n) {
        this.b = eoo_22;
        this.c = n;
    }

    private int a(long l) {
        return this.b.a(l) + (this.b.b(l) ? 20000 : 0);
    }

    private int b(long l) {
        int n = (int)(l + (long)this.c + (long)this.b.a(l) & 0xFFFFL);
        int n2 = n * n;
        return n2 & 0xFF ^ n2 >> 16 & 0xFF00;
    }

    public int a(Long l, Long l2) {
        int n = Integer.compare(-this.a(l), -this.a(l2));
        if (n != 0) {
            return n;
        }
        int n2 = Integer.compare(this.b(l), this.b(l2));
        if (n2 != 0) {
            return n2;
        }
        return l.compareTo(l2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Long)object, (Long)object2);
    }
}

