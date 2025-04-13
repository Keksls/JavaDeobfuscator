/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bQU
 */
class bqu_0
implements Comparator<bqp_0> {
    static final Comparator<bqp_0> a = new bqu_0();

    private bqu_0() {
    }

    public int a(bqp_0 bqp_02, bqp_0 bqp_03) {
        int n;
        int n2 = bqp_02.b();
        if (n2 == (n = bqp_03.b())) {
            String string = bae.h().a(151, (long)bqp_02.a(), new Object[0]);
            String string2 = bae.h().a(151, (long)bqp_03.a(), new Object[0]);
            return string.compareTo(string2);
        }
        return n2 - n;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bqp_0)object, (bqp_0)object2);
    }
}

