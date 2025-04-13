/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Snapshot
 */
import com.codahale.metrics.Snapshot;

/*
 * Renamed from HF
 */
class hf_1 {
    private final long a;
    private final Snapshot b;

    hf_1(long l, Snapshot snapshot) {
        this.a = l;
        this.b = snapshot;
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b.getMin();
    }

    public long c() {
        return this.b.getMax();
    }

    public double d() {
        return this.b.getMean();
    }

    public double e() {
        return this.b.getMedian();
    }

    public double f() {
        return this.b.getStdDev();
    }

    public double g() {
        return this.b.get75thPercentile();
    }

    public double h() {
        return this.b.get95thPercentile();
    }

    public double i() {
        return this.b.get98thPercentile();
    }

    public double j() {
        return this.b.get99thPercentile();
    }

    public double k() {
        return this.b.get999thPercentile();
    }

    public String toString() {
        return "HistogramReport{m_count=" + this.a + ", m_snapshot=" + this.b.size() + "}";
    }
}

