/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Gauge
 */
import com.codahale.metrics.Gauge;

/*
 * Renamed from HW
 */
class hw_2<T>
implements ip_2,
Gauge<T> {
    private final String a;
    private final Gauge<T> b;

    hw_2(String string, Gauge<T> gauge) {
        this.a = string;
        this.b = gauge;
    }

    public T getValue() {
        return (T)this.b.getValue();
    }

    @Override
    public hl_1 a(hb_1 hb_12) {
        return new hj_1(this.a, this);
    }

    @Override
    public io_2 a() {
        return io_2.h;
    }
}

