/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Timer
 */
import com.codahale.metrics.Timer;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from HN
 */
class hn_1
extends Timer
implements ip_2 {
    final int a;
    long b;

    hn_1(int n) {
        this.a = n;
    }

    @Override
    public hl_1 a(hb_1 hb_12) {
        return new ho_1(hb_12, this);
    }

    public void update(long l, TimeUnit timeUnit) {
        super.update(l, timeUnit);
        this.b += timeUnit.toMillis(l);
    }

    @Override
    public io_2 a() {
        return io_2.a;
    }
}

