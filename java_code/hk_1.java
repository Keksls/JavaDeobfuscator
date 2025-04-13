/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Histogram
 *  com.codahale.metrics.Snapshot
 *  com.google.gson.annotations.SerializedName
 */
import com.codahale.metrics.Histogram;
import com.codahale.metrics.Snapshot;
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from HK
 */
public class hk_1
extends hl_1 {
    @SerializedName(value="type")
    private static final String a = "histogram";
    @SerializedName(value="count")
    private final long b;
    @SerializedName(value="min")
    private final long c;
    @SerializedName(value="max")
    private final long d;
    @SerializedName(value="mean")
    private final double e;
    @SerializedName(value="median")
    private final double f;
    @SerializedName(value="stddev")
    private final double g;
    @SerializedName(value="p75")
    private final double h;
    @SerializedName(value="p95")
    private final double i;
    @SerializedName(value="p98")
    private final double j;
    @SerializedName(value="p99")
    private final double k;
    @SerializedName(value="p999")
    private final double l;

    public hk_1(String string, Histogram histogram) {
        super(string);
        Snapshot snapshot = histogram.getSnapshot();
        this.b = histogram.getCount();
        this.c = snapshot.getMin();
        this.d = snapshot.getMax();
        this.e = snapshot.getMean();
        this.f = snapshot.getMedian();
        this.g = snapshot.getStdDev();
        this.h = snapshot.get75thPercentile();
        this.i = snapshot.get95thPercentile();
        this.j = snapshot.get98thPercentile();
        this.k = snapshot.get98thPercentile();
        this.l = snapshot.get999thPercentile();
    }
}

