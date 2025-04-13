/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Timer
 */
import com.codahale.metrics.Timer;

/*
 * Renamed from HR
 */
class hr_2
extends Timer
implements ip_2 {
    final long a;

    hr_2(long l) {
        this.a = l;
    }

    @Override
    public hl_1 a(hb_1 hb_12) {
        return new hs_2(hb_12, this);
    }

    @Override
    public io_2 a() {
        return io_2.c;
    }
}

