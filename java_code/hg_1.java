/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Meter
 */
import com.codahale.metrics.Meter;

/*
 * Renamed from HG
 */
class hg_1 {
    private final Meter a;

    hg_1(Meter meter) {
        this.a = meter;
    }

    public long a() {
        return this.a.getCount();
    }

    public double b() {
        return this.a.getMeanRate();
    }

    public double c() {
        return this.a.getOneMinuteRate();
    }

    public double d() {
        return this.a.getFiveMinuteRate();
    }

    public double e() {
        return this.a.getFifteenMinuteRate();
    }

    public String toString() {
        return "MeterReport{m_meter=" + this.a.getCount() + "}";
    }
}

